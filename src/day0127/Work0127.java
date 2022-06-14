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
		super("과목");

		// 콤보박스 Model클래스 생성
		DefaultComboBoxModel<String> dcb = new DefaultComboBoxModel<String>();

		// Model 객체 입력 받기
		jcb = new JComboBox<String>(dcb);

		// Model클래스에 데이터 추가
		dcb.addElement("Java");
		dcb.addElement("Oracle");
		dcb.addElement("JDBC");
		dcb.addElement("HTML");

		// 이벤트 메소드호출
		jcb.addItemListener(this);
//		jtfItem.add(this);

		// 텍스트 필드
		jtfItem = new JTextField();
		// 라벨
		JLabel jlblItem = new JLabel("선택아이템");

		// 라벨 글꼴
		jlblItem.setFont(new Font("맑은고딕체", Font.PLAIN, 15));

		// 텍스트 필드 글자 가운데 정렬
		jtfItem.setHorizontalAlignment(JTextField.CENTER);

		((JLabel) jcb.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);

		setLayout(null);

		// 위치
		jcb.setBounds(65, 50, 150, 30);
		jtfItem.setBounds(350, 50, 150, 30);
		jlblItem.setBounds(270, 50, 150, 30);

		// 배치
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
