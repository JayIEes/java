package day0211;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 * Thread가 도입되어 읽기와 쓰기를 동시에 한다.
 * @author user
 */
@SuppressWarnings("serial")
public class SimpleChatServer extends JFrame implements ActionListener,Runnable {
	
	private JTextArea jtaTalkDisplay;
	private JTextField jtfTalk;
	private JScrollPane jspJtaTalkDisplay;
	
	private ServerSocket server;//PORT열기, 접속자 소켓을 받고 관리
	private Socket client;// 접속자가 생성한 소켓
	private DataInputStream disReadStream;//접속자의 메시지를 읽기 위한 스트림
	private DataOutputStream dosWritStream;//접속자에게 메시지를 보내기위한 스트림
	
	public SimpleChatServer() {
		super(":::::::::채팅서버::::::::::");
		
		jtaTalkDisplay=new JTextArea();
		jspJtaTalkDisplay=new JScrollPane( jtaTalkDisplay );
		jtfTalk=new JTextField();
		
		jtaTalkDisplay.setEditable(false);

		jspJtaTalkDisplay.setBorder(new TitledBorder("대화내용"));
		jtfTalk.setBorder(new TitledBorder("대화"));
		
		add("Center",jspJtaTalkDisplay);
		add("South",jtfTalk);
		
		setBounds(100, 100, 400, 600);
		setVisible(true);
		
		
		try {
			openServer();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		jtfTalk.addActionListener(this);
	
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				
				dispose();
			}//windowClosing

			@Override
			public void windowClosed(WindowEvent e) {
				try {
				if(disReadStream!=null) {disReadStream.close();}
				if(dosWritStream!=null) {dosWritStream.close();}
				if(client!=null) {client.close();}
				if(server!=null) {server.close();}
				}catch(IOException ie) {
					ie.printStackTrace();
				}finally {
					System.exit(JFrame.ABORT);
				}
			}
			
		});
		
		
		
		
	}//SimpleChatServer
	
	private void openServer() throws IOException {
		if(server==null) {
			server= new ServerSocket(50000);
			jtaTalkDisplay.setText("서버 가동 중...\n접속자 들어오기를 기다림\n");
			
			client=server.accept();//접속자가 들어오면 접속자를 받는다.
			jtaTalkDisplay.append("접속자가 들어왔습니다.\n");
			//대화를 보내거나 읽을 수 있도록 소켓에서 스트림 연결
			disReadStream=new DataInputStream(client.getInputStream());
			dosWritStream=new DataOutputStream(client.getOutputStream());
			jtaTalkDisplay.append("즐거운 채팅\n");
			
//			readMsg();
			
			//Thread를 생성하여 동시에 동작해야할 코드를 실행시킨다.
			Thread thread=new Thread(this);
			thread.start(); // start() =>run()이 호출된다.
			
		}//end if
	}//OpenServer
	
	private void setScrollbar() {
		
		jspJtaTalkDisplay.getVerticalScrollBar().setValue
		(jspJtaTalkDisplay.getVerticalScrollBar().getMaximum());
		
//		System.out.println(jspJtaTalkDisplay.getVerticalScrollBar().getMaximum());
	}//setScrollbar
	
	
	/**
	 * 접속자가 보내오는 메시지를 읽어들여 무한루프로 읽어들여 JTextArea에 출력
	 */
//	public void readMsg() {
	@Override
	public void run() {
		try {
			while(true) {
				jtaTalkDisplay.append(disReadStream.readUTF()+"\n");
				setScrollbar();
			}//end while
		}catch(IOException ie) {
			jtaTalkDisplay.append("대화상대가 채팅을 종료");
			ie.printStackTrace();
		}//end catch
	}//readMsg
	
	
	public void sendMsg() throws IOException{
		String msg=jtfTalk.getText();
		dosWritStream.writeUTF("지숙 "+msg); //접속자에게 메시지를 보내고
		dosWritStream.flush();
		
		jtaTalkDisplay.append("지숙 : "+msg+"\n");//내 대화창에도 메시지를 올리고
		jtfTalk.setText(""); //대화입력 창을 초기화한다.
		setScrollbar();
	}//sendMsg
	

	@Override
	public void actionPerformed(ActionEvent ae) {

		try {
			sendMsg();
		}catch(IOException e) {
			e.printStackTrace();
		}//end catch
		
	}//actionPerformed

	public static void main(String[] args) {
		new  SimpleChatServer();
	}//main

	

}//class
