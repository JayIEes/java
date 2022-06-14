package day0203;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class UseFileDialogView extends JFrame { 

	//�����ο��� "������Ʈ������+�ϴ���" �� �̸� ������ �밡���� ǥ���(Hungarian Notation)
	private JButton jbtnLoad, jbtnSave, jbtnInput, jbtnMsg, jbtnCon;
	
	
	public UseFileDialogView() {
		super("���ϴ��̾�α� ���");
		
		jbtnLoad=new JButton("���� ���̾�α�");
		jbtnSave=new JButton("���� ���̾�α�");
		
		jbtnInput=new JButton("�Է� ���̾�α�");
		jbtnMsg=new JButton("�޼��� ���̾�α�");
		jbtnCon=new JButton("Ȯ�� ���̾�α�");
		
		setLayout(new FlowLayout());
		
		add(jbtnLoad);
		add(jbtnSave);
		add(jbtnInput);
		add(jbtnMsg);
		add(jbtnCon);
		
		//������Ʈ���� �߻��� �̺�Ʈ�� JVM�� û���� �� �ֵ��� �̺�Ʈ ���
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
