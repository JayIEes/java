package day0204;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInputStream을 사용한 파일의 내용 읽기
 * @author user
 */
public class UseFileInputStream {

	public UseFileInputStream() throws IOException {
		//1. 파일에 스트림을 연결
		File file=new File("e:/dev/temp/java_read.txt");
		FileInputStream fis=null;
		if(file.exists()) {
			try {
				fis=new FileInputStream(file);//파일에 스트림을 사용하여 연결하고
				//연결된 파일에서 최초 1byte만 읽어들인다.
//				int data=fis.read(); //연결된 스트림에서 1byte를 가져온다.
//				System.out.println("읽어들인 데이터 "+ (char)data); //한글 못읽음
//			}catch (IOException ie) { //FileNotFoundException면 위 exists와 중복되니까 굳이
//				ie.printStackTrace();
			
				//연결된 파일에서 모든 데이터를 1byte씩 읽어들인다.
				int data=0;
				while((data=fis.read()) != -1) {//EOF
					System.out.print((char)data);
				}
			
			}finally { //이 코드를 반드시 실행시키기위해 try~ finally부분은 없어서는 안된다.
				if(fis!=null) {
					fis.close(); //3. 스트림의 사용이 끝났다면 메모리 누수를 막기위해 반드시 닫아준다.
				}
			}//end finally
			
		}else {
			System.out.println(file.getAbsolutePath()+"이 존재하지 않습니다.");
		}//end else
		
	}//UseFileInputStream
	
	public static void main(String[] args) {
		try {
			new UseFileInputStream();
		} catch (IOException e) {
			//생성자의 여러 행에서 발생한 IOExceoption을 한번에 모아서 처리할 수 있다.
			e.printStackTrace();
		}//end catch
	}

}
