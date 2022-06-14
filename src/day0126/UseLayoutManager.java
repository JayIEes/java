package day0126;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
//1. 윈도우 컴포넌트 상속
public class UseLayoutManager extends JFrame {


	public UseLayoutManager() {
		super("복합적으로 사용하는 레이아웃 매니저");
	
		//2. 컴포넌트 생성
		//일반컴포넌트-기능제공
		JLabel jlblName=new JLabel("이름");
		JTextField jtfName=new JTextField(10);
		JButton jbtnAdd=new JButton("추가");
		JTextArea jtaNameDisp=new JTextArea();
		
		
		//컨테이너 컴포넌트 - 일반 컴포넌트를 배치하는 것.
		JPanel jpNorth=new JPanel();
		
		//3. 배치
		//컨테이너 컴포넌트에 일반 컴포넌트 배치
		jpNorth.add(jlblName);
		jpNorth.add(jtfName);
		jpNorth.add(jbtnAdd);
		
		
		//윈도우 컴포넌트(BorderLayout)에 배치
		add("North",jpNorth);
		add("Center",jtaNameDisp);
		
		//4. 윈도우 크기설정
		setSize(400,300);
		
		//5. 가시화
		setVisible(true);
		
		//6. 종료 이벤트처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}//UseLayoutManager
	
	
	
	
	public static void main(String[] args) {
		new UseLayoutManager();
		
	}//main

}
