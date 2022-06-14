package day0128;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
//1.������ ������Ʈ ���
public class TestKeyEvtDesign extends JFrame {

	//2. �̺�Ʈ ó���� ���ȴ� ������Ʈ�� ����
	private JTextField jtfKey;
	private JLabel jlblOutput;
	
	public TestKeyEvtDesign() {
		
		super("Ű���� �̺�Ʈ");
		
		jtfKey=new JTextField();
		jlblOutput =new JLabel("��� : ");
		
		Font font=new Font("���� ���", Font.BOLD, 20);
		jtfKey.setFont(font);
		jlblOutput.setFont(font);
		
		setLayout(new GridLayout(2, 1)  );
		
		add(jtfKey);
		add(jlblOutput);
		
		//�̺�Ʈ ��� 
		TestKeyEvtProcess tkep=new TestKeyEvtProcess(this); //has a ����
		jtfKey.addKeyListener(tkep); //JTextField�� �̺�Ʈ�� ���
		addWindowListener(tkep); //JFrame�� �̺�Ʈ�� ���
		
		setBounds(100, 100, 300, 150);
		setVisible(true);
		
	}//TestKeyEvtDesign
	
	
	
	public JLabel getJlblOutput() {
		return jlblOutput;
	}



	public JTextField getJtfKey() {
		return jtfKey;
	}



	public static void main(String[] args) {
		new TestKeyEvtDesign();
		
	}//main

}
