package day0206_project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * view, report ��ư �̺�Ʈ ó�� Ŭ����
 * @author user
 */
public class ButtonEvt implements ActionListener {

	private FileAnalysis fa;
	
	public ButtonEvt(FileAnalysis fa) {
		this.fa=fa;
	}//ButtonEvt
	
	



	@Override
	public void actionPerformed(ActionEvent ae) {

		
		//view ��ư �̺�Ʈ ó��
		if(ae.getSource()==fa.getViewJbtn()) {
			
			
		}//end if
		
		
		//view ��ư �̺�Ʈ ó��
		if(ae.getSource()==fa.getReportJbtn()) {
			
		}//end if
		
		
		
	}//actionPerformed

}//class
