package day0202;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class NoteDesign extends JFrame  {

	private JMenuItem file; //�� ��
	private JMenuItem file5; //�ݱ�
	private JMenuItem form; //�۲�
	private JTextArea jta; //�ؽ�Ʈ area
	
	
	public NoteDesign() {
		
		super("�޸���");
		
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
		NoteEvt ne=new NoteEvt(this);
		file.addActionListener(ne);
		file5.addActionListener(ne);
		form.addActionListener(ne);
		
		
		
		//��ġ
		add("Center",jsp);
		
		
		setBounds(600,200,800,600);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//NoteDesign ������
	
	
	
	
	
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

		new NoteDesign();
		
	}//main

}//class
