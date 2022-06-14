package day0208;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 사용자가 입력한 키의 값 얻기(엔터가 눌려지면 그 때 값이 입력된다.)
 * @author user
 */
public class UseKeyboardInput {

	
	public UseKeyboardInput() throws IOException {
		
		
		System.out.println("아무 키나 누르고 엔터");
//		int value=System.in.read(); //엔터가 눌려지기 전까지 대기(아래줄의 코드를 실행하지 않는다.)
//		System.out.println("입력값 "+(char)value);
		
		////////영어, 숫자, 특수 문자는 읽혀지고, 한글은 깨진다.
//		int value=0;
//		while((value=System.in.read())!=13) {
//		System.out.print((char)value);
//			
//		}//end while
		
		
		//줄단위(enter -13)로 읽어들이기
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String value=br.readLine();
		
		System.out.println("입력값"+value);
		
	}//UseKeyboardInput
	
	
	public static void main(String[] args) {

		try {
			new UseKeyboardInput();
		} catch (IOException e) {
			e.printStackTrace();
		}//end catch
		
	}//main

}//class
