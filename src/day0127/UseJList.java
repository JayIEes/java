package day0127;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class UseJList extends JFrame {

	public UseJList() {
		super("MVC Pattern이 도입된 클래스");
		
		//컴포넌트 생성
		//MVC Pattern이 도입된 컴포넌트는 Model로부터 생성
		DefaultListModel<String> dlmFriend=new DefaultListModel<String>();
		DefaultListModel<String> dlmBlockedFriend=new DefaultListModel<String>();
		
		JList<String> listFriend= new JList<String>(dlmFriend);
		JList<String> listBlockedFriend= new JList<String>(dlmBlockedFriend);

		//JList는 스크롤 바가 없어서 JScrollPane 즉 Container컴포넌트를 사용해서 스크롤바 설정
		JScrollPane jspListFriend = new JScrollPane(listFriend);
		JScrollPane jspListBlockedFriend = new JScrollPane(listBlockedFriend);
		
		jspListFriend.setBorder(new TitledBorder("친구목록"));
		jspListBlockedFriend.setBorder(new TitledBorder("차단친구목록"));
		
		JButton jbtnBlock=new JButton(">>");
		JButton jbtnUnblock=new JButton("<<");
		
		
		//Model을 통해서 데이터를 추가한다. //Model애 데이터를 넣지 View에 넣지 않는다.
		dlmFriend.addElement("김철수");
		dlmFriend.addElement("김하나");
		dlmFriend.addElement("이영희");
		dlmFriend.addElement("강현정");
		dlmFriend.addElement("박소영");
		dlmFriend.addElement("김희정");
		dlmFriend.addElement("안서희");
		
		dlmBlockedFriend.addElement("조민혁");
		dlmBlockedFriend.addElement("이나리");
		dlmBlockedFriend.addElement("김건희");
		dlmBlockedFriend.addElement("이재용");
		
		
		
		
		//배치
		setLayout(null); //자동 배치관리자를 해제
		//위치, 크기 설정
		jspListFriend.setBounds(20,40,200,350);
		jspListBlockedFriend.setBounds(330,40,200,350);
		jbtnBlock.setBounds(250,150,50,40);
		jbtnUnblock.setBounds(250,220,50,40);
		
		
		add(jspListFriend);
		add(jspListBlockedFriend);
		add(jbtnBlock);
		add(jbtnUnblock);
		
		
		setBounds(100,150,600,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
	}//UseJList
	
	
	public static void main(String[] args) {
		
		new UseJList();
		
		
	}//main

}
