package day0125;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author user
 * Swing Component를 사용한 Window Application 작성 방법.
 */
@SuppressWarnings("serial")
//1. 윈도우 컨포넌트를 상속받는다. : 내가 만든 클래스에서 윈도우 컴포넌트의 모든 기능을 사용.
public class HelloSwing extends JFrame { //한번 실행시 절대 꺼지지 않는다;

	public HelloSwing() {
		super("안녕 스윙"); // 부모클래스의 생성자를 부름  //타이틀 바레 메세지 넣기
		
		//2. 사용자에게 제공할 컴포넌트 생성. (Swing은 AWT컴포넌트를 혼합하여 사용할 수 있다.
		JButton jbtn=new JButton("Swing 버튼");
		Button btn=new Button("AWT 버튼"); //has a 관계
	
		//3. 생성된 컴포넌트를 윈도우 컴포넌트에 배치
		//여러 컴포넌트를 한번에 보여주려면 Container Component가 사용되거나
		//윈도우 컴포넌트에 배치관리자(LayoutManager)를 변경하여 보여준다.
		setLayout(new GridLayout(1,2)); //배치관리자 변경
		
		add(jbtn); //변경된 배치관리자에 맞게 컴포넌트가 배치
		add(btn);
		
		//4. 윈도우의 크기 설정
		setSize(500,250); //픽셀임
		
		//5.사용자에게 보여주기(윈도우 컴포넌트는 사용자에게 보여주기를 해야 보여진다.)
		setVisible(true);
		
		//6. 윈도우 종류 이벤트처리
//		addWindowListener(new WindowAdapter() {//anonymous innerclass
//			@Override
//			public void windowClosing(WindowEvent e) {
//				dispose();
//			}
//		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new HelloSwing();
		
	}//main

}
