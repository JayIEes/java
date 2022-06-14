package day0105.sub;

import day0105.Modifiers;

/**
 * @author user
 * 다른 패키지의 상속관계로 설정된 자식 클래스
 */
public class Modifiers4 extends Modifiers{
	
	
	public static void main(String[] args) {
		System.out.println("다른 패키지에 존재하는 자식 클래스");
		//객체화: 인스턴스 변수를 사용하기 위해
		//상속 관계에서는 "자식클래스"로 객체화를 한다.
		Modifiers4 m = new Modifiers4();
		//변수의 접근지정자에 따라 사용과 사용불가가 결정된다.
		System.out.println("public : "+m.instanceA); //사용가능
		System.out.println("protected : "+m.instanceB);//사용가능
//		System.out.println("default : "+m.instanceC);//사용불가능
//		System.out.println("private : "+m.instanceD); //사용불가능
		
		
		
	}//main

}//class
