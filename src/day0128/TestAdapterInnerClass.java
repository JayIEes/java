package day0128;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class TestAdapterInnerClass extends JFrame {

	public TestAdapterInnerClass() {
		super("inner class를 사용한 이벤트 처리방법");
		
		
//		//inner class 객체화
//		TestAdapterInnerClass.InnerEvent ie=this.new InnerEvent();
//		//이벤트 등록
//		addWindowListener(ie);

		addWindowListener(new InnerEvent());
		
		
		setSize(400,300);
		setVisible(true);
		
		
	}//TestAdapterInnerClass
	
	
	///////////////////////////////inner class 시작/////////////////////////////////////////
	
	public class InnerEvent extends WindowAdapter{

		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("inner class에서 처리한 윈도우 종료 이벤트");
			super.windowClosing(e);
			dispose(); //Window class의 종료메소드인데,
			//inner class는 바깥 클래스의 자원을 맘껏 부를 수 있으니까.
		}//windowClosing
		
	}//class
	
	////////////////////////////////inner class 끝/////////////////////////////////////////
	
	
	public static void main(String[] args) {
		new TestAdapterInnerClass();
	}//main

}
