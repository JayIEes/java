package day0128;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * has a ����� TestKeyEvtDesign Ŭ������ �̺�Ʈ�� ó���� Ŭ����
 * @author user
 */
public class TestKeyEvtProcess extends WindowAdapter implements KeyListener {

	
	private TestKeyEvtDesign tked;
	
	public TestKeyEvtProcess(TestKeyEvtDesign tked) {
		this.tked=tked;
		
		
		
	}//TestKeyEvtProcess
	
	
	
	
	@Override
	public void windowClosing(WindowEvent e) {
		tked.dispose();
	}//windowClosing




	@Override
	public void keyTyped(KeyEvent e) {
//		System.out.println("keyTyped");
	}//

	@Override
	public void keyPressed(KeyEvent ke) {
//		System.out.println("keyPressed");

		System.out.println(ke.getKeyChar());
		System.out.println(ke.getKeyCode()); //Ű������ ������ ��  //ASCII -�빮��, �ҹ��ڰ� �ٸ� ��

	}

	@Override
	public void keyReleased(KeyEvent ke) {
//		System.out.println("keyReleased");
		//���� Ű�� Ű ���� Ű �ڵ� ���
		tked.getJlblOutput().setText(String.valueOf(ke.getKeyCode()+"/"+ke.getKeyChar())); 
		//int�� String����- �⺻���̴ϱ� toString()����!!! String.valueOf() ����ϱ�...!
		
		//�ֿܼ� JTextField�� �Էµ� ��� ���ڿ��� ���
		System.out.println(tked.getJtfKey().getText());
		
		
		//ESCŰ�� �������� ���α׷� ����
		switch(ke.getKeyCode()) { 
		case KeyEvent.VK_ESCAPE : //27�̶�� �������� �����
			tked.dispose();
		}
	}//keyReleased

}//class
