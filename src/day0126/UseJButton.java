package day0126;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class UseJButton extends JFrame {

	public UseJButton() {
		super("��ư�� ����");
		
		ImageIcon ii=new ImageIcon("E:/dev/workspace/javase_prj/src/day0126/images/img1.PNG");
		ImageIcon ii2=new ImageIcon("E:/dev/workspace/javase_prj/src/day0126/images/img2.PNG");
		ImageIcon ii3=new ImageIcon("E:/dev/workspace/javase_prj/src/day0126/images/img3.PNG");
		ImageIcon ii4=new ImageIcon("E:/dev/workspace/javase_prj/src/day0126/images/img4.PNG");
	
		//��ư����
		JButton jbtn=new JButton("���ε�",ii);
		JButton jbtn2=new JButton("������",ii2);
		JButton jbtn3=new JButton("����ġ",ii3);
		
		//��ư ��ü ����
		jbtn.setToolTipText("�������� ����ȭ");
		jbtn2.setToolTipText("����̸� ����ȭ");
		jbtn3.setToolTipText("�����Ƹ� ����ȭ");
		
		
		//���콺�����Ͱ� �ö��� �� �̹����� ����. RollOver (AWT������ �ȵ�)
		jbtn.setRolloverIcon(ii4);
		
		
		//��ư�� �ؽ�Ʈ �̵�
		//�����̵�
		jbtn.setVerticalTextPosition(JButton.BOTTOM);//TOP, CENTER, BOTTOM
		//�����̵�
		jbtn2.setHorizontalTextPosition(JButton.RIGHT);//LEFT,CENTER,RIGHT,
		
		jbtn3.setVerticalTextPosition(JButton.TOP);
		jbtn3.setHorizontalTextPosition(JButton.CENTER);
		
		
		//��ġ
		//��ġ������ BorderLayout -> GridLayout����
		setLayout(new GridLayout());
		
		add(jbtn);
		add(jbtn2);
		add(jbtn3);
		
		//������ ũ�� ����
		setBounds(100,150,650,250);
		
		//����ȭ
		setVisible(true);
		
		
		//����ó��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}//UseJButton
	
	
	public static void main(String[] args) {
		new UseJButton();
		
		
	}//main

}
