package day0206_project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * view, report 버튼 이벤트 처리 클래스
 * @author user
 */
public class ButtonEvt implements ActionListener {

	private FileAnalysis fa;
	
	public ButtonEvt(FileAnalysis fa) {
		this.fa=fa;
	}//ButtonEvt
	
	



	@Override
	public void actionPerformed(ActionEvent ae) {

		
		//view 버튼 이벤트 처리
		if(ae.getSource()==fa.getViewJbtn()) {
			
			
		}//end if
		
		
		//view 버튼 이벤트 처리
		if(ae.getSource()==fa.getReportJbtn()) {
			
		}//end if
		
		
		
	}//actionPerformed

}//class
