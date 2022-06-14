package day0127;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class UseJList extends JFrame {

	public UseJList() {
		super("MVC Pattern�� ���Ե� Ŭ����");
		
		//������Ʈ ����
		//MVC Pattern�� ���Ե� ������Ʈ�� Model�κ��� ����
		DefaultListModel<String> dlmFriend=new DefaultListModel<String>();
		DefaultListModel<String> dlmBlockedFriend=new DefaultListModel<String>();
		
		JList<String> listFriend= new JList<String>(dlmFriend);
		JList<String> listBlockedFriend= new JList<String>(dlmBlockedFriend);

		//JList�� ��ũ�� �ٰ� ��� JScrollPane �� Container������Ʈ�� ����ؼ� ��ũ�ѹ� ����
		JScrollPane jspListFriend = new JScrollPane(listFriend);
		JScrollPane jspListBlockedFriend = new JScrollPane(listBlockedFriend);
		
		jspListFriend.setBorder(new TitledBorder("ģ�����"));
		jspListBlockedFriend.setBorder(new TitledBorder("����ģ�����"));
		
		JButton jbtnBlock=new JButton(">>");
		JButton jbtnUnblock=new JButton("<<");
		
		
		//Model�� ���ؼ� �����͸� �߰��Ѵ�. //Model�� �����͸� ���� View�� ���� �ʴ´�.
		dlmFriend.addElement("��ö��");
		dlmFriend.addElement("���ϳ�");
		dlmFriend.addElement("�̿���");
		dlmFriend.addElement("������");
		dlmFriend.addElement("�ڼҿ�");
		dlmFriend.addElement("������");
		dlmFriend.addElement("�ȼ���");
		
		dlmBlockedFriend.addElement("������");
		dlmBlockedFriend.addElement("�̳���");
		dlmBlockedFriend.addElement("�����");
		dlmBlockedFriend.addElement("�����");
		
		
		
		
		//��ġ
		setLayout(null); //�ڵ� ��ġ�����ڸ� ����
		//��ġ, ũ�� ����
		jspListFriend.setBounds(20,40,200,350);
		jspListBlockedFriend.setBounds(330,40,200,350);
		jbtnBlock.setBounds(250,150,50,40);
		jbtnUnblock.setBounds(250,220,50,40);
		
		
		add(jspListFriend);
		add(jspListBlockedFriend);
		add(jbtnBlock);
		add(jbtnUnblock);
		
		
		setBounds(100,150,600,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
	}//UseJList
	
	
	public static void main(String[] args) {
		
		new UseJList();
		
		
	}//main

}
