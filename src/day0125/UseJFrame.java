package day0125;

import javax.swing.JFrame;

/**
 * @author user
 * JFrame을 상속받으면 Window부터 생성되어 짧은 코드로 사용자에게 Application을 제공할 수 있다.
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
