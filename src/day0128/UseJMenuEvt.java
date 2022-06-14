package day0128;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * has a 관계 이벤트 처리
 * @author user
 */
public class UseJMenuEvt extends WindowAdapter implements ActionListener {

	private UseJMenu ujm;
	
	
	public UseJMenuEvt(UseJMenu ujm) {
		this.ujm=ujm;
		
		
		
	}//UseJMenuEvt
	
	
	
	@Override
	public void windowClosing(WindowEvent we) {
		ujm.dispose();
		
	}//windowClosing
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==ujm.getJmiDialog()) {
			new UseJDialog(ujm);
		}
	
		if(ae.getSource()==ujm.getJmiClose()) {
			ujm.dispose();
		}
		
		
}//actionPerformed

	
	
	public static void main(String[] args) {

	}//main

}
