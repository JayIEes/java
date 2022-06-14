package project_11111;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ViewDialog extends JDialog implements ActionListener {

	private UserLog ul;

	JTextField startLine = null;
	JTextField endLine = null;
	JButton jbtnConfirm = new JButton("Confirm");

	public ViewDialog(UserLog ul) {
		this.ul = ul;

		Container contentPane = this.getContentPane();
		JPanel pane = new JPanel();
		startLine = new JTextField(5);
		JLabel startLabel = new JLabel("start line: ");
		endLine = new JTextField(5);
		JLabel endLabel = new JLabel("end line: ");

		pane.add(startLabel);
		pane.add(startLine);
		pane.add(endLabel);
		pane.add(endLine);
		pane.add(jbtnConfirm);
		contentPane.add(pane);

		setBounds(100, 100, 300, 200);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		jbtnConfirm.addActionListener(this);

	}

	public void actionPerformed(ActionEvent actionEvent) {
		if (actionEvent.getSource() == jbtnConfirm) {
			int start = 1;
			int end = 0;

			if (startLine.getText().isEmpty() && endLine.getText().isEmpty()) {
				//start , end ���� �Ѵ� ���� -> 1~6�� ��� , 1~�� �ٱ��� �м�
				System.out.println("bothEmpty");
				try {
					ul.readFile();
					
					dispose();
					
					///���⿡ ������������� //////
					
					new JButtonEvt(ul).createDialog();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else if (!startLine.getText().isEmpty() && endLine.getText().isEmpty()) {
				//start �ְ�, end ���� ����
				System.out.println("endEmpty");
				
				try {
					start = Integer.parseInt(startLine.getText());
					ul.readFile(start);
					
					new JButtonEvt(ul).createDialog();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(ul, "���ڸ� �Է����ּ���.");
					System.err.println("���ڸ� �Է����ּ���.");
				}
			} else { 
				if (startLine.getText().isEmpty() && !endLine.getText().isEmpty()) {
					//end���θ� �ִ� 
					System.out.println("startEmpty");
					end = Integer.parseInt(endLine.getText());

					
				} else if (!startLine.getText().isEmpty() && !endLine.getText().isEmpty()) {
					//start , end ���� �Ѵ� �ִ�
					System.out.println("bothFull");
					start = Integer.parseInt(startLine.getText());
					end = Integer.parseInt(endLine.getText());
				}

				try {
					ul.readFile(start, end); 
					new JButtonEvt(ul).createDialog();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		} // end if
	}// actionPerformed

}// end class
