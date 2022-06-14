package day0127;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
//1. 윈도우 컴포넌트 상속
//E-1. 이벤트를 처리할 인터페이스 구현
public class UseActionEvent extends JFrame implements ActionListener {

	
	//이벤트처리에 관련있는 컴포넌트를 class field에 선언
	private JTextField jtfName; //인스턴스 변수
	private JTextArea jtaNameDisp;
	private JButton jbtnAdd;
	
	public UseActionEvent() {
		super("버튼류에서 발생하는 이벤트");
	
		//2. 컴포넌트 생성
		//일반컴포넌트-기능제공
		JLabel jlblName=new JLabel("이름"); //지역변수
		
		jbtnAdd=new JButton("추가");//인스턴수 변수의 생성
		
		jtfName=new JTextField(10); //인스턴수 변수의 생성
		
		jtaNameDisp=new JTextArea();
		
		
		//컨테이너 컴포넌트 - 일반 컴포넌트를 배치하는 것.
		JPanel jpNorth=new JPanel();
		
		
		//E-4. 컴포넌트가 이벤트를 발생시킬 수 있도록 이벤트에 등록
		jbtnAdd.addActionListener(this);//버튼 클릭 => 입력된 객체가 Override한 method가 호출 : actionPerformed가 호출
		jtfName.addActionListener(this);//TextField 에서 엔터
		
//		System.out.println(jtfName);
//		System.out.println(jbtnAdd);
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
	
	//E-2. Abstract Method의 Override
	@Override
	public void actionPerformed(ActionEvent ae) { //컴포넌트.addXxxListener(객체);의 메소드에서 호출된다.
		//E-3. 이벤트가 발생했을 때 사용자에게 제공할 코드(동작)
//		버튼이 눌리면 JTextField의 값을 얻어와서 
		
		System.out.println("이벤트 발생"+ae.getSource());
		
		String source="";
		
		if(ae.getSource()==jbtnAdd){
			source="버튼";
		}else 
		
		if(ae.getSource()==jtfName){
			source="텍스트 필드";
		}//end if
		
		String txt=jtfName.getText(); //인스턴스 변수
		//JTextArea에 넣는다.
//		jtaNameDisp.setText(txt); //기존의 값을 지우고 새로 설정함.
		jtaNameDisp.append(source+" "+txt); //기존 값 뒤에 붙일 수 있음,	옆으로로 나오기 때문에 \n필요
		jtaNameDisp.append("\n"); 
		
		//JTextField의 값 삭제
		jtfName.setText("");
	}//actionPerformed
	
	
	public static void main(String[] args) {
		new UseActionEvent();
		
	}//main





}
