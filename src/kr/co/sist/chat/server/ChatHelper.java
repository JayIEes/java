package kr.co.sist.chat.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.DefaultListModel;
import javax.swing.JScrollPane;

import kr.co.sist.chat.client.ChatClient;

/**
 * 접속자 소켓을 받아, 메시지를 보내고 읽기 위한 Stream을 연결하고 
 * 메시지를 보내는 것과 읽기를 동시에 실행하기 위해서 Thread를 도입하여 코딩한다.
 * @author user
 */
public class ChatHelper extends Thread  {

	private Socket someClient;
	private DataInputStream disReadStream;
	private DataInputStream disReadStream2;
	private DataOutputStream dosWriteStream;
	private JScrollPane jspServerMonitor;
	private String nick;

	private DefaultListModel<String> dlmServerMonitor;
	private int count;

	
	public ChatHelper(Socket client, DefaultListModel<String> dlmServerMonitor, 
			int cnt,JScrollPane jspServerMonitor) throws IOException {
		
		//접속자 소켓을 받고
		this.someClient=client;
		this.dlmServerMonitor=dlmServerMonitor;
		this.count=cnt;
		this.jspServerMonitor=jspServerMonitor;
		
		//스트림을 연결하여 대화를 읽어 들일 수 있는 상태를 만든다.
		disReadStream=new DataInputStream(someClient.getInputStream());
		dosWriteStream=new DataOutputStream(someClient.getOutputStream());
		
		//스트림이 연결되어 데이터를 보내고 읽을 수 있는 상태가 됨.
		nick =disReadStream.readUTF(); //연결되자마자 처음 들어오는 데이터는 닉넥임이다.
		
		
		//관리자 모니터에 접속자가 들어왔음을 보여준다.
		dlmServerMonitor.addElement(cnt+"번째로 ["+nick+"]이(가) 접속하였습니다.");
		dlmServerMonitor.addElement(cnt+"번째 ["+nick+"]의 접속자 정보 ["+someClient.getInetAddress()+"]" );
		setScrollbar();
		
		//모든 접속자에게 현재 접속자가 들어왔음을 알려준다.
		broadcast("["+nick+"]이(가) 접속하였습니다.");
//		broadcast(cnt+"번째 접속자가 접속하였습니다.");
		
	}//ChatHelper
	
	
	private void setScrollbar() {
		
		jspServerMonitor.getVerticalScrollBar().setValue
			(jspServerMonitor.getVerticalScrollBar().getMaximum());
			
		}//setScrollbar
	
	
	/**
	 *메시지를 무한루프로 읽어들여 모든 접속자에게 뿌려준다.
	 */
	@Override
	public void run() { //ChatServer의 run()안에서 start()호출
		
		StringBuilder revMsg=new StringBuilder();
		try {
			while(true) {
				revMsg.append("[").append(nick).append("]").append(disReadStream.readUTF());
//				revMsg= disReadStream.readUTF(); //메시지를 읽어들여
				broadcast(revMsg.toString());//모든 접속자에게 보낸다.
				revMsg.delete(0, revMsg.length());
			}//end while
		}catch(IOException ie) {
			//메시지를 읽어들이지 못하는 상태는 접속자가 접속을 종료한 상태
			//접속자를 관리하는 리스트에서 현재 객체(helper)를 삭제하고,
			ChatServer.connectList.remove(this);
			//서버창에 접속자가 나갔음을 알려주고,
//			dlmServerMonitor.addElement(count+"번째 접속자가 퇴실하였습니다.");
			dlmServerMonitor.addElement("["+nick+"]이(가) 퇴실하였습니다.");
			setScrollbar();
			//모든 접속자에게도 나갔음을 알려준다.
			try {
//				broadcast(count+"번째가 퇴실하였습니다.");
				broadcast("["+nick+"]이(가) 퇴실하였습니다.");
			} catch (IOException e) {
				e.printStackTrace();
			}//end catch
			ie.printStackTrace();
		}//end catch
	}//run

	
	
	
	
	/**
	 * 입력받은 메시지를 모든 접속자에게 보내주는 일
	 * @param msg 모든 접속자에게 보낼 메시지
	 * @throws IOException
	 */
	public  synchronized void broadcast(String msg) throws IOException{ //synchronized : multi thread를 가능하게 해주는
	
		for(ChatHelper ch : ChatServer.connectList) {
			ch.dosWriteStream.writeUTF(msg); //모든 접속자에게 메시지 날림
		}//end for
		
	}//broadcast
	
	
}//class
