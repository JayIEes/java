package day0125;

import javax.swing.JFrame;

/**
 * @author user
 * JFrame�� ��ӹ����� Window���� �����Ǿ� ª�� �ڵ�� ����ڿ��� Application�� ������ �� �ִ�.
 */
@SuppressWarnings("serial")
public class UseJFrame extends JFrame {

	public UseJFrame() {
		setSize(800,200);
		setVisible(true); 
	}
	
	public static void main(String[] args) {
		
		new UseJFrame();
		
		
	}

}
