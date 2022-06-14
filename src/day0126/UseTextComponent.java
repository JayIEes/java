package day0126;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class UseTextComponent extends JFrame {

	public UseTextComponent() {
		super("TextComponent����");
		
		JTextField jtf =new JTextField();
		JPasswordField jpf =new JPasswordField();
		JTextArea jta =new JTextArea();
	
		//�۲� ����
		jtf.setFont(new Font("����ü" , Font.BOLD, 20));
		jta.setFont(new Font("�ü�ü",Font.ITALIC|Font.BOLD,25));
		
		//���⹮�� ����
		jpf.setEchoChar('*'); //�ѱ۵� ����
		//JTA�� �ٴ����� �ٲ�
		jta.setLineWrap(true);//�ܾ� �����ϰ� ���� �ٲ�
		//JTA�� �ٴܾ� ��ȣ �ɼ�(�ѱ�x)
		jta.setWrapStyleWord(true);

		//JTextArea�� ScrollBar�� �����Ƿ� ScrollBar�� ������ JScrollPane�� has a���踦 ������ ��
		JScrollPane jsp=new JScrollPane(jta);
		
		//border����
		jtf.setBorder(new TitledBorder("�̸�"));
		jpf.setBorder(new TitledBorder("����"));
		jsp.setBorder(new TitledBorder("���")); //line border�� ���� border���� �ٲ� ���� �ִ�?
		
		
		//��ġ
		setLayout(null);
		
		//��ǥ, ũ�� ����
		jtf.setBounds(20,30,200,40);
		jpf.setBounds(20,100,200,40);
//		jta.setBounds(20,160,200,190);
		jsp.setBounds(20,160,200,190);
		
//		jsb.creatHori

		//��ġ
		add(jtf);
		add(jpf);
//		add(jta);
		//JTextArea�� ���� JScrollPane�� ��ġ�Ѵ�.
		add(jsp);
		
		setBounds(100,100,250,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}//UseTextComponent
	
	
	
	public static void main(String[] args) {
		new UseTextComponent();
		
		
	}//main

}
