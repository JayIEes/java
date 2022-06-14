package day0120;

import java.util.Date;

/**
 * Date클래스의 사용
 * @author user
 */
public class UseDate {

	
	
	
	public static void main(String[] args) {
		//CMOS 날짜 얻기
		long ctm=System.currentTimeMillis(); //1970-01-01 00:00:00에서부터 현재까지의 시간을 ms
		System.out.println(ctm);//System클래스만 OS와 정보를 교환할 수 있는 유일한 클래스.
		
		//1.객체화
		Date date= new Date();
		Date date2= new Date(ctm);
		
		System.out.println(date); //객체 출력했는데 값이 나온 이유는 java.lang.Object클래스의 toString()를 Override해서 그렇다.
		System.out.println(date2); //객체 출력했는데 값이 나온 이유는 java.lang.Object클래스의 toString()를 Override해서 그렇다.
		
		
		
		
		
		
	}//main

}
