package day0204;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * 문자열 데이터를 목적지 파일로 기록.
 * @author user
 */
@SuppressWarnings("serial")
public class UseFileWriter{

	public void writeData() throws IOException {
		String msg="오늘은 즐거운 금요일입니다.";
		
		
		File file=new File("e:/dev/temp/write_data.txt");
		//파일이 존재하면 ConfirmDialog로 덮었쓸 것인지 물어보고 "예"가 눌리는 경우에만 덮어쓴다.
		//만약 파일이 존재하지 않으면 파일을 생성한다.
		FileWriter fw=null; //
		try{
		
		int flag=0;
		
			if(file.exists()) {
				flag=JOptionPane.showConfirmDialog(null, "파일을 덮어쓰겠습니까?");
				switch(flag) {
				case JOptionPane.OK_OPTION : 
					//1.스트림을 연결
					fw=new FileWriter(file); //스트림이 생성되면 파일을 덮어쓴다.
					//2. 스트림에 데이터를 기록
					fw.write(msg);
					//3. 스트림에 기록된 데이터를 목적지로 분출
					fw.flush();
					System.out.println("파일을 덮었습니다.");
					break;
				case JOptionPane.CANCEL_OPTION:
					System.out.println("취소를 누르셨습니다."); break;
					
				case JOptionPane.NO_OPTION:
					System.out.println("아니오를 누르셨습니다.");
				}//end switch
			
			}else {
				System.out.println(file.createNewFile()? "파일을 새로 생성하였습니다." : "실패했습니다.");
			
			}//end else
				System.out.println("파일로 데이터를 기록하였습니다.");
				
		}finally {
			//4.스트림을 끊는다.(메모리 누수 방지)
			if(fw!=null) {fw.close();}//end if
		}//end finally
		
		
		
		
	}//writeData
	
	
	
	public static void main(String[] args) {

		UseFileWriter ufw=new UseFileWriter();
		try {
			ufw.writeData();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}//main

}
