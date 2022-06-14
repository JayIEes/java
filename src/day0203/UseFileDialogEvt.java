package day0203;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

/**
 * 디자인 클래스의 이벤트를 분리하여 처리하는 클래스(has a)
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
	 * 파일다이얼로그를 열기모드로 
	 */
	private void loadFileDialog() {
		FileDialog fdOpen=new FileDialog(ufdv,"파일열기",FileDialog.LOAD);
		fdOpen.setVisible(true);
		
		//파일의 경로
		String path=fdOpen.getDirectory();
		String name=fdOpen.getFile();
		
		//얻어낸 경로와 파일명을 타이틀바에 설정 setTitie("변경할 내용");
		//선택한 파일이 존재할때에만 타이틀바를 설정
		if(path!=null&&name!=null) { //둘 중 하나만 값이 있을 수가 없기 때문에 하나만 물어도 괜찮다.
			ufdv.setTitle(path+name);
		}//end if
		
		
	}//loadFileDialog
	
	
	/**
	 * 파일다이얼로그를 저장모드로 
	 */
	private void saveFileDialog() {
		FileDialog fdSave=new FileDialog(ufdv,"파일저장",FileDialog.SAVE);
		fdSave.setVisible(true);
		//파일의 경로
		String path=fdSave.getDirectory();
		String name=fdSave.getFile();
				
		//얻어낸 경로와 파일명을 타이틀바에 설정 setTitie("변경할 내용");
		//선택한 파일이 존재할때에만 타이틀바를 설정
		if(path!=null) { //둘 중 하나만 값이 있을 수가 없기 때문에 하나만 물어도 괜찮다.
		ufdv.setTitle("저장"+path+name);
		}//end if
		
		
	}//loadFileDialog

	
	private void useInputDialog() {
//		String inputMsg=JOptionPane.showInputDialog("이름을 입력해주세요");
		String inputMsg=JOptionPane.showInputDialog(ufdv,"이름을 입력해주세요",
									"이름이 뭡니까?"/*타이틀*/,JOptionPane.QUESTION_MESSAGE);
		ufdv.setTitle("이름 : "+inputMsg);
	}//useInputDialog
	
	
	
	private void useMsgDialog() {
//		JOptionPane.showMessageDialog(ufdv, "간단한 정보 전달");
		JOptionPane.showMessageDialog(ufdv, "간단한 정보 전달","기본메세지",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(ufdv, "간단한 정보 전달","경고메세지",JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(ufdv, "간단한 정보 전달","정보메세지",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(ufdv, "간단한 정보 전달","질문메세지",JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(ufdv, "간단한 정보 전달","에러메세지",JOptionPane.ERROR_MESSAGE); //x아이콘
	
	}//useMsgDialog
	
	
	
	private void useConfirmDialog() {
		
		int flag=JOptionPane.showConfirmDialog(ufdv, "종료하시겠습니까?");
		System.out.println("선택한 값 "+flag);
		switch(flag) {
		case JOptionPane.OK_OPTION:
			ufdv.setTitle("예 선택");
			break;
		case JOptionPane.NO_OPTION:
			ufdv.setTitle("아니오 선택");
			break;
		case JOptionPane.CANCEL_OPTION:
			ufdv.setTitle("취소 선택");
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
