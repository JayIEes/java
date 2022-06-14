package day0128;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class UseJMenu extends JFrame  {

	//3. 메뉴 아이텐 선언 - 이벤트 발생 시 비교당해야하기 때문에
	private JMenuItem jminew, jmiDialog,jmiClose,jmiHelp;
	
	
	
	public UseJMenu() {
		
		super("메뉴연습");
		
		//1.메뉴바를 생성
		JMenuBar jmb=new JMenuBar();
		//2.메뉴를 생성
		JMenu jm=new JMenu("메뉴1");
		JMenu jm2=new JMenu("메뉴2");
		//3. 메뉴아이템을 생성
		jminew=new JMenuItem("메뉴아이템");
		jmiDialog=new JMenuItem("다이얼로그");
		jmiClose=new JMenuItem("닫기");
		jmiHelp=new JMenuItem("도움말");
		
		//4.메뉴아이템을 메뉴에 배치
		jm.add(jminew);
		jm.add(jmiDialog);
		jm.addSeparator(); // 구분선
		jm.add(jmiClose);
		
		jm2.add(jmiHelp);
		
		//5. 메뉴를 메뉴바에 배치
		jmb.add(jm);
		jmb.add(jm2);
		
		//6. 메뉴바를 프레임에 배치
		setJMenuBar(jmb);
		
		//메뉴아이템의 이벤트 등록
		//has a
		UseJMenuEvt ujme=new UseJMenuEvt(this);
		jmiDialog.addActionListener(ujme);
		jmiClose.addActionListener(ujme);
		
		setSize(600,400);
		setVisible(true);
		
		
	}//UseJMenu
	
	
	
	
	
	public JMenuItem getJminew() {
		return jminew;
	}





	public JMenuItem getJmiDialog() {
		return jmiDialog;
	}





	public JMenuItem getJmiClose() {
		return jmiClose;
	}





	public JMenuItem getJmiHelp() {
		return jmiHelp;
	}





	public static void main(String[] args) {
		new UseJMenu();
		
	}//main

}
