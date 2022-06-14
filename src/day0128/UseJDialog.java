package day0128;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class UseJDialog extends JDialog {

	private JButton jbtnClose;
	
	public UseJDialog(UseJMenu ujm) {
		super(ujm,"�ڽ�â",true); //UseJMenu(������)Ŭ������ �θ���������� Dialog����
		
		jbtnClose=new JButton("�ݱ�");
		JPanel jpSouth=new JPanel(); //BorderLayout���� ��ư�� ���� ũ��� ��ġ�ϱ� ���� ���
		jpSouth.add(jbtnClose);
		
		add("South", jpSouth);
		
		//�̺�Ʈ ��� :setVisible ���� �Ǿ��Ѵ�.
		USeJDialogEvt ujde=new USeJDialogEvt(this);
		addWindowListener(ujde);
		jbtnClose.addActionListener(ujde);
		
//		setBounds(100,100,400,400); //������ǥ�� �θ�������� ���þ��� �׻� ������ ��ġ���� ��Ÿ����.
		setBounds(ujm.getX()+50,ujm.getY()+50,400,300);
		setVisible(true);
		
		
		
		
//		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}//UseJDialog

	public JButton getJbtnClose() {
		return jbtnClose;
	}//getJbtnClose
	
	
	
}//class UseJDialog
