package day0128;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class TestAdapterInnerClass extends JFrame {

	public TestAdapterInnerClass() {
		super("inner class�� ����� �̺�Ʈ ó�����");
		
		
//		//inner class ��üȭ
//		TestAdapterInnerClass.InnerEvent ie=this.new InnerEvent();
//		//�̺�Ʈ ���
//		addWindowListener(ie);

		addWindowListener(new InnerEvent());
		
		
		setSize(400,300);
		setVisible(true);
		
		
	}//TestAdapterInnerClass
	
	
	///////////////////////////////inner class ����/////////////////////////////////////////
	
	public class InnerEvent extends WindowAdapter{

		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("inner class���� ó���� ������ ���� �̺�Ʈ");
			super.windowClosing(e);
			dispose(); //Window class�� ����޼ҵ��ε�,
			//inner class�� �ٱ� Ŭ������ �ڿ��� ���� �θ� �� �����ϱ�.
		}//windowClosing
		
	}//class
	
	////////////////////////////////inner class ��/////////////////////////////////////////
	
	
	public static void main(String[] args) {
		new TestAdapterInnerClass();
	}//main

}
