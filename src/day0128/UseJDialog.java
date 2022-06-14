package day0128;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class UseJDialog extends JDialog {

	private JButton jbtnClose;
	
	public UseJDialog(UseJMenu ujm) {
		super(ujm,"자식창",true); //UseJMenu(윈도우)클래스를 부모윈도우로한 Dialog생성
		
		jbtnClose=new JButton("닫기");
		JPanel jpSouth=new JPanel(); //BorderLayout에서 버튼을 고유 크기로 배치하기 위해 사용
		jpSouth.add(jbtnClose);
		
		add("South", jpSouth);
		
		//이벤트 등록 :setVisible 전에 되야한다.
		USeJDialogEvt ujde=new USeJDialogEvt(this);
		addWindowListener(ujde);
		jbtnClose.addActionListener(ujde);
		
//		setBounds(100,100,400,400); //고정좌표로 부모윈도우와 관련없이 항상 정해진 위치에서 나타난다.
		setBounds(ujm.getX()+50,ujm.getY()+50,400,300);
		setVisible(true);
		
		
		
		
//		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}//UseJDialog

	public JButton getJbtnClose() {
		return jbtnClose;
	}//getJbtnClose
	
	
	
}//class UseJDialog
