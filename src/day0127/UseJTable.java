package day0127;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class UseJTable extends JFrame {

	public UseJTable() {
		
		super("MVC Pattern�� ������ Ŭ����");
		
		//������Ʈ�� ����
		//�����͸� �����ϴ� ModelŬ������ �����Ѵ�. �׷��� ���� Model�� View�� ����ִ´�.
		String[] columnNames= {"��ȣ","�̸�","����","�̸���"};
		String[][] rowData= { 
								{"1","���μ�","24","jung@test.com"},
								{"2","������","25","jang@gmail.com"}, 
								{"3","������","26","kim@naver.com"} 
							};
				
		DefaultTableModel dtm=new DefaultTableModel(rowData, columnNames);
		
		JTable jt=new JTable(dtm);
		JScrollPane jsp=new JScrollPane(jt);
		
		//������ �߰� (Model���)
		String[] data= {"4","������","27","Kim@naver.com"};
		dtm.addRow(data);
		
		//�������� ������ ������ View Ŭ������ ���. 
		jt.setRowHeight(25);
		
		//�÷��� ���� ���� (JTable�� �÷������� ���� ��ü�� �� ����)
		jt.getColumnModel().getColumn(0).setPreferredWidth(40);
		jt.getColumnModel().getColumn(1).setPreferredWidth(120);
		jt.getColumnModel().getColumn(2).setPreferredWidth(40);
		jt.getColumnModel().getColumn(3).setPreferredWidth(200);
		
		
		//��ġ
		//BorderLayout�� Center������ ������Ʈ�� ��ġ
		add("Center",jsp);
		
		setSize(500,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}//UseJTable
	
	
	public static void main(String[] args) {
		new UseJTable();
		
		
		
	}//main

}//class
