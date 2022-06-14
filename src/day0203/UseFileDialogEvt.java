package day0203;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

/**
 * ������ Ŭ������ �̺�Ʈ�� �и��Ͽ� ó���ϴ� Ŭ����(has a)
 * @author user
 */
public class UseFileDialogEvt extends WindowAdapter implements ActionListener {

	private UseFileDialogView ufdv;
	
	
	public UseFileDialogEvt(UseFileDialogView ufdv) {
		this.ufdv = ufdv;
	}//UseFileDialogEvt


	@Override
	public void windowClosing(WindowEvent we) {
		ufdv.dispose();
	}//windowClosing

	
	/**
	 * ���ϴ��̾�α׸� ������� 
	 */
	private void loadFileDialog() {
		FileDialog fdOpen=new FileDialog(ufdv,"���Ͽ���",FileDialog.LOAD);
		fdOpen.setVisible(true);
		
		//������ ���
		String path=fdOpen.getDirectory();
		String name=fdOpen.getFile();
		
		//�� ��ο� ���ϸ��� Ÿ��Ʋ�ٿ� ���� setTitie("������ ����");
		//������ ������ �����Ҷ����� Ÿ��Ʋ�ٸ� ����
		if(path!=null&&name!=null) { //�� �� �ϳ��� ���� ���� ���� ���� ������ �ϳ��� ��� ������.
			ufdv.setTitle(path+name);
		}//end if
		
		
	}//loadFileDialog
	
	
	/**
	 * ���ϴ��̾�α׸� ������� 
	 */
	private void saveFileDialog() {
		FileDialog fdSave=new FileDialog(ufdv,"��������",FileDialog.SAVE);
		fdSave.setVisible(true);
		//������ ���
		String path=fdSave.getDirectory();
		String name=fdSave.getFile();
				
		//�� ��ο� ���ϸ��� Ÿ��Ʋ�ٿ� ���� setTitie("������ ����");
		//������ ������ �����Ҷ����� Ÿ��Ʋ�ٸ� ����
		if(path!=null) { //�� �� �ϳ��� ���� ���� ���� ���� ������ �ϳ��� ��� ������.
		ufdv.setTitle("����"+path+name);
		}//end if
		
		
	}//loadFileDialog

	
	private void useInputDialog() {
//		String inputMsg=JOptionPane.showInputDialog("�̸��� �Է����ּ���");
		String inputMsg=JOptionPane.showInputDialog(ufdv,"�̸��� �Է����ּ���",
									"�̸��� ���ϱ�?"/*Ÿ��Ʋ*/,JOptionPane.QUESTION_MESSAGE);
		ufdv.setTitle("�̸� : "+inputMsg);
	}//useInputDialog
	
	
	
	private void useMsgDialog() {
//		JOptionPane.showMessageDialog(ufdv, "������ ���� ����");
		JOptionPane.showMessageDialog(ufdv, "������ ���� ����","�⺻�޼���",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(ufdv, "������ ���� ����","���޼���",JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(ufdv, "������ ���� ����","�����޼���",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(ufdv, "������ ���� ����","�����޼���",JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(ufdv, "������ ���� ����","�����޼���",JOptionPane.ERROR_MESSAGE); //x������
	
	}//useMsgDialog
	
	
	
	private void useConfirmDialog() {
		
		int flag=JOptionPane.showConfirmDialog(ufdv, "�����Ͻðڽ��ϱ�?");
		System.out.println("������ �� "+flag);
		switch(flag) {
		case JOptionPane.OK_OPTION:
			ufdv.setTitle("�� ����");
			break;
		case JOptionPane.NO_OPTION:
			ufdv.setTitle("�ƴϿ� ����");
			break;
		case JOptionPane.CANCEL_OPTION:
			ufdv.setTitle("��� ����");
		}
		
	}//useConfirmDialog
	
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==ufdv.getJbtnLoad()) {
			loadFileDialog();
		}
		
		if(ae.getSource()==ufdv.getJbtnSave()) {
			saveFileDialog();
		}
		
		if(ae.getSource()==ufdv.getJbtnInput()) {
			useInputDialog();
		}
		
		if(ae.getSource()==ufdv.getJbtnMsg()) {
			useMsgDialog();
		}
		
		if(ae.getSource()==ufdv.getJbtnCon()) {
			useConfirmDialog();
		}
		
	}//actionPerformed

}
