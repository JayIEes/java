package day0105;

/**
 * @author user
 * instance (member) variable 사용. <br>
 * 1. 선언 : 접근지정자 데이터형 변수명;<br> (접근지정자 빠지면 지역변수 됨, 지역변수는 접근지정자 못쓴다.)
 * 2. 객체생성 : 클래스명 객체명 = new 클래스명();<br>
 * 3. 객체명을 사용해서 변수 값 할당 : 객체명.변수명= 값;<br>
 * 4. 객체명을 사용하여 변수사용 : 객체명.변수명<br> 
 */
public class UseInstanceVariable {
	// 1. 선언
	int i; //default 접근지정자를 가진 인스턴스(멤버)변수 i
	int j; //default 접근지정자를 가진 인스턴스(멤버)변수 j

	
	
	public static void main(String[] args) {
	//	System.out.println(i); //인스턴스 변수는 static영역에서 객체명 없이 직접 사용할 수 없다.//
	//2. 객체화 //int 
		UseInstanceVariable uiv=new UseInstanceVariable();
	//3. 값 할당
		uiv.i=2022;
		
		
	//4. 값 사용 : 인스턴스(멤버)변수는 자동초기화가된다.
		System.out.println(uiv.i);
		
		
		//클래스로 객체를 몇개든 만들 수 있다.
		UseInstanceVariable uiv1=new UseInstanceVariable();
		UseInstanceVariable uiv2=new UseInstanceVariable();
		//생성된 객체는 (uiv1 또는 uiv2)에는 같은 이름의 변수 i를 각각 가진다.
		uiv1.i=1;
		uiv2.i=5;
		System.out.println(uiv.i+"/"+uiv1.i+"/"+uiv2.i);
		
		
		
	}//main

}//class
