package day0105.sub;

import day0105.Modifiers;

/**
 * @author user
 * 다은 패키지 다른 클래스
 */
public class Modifiers3 {
	
	
	public static void main(String[] args) {
		System.out.println("다른 패키지의 다른 클래스");
		//객체화: 인스턴스 변수를 사용하기 위해 
		Modifiers m = new Modifiers();
		//변수의 접근지정자에 따라 사용과 사용불가가 결정된다.
		System.out.println("public : "+m.instanceA); //사용가능
//		System.out.println("protected : "+m.instanceB);//사용불가능
//		System.out.println("default : "+m.instanceC);//사용불가능
//		System.out.println("private : "+m.instanceD); //사용불가능
		
		
		
	}//main

}//class
