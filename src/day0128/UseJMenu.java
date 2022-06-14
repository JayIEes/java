package day0128;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class UseJMenu extends JFrame  {

	//3. �޴� ������ ���� - �̺�Ʈ �߻� �� �񱳴��ؾ��ϱ� ������
	private JMenuItem jminew, jmiDialog,jmiClose,jmiHelp;
	
	
	
	public UseJMenu() {
		
		super("�޴�����");
		
		//1.�޴��ٸ� ����
		JMenuBar jmb=new JMenuBar();
		//2.�޴��� ����
		JMenu jm=new JMenu("�޴�1");
		JMenu jm2=new JMenu("�޴�2");
		//3. �޴��������� ����
		jminew=new JMenuItem("�޴�������");
		jmiDialog=new JMenuItem("���̾�α�");
		jmiClose=new JMenuItem("�ݱ�");
		jmiHelp=new JMenuItem("����");
		
		//4.�޴��������� �޴��� ��ġ
		jm.add(jminew);
		jm.add(jmiDialog);
		jm.addSeparator(); // ���м�
		jm.add(jmiClose);
		
		jm2.add(jmiHelp);
		
		//5. �޴��� �޴��ٿ� ��ġ
		jmb.add(jm);
		jmb.add(jm2);
		
		//6. �޴��ٸ� �����ӿ� ��ġ
		setJMenuBar(jmb);
		
		//�޴��������� �̺�Ʈ ���
		//has a
		UseJMenuEvt ujme=new UseJMenuEvt(this);
		jmiDialog.addActionListener(ujme);
		jmiClose.addActionListener(ujme);
		
		setSize(600,400);
		setVisible(true);
		
		
	}//UseJMenu
	
	
	
	
	
	public JMenuItem getJminew() {
		return jminew;
	}





	public JMenuItem getJmiDialog() {
		return jmiDialog;
	}





	public JMenuItem getJmiClose() {
		return jmiClose;
	}





	public JMenuItem getJmiHelp() {
		return jmiHelp;
	}





	public static void main(String[] args) {
		new UseJMenu();
		
	}//main

}
