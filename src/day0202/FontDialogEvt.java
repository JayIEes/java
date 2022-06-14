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
			case "�Ϲ�" : style= Font.PLAIN; break;
			case "����" : style= Font.BOLD;break;
			case "����Ӳ�" : style= Font.ITALIC;break;
			case "���� ����Ӳ�" : style= Font.ITALIC|Font.BOLD;break;
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
			case "�Ϲ�" : style = Font.PLAIN; break;
			case "����" : style = Font.BOLD;break;
			case "����Ӳ�" : style = Font.ITALIC;break;
			case "���� ����Ӳ�" : style = Font.ITALIC|Font.BOLD;break;
			}
			
			int size =Integer.parseInt(fd.getJtfSize().getText());		
			
			switch(fd.getJtfFont().getText()) {
			case "����": fd.getJlblPreview().setFont(new Font("����",style,size)); break;
			case "���� ���" :fd.getJlblPreview().setFont(new Font("���� ���",style,size));break; 
			case "�ü�ü" : fd.getJlblPreview().setFont(new Font("�ü�ü",style,size));break; 
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
			case "�Ϲ�": fd.getJlblPreview().setFont(new Font(fd.getJtfFont().getText(),Font.PLAIN,size)); break;
			case "����" :fd.getJlblPreview().setFont(new Font(fd.getJtfFont().getText(),Font.BOLD,size));break; 
			case "����Ӳ�" : fd.getJlblPreview().setFont(new Font(fd.getJtfFont().getText(),Font.ITALIC,size));break; 
			case "���� ����Ӳ�" : fd.getJlblPreview().setFont(new Font(fd.getJtfFont().getText(),Font.ITALIC|Font.BOLD,size));break; 
			}//end switch
		}//end if
	
	}//styleChange
	
	
	
	public void sizeChange(ListSelectionEvent e) {
		
		if(e.getValueIsAdjusting()) {
			fd.getJtfSize().setText(fd.getJlSize().getSelectedValue().toString());
			
			int size=Integer.parseInt(fd.getJtfSize().getText());
			
			
			
			switch(fd.getJtfStyle().getText()) {
			case "�Ϲ�": fd.getJlblPreview().setFont(new Font(fd.getJtfFont().getText(),Font.PLAIN,size)); break; 
			case "����" :fd.getJlblPreview().setFont(new Font(fd.getJtfFont().getText(),Font.BOLD,size));break; 
			case "����Ӳ�" : fd.getJlblPreview().setFont(new Font(fd.getJtfFont().getText(),Font.ITALIC,size));break; 
			case "���� ����Ӳ�" : fd.getJlblPreview().setFont(new Font(fd.getJtfFont().getText(),Font.ITALIC|Font.BOLD,size));break; 
			}
		}
	}//sizeChange
	
}//class
