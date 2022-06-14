package day0127;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
//1. ������ ������Ʈ ���
//E-1. �̺�Ʈ�� ó���� �������̽� ����
public class UseActionEvent extends JFrame implements ActionListener {

	
	//�̺�Ʈó���� �����ִ� ������Ʈ�� class field�� ����
	private JTextField jtfName; //�ν��Ͻ� ����
	private JTextArea jtaNameDisp;
	private JButton jbtnAdd;
	
	public UseActionEvent() {
		super("��ư������ �߻��ϴ� �̺�Ʈ");
	
		//2. ������Ʈ ����
		//�Ϲ�������Ʈ-�������
		JLabel jlblName=new JLabel("�̸�"); //��������
		
		jbtnAdd=new JButton("�߰�");//�ν��ϼ� ������ ����
		
		jtfName=new JTextField(10); //�ν��ϼ� ������ ����
		
		jtaNameDisp=new JTextArea();
		
		
		//�����̳� ������Ʈ - �Ϲ� ������Ʈ�� ��ġ�ϴ� ��.
		JPanel jpNorth=new JPanel();
		
		
		//E-4. ������Ʈ�� �̺�Ʈ�� �߻���ų �� �ֵ��� �̺�Ʈ�� ���
		jbtnAdd.addActionListener(this);//��ư Ŭ�� => �Էµ� ��ü�� Override�� method�� ȣ�� : actionPerformed�� ȣ��
		jtfName.addActionListener(this);//TextField ���� ����
		
//		System.out.println(jtfName);
//		System.out.println(jbtnAdd);
		//3. ��ġ
		//�����̳� ������Ʈ�� �Ϲ� ������Ʈ ��ġ
		jpNorth.add(jlblName);
		jpNorth.add(jtfName);
		jpNorth.add(jbtnAdd);
		
		
		//������ ������Ʈ(BorderLayout)�� ��ġ
		add("North",jpNorth);
		add("Center",jtaNameDisp);
		
		//4. ������ ũ�⼳��
		setSize(400,300);
		
		//5. ����ȭ
		setVisible(true);
		
		//6. ���� �̺�Ʈó��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}//UseLayoutManager
	
	//E-2. Abstract Method�� Override
	@Override
	public void actionPerformed(ActionEvent ae) { //������Ʈ.addXxxListener(��ü);�� �޼ҵ忡�� ȣ��ȴ�.
		//E-3. �̺�Ʈ�� �߻����� �� ����ڿ��� ������ �ڵ�(����)
//		��ư�� ������ JTextField�� ���� ���ͼ� 
		
		System.out.println("�̺�Ʈ �߻�"+ae.getSource());
		
		String source="";
		
		if(ae.getSource()==jbtnAdd){
			source="��ư";
		}else 
		
		if(ae.getSource()==jtfName){
			source="�ؽ�Ʈ �ʵ�";
		}//end if
		
		String txt=jtfName.getText(); //�ν��Ͻ� ����
		//JTextArea�� �ִ´�.
//		jtaNameDisp.setText(txt); //������ ���� ����� ���� ������.
		jtaNameDisp.append(source+" "+txt); //���� �� �ڿ� ���� �� ����,	�����η� ������ ������ \n�ʿ�
		jtaNameDisp.append("\n"); 
		
		//JTextField�� �� ����
		jtfName.setText("");
	}//actionPerformed
	
	
	public static void main(String[] args) {
		new UseActionEvent();
		
	}//main





}
