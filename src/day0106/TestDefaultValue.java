package day0106;

/**
 * @author user
 * class field에 선언되는 변수는 자동초기화된다. <br>
 * 개발자가 초기값을 넣을 필요가 없다.
 */
public class TestDefaultValue {
	
	//얘네는 instance variable
	int i; //정수형 : 0
	char c; //문자형 : \u0000
	double d; //실수형:0.0
	boolean b;//불린형 :false
	TestDefaultValue tdv;//참조형 :null
	String str; //참조형 :null
	int[] arr; //참조형 :null
		
	
	public static void main(String[] args) {

		TestDefaultValue instance=new TestDefaultValue(); //여기서 instance는 인스턴스이다. (instance varible 아님)
		System.out.println("정수형 ["+instance.i+"]");
		System.out.println("문자형 ["+instance.c+"]");
		System.out.println("실수형 ["+instance.d+"]");
		System.out.println("불린형 ["+instance.b+"]");
		System.out.println("참조형 class ["+instance.tdv+"]");
		System.out.println("참조형 String ["+instance.str+"]");
		System.out.println("참조형 array ["+instance.arr+"]");
		
		
	}//main

}//class
