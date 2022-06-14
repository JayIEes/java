package day0128;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class TestWindowEvent extends JFrame implements WindowListener{

	
	
	public TestWindowEvent() {
		super("������ �̺�Ʈ ����");
		
		//�̺�Ʈ ���
		addWindowListener(this); //JVM�� �̺�Ʈ�� ������
		
		
		setSize(300,400);
		setVisible(true);
		
	}//TestWindowEvent
	
	
	
	




	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("WindowOpened");
	}




	@Override
	public void windowClosing(WindowEvent e) { //closing ���¿��� dispose�޼ҵ尡 �ҷ�����
		System.out.println("windowClosing");		
		dispose(); //������ �۾��� ����ǰ�
		System.exit(0); //���⼭ ����  //0 -��������(JVM�� �������μ����� �����ϰ� ����).
		//1-������ ���� - (JVM�� ���� ���μ����� �ߴ��ϰ� ����)
	}//windowClosing




	@Override
	public void windowClosed(WindowEvent e) {//���� �Ϸ� �� ȣ��
		System.out.println("windowClosed");	
		
	}




	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified");		
		
	}




	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified");		
		
	}




	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated");		
		
	}




	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated");		
		
	}

	
	
	public static void main(String[] args) {
		
		new TestWindowEvent();
		
		
	}//main
}
