package day0126;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class UseJButton extends JFrame {

	public UseJButton() {
		super("버튼의 제어");
		
		ImageIcon ii=new ImageIcon("E:/dev/workspace/javase_prj/src/day0126/images/img1.PNG");
		ImageIcon ii2=new ImageIcon("E:/dev/workspace/javase_prj/src/day0126/images/img2.PNG");
		ImageIcon ii3=new ImageIcon("E:/dev/workspace/javase_prj/src/day0126/images/img3.PNG");
		ImageIcon ii4=new ImageIcon("E:/dev/workspace/javase_prj/src/day0126/images/img4.PNG");
	
		//버튼생성
		JButton jbtn=new JButton("프로도",ii);
		JButton jbtn2=new JButton("제이지",ii2);
		JButton jbtn3=new JButton("어피치",ii3);
		
		//버튼 객체 제어
		jbtn.setToolTipText("강아지를 형상화");
		jbtn2.setToolTipText("고양이를 형상화");
		jbtn3.setToolTipText("복숭아를 형상화");
		
		
		//마우스포인터가 올라갔을 때 이미지를 변경. RollOver (AWT에서는 안됨)
		jbtn.setRolloverIcon(ii4);
		
		
		//버튼의 텍스트 이동
		//수직이동
		jbtn.setVerticalTextPosition(JButton.BOTTOM);//TOP, CENTER, BOTTOM
		//수평이동
		jbtn2.setHorizontalTextPosition(JButton.RIGHT);//LEFT,CENTER,RIGHT,
		
		jbtn3.setVerticalTextPosition(JButton.TOP);
		jbtn3.setHorizontalTextPosition(JButton.CENTER);
		
		
		//배치
		//배치관리자 BorderLayout -> GridLayout변경
		setLayout(new GridLayout());
		
		add(jbtn);
		add(jbtn2);
		add(jbtn3);
		
		//윈도우 크기 설정
		setBounds(100,150,650,250);
		
		//가시화
		setVisible(true);
		
		
		//종료처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}//UseJButton
	
	
	public static void main(String[] args) {
		new UseJButton();
		
		
	}//main

}
