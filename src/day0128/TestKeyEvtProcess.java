package day0128;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * has a 관계로 TestKeyEvtDesign 클래스의 이벤트를 처리할 클래스
 * @author user
 */
public class TestKeyEvtProcess extends WindowAdapter implements KeyListener {

	
	private TestKeyEvtDesign tked;
	
	public TestKeyEvtProcess(TestKeyEvtDesign tked) {
		this.tked=tked;
		
		
		
	}//TestKeyEvtProcess
	
	
	
	
	@Override
	public void windowClosing(WindowEvent e) {
		tked.dispose();
	}//windowClosing




	@Override
	public void keyTyped(KeyEvent e) {
//		System.out.println("keyTyped");
	}//

	@Override
	public void keyPressed(KeyEvent ke) {
//		System.out.println("keyPressed");

		System.out.println(ke.getKeyChar());
		System.out.println(ke.getKeyCode()); //키에대한 유일한 값  //ASCII -대문자, 소문자가 다른 값

	}

	@Override
	public void keyReleased(KeyEvent ke) {
//		System.out.println("keyReleased");
		//눌린 키의 키 값과 키 코드 얻기
		tked.getJlblOutput().setText(String.valueOf(ke.getKeyCode()+"/"+ke.getKeyChar())); 
		//int를 String으로- 기본형이니까 toString()말고!!! String.valueOf() 사용하기...!
		
		//콘솔에 JTextField에 입력된 모든 문자열을 출력
		System.out.println(tked.getJtfKey().getText());
		
		
		//ESC키가 눌려지면 프로그램 종료
		switch(ke.getKeyCode()) { 
		case KeyEvent.VK_ESCAPE : //27이라고 하지말고 상수로
			tked.dispose();
		}
	}//keyReleased

}//class
