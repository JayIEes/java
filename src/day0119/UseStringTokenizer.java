package day0119;

import java.util.StringTokenizer;

/**
 * @author user
 * 문자열을 짧은 한 마디(토큰)으로 구분할 때 사용하는 클래스.
 */
public class UseStringTokenizer {

	public UseStringTokenizer() {
		String msg="자바,오라클,.JDBC,HTML,CSS"; //CSV Data (Comma Seperated Value) : 특정 문자열로 구분된 데이터 
	
		//1. StringTokenizer생성
//		StringTokenizer stk = new StringTokenizer(msg); // msg의 시작 주소를 받은거임 //얘는 공백으로 토큰 구분하는애
//		StringTokenizer stk = new StringTokenizer(msg,","); //특정문자열로 구분하여 토큰생성
//		StringTokenizer stk = new StringTokenizer(msg,",."); //특정문자열로 구분하여 토큰생성 (or기능!)
		//구분문자열에는 or기능 - 구분문자열에 해달하는 모든 문자열을 토큰으로 생성
//		StringTokenizer stk = new StringTokenizer(msg,",.B "); //특정문자열로 구분하여 토큰생성 (or기능!) //공백을 delim에 넣어도 잘린다.
//		StringTokenizer stk = new StringTokenizer(msg,",",true); //매개변수3개 //구분문자열도 토큰으로 생성한다!
		StringTokenizer stk = new StringTokenizer(msg,",",false); //매개변수3개 //구분문자열도 토큰으로 생성한다!
		
		
		
		//2. 토큰의 수. (토큰이 얻어질 때마다 감소한다.)
		System.out.println(stk.countTokens());
		
//		//3. 토크이 존재하는지 
//		System.out.println(stk.hasMoreTokens());
//		//4.토큰을 얻고, 포인터를 다음 토큰앞으로 이동하는지
//		System.out.println(stk.nextToken());
//		//3. 토크이 존재하는지 
//		System.out.println(stk.hasMoreTokens());
//		//4.토큰을 얻고, 포인터를 다음 토큰앞으로 이동하는지
//		System.out.println(stk.nextToken());
//		//3. 토크이 존재하는지 
//		System.out.println(stk.hasMoreTokens());
//		//4.토큰을 얻고, 포인터를 다음 토큰앞으로 이동하는지
//		System.out.println(stk.nextToken());
//		//3. 토크이 존재하는지 
//		System.out.println(stk.hasMoreTokens());
//		//4.토큰을 얻고, 포인터를 다음 토큰앞으로 이동하는지
//		System.out.println(stk.nextToken());
//		//3. 토크이 존재하는지 
//		System.out.println(stk.hasMoreTokens());
//		//4.토큰을 얻고, 포인터를 다음 토큰앞으로 이동하는지
//		System.out.println(stk.nextToken());
//		
//		System.out.println("----------------");
//		
		
		//3. 토큰이 존재하는지 
		String token="";
		while(stk.hasMoreTokens()) {
		//4.토큰을 얻고, 포인터를 다음 토큰앞으로 이동하는지
//			stk.nextToken();
			token=stk.nextToken();
			System.out.println(token);
		}//end while
		
		
		
		
		
		
	}//UseStringTokenizer
	
	public static void main(String[] args) {
		new UseStringTokenizer();
		
		
		
		
	}//main

}//class
