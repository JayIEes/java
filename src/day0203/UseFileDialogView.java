package day0203;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class UseFileDialogView extends JFrame { 

	//디자인에서 "컴포넌트의종류+하는일" 의 이름 형식을 헝가리안 표기법(Hungarian Notation)
	private JButton jbtnLoad, jbtnSave, jbtnInput, jbtnMsg, jbtnCon;
	
	
	public UseFileDialogView() {
		super("파일다이얼로그 사용");
		
		jbtnLoad=new JButton("열기 다이얼로그");
		jbtnSave=new JButton("저장 다이얼로그");
		
		jbtnInput=new JButton("입력 다이얼로그");
		jbtnMsg=new JButton("메세지 다이얼로그");
		jbtnCon=new JButton("확인 다이얼로그");
		
		setLayout(new FlowLayout());
		
		add(jbtnLoad);
		add(jbtnSave);
		add(jbtnInput);
		add(jbtnMsg);
		add(jbtnCon);
		
		//컴포넌트에서 발생한 이벤트를 JVM이 청취할 수 있도록 이벤트 등록
		UseFileDialogEvt ufde=new UseFileDialogEvt(this);
		addWindowListener(ufde);
		jbtnLoad.addActionListener(ufde);
		jbtnSave.addActionListener(ufde);
		
		jbtnInput.addActionListener(ufde);
		jbtnMsg.addActionListener(ufde);
		jbtnCon.addActionListener(ufde);
		
		
		setBounds(100,100,700,200);
		setVisible(true);
		
		
	}//UseFileDialogView
	
	
	
	public JButton getJbtnLoad() {
		return jbtnLoad;
	}



	public JButton getJbtnSave() {
		return jbtnSave;
	}



	public JButton getJbtnInput() {
		return jbtnInput;
	}



	public JButton getJbtnMsg() {
		return jbtnMsg;
	}



	public JButton getJbtnCon() {
		return jbtnCon;
	}



	public static void main(String[] args) {
		new UseFileDialogView();
	}//main

}
