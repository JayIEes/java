package day0125;


import javax.swing.JFrame;
import javax.swing.JWindow;

/**
 * @author user
 * Window�� ��ӹ����� ������Ʈ�� �����̳� ������Ʈ�� ��ġ�Ͽ� �����ֱ� ���� JFrame�� �ʿ��ϴ�.
 */
@SuppressWarnings("serial")
public class UseJWindow extends JWindow {

	public UseJWindow(JFrame jf) {
		super(jf);
		jf.setSize(400,400);
		jf.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		JFrame jf=new JFrame();
		new UseJWindow(jf); 
				
		
		
	}//main
}//class
