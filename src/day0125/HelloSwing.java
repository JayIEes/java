package day0125;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author user
 * Swing Component�� ����� Window Application �ۼ� ���.
 */
@SuppressWarnings("serial")
//1. ������ ������Ʈ�� ��ӹ޴´�. : ���� ���� Ŭ�������� ������ ������Ʈ�� ��� ����� ���.
public class HelloSwing extends JFrame { //�ѹ� ����� ���� ������ �ʴ´�;

	public HelloSwing() {
		super("�ȳ� ����"); // �θ�Ŭ������ �����ڸ� �θ�  //Ÿ��Ʋ �ٷ� �޼��� �ֱ�
		
		//2. ����ڿ��� ������ ������Ʈ ����. (Swing�� AWT������Ʈ�� ȥ���Ͽ� ����� �� �ִ�.
		JButton jbtn=new JButton("Swing ��ư");
		Button btn=new Button("AWT ��ư"); //has a ����
	
		//3. ������ ������Ʈ�� ������ ������Ʈ�� ��ġ
		//���� ������Ʈ�� �ѹ��� �����ַ��� Container Component�� ���ǰų�
		//������ ������Ʈ�� ��ġ������(LayoutManager)�� �����Ͽ� �����ش�.
		setLayout(new GridLayout(1,2)); //��ġ������ ����
		
		add(jbtn); //����� ��ġ�����ڿ� �°� ������Ʈ�� ��ġ
		add(btn);
		
		//4. �������� ũ�� ����
		setSize(500,250); //�ȼ���
		
		//5.����ڿ��� �����ֱ�(������ ������Ʈ�� ����ڿ��� �����ֱ⸦ �ؾ� ��������.)
		setVisible(true);
		
		//6. ������ ���� �̺�Ʈó��
//		addWindowListener(new WindowAdapter() {//anonymous innerclass
//			@Override
//			public void windowClosing(WindowEvent e) {
//				dispose();
//			}
//		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new HelloSwing();
		
	}//main

}
