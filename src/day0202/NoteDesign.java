package day0202;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class NoteDesign extends JFrame  {

	private JMenuItem file; //새 글
	private JMenuItem file5; //닫기
	private JMenuItem form; //글꼴
	private JTextArea jta; //텍스트 area
	
	
	public NoteDesign() {
		
		super("메모장");
		
		//TextArea
		jta=new JTextArea();
		
		//TextArea 스크롤
		JScrollPane jsp =new JScrollPane(jta);
		
		//부모창 메뉴
		JMenuBar jmb=new JMenuBar(); //메뉴바
		
		JMenu jmFile=new JMenu("파일"); //메뉴
		JMenu jmForm=new JMenu("서식");
		JMenu jmHelp=new JMenu("도움말");
		
		file=new JMenuItem("새 글");//메뉴 아이템
		JMenuItem file2=new JMenuItem("열기");
		JMenuItem file3=new JMenuItem("저장");
		JMenuItem file4=new JMenuItem("다른 이름으로 저장");
		file5=new JMenuItem("닫기");
		
		form=new JMenuItem("글꼴");
		
		
		
		JMenuItem help=new JMenuItem("메모장 정보");
		
		//메뉴아이템 메뉴에 배치
		jmFile.add(file);
		jmFile.add(file2);
		jmFile.add(file3);
		jmFile.add(file4);
		jmFile.add(file5);
		
		jmForm.add(form);
		
		jmHelp.add(help);
		
		//메뉴를 메뉴바에 배치
		jmb.add(jmFile);
		jmb.add(jmForm);
		jmb.add(jmHelp);
		
		setJMenuBar(jmb);

		//액션 등록
		NoteEvt ne=new NoteEvt(this);
		file.addActionListener(ne);
		file5.addActionListener(ne);
		form.addActionListener(ne);
		
		
		
		//배치
		add("Center",jsp);
		
		
		setBounds(600,200,800,600);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//NoteDesign 생성자
	
	
	
	
	
	public JMenuItem getFile() {
		return file;
	}





	public JMenuItem getFile5() {
		return file5;
	}





	public JMenuItem getForm() {
		return form;
	}





	public JTextArea getJta() {
		return jta;
	}






	public static void main(String[] args) {

		new NoteDesign();
		
	}//main

}//class
