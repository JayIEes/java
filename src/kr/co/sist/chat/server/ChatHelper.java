package kr.co.sist.chat.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.DefaultListModel;
import javax.swing.JScrollPane;

import kr.co.sist.chat.client.ChatClient;

/**
 * ������ ������ �޾�, �޽����� ������ �б� ���� Stream�� �����ϰ� 
 * �޽����� ������ �Ͱ� �б⸦ ���ÿ� �����ϱ� ���ؼ� Thread�� �����Ͽ� �ڵ��Ѵ�.
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
		
		//������ ������ �ް�
		this.someClient=client;
		this.dlmServerMonitor=dlmServerMonitor;
		this.count=cnt;
		this.jspServerMonitor=jspServerMonitor;
		
		//��Ʈ���� �����Ͽ� ��ȭ�� �о� ���� �� �ִ� ���¸� �����.
		disReadStream=new DataInputStream(someClient.getInputStream());
		dosWriteStream=new DataOutputStream(someClient.getOutputStream());
		
		//��Ʈ���� ����Ǿ� �����͸� ������ ���� �� �ִ� ���°� ��.
		nick =disReadStream.readUTF(); //������ڸ��� ó�� ������ �����ʹ� �г����̴�.
		
		
		//������ ����Ϳ� �����ڰ� �������� �����ش�.
		dlmServerMonitor.addElement(cnt+"��°�� ["+nick+"]��(��) �����Ͽ����ϴ�.");
		dlmServerMonitor.addElement(cnt+"��° ["+nick+"]�� ������ ���� ["+someClient.getInetAddress()+"]" );
		setScrollbar();
		
		//��� �����ڿ��� ���� �����ڰ� �������� �˷��ش�.
		broadcast("["+nick+"]��(��) �����Ͽ����ϴ�.");
//		broadcast(cnt+"��° �����ڰ� �����Ͽ����ϴ�.");
		
	}//ChatHelper
	
	
	private void setScrollbar() {
		
		jspServerMonitor.getVerticalScrollBar().setValue
			(jspServerMonitor.getVerticalScrollBar().getMaximum());
			
		}//setScrollbar
	
	
	/**
	 *�޽����� ���ѷ����� �о�鿩 ��� �����ڿ��� �ѷ��ش�.
	 */
	@Override
	public void run() { //ChatServer�� run()�ȿ��� start()ȣ��
		
		StringBuilder revMsg=new StringBuilder();
		try {
			while(true) {
				revMsg.append("[").append(nick).append("]").append(disReadStream.readUTF());
//				revMsg= disReadStream.readUTF(); //�޽����� �о�鿩
				broadcast(revMsg.toString());//��� �����ڿ��� ������.
				revMsg.delete(0, revMsg.length());
			}//end while
		}catch(IOException ie) {
			//�޽����� �о������ ���ϴ� ���´� �����ڰ� ������ ������ ����
			//�����ڸ� �����ϴ� ����Ʈ���� ���� ��ü(helper)�� �����ϰ�,
			ChatServer.connectList.remove(this);
			//����â�� �����ڰ� �������� �˷��ְ�,
//			dlmServerMonitor.addElement(count+"��° �����ڰ� ����Ͽ����ϴ�.");
			dlmServerMonitor.addElement("["+nick+"]��(��) ����Ͽ����ϴ�.");
			setScrollbar();
			//��� �����ڿ��Ե� �������� �˷��ش�.
			try {
//				broadcast(count+"��°�� ����Ͽ����ϴ�.");
				broadcast("["+nick+"]��(��) ����Ͽ����ϴ�.");
			} catch (IOException e) {
				e.printStackTrace();
			}//end catch
			ie.printStackTrace();
		}//end catch
	}//run

	
	
	
	
	/**
	 * �Է¹��� �޽����� ��� �����ڿ��� �����ִ� ��
	 * @param msg ��� �����ڿ��� ���� �޽���
	 * @throws IOException
	 */
	public  synchronized void broadcast(String msg) throws IOException{ //synchronized : multi thread�� �����ϰ� ���ִ�
	
		for(ChatHelper ch : ChatServer.connectList) {
			ch.dosWriteStream.writeUTF(msg); //��� �����ڿ��� �޽��� ����
		}//end for
		
	}//broadcast
	
	
}//class
