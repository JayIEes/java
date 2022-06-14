package day0202;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


/**
 * @author JSPC
 *
 */
@SuppressWarnings("serial")
public class Notepad extends JFrame {

	private JMenuItem file; //새 글
	private JMenuItem file5; //닫기
	private JMenuItem form; //글꼴
	private JTextArea jta; //텍스트 area
	
	
	public Notepad(String title) {
		
		super(title);
		
		//TextArea
				jta=new JTextArea();
				
				//TextArea 스크롤
				JScrollPane jsp =new JScrollPane(jta);
				
				//부모창 메뉴
				JMenuBar jmb=new JMenuBar(); //메뉴바
				
				JMenu jmFile=new JMenu("파일"); //메뉴
				JMenu jmForm=new JMenu("서식");
				JMenu jmHelp=new JMenu("도움말");
				
				file=new JMenuItem("새 글");//메뉴 아이템
				JMenuItem file2=new JMenuItem("열기");
				JMenuItem file3=new JMenuItem("저장");
				JMenuItem file4=new JMenuItem("다른 이름으로 저장");
				file5=new JMenuItem("닫기");
				
				form=new JMenuItem("글꼴");
				
				
				
				JMenuItem help=new JMenuItem("메모장 정보");
				
				//메뉴아이템 메뉴에 배치
				jmFile.add(file);
				jmFile.add(file2);
				jmFile.add(file3);
				jmFile.add(file4);
				jmFile.add(file5);
				
				jmForm.add(form);
				
				jmHelp.add(help);
				
				//메뉴를 메뉴바에 배치
				jmb.add(jmFile);
				jmb.add(jmForm);
				jmb.add(jmHelp);
				
				setJMenuBar(jmb);

				//액션 등록
				file.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						if(e.getSource()==file) {
							jta.setText("");
						}
						
						if(e.getSource()==file5) {
							dispose();
						}
					
						if(e.getSource()==form) {
							new NoteJDialog(Notepad.this, "글꼴");
						}
					}
				});
				
				
				
				//배치
				add("Center",jsp);
				
				
				setBounds(600,200,800,600);
				
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		  
		
	}
	
	
	
	
	public JMenuItem getFile() {
		return file;
	}




	public JMenuItem getFile5() {
		return file5;
	}




	public JMenuItem getForm() {
		return form;
	}




	public JTextArea getJta() {
		return jta;
	}




	public static void main(String[] args) {
		Notepad np = new Notepad("메모장");
		np.setVisible(true);
	}

}
