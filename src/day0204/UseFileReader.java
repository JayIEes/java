package day0204;

import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * 16 bit ��Ʈ���� ����� ������ �ٴ��� �б�
 * @author user
 */
@SuppressWarnings("serial")
public class UseFileReader extends JFrame{
	

	public void readFile() throws IOException {
		//1. ������ ������ ������ ��� ��ü�� ����
		FileDialog fd=new FileDialog(this,"���� ����",FileDialog.LOAD);
		fd.setVisible(true);
		
		String path=fd.getDirectory();
		String name=fd.getFile();
		
		File file=new File(path+name);
		if(file.exists()) {
			BufferedReader br=null;//�ٴ����� �д� ���
			
			try {
				//���Ͽ� �����ϴ� ����� ���� ��Ʈ���� ����
				br = new BufferedReader(new FileReader(file));
//				System.out.println(br.readLine()); //\n���� �� �� �б�
				
//				String data="";
//				while((data=br.readLine())!=null) {
//					System.out.print(data);
//				}//end while
				
				String data="";
				StringBuilder outputData=new StringBuilder();
				while((data=br.readLine())!=null) {
					outputData.append(data).append("\n");
				}//end while
				JTextArea jta=new JTextArea(outputData.toString(),10,50);
				JScrollPane jsp=new JScrollPane(jta);
				
				JOptionPane.showMessageDialog(this, jsp);
				
				
			}finally {
				if(br!=null) {br.close();}//end if
			}//end finally
			
			
			System.out.println("���� ����");
		}else {
			JOptionPane.showMessageDialog(this, file + "������ �������� �ʽ��ϴ�.");
		}//end else
//		FileReader fr=new FileReader();
		
		
	}//readFile
	
	
	
	public static void main(String[] args) {
		UseFileReader ufr=new UseFileReader();
		try {
			ufr.readFile();
		} catch (IOException e) {
			e.printStackTrace();
		}//end catch
//		System.exit(0);
		ufr.dispose();
	}//main

}
