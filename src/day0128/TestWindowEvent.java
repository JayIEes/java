package day0128;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class TestWindowEvent extends JFrame implements WindowListener{

	
	
	public TestWindowEvent() {
		super("윈도우 이벤트 연습");
		
		//이벤트 등록
		addWindowListener(this); //JVM이 이벤트를 감지함
		
		
		setSize(300,400);
		setVisible(true);
		
	}//TestWindowEvent
	
	
	
	




	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("WindowOpened");
	}




	@Override
	public void windowClosing(WindowEvent e) { //closing 상태에서 dispose메소드가 불려지면
		System.out.println("windowClosing");		
		dispose(); //윈도우 작업이 종료되고
		System.exit(0); //여기서 끝내  //0 -정상종료(JVM의 종료프로세스를 수행하고 종료).
		//1-비정상 종료 - (JVM의 종료 프로세스를 중단하고 종료)
	}//windowClosing




	@Override
	public void windowClosed(WindowEvent e) {//종료 완료 후 호출
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
