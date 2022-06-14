package day0209;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

/**
 * 설정한 ip주소와 포트를 가지고 서버를 찾아 연결하는 일 => 클라이언트 Client
 * @author user
 */
public class SimpleClient {

	public SimpleClient() throws UnknownHostException, IOException {
		

		Socket client=null; // 컴퓨터끼리 연결
		DataInputStream dis=null;//데이터를 읽기위한 스트림 
		DataOutputStream dos=null;//데이터를 보내기 위한 스트림 
		
		try {
			String ip=JOptionPane.showInputDialog("ip를 넣어주세요");
			
			//2.소켓을 생성하여 서버에 연결시도
			client =new Socket("211.63.89."+ip,65500);
			System.out.println("서버 접속에 시도하여 접속 성공");
			
			//4. 서버에서 보내오는 메시지를 읽기 위해 스트림을 연결
			dis=new DataInputStream(client.getInputStream());
			
			//7. 메시지를 decode하여 읽어들인다.
			String revMsg=dis.readUTF();
			System.out.println("서버에서 온 메세지"+revMsg);
			
			dos=new DataOutputStream(client.getOutputStream());
			
			String msg=JOptionPane.showInputDialog("서버에 보낼 메시지 입력","서지숙: ");
			//8.입력받은 메시지를 스트림에 기록
			dos.writeUTF(msg);
			//9.스트림의 내용을 분출
			dos.flush();
		
		
		}finally {
			if(dis!=null) {dis.close();}
			if(client!=null) {client.close();}
		}
	}//SimpleClient
	
	
	public static void main(String[] args) {
		
		try {
			new SimpleClient();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//main

}//class
