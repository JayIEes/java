package day0125;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Work extends JFrame {
	
	public Work() {
		super("��ư");
		
		String[] btnLabel="1,2,3,4,5,6,7,8,9,*,0,#".split(",");
		
		setLayout(new GridLayout(4,3));
		
		JButton[] jbtn = new JButton[btnLabel.length];//�� ��ư �迭 ����, ��� ���� ���� null
		
		for(int i=0;i<btnLabel.length;i++){ //�迭 ��° �濡 JButton��ü�� �����Ѵ�.
			jbtn[i] = new JButton(btnLabel[i]); // ������ ��ư ��ü�� ��ġ�Ѵ�.
			add(jbtn[i]);
		}
		
		setSize(400,600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Work();
	}

}
