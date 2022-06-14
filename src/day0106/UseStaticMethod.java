package day0106;

/**
 * @author user
 * static method : 인스턴스 변수를 사용하지 않고 입력된 값으로만 업무를 처리할 때. 
 */
public class UseStaticMethod {
	//1. method정의
	public static void test() {
		System.out.println("static method 호출");
	}//test
	
	public static void main(String[] args) {
		//2. 호출
		UseStaticMethod.test();
		
		
		
		
	}//main

}//class
