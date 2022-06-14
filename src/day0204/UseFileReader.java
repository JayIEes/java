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
 * 16 bit 스트림을 사용한 파일의 줄단위 읽기
 * @author user
 */
@SuppressWarnings("serial")
public class UseFileReader extends JFrame{
	

	public void readFile() throws IOException {
		//1. 연결할 파일의 정보를 얻는 객체를 생성
		FileDialog fd=new FileDialog(this,"파일 선택",FileDialog.LOAD);
		fd.setVisible(true);
		
		String path=fd.getDirectory();
		String name=fd.getFile();
		
		File file=new File(path+name);
		if(file.exists()) {
			BufferedReader br=null;//줄단위로 읽는 기능
			
			try {
				//파일에 연결하는 기능을 가진 스트림과 연결
				br = new BufferedReader(new FileReader(file));
//				System.out.println(br.readLine()); //\n까지 한 줄 읽기
				
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
			
			
			System.out.println("파일 있음");
		}else {
			JOptionPane.showMessageDialog(this, file + "파일이 존재하지 않습니다.");
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
