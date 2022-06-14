package day0202;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class NoteEvt implements ActionListener {

	public NoteDesign nd;
	
	public NoteEvt(NoteDesign nd) {
		this.nd=nd;
		
	}//NoteEvt
	
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==nd.getFile()) {
			nd.getJta().setText("");
		}
		if(ae.getSource()==nd.getFile5()) {
			nd.dispose();
		}
		if(ae.getSource()==nd.getForm()) {
			new FontDialog(nd);
		}
			
			
	}//actionPerformed



	
	
}//class
