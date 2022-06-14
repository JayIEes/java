package day0125;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class UseGridLayout extends JFrame {
//1. 윈도우 컴포넌트 상속
	public UseGridLayout() {
		super("그리드레이아웃 연습");

		//2. 컴토넌트 생성
		JLabel jlblHobby=new JLabel("취미");
		JLabel jlblGender=new JLabel("성별");
		
		JCheckBox jcbHobby1=new JCheckBox("등산");
		JCheckBox jcbHobby2=new JCheckBox("낚시");
		
		JRadioButton jrbM=new JRadioButton("남자");
		JRadioButton jrbF=new JRadioButton("여자");
		//ButtonGroup을 생성해야 RadioButton이 하나만 선택된다.
		ButtonGroup bg=new ButtonGroup();  //////////////중요!! radio버튼 그룹으로 묶인다.
		bg.add(jrbM); //ButtonGroup과 JRadioButton은 has a 관계
		bg.add(jrbF);
		
		
		//3. 컴포넌트 배치
		//배치관리자 설정 
		setLayout(new GridLayout(2, 3)); //말도 안되는 행과 열이 나와도 알아서 나옴
		add(jlblHobby);
		add(jcbHobby1);
		add(jcbHobby2);
		
		add(jlblGender);
		add(jrbM);
		add(jrbF);
		
		//4. 윈도우 크기 설정
		setSize(300,200);
		
		
		//5. 가시화
		setVisible(true);
		
		//6.윈도우 종료 이벤트 처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}// UseGridLayout
	
	
	public static void main(String[] args) {
		new UseGridLayout();
	}//main

}
