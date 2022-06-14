package day0127;

import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class Work0127 extends JFrame implements ItemListener {

	private JComboBox<String> jcb;
	private JTextField jtfItem;

	public Work0127() {
		super("����");

		// �޺��ڽ� ModelŬ���� ����
		DefaultComboBoxModel<String> dcb = new DefaultComboBoxModel<String>();

		// Model ��ü �Է� �ޱ�
		jcb = new JComboBox<String>(dcb);

		// ModelŬ������ ������ �߰�
		dcb.addElement("Java");
		dcb.addElement("Oracle");
		dcb.addElement("JDBC");
		dcb.addElement("HTML");

		// �̺�Ʈ �޼ҵ�ȣ��
		jcb.addItemListener(this);
//		jtfItem.add(this);

		// �ؽ�Ʈ �ʵ�
		jtfItem = new JTextField();
		// ��
		JLabel jlblItem = new JLabel("���þ�����");

		// �� �۲�
		jlblItem.setFont(new Font("�������ü", Font.PLAIN, 15));

		// �ؽ�Ʈ �ʵ� ���� ��� ����
		jtfItem.setHorizontalAlignment(JTextField.CENTER);

		((JLabel) jcb.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);

		setLayout(null);

		// ��ġ
		jcb.setBounds(65, 50, 150, 30);
		jtfItem.setBounds(350, 50, 150, 30);
		jlblItem.setBounds(270, 50, 150, 30);

		// ��ġ
		add(jcb);
		add(jtfItem);
		add(jlblItem);

		//
		setBounds(400, 200, 560, 250);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}// Work0127

	@Override
	public void itemStateChanged(ItemEvent e) {
		jtfItem.setText(jcb.getSelectedItem().toString());
	}

	public static void main(String[] args) {
		new Work0127();
	}// main

}// class
