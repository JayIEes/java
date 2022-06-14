package day0202;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


@SuppressWarnings("serial")
public class NoteJDialog extends JDialog {

	private JList<String> jlFont;
	private JList<String> jlStyle;
	private JList<Integer> jlSize;
	
	private JTextField jtfFont;
	private JTextField jtfStyle;
	private JTextField jtfSize;
	
	private JButton jbtnConfirm;
	private JButton jbtnCancel;
	 
	private JLabel jlblPreview;
	
	
	public NoteJDialog(Notepad np, String title) {
		
		super(np, title , true);
		JLabel jlbl=new JLabel("�۲�");
		JLabel jlblStyle=new JLabel("�۲� ��Ÿ��");
		JLabel jlblSize=new JLabel("ũ��");
		jlblPreview =new JLabel("����");
		
		//TextField
		jtfFont=new JTextField();
		jtfStyle=new JTextField();
		jtfSize=new JTextField();
		
		
		
		//��ư
		jbtnConfirm=new JButton("Ȯ��");
		jbtnCancel=new JButton("���");
		
		
		//jLust
		DefaultListModel<String> fontList = new DefaultListModel<>();
		DefaultListModel<String> styleList = new DefaultListModel<>();
		DefaultListModel<Integer> sizeList = new DefaultListModel<>();
		
		jlFont=new JList<String>(fontList);
		jlStyle=new JList<String>(styleList);
		jlSize=new JList<Integer>(sizeList);
		
		JScrollPane jsp=new JScrollPane(jlFont);
		JScrollPane jsp2=new JScrollPane(jlStyle);
		JScrollPane jsp3=new JScrollPane(jlSize);
		
		fontList.addElement("����");
		fontList.addElement("���� ���");
		fontList.addElement("�ü�ü");
		fontList.addElement("Serif");
		fontList.addElement("SansSerif");

		styleList.addElement("�Ϲ�");
		styleList.addElement("����");
		styleList.addElement("����Ӳ�");
		styleList.addElement("���� ����Ӳ�");

		for(int i=8; i<81 ; i++) {
			if(i>7&&i<11) {
			sizeList.addElement(i);
			}else {
			sizeList.addElement(i+1);
			i++;
			}//else
		}//end for
		
		
		
		
		
		
		jlFont.setSelectedIndex(0);
		jlStyle.setSelectedIndex(0);
		jlSize.setSelectedIndex(0);
		
		jtfFont.setText("����");
		jtfStyle.setText("�Ϲ�");
		jtfSize.setText("8");
		
		jlblPreview.setFont(new Font("����",Font.PLAIN,8));
		
		
		
		
		
		
		jlFont.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				
				if(e.getValueIsAdjusting()){
					jtfFont.setText(jlFont.getSelectedValue().toString());
					jlblPreview.setText(jlFont.getSelectedValue().toString());
					
					int style = 0;
							
					switch(getJtfStyle().getText()) {
					case "�Ϲ�" : style = Font.PLAIN; break;
					case "����" : style = Font.BOLD;break;
					case "����Ӳ�" : style = Font.ITALIC;break;
					case "���� ����Ӳ�" : style = Font.ITALIC|Font.BOLD;break;
					}
					
					int size =Integer.parseInt(getJtfSize().getText());		
					
					switch(jtfFont.getText()) {
					case "����": jlblPreview.setFont(new Font("����",style,size)); break;
					case "���� ���" :jlblPreview.setFont(new Font("���� ���",style,size));break; 
					case "�ü�ü" : jlblPreview.setFont(new Font("�ü�ü",style,size));break; 
					case "Serif" : jlblPreview.setFont(new Font("Serif",style,size));break; 
					case "SansSerif" :jlblPreview.setFont(new Font("SansSerif",style,size));break; 
					}//end switch
				}
			}
		});
		
		
		
		jlStyle.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				
				
				if(e.getValueIsAdjusting()) {
					jtfStyle.setText(jlStyle.getSelectedValue().toString());	
					
					int size =Integer.parseInt(getJtfSize().getText());		
					switch(jtfStyle.getText()) {
					case "�Ϲ�": jlblPreview.setFont(new Font(jtfFont.getText(),Font.PLAIN,size)); break;
					case "����" :jlblPreview.setFont(new Font(jtfFont.getText(),Font.BOLD,size));break; 
					case "����Ӳ�" : jlblPreview.setFont(new Font(jtfFont.getText(),Font.ITALIC,size));break; 
					case "���� ����Ӳ�" : jlblPreview.setFont(new Font(jtfFont.getText(),Font.ITALIC|Font.BOLD,size));break; 
					}//end switch
				}
			}
		});
		
		
		jlSize.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				
				
				if(e.getValueIsAdjusting()) {
					jtfSize.setText(jlSize.getSelectedValue().toString());
					
					int size=Integer.parseInt(jtfSize.getText());
					
					
					
					switch(jtfStyle.getText()) {
					case "�Ϲ�": jlblPreview.setFont(new Font(jtfFont.getText(),Font.PLAIN,size)); break; 
					case "����" :jlblPreview.setFont(new Font(jtfFont.getText(),Font.BOLD,size));break; 
					case "����Ӳ�" : jlblPreview.setFont(new Font(jtfFont.getText(),Font.ITALIC,size));break; 
					case "���� ����Ӳ�" : jlblPreview.setFont(new Font(jtfFont.getText(),Font.ITALIC|Font.BOLD,size));break; 
					}
				}
				
			}
		});
		
	
		jbtnConfirm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				
				if(ae.getSource()==getJbtnConfirm()) {
					
					dispose();
					String fontName= getJtfFont().getText();
					int style = 0;
					
					switch(getJtfStyle().getText()) {
					case "�Ϲ�" : style= Font.PLAIN; break;
					case "����" : style= Font.BOLD;break;
					case "����Ӳ�" : style= Font.ITALIC;break;
					case "���� ����Ӳ�" : style= Font.ITALIC|Font.BOLD;break;
					}
					
					
					int size =Integer.parseInt(getJtfSize().getText());

					np.getJta().setFont(new Font(fontName,style,size));
				}
			
			}
		});
		jbtnCancel.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==getJbtnCancel()) {
					dispose();
				}
			}
			
		});
		
		
		
		
		//preview Border
		TitledBorder tb = new TitledBorder("����");
		jlblPreview.setBorder(tb);
		
		
		
		//Font ����
		jlbl.setFont(new Font("���� ���", Font.BOLD, 13)); //�۲� ��Ʈ
		jlblStyle.setFont(new Font("���� ���", Font.BOLD, 13)); //�۲� ��Ʈ
		jlblSize.setFont(new Font("���� ���", Font.BOLD, 13)); //�۲� ��Ʈ
		
		
		
		
		setLayout(null);
		
		
		//��ġ
		add(jlbl);
		add(jlblStyle);
		add(jlblSize);
		add(jlblPreview);
		
		add(jsp);
		add(jsp2);
		add(jsp3);
		
		
		add(jtfFont);
		add(jtfStyle);
		add(jtfSize);

		add(jbtnConfirm);
		add(jbtnCancel);
		
		
		//��ġ ����
		jlbl.setBounds(40,2,100,100); //�۲� ��ġ
		jlblStyle.setBounds(220,2,100,100); //�۲ý�Ÿ�� ��ġ
		jlblSize.setBounds(400,2,100,100); //�۲�ũ�� ��ġ
		jlblPreview.setBounds(220,200,260,100); //preview ��ġ
	
		jsp.setBounds(40,100,150,70); //�۲ø���Ʈ ��ġ
		jtfFont.setBounds(40,70,150,30); //�۲� �ؽ�Ʈ �ʵ� ��ġ
		
		jsp2.setBounds(220,100,150,70); //�۲ý�Ÿ�� ����Ʈ ��ġ
		jtfStyle.setBounds(220,70,150,30); //�۲ý�Ÿ�� �ؽ�Ʈ �ʵ� ��ġ
		
		jsp3.setBounds(400,100,80,70); //�۲�ũ�� ����Ʈ��ġ
		jtfSize.setBounds(400,70,80,30); //�۲�ũ�� �ؽ�Ʈ �ʵ� ��ġ
		
		jbtnConfirm.setBounds(300,400,80,25);
		jbtnCancel.setBounds(400,400,80,25);
		
		
		
		setBounds(np.getX()+50,np.getY()+50,550,500);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}


	public JList<String> getJlFont() {
		return jlFont;
	}


	public void setJlFont(JList<String> jlFont) {
		this.jlFont = jlFont;
	}


	public JList<String> getJlStyle() {
		return jlStyle;
	}


	public void setJlStyle(JList<String> jlStyle) {
		this.jlStyle = jlStyle;
	}


	public JList<Integer> getJlSize() {
		return jlSize;
	}


	public void setJlSize(JList<Integer> jlSize) {
		this.jlSize = jlSize;
	}


	public JTextField getJtfFont() {
		return jtfFont;
	}


	public void setJtfFont(JTextField jtfFont) {
		this.jtfFont = jtfFont;
	}


	public JTextField getJtfStyle() {
		return jtfStyle;
	}


	public void setJtfStyle(JTextField jtfStyle) {
		this.jtfStyle = jtfStyle;
	}


	public JTextField getJtfSize() {
		return jtfSize;
	}


	public void setJtfSize(JTextField jtfSize) {
		this.jtfSize = jtfSize;
	}


	public JButton getJbtnConfirm() {
		return jbtnConfirm;
	}


	public void setJbtnConfirm(JButton jbtnConfirm) {
		this.jbtnConfirm = jbtnConfirm;
	}


	public JButton getJbtnCancel() {
		return jbtnCancel;
	}


	public void setJbtnCancel(JButton jbtnCancel) {
		this.jbtnCancel = jbtnCancel;
	}


	public JLabel getJlblPreview() {
		return jlblPreview;
	}


	public void setJlblPreview(JLabel jlblPreview) {
		this.jlblPreview = jlblPreview;
	}
	
	
	
	
}
