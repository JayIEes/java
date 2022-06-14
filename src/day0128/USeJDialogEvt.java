package day0128;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

/**
 * @author user
 * ���̾�α��� �̺�Ʈ�� has a ����� ó���ϱ����� Ŭ����
 */
public class USeJDialogEvt extends WindowAdapter implements ActionListener {

	private UseJDialog ujd;
	
	public USeJDialogEvt(UseJDialog ujd) {
		this.ujd=ujd;
	}
	
	
	@Override
	public void windowClosing(WindowEvent e) {
		//���� �۾� �� ���� �� �� �� �ִ�
		switch(JOptionPane.showConfirmDialog(ujd, "�����Ͻðڽ��ϱ�?")){
		case JOptionPane.OK_OPTION:
			ujd.dispose(); break;
		case JOptionPane.OK_CANCEL_OPTION:
		ujd.dispose();
		}
//		ujd.dispose();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ujd.dispose();
	}




}
