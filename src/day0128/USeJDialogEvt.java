package day0128;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

/**
 * @author user
 * 다이얼로그의 이벤트를 has a 관계로 처리하기위한 클래스
 */
public class USeJDialogEvt extends WindowAdapter implements ActionListener {

	private UseJDialog ujd;
	
	public USeJDialogEvt(UseJDialog ujd) {
		this.ujd=ujd;
	}
	
	
	@Override
	public void windowClosing(WindowEvent e) {
		//종료 작업 때 일을 더 할 수 있다
		switch(JOptionPane.showConfirmDialog(ujd, "종료하시겠습니까?")){
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
