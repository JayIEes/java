package day0128;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * ������ Ŭ������ �޾�(has a) ������ Ŭ������ �̺�Ʈ�� ó���ϴ� Ŭ����
 * @author user
 */
public class TestAdapterHasA extends WindowAdapter {

	private TestDesign td;//���� ��ü�� �� Ŭ������ ��� instance �������� ����ϱ�����.
	
	public TestAdapterHasA(TestDesign td) {
		this.td=td;
	}//TestAdapterHasA
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("�ܺ�Ŭ�������� ������ ���� �̺�Ʈ ó��");
//		dispose(); //TestAdapterHasA Ŭ������ ��� �ٿ��� �� ����� �������� �ʴ´�.
		td.dispose();
	}//windowClosing

	
	
	
	
}//class
