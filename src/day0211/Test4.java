package day0211;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Test4 extends JFrame {

	private JButton jbtn;
	
	public Test4() {
		super("테스트");
		jbtn=new JButton("클릭");
		//람다식으로 버튼을 눌렀을 때 confirm dialog로 종료 여부를 물어보고 "예"가 클릭되면 
		//윈도우를 종료하는 코드
//		ActionListener al=(ActionEvent ae)->{
//			
//		};
		jbtn.addActionListener((ActionEvent e)->{
			switch(JOptionPane.showConfirmDialog(this, "종료하시겠습니까?")) {
			case JOptionPane.OK_OPTION:
				dispose();
			}
		});
			
		
		add("Center",jbtn);
		setSize(300,300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {

		new Test4();
		
	}//main

}//class
