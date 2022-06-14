package day0209;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

/**
 * PORT를 열고 접속자가 들어오기를 기다리는 프로그램 => 서버(Server)
 * @author user
 */
public class SimpleServer {
	
	public SimpleServer() throws IOException {
		//1.서버 소켓 생성 (PORT가 열림) PORT는 선점이어서 이 클래스를 두 번 실행하면 에러
		ServerSocket server = null;
		Socket client=null; //접속자와 연결하기 위한 
		
		DataOutputStream dos=null;// 접속자에게 메시지를 보내기위한 스트림
		DataInputStream dis=null; //접속자가 보내오는 메시지를 읽기위한 스트림
		
		String sendMsg="";
		String revMsg="";//접소자
		
//		try { 
		
			server=new ServerSocket(65500); 
			System.out.println("서버 가동중..");
			
			
			//3. 접속자가 들어오면 접속자 소켓을 허가하여 받는다.
			while(true) {
				client = server.accept(); //실행을 멈추는 메소스, 블락킹메소드
				System.out.println("접속자 있음"+client.getInetAddress());
				
				//접속자에게 보내줄 메시지
				sendMsg="접속이 정상적으로 되었습니다.! - 서지숙";
				
				//4. 접속자에게 메시지를 보내기 위한 스트림을 연결한다.
				dos=new DataOutputStream(client.getOutputStream());
				
				//5. 스트림에 데이터쓰기
				dos.writeUTF(sendMsg);//한글이 인코딩된다.
				
				//6.목적지로 분출
				dos.flush();//스트림의 내용을 목적지로 분출!
				
				
				dis=new DataInputStream(client.getInputStream());
				
				//10. 데이터를 읽는다.
				revMsg= dis.readUTF();
				JOptionPane.showMessageDialog(null, revMsg);
				
			
			}//end while
			
//		}finally {
//			if(dos!=null) {dos.close();}
//			if(client!=null) {client.close();}
//			if(server!=null) {server.close();}
//		}//end finally
				
	}//SimpleServer

	public static void main(String[] args) {
		try {
			new SimpleServer();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//main

}//class
