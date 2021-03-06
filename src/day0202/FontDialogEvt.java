package day0202;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class FontDialogEvt implements ActionListener, ListSelectionListener{

	
	
	private FontDialog fd;
	private NoteDesign nd;
	
	public FontDialogEvt(NoteDesign nd, FontDialog fd) {
		this.nd=nd;
		this.fd=fd;
	}//FontDialogEvt

	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==fd.getJbtnConfirm()) {
			
			fd.dispose();
//			NoteDesign nd =new NoteDesign();
			String fontName= fd.getJtfFont().getText();
			int style = 0;
			
			switch(fd.getJtfStyle().getText()) {
			case "일반" : style= Font.PLAIN; break;
			case "굵게" : style= Font.BOLD;break;
			case "기울임꼴" : style= Font.ITALIC;break;
			case "굵은 기울임꼴" : style= Font.ITALIC|Font.BOLD;break;
			}
			
			
			int size =Integer.parseInt(fd.getJtfSize().getText());

			nd.getJta().setFont(new Font(fontName,style,size));
		}
		
		if(ae.getSource()==fd.getJbtnCancel()) {
			fd.dispose();
		}
		
	}//actionPerformed


	@Override
	public void valueChanged(ListSelectionEvent e) {
		
		if(e.getSource()==fd.getJlFont()) {
			fontChange(e);
		}
		
		if(e.getSource()==fd.getJlStyle()) {
			styleChange(e);
		}
		
		if(e.getSource()==fd.getJlSize()) {
			sizeChange(e);
		}
		
	}//valueChanged


	
	public void fontChange(ListSelectionEvent e) {
		if(e.getValueIsAdjusting()){
			fd.getJtfFont().setText(fd.getJlFont().getSelectedValue().toString());
			fd.getJlblPreview().setText(fd.getJlFont().getSelectedValue().toString());
			
			int style = 0;
					
			switch(fd.getJtfStyle().getText()) {
			case "일반" : style = Font.PLAIN; break;
			case "굵게" : style = Font.BOLD;break;
			case "기울임꼴" : style = Font.ITALIC;break;
			case "굵은 기울임꼴" : style = Font.ITALIC|Font.BOLD;break;
			}
			
			int size =Integer.parseInt(fd.getJtfSize().getText());		
			
			switch(fd.getJtfFont().getText()) {
			case "돋움": fd.getJlblPreview().setFont(new Font("돋움",style,size)); break;
			case "맑은 고딕" :fd.getJlblPreview().setFont(new Font("맑은 고딕",style,size));break; 
			case "궁서체" : fd.getJlblPreview().setFont(new Font("궁서체",style,size));break; 
			case "Serif" : fd.getJlblPreview().setFont(new Font("Serif",style,size));break; 
			case "SansSerif" :fd.getJlblPreview().setFont(new Font("SansSerif",style,size));break; 
			}//end switch
		}//end if
	}//fontChage

	
	public void styleChange(ListSelectionEvent e) {
		if(e.getValueIsAdjusting()) {
			fd.getJtfStyle().setText(fd.getJlStyle().getSelectedValue().toString());	
			
			int size =Integer.parseInt(fd.getJtfSize().getText());		
			switch(fd.getJtfStyle().getText()) {
			case "일반": fd.getJlblPreview().setFont(new Font(fd.getJtfFont().getText(),Font.PLAIN,size)); break;
			case "굵게" :fd.getJlblPreview().setFont(new Font(fd.getJtfFont().getText(),Font.BOLD,size));break; 
			case "기울임꼴" : fd.getJlblPreview().setFont(new Font(fd.getJtfFont().getText(),Font.ITALIC,size));break; 
			case "굵은 기울임꼴" : fd.getJlblPreview().setFont(new Font(fd.getJtfFont().getText(),Font.ITALIC|Font.BOLD,size));break; 
			}//end switch
		}//end if
	
	}//styleChange
	
	
	
	public void sizeChange(ListSelectionEvent e) {
		
		if(e.getValueIsAdjusting()) {
			fd.getJtfSize().setText(fd.getJlSize().getSelectedValue().toString());
			
			int size=Integer.parseInt(fd.getJtfSize().getText());
			
			
			
			switch(fd.getJtfStyle().getText()) {
			case "일반": fd.getJlblPreview().setFont(new Font(fd.getJtfFont().getText(),Font.PLAIN,size)); break; 
			case "굵게" :fd.getJlblPreview().setFont(new Font(fd.getJtfFont().getText(),Font.BOLD,size));break; 
			case "기울임꼴" : fd.getJlblPreview().setFont(new Font(fd.getJtfFont().getText(),Font.ITALIC,size));break; 
			case "굵은 기울임꼴" : fd.getJlblPreview().setFont(new Font(fd.getJtfFont().getText(),Font.ITALIC|Font.BOLD,size));break; 
			}
		}
	}//sizeChange
	
}//class
