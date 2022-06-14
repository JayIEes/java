package day0128;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class TestDesign extends JFrame {

	public TestDesign() {
		super("외부클래스에서 이벤트 처리");
	
		//has a 관계로 이벤트를 설정 
		TestAdapterHasA taha=new TestAdapterHasA(this);
		//디자인 클래스에서 발생한 이벤트를 has a관계의 클래스에 처리하도록 등록
		addWindowListener(taha);
	
		setSize(400,400);
		setVisible(true);
		
	}//TestDesign
	
	
	public static void main(String[] args) {
		new TestDesign();
	}//main

}
