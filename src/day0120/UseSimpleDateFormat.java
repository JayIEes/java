package day0120;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Formatter class =>형식을 설정하는 일을 하는 클래스들
 * java.text에 존재한다.
 * @author user
 */
public class UseSimpleDateFormat {

	public UseSimpleDateFormat() {
		
		Date date=new Date();
		//1. Formatter class생성(형식 설정)
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd a HH(kk,KK,hh):mm:ss EEEE");
		
		
		//2. 설정된 형식의 날짜 정보 얻어 (Date와 has a )
		String formatDate=sdf.format(date);
		
		//3. 출력
		System.out.println(formatDate);
		
		
		System.out.println("-------------------------------------");
		//Locale을 사용한 다른 국가의 날짜 형식
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd a HH(hh):mm:ss EEEE",Locale.GERMANY);
		System.out.println(sdf2.format(date));
		
	}//UseSimpleDateFormat
	
	public static void main(String[] args) {
		new UseSimpleDateFormat();
		
		
		
		
		
		
		
		
		
		
	}//main

}
