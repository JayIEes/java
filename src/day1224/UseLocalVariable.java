package day1224;
/**
	지역변수의 사용 
*/

public class UseLocalVariable {
	//java application
	public static void main(String[] args) {
	//1. 변수 선언 : 변수명이 다르다면 몇개든 선언할 수 있다.
	int i; //초기화가 되지 않은 변수
	int age = 0; //초기화된 변수
	//2. 값 할당
	i = 2021;
	age = 25;
	System.out.println(age);
	age = 22;
	age = 55;
	//double age; 데이터형이 달라도 변수명이 같다면 Error 발생!
	
	//3. 값 사용
	System.out.println(i+1);
	System.out.println(age+"살");

	int 나이 = 0;
	System.out.println(나이);
		
	}//main

}//class
