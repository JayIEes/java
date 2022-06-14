package day0126;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class Homework0126 extends JFrame{

	
	public Homework0126() {
		super("사원관리");
		
	
		//라벨
		JLabel jlbl=new JLabel("번호");
		JLabel jlbl2=new JLabel("이름");
		JLabel jlbl3=new JLabel("성별");
		JLabel jlbl4=new JLabel("이메일");
		
		
		//텍스트필드
		JTextField jtfNum=new JTextField();
		JTextField jtfName=new JTextField();
		JTextField jtfEmail=new JTextField();
		
		//라디오버튼
		JRadioButton jrbM=new JRadioButton("남");
		JRadioButton jrbF=new JRadioButton("여");
		
		
		//TextArea
		JTextArea jtaData=new JTextArea();
		
		//JTextArea ScrollBar추가
		JScrollPane jsp=new JScrollPane(jtaData);
		
		//버튼
		JButton jbtnAdd= new JButton("추가");
		JButton jbtnDelete= new JButton("삭제");
		JButton jbtnModify= new JButton("변경");
		JButton jbtnClose= new JButton("닫기");
		
		
		
		//데이터 부분 Border설정
		jsp.setBorder(new TitledBorder("데이터"));
		
		
		//라벨 텍스트 배치
		jlbl.setHorizontalAlignment(JLabel.CENTER);
		jlbl2.setHorizontalAlignment(JLabel.CENTER);
		jlbl3.setHorizontalAlignment(JLabel.CENTER);
		jlbl4.setHorizontalAlignment(JLabel.CENTER);
		
		
		//라벨 색
		jlbl.setOpaque(true);
		jlbl.setBackground(new Color(0xD5D5D5));
		jlbl2.setOpaque(true);
		jlbl2.setBackground(new Color(0xD5D5D5));
		jlbl3.setOpaque(true);
		jlbl3.setBackground(new Color(0xD5D5D5));
		jlbl4.setOpaque(true);
		jlbl4.setBackground(new Color(0xD5D5D5));
		
		
		//라디오 버튼 하나만 제한
		ButtonGroup bg=new ButtonGroup();
		bg.add(jrbM);
		bg.add(jrbF);
		
		
		//배치
		setLayout(null);
		
		
		//좌표
		jlbl.setBounds(20,30,80,30);
		jlbl2.setBounds(20,70,80,30);
		jlbl3.setBounds(20,110,80,30);
		jlbl4.setBounds(20,150,80,30);
		
		jtfNum.setBounds(110,30,130,30);
		jtfName.setBounds(110,70,130,30);
		jtfEmail.setBounds(110,150,130,30);
		
		jsp.setBounds(250,25,200,150);
		
		jrbM.setBounds(110,100,50,50);
		jrbF.setBounds(170,100,50,50);
		
		jbtnAdd.setBounds(85,215,70,25);
		jbtnDelete.setBounds(170,215,70,25);
		jbtnModify.setBounds(255,215,70,25);
		jbtnClose.setBounds(340,215,70,25);
		
		
		
		//배치한다.
		add(jlbl);
		add(jlbl2);
		add(jlbl3);
		add(jlbl4);
		
		add(jtfNum);
		add(jtfName);
		add(jtfEmail);
		
		add(jsp); //스크롤
		
		add(jrbM);
		add(jrbF);
		
		add(jbtnAdd);
		add(jbtnDelete);
		add(jbtnModify);
		add(jbtnClose);
		
		
		//윈도우 크기
		setSize(520,300);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}//Homework0126
	
	
	
	public static void main(String[] args) {

		new Homework0126();
		
	}//main

}//class
