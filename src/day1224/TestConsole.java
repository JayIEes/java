package day1224;
/**
console 출력 연습
*/

//1. 소스코드 작성
public class TestConsole{  
	/*
	main method를 가진 클래스는 단독으로 실행될 수 있는 클래스
	단독으로 실행 될 수 있는 클래스를 Java Applicaton이라고 한다.
	*/
	public static void main(String[] args){
		//System.out.print("안녕하세요?");
		//System.out.print("today is christmas eve");
		//System.out.println("today is christmas eve");
		//System.out.print("wow");

		System.out.println("상수출력");
		System.out.println(24);//정수 상수
		System.out.println(12.24);//실수 상수
		System.out.println('A');//문자상수
		System.out.println(true);//불린상수
		System.out.println("안녕");//문자열상수

		System.out.println("변수");
		int i=12;
		TestConsole t = new TestConsole();//참조형 데이터형

		System.out.println(i);//기본형 데이터형은 값이 출력
		System.out.println(t);//참조형 데이터는 주소가 출력

		System.out.println("12+24="+(12+24));//연산식 결과 출력
	}//main

}//class

//2. 저장 : TestConsole.java

//3. 컴파일 : javac TestConsole.java

//4. 실행: java TestConsole