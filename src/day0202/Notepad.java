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

	private JMenuItem file; //�� ��
	private JMenuItem file5; //�ݱ�
	private JMenuItem form; //�۲�
	private JTextArea jta; //�ؽ�Ʈ area
	
	
	public Notepad(String title) {
		
		super(title);
		
		//TextArea
				jta=new JTextArea();
				
				//TextArea ��ũ��
				JScrollPane jsp =new JScrollPane(jta);
				
				//�θ�â �޴�
				JMenuBar jmb=new JMenuBar(); //�޴���
				
				JMenu jmFile=new JMenu("����"); //�޴�
				JMenu jmForm=new JMenu("����");
				JMenu jmHelp=new JMenu("����");
				
				file=new JMenuItem("�� ��");//�޴� ������
				JMenuItem file2=new JMenuItem("����");
				JMenuItem file3=new JMenuItem("����");
				JMenuItem file4=new JMenuItem("�ٸ� �̸����� ����");
				file5=new JMenuItem("�ݱ�");
				
				form=new JMenuItem("�۲�");
				
				
				
				JMenuItem help=new JMenuItem("�޸��� ����");
				
				//�޴������� �޴��� ��ġ
				jmFile.add(file);
				jmFile.add(file2);
				jmFile.add(file3);
				jmFile.add(file4);
				jmFile.add(file5);
				
				jmForm.add(form);
				
				jmHelp.add(help);
				
				//�޴��� �޴��ٿ� ��ġ
				jmb.add(jmFile);
				jmb.add(jmForm);
				jmb.add(jmHelp);
				
				setJMenuBar(jmb);

				//�׼� ���
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
							new NoteJDialog(Notepad.this, "�۲�");
						}
					}
				});
				
				
				
				//��ġ
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
		Notepad np = new Notepad("�޸���");
		np.setVisible(true);
	}

}
