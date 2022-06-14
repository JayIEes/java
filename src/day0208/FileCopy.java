package day0208;

import java.awt.FileDialog;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import day0207_Final.JButtonEvt;

@SuppressWarnings("serial")
public class FileCopy extends JFrame {

	private JLabel jlblOutput;
	private FileCopy fc;
	
	public FileCopy() {
		
		super("���Ϻ���");
		
		jlblOutput=new JLabel("���");
		JButton jbtnFileChoose=new JButton("���� ����");
		
		jlblOutput.setFont(new Font("�ü�ü",Font.BOLD,20));
		fc=this;
		jbtnFileChoose.addActionListener(new BtnEventProcess());
	
		//��ġ
		JPanel jpCenter=new JPanel();
		jpCenter.add(jbtnFileChoose);
		
		add("Center",jpCenter);
		add("South",jlblOutput);
		
		setBounds(100,100,400,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		File file=new File();
	}//FileCopy
	
	///////////////////��ư�� ����Ʈ�� ó���ϱ����� Inner class����//////////////////////////
	
	public class BtnEventProcess implements ActionListener{

		public void copyFile(File originalFile) throws IOException{
			FileInputStream fis=null;
			FileOutputStream fos=null;
			
			try {
//				System.out.println(originalFile);
				//1.���� ���Ͽ� ��Ʈ�� ����
				fis=new FileInputStream(originalFile);
				//2.������ ���ϸ� ���� : ���� ���ϸ�_copy
				//\\211.63.89.130\sharing\05.������Ʈ\project_1\work.docx
				//\\211.63.89.130\sharing\05.������Ʈ\project_1\work_copy.docx_
				
				//���ϸ��� �������� �� ���� ���ϸ�_copy��� �̸����� ���ϸ��� ����� ���
				StringBuilder copyFileName=new StringBuilder(originalFile.getAbsolutePath());
				copyFileName.insert(copyFileName.lastIndexOf("."),"_copy");
				
				File copyFile=new File(copyFileName.toString());
				
				
				//3.��½�Ʈ������ 
				fos=new FileOutputStream(copyFile);
				
///////////////////////////HDD�� ������� ���� �ڵ� (���� ����)/////////////////////////////////////				
//				//4.���� ���Ͽ��� 1byte�� �о�鿩
//				int readData=0;
//				while((readData=fis.read())!= -1) { //�����Ͱ� �����Ѵٸ�
//					//3.������ ���Ͽ� ����.(����� ���Ͽ� ����� ��Ʈ���� ����.)
//					fos.write(readData);
//				}//end while
///////////////////////////HDD�� ������� ���� �ڵ� (���� ����)/////////////////////////////////////
				
				//4. HDD�ּ� �� ���� �о���� �����͸� ������ �� �迭 ����
				byte[] data=new byte[512];
				
				//5.������ �б�
				int dataSize=0;
				while((dataSize=fis.read(data))!=-1) {
					//6.�迭�� ����� �������� ũ������� ��Ʈ���� ���
					fos.write(data,0,dataSize);
//					System.out.println(dataSize+"�� ����");
				}//end while
//				System.out.println();
				
				//6.��Ʈ���� �����ִ� �����͸� ����
				fos.flush();
				JOptionPane.showMessageDialog(fc, copyFile.getName()+"���� ����Ǿ����ϴ�.");
				jlblOutput.setText(copyFile.getAbsolutePath());
				
			}finally {
				if(fis!=null) {fis.close();}
				if(fos!=null) {fos.close();}
			}//end finally
			
		}//copyFile
		
		public void copyFile16(File originalFile) throws IOException{
			BufferedReader br=null;
			FileWriter fw=null;
			
			try {
//				System.out.println(originalFile);
				//1.���� ���Ͽ� ��Ʈ�� ����
				br=new BufferedReader(new FileReader(originalFile)) ;
				
				//2.������ ���ϸ� ���� : ���� ���ϸ�_copy
				//\\211.63.89.130\sharing\05.������Ʈ\project_1\work.docx
				//\\211.63.89.130\sharing\05.������Ʈ\project_1\work_copy.docx_
				
				//���ϸ��� �������� �� ���� ���ϸ�_copy��� �̸����� ���ϸ��� ����� ���
				StringBuilder copyFileName=new StringBuilder(originalFile.getAbsolutePath());
				copyFileName.insert(copyFileName.lastIndexOf("."),"_copy");
				
				File copyFile=new File(copyFileName.toString());
				
				
				//3.��½�Ʈ������ 
				fw=new FileWriter(copyFile);
				
				//4.���� ���Ͽ��� 1byte�� �о�鿩
				String readData="";
				while((readData=br.readLine())!= null) { //�����Ͱ� �����Ѵٸ�
					//5.������ ���Ͽ� ����.(����� ���Ͽ� ����� ��Ʈ���� ����.)
					fw.write(readData);
				}//end while
				
				
				
				//6.��Ʈ���� �����ִ� �����͸� ����
				fw.flush();
				JOptionPane.showMessageDialog(fc, copyFile.getName()+"���� ����Ǿ����ϴ�.");
				jlblOutput.setText(copyFile.getAbsolutePath());
				
			}finally {
				if(br!=null) {br.close();}
				if(fw!=null) {fw.close();}
			}//end finally
			
		}//copyFile
		
		public void openDialog() {
			FileDialog fdOpen=new FileDialog(fc,"���ϼ���",FileDialog.LOAD);
			fdOpen.setVisible(true);
			
			String path=fdOpen.getDirectory();
			String name=fdOpen.getFile();
			
			File originalFile=new File(path+name);// ������ ���Ϸ� ���� ��ü �����ϰ�
			if(originalFile.exists()) { // ������ �����Ѵٸ�
			
				try {
					copyFile(originalFile); //���� �۾� ����
				} catch (IOException ie) {
					JOptionPane.showMessageDialog(fc, "���� ���� �� ���� �߻�");
					ie.printStackTrace();
				}//end catch
			}//end if
			
		}//openDialog
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			openDialog();
			
		}
		
		
	}
	
	///////////////////��ư�� �̺�Ʈ�� ó���ϱ����� Inner class ��//////////////////////////
	
	
	
	public static void main(String[] args) {

		new FileCopy();
		
		
	}//main

}//class
