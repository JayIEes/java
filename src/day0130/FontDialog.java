package day0130;

import java.awt.Font;

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

/**
 * 서식의 글꼴 다이얼로그 클래스 
 * @author JSPC
 */
@SuppressWarnings("serial")
public class FontDialog extends JDialog  {

	private JList<String> jlFont;
	private JList<String> jlStyle;
	private JList<Integer> jlSize;
	
	private JTextField jtfFont;
	private JTextField jtfStyle;
	private JTextField jtfSize;
	
	private JButton jbtnConfirm;
	private JButton jbtnCancel;
	 
	private JLabel jlblPreview;
	
	
	public FontDialog(NoteDesign nd) {
	
		
		super(nd, "글꼴", true); 
		//라벨
		JLabel jlbl=new JLabel("글꼴");
		JLabel jlblStyle=new JLabel("글꼴 스타일");
		JLabel jlblSize=new JLabel("크기");
		jlblPreview =new JLabel("돋움");
		
		//TextField
		jtfFont=new JTextField();
		jtfStyle=new JTextField();
		jtfSize=new JTextField();
		
		
		
		//버튼
		jbtnConfirm=new JButton("확인");
		jbtnCancel=new JButton("취소");
		
		
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
		
		fontList.addElement("돋움");
		fontList.addElement("맑은 고딕");
		fontList.addElement("궁서체");
		fontList.addElement("Serif");
		fontList.addElement("SansSerif");

		styleList.addElement("일반");
		styleList.addElement("굵게");
		styleList.addElement("기울임꼴");
		styleList.addElement("굵은 기울임꼴");

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
		
		jtfFont.setText("돋움");
		jtfStyle.setText("일반");
		jtfSize.setText("8");
		
		jlblPreview.setFont(new Font("돋움",Font.PLAIN,8));
		
		
		
		
		
		
		jlFont.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				
				if(e.getValueIsAdjusting()){
					jtfFont.setText(jlFont.getSelectedValue().toString());
					jlblPreview.setText(jlFont.getSelectedValue().toString());
					
					int style = 0;
							
					switch(getJtfStyle().getText()) {
					case "일반" : style = Font.PLAIN; break;
					case "굵게" : style = Font.BOLD;break;
					case "기울임꼴" : style = Font.ITALIC;break;
					case "굵은 기울임꼴" : style = Font.ITALIC|Font.BOLD;break;
					}
					
					int size =Integer.parseInt(getJtfSize().getText());		
					
					switch(jtfFont.getText()) {
					case "돋움": jlblPreview.setFont(new Font("돋움",style,size)); break;
					case "맑은 고딕" :jlblPreview.setFont(new Font("맑은 고딕",style,size));break; 
					case "궁서체" : jlblPreview.setFont(new Font("궁서체",style,size));break; 
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
					case "일반": jlblPreview.setFont(new Font(jtfFont.getText(),Font.PLAIN,size)); break;
					case "굵게" :jlblPreview.setFont(new Font(jtfFont.getText(),Font.BOLD,size));break; 
					case "기울임꼴" : jlblPreview.setFont(new Font(jtfFont.getText(),Font.ITALIC,size));break; 
					case "굵은 기울임꼴" : jlblPreview.setFont(new Font(jtfFont.getText(),Font.ITALIC|Font.BOLD,size));break; 
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
					case "일반": jlblPreview.setFont(new Font(jtfFont.getText(),Font.PLAIN,size)); break; 
					case "굵게" :jlblPreview.setFont(new Font(jtfFont.getText(),Font.BOLD,size));break; 
					case "기울임꼴" : jlblPreview.setFont(new Font(jtfFont.getText(),Font.ITALIC,size));break; 
					case "굵은 기울임꼴" : jlblPreview.setFont(new Font(jtfFont.getText(),Font.ITALIC|Font.BOLD,size));break; 
					}
				}
				
			}
		});
		
		
		FontDialogEvt fde=new FontDialogEvt(nd, this);
		jbtnConfirm.addActionListener(fde);
		jbtnCancel.addActionListener(fde);
		
		
		
		
		//preview Border
		TitledBorder tb = new TitledBorder("보기");
		jlblPreview.setBorder(tb);
		
		
		
		//Font 설정
		jlbl.setFont(new Font("맑은 고딕", Font.BOLD, 13)); //글꼴 폰트
		jlblStyle.setFont(new Font("맑은 고딕", Font.BOLD, 13)); //글꼴 폰트
		jlblSize.setFont(new Font("맑은 고딕", Font.BOLD, 13)); //글꼴 폰트
		
		
		
		
		setLayout(null);
		
		
		//배치
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
		
		
		//위치 설정
		jlbl.setBounds(40,2,100,100); //글꼴 위치
		jlblStyle.setBounds(220,2,100,100); //글꼴스타일 위치
		jlblSize.setBounds(400,2,100,100); //글꼴크기 위치
		jlblPreview.setBounds(220,200,260,100); //preview 위치
	
		jsp.setBounds(40,100,150,70); //글꼴리스트 위치
		jtfFont.setBounds(40,70,150,30); //글꼴 텍스트 필드 위치
		
		jsp2.setBounds(220,100,150,70); //글꼴스타일 리스트 위치
		jtfStyle.setBounds(220,70,150,30); //글꼴스타일 텍스트 필드 위치
		
		jsp3.setBounds(400,100,80,70); //글꼴크기 리스트위치
		jtfSize.setBounds(400,70,80,30); //글꼴크기 텍스트 필드 위치
		
		jbtnConfirm.setBounds(300,400,80,25);
		jbtnCancel.setBounds(400,400,80,25);
		
		
		
		setBounds(nd.getX()+50,nd.getY()+50,550,500);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}//FontDialog

	
	
	

	public JList<String> getJlFont() {
		return jlFont;
	}


	public JList<String> getJlStyle() {
		return jlStyle;
	}


	public JList<Integer> getJlSize() {
		return jlSize;
	}


	public JTextField getJtfFont() {
		return jtfFont;
	}


	public JTextField getJtfStyle() {
		return jtfStyle;
	}


	public JTextField getJtfSize() {
		return jtfSize;
	}


	public JButton getJbtnConfirm() {
		return jbtnConfirm;
	}


	public JButton getJbtnCancel() {
		return jbtnCancel;
	}


	public JLabel getJlblPreview() {
		return jlblPreview;
	}

	
	
	
	
	

}//class



