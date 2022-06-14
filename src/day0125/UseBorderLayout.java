package day0125;

import java.awt.BorderLayout;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 * BorderLayout
 * @author user
 */
@SuppressWarnings("serial")
//1. 윈도우 컴포넌트를 상속
public class UseBorderLayout extends JFrame {

	public UseBorderLayout() {
		super("경계레이아웃 연습");
		
	//2. 컴포넌트 생성
		JButton jbtnSouth=new JButton("south 버튼");
		JButton jbtnEast=new JButton("East 버튼");
		JLabel jlblNorth=new JLabel("북쪽 라벨");
		JLabel jlblWest=new JLabel("서쪽 라벨");
		JTextArea jtaCenter=new JTextArea("가운데 TextArea");
		
	//3. 컴포넌트 배치
		//배치관리자 설정
//		setLayout(new BorderLayout()); //해도 안해도 괜찮
		//문자열상수
		add("North", jlblNorth);
		add("South", jbtnSouth);
		//BorderLayout Constant
		add(BorderLayout.CENTER,jtaCenter);
		add(BorderLayout.WEST,jlblWest);
		add(jbtnEast,BorderLayout.EAST);
		
		
	//4. 윈도우 크기설정
		setSize(400,400);
		
	//5.가시화
		setVisible(true);
		
	//6. 윈도우 종료 이벤트 처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//UseBorderLayout
	
	
	
	public static void main(String[] args) {

		new UseBorderLayout();
		
	}//main

}//class
