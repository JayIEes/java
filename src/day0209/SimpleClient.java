package day0209;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

/**
 * ������ ip�ּҿ� ��Ʈ�� ������ ������ ã�� �����ϴ� �� => Ŭ���̾�Ʈ Client
 * @author user
 */
public class SimpleClient {

	public SimpleClient() throws UnknownHostException, IOException {
		

		Socket client=null; // ��ǻ�ͳ��� ����
		DataInputStream dis=null;//�����͸� �б����� ��Ʈ�� 
		DataOutputStream dos=null;//�����͸� ������ ���� ��Ʈ�� 
		
		try {
			String ip=JOptionPane.showInputDialog("ip�� �־��ּ���");
			
			//2.������ �����Ͽ� ������ ����õ�
			client =new Socket("211.63.89."+ip,65500);
			System.out.println("���� ���ӿ� �õ��Ͽ� ���� ����");
			
			//4. �������� �������� �޽����� �б� ���� ��Ʈ���� ����
			dis=new DataInputStream(client.getInputStream());
			
			//7. �޽����� decode�Ͽ� �о���δ�.
			String revMsg=dis.readUTF();
			System.out.println("�������� �� �޼���"+revMsg);
			
			dos=new DataOutputStream(client.getOutputStream());
			
			String msg=JOptionPane.showInputDialog("������ ���� �޽��� �Է�","������: ");
			//8.�Է¹��� �޽����� ��Ʈ���� ���
			dos.writeUTF(msg);
			//9.��Ʈ���� ������ ����
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
