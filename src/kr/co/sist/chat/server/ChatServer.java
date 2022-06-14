package kr.co.sist.chat.server;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

import kr.co.sist.chat.client.ChatClient;

@SuppressWarnings("serial")
public class ChatServer extends JFrame implements ActionListener, Runnable {

	private JButton jbtnOpenServer, jbtnClose;
	
	private JScrollPane jspServerMonitor;
	private JList<String> jlServerMonitor;
	private DefaultListModel<String> dlmServerMonitor;
//	private ChatClient cc;
	
	private Thread serverThread; //������ ������ ������ �����ΰ� ���ÿ� �ޱ� ���� ������
	public static List<ChatHelper> connectList; //�����ڸ� �ޱ����� ����Ʈ
	private ServerSocket server; //������ ������ �ޱ����� ���� ����
	
		
	public ChatServer() {
		super(":::::::ä�ù� ������::::::::::");
		
		
		connectList = new ArrayList<ChatHelper>();
		
		
		 jbtnOpenServer=new JButton("��������");
		 jbtnClose=new JButton("���� ����");
			
		dlmServerMonitor=new DefaultListModel<String>();
		
		jlServerMonitor=new JList<String>( dlmServerMonitor );
		jspServerMonitor=new JScrollPane( jlServerMonitor);
				
		jspServerMonitor.setBorder(new TitledBorder("������ ����"));
		
		JPanel jpSouth=new JPanel();
		
		jpSouth.add( jbtnOpenServer);
		jpSouth.add( jbtnClose);
		
		add("Center",jspServerMonitor);
		add("South", jpSouth);
		
		jbtnClose.addActionListener(this);
		jbtnOpenServer.addActionListener(this);

		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}//windowClosing

			@Override
			public void windowClosed(WindowEvent we) {
				
				try {
					if(server!=null) {server.close();} //end if
					System.exit(JFrame.ABORT);
				}catch(IOException ie){
					ie.printStackTrace();
				}//end catch
			}//windowClosed
			
		});
		
		setBounds(200,200,300, 500);
		setVisible(true);
		
	}//ChatServer
	
	
	
	
	
	
	/**
	 * ������ ������ �ް�, ���ۿ� �ְ�, �����ڰ� �������� �޽����� ���� �� �ִ� ����.
	 */
	@Override
	public void run() {

		try {
			server=new ServerSocket(25000); //PORT�� ����
			dlmServerMonitor.addElement("������ ���� ���Դϴ�.");
			
			ChatHelper helper=null;
			
			for(int cnt=1; connectList.size()<21 ; cnt++) {
				helper=new ChatHelper(server.accept(), dlmServerMonitor, cnt,jspServerMonitor) ;
				connectList.add(helper);
				//������ helper�� ��ȭ�� �о�鿩, ������ �� �ִ� ���·� �����.
				helper.start();
				
			}//end for
			
		} catch (IOException e) {
			e.printStackTrace();
		}//end catch
		
		
		
	}//run

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==jbtnClose) {
			
			dispose();
		}//end if
		
		
		
		if(ae.getSource()==jbtnOpenServer) {
			
			if(serverThread!=null) {
				JOptionPane.showMessageDialog(this, "������ �̹� ���� ���Դϴ�.");
				return; //�Ʒ����� �ڵ带 �������� ���� ȣ���� ������ ���ư���. early return
			}//end if
			
			//else�� �ۼ����� �ʰ� else ������ �ϴ� �ڵ带 �ۼ��ϸ� �ȴ�.
			serverThread= new Thread(this);
			serverThread.start();//start =>run
			
			
		}//end if
		
		
	}//actionPerformed

	public static void main(String[] args) {
		new ChatServer();
	}//main

}//class
