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
				//start , end 라인 둘다 없는 -> 1~6번 출력 , 1~끝 줄까지 분석
				System.out.println("bothEmpty");
				try {
					ul.readFile();
					
					dispose();
					
					///여기에 뭔가를해줘야함 //////
					
					new JButtonEvt(ul).createDialog();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else if (!startLine.getText().isEmpty() && endLine.getText().isEmpty()) {
				//start 있고, end 라인 없는
				System.out.println("endEmpty");
				
				try {
					start = Integer.parseInt(startLine.getText());
					ul.readFile(start);
					
					new JButtonEvt(ul).createDialog();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(ul, "숫자를 입력해주세요.");
					System.err.println("숫자를 입력해주세요.");
				}
			} else { 
				if (startLine.getText().isEmpty() && !endLine.getText().isEmpty()) {
					//end라인만 있는 
					System.out.println("startEmpty");
					end = Integer.parseInt(endLine.getText());

					
				} else if (!startLine.getText().isEmpty() && !endLine.getText().isEmpty()) {
					//start , end 라인 둘다 있는
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
