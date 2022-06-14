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
 * Thread�� ���ԵǾ� �б�� ���⸦ ���ÿ� �Ѵ�.
 * @author user
 */
@SuppressWarnings("serial")
public class SimpleChatServer extends JFrame implements ActionListener,Runnable {
	
	private JTextArea jtaTalkDisplay;
	private JTextField jtfTalk;
	private JScrollPane jspJtaTalkDisplay;
	
	private ServerSocket server;//PORT����, ������ ������ �ް� ����
	private Socket client;// �����ڰ� ������ ����
	private DataInputStream disReadStream;//�������� �޽����� �б� ���� ��Ʈ��
	private DataOutputStream dosWritStream;//�����ڿ��� �޽����� ���������� ��Ʈ��
	
	public SimpleChatServer() {
		super(":::::::::ä�ü���::::::::::");
		
		jtaTalkDisplay=new JTextArea();
		jspJtaTalkDisplay=new JScrollPane( jtaTalkDisplay );
		jtfTalk=new JTextField();
		
		jtaTalkDisplay.setEditable(false);

		jspJtaTalkDisplay.setBorder(new TitledBorder("��ȭ����"));
		jtfTalk.setBorder(new TitledBorder("��ȭ"));
		
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
			jtaTalkDisplay.setText("���� ���� ��...\n������ �����⸦ ��ٸ�\n");
			
			client=server.accept();//�����ڰ� ������ �����ڸ� �޴´�.
			jtaTalkDisplay.append("�����ڰ� ���Խ��ϴ�.\n");
			//��ȭ�� �����ų� ���� �� �ֵ��� ���Ͽ��� ��Ʈ�� ����
			disReadStream=new DataInputStream(client.getInputStream());
			dosWritStream=new DataOutputStream(client.getOutputStream());
			jtaTalkDisplay.append("��ſ� ä��\n");
			
//			readMsg();
			
			//Thread�� �����Ͽ� ���ÿ� �����ؾ��� �ڵ带 �����Ų��.
			Thread thread=new Thread(this);
			thread.start(); // start() =>run()�� ȣ��ȴ�.
			
		}//end if
	}//OpenServer
	
	private void setScrollbar() {
		
		jspJtaTalkDisplay.getVerticalScrollBar().setValue
		(jspJtaTalkDisplay.getVerticalScrollBar().getMaximum());
		
//		System.out.println(jspJtaTalkDisplay.getVerticalScrollBar().getMaximum());
	}//setScrollbar
	
	
	/**
	 * �����ڰ� �������� �޽����� �о�鿩 ���ѷ����� �о�鿩 JTextArea�� ���
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
			jtaTalkDisplay.append("��ȭ��밡 ä���� ����");
			ie.printStackTrace();
		}//end catch
	}//readMsg
	
	
	public void sendMsg() throws IOException{
		String msg=jtfTalk.getText();
		dosWritStream.writeUTF("���� "+msg); //�����ڿ��� �޽����� ������
		dosWritStream.flush();
		
		jtaTalkDisplay.append("���� : "+msg+"\n");//�� ��ȭâ���� �޽����� �ø���
		jtfTalk.setText(""); //��ȭ�Է� â�� �ʱ�ȭ�Ѵ�.
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
