package day0209;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

/**
 * PORT�� ���� �����ڰ� �����⸦ ��ٸ��� ���α׷� => ����(Server)
 * @author user
 */
public class SimpleServer {
	
	public SimpleServer() throws IOException {
		//1.���� ���� ���� (PORT�� ����) PORT�� �����̾ �� Ŭ������ �� �� �����ϸ� ����
		ServerSocket server = null;
		Socket client=null; //�����ڿ� �����ϱ� ���� 
		
		DataOutputStream dos=null;// �����ڿ��� �޽����� ���������� ��Ʈ��
		DataInputStream dis=null; //�����ڰ� �������� �޽����� �б����� ��Ʈ��
		
		String sendMsg="";
		String revMsg="";//������
		
//		try { 
		
			server=new ServerSocket(65500); 
			System.out.println("���� ������..");
			
			
			//3. �����ڰ� ������ ������ ������ �㰡�Ͽ� �޴´�.
			while(true) {
				client = server.accept(); //������ ���ߴ� �޼ҽ�, ���ŷ�޼ҵ�
				System.out.println("������ ����"+client.getInetAddress());
				
				//�����ڿ��� ������ �޽���
				sendMsg="������ ���������� �Ǿ����ϴ�.! - ������";
				
				//4. �����ڿ��� �޽����� ������ ���� ��Ʈ���� �����Ѵ�.
				dos=new DataOutputStream(client.getOutputStream());
				
				//5. ��Ʈ���� �����;���
				dos.writeUTF(sendMsg);//�ѱ��� ���ڵ��ȴ�.
				
				//6.�������� ����
				dos.flush();//��Ʈ���� ������ �������� ����!
				
				
				dis=new DataInputStream(client.getInputStream());
				
				//10. �����͸� �д´�.
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
