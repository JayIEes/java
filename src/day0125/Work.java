package day0125;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Work extends JFrame {
	
	public Work() {
		super("버튼");
		
		String[] btnLabel="1,2,3,4,5,6,7,8,9,*,0,#".split(",");
		
		setLayout(new GridLayout(4,3));
		
		JButton[] jbtn = new JButton[btnLabel.length];//빈 버튼 배열 생성, 모든 방의 값이 null
		
		for(int i=0;i<btnLabel.length;i++){ //배열 번째 방에 JButton객체를 생성한다.
			jbtn[i] = new JButton(btnLabel[i]); // 생성된 버튼 객체를 배치한다.
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
