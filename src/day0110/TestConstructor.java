package day0110;

/**
 * 생성자의 정의와 호출
 * @author user
 */
public class TestConstructor {

	private int i; //iv인스턴스 변수, 객체화 할 때 heap메모리에 자동초기화(0)되어 올라간다.
	
	
	public TestConstructor() {
		i=2022;
		//객체 생성될 때 인스턴스 변수의 값을 2022로 초기화 하고 싶다.
		System.out.println("기본생성자");
	}//TestConstructor
	
	public void test() {
		System.out.println("test method!");
	}//test
	
	
	/**
	 * 생성자 overload : 규칙 접근지정가 같고, 반환형 같고, method명 같고, 매개변수는 다르게
	 * @param i 객체가 생성될 때 들어갈 초기값.
	 */
	public TestConstructor(int i) {
		this.i=i;
			System.out.println("인수있는 생성자");
//			test();//일반 method 호출 가능
//			TestConstructor();//생성자는 일반 method 호출문법으로 직접 호출할 수 없다. 
	}//TestConstructor
	
	
	
	public static void main(String[] args) {
		TestConstructor tc = new TestConstructor(); //기본 생성자를 사용하여 객체화
		System.out.println(tc.i);
		TestConstructor tc1=new TestConstructor(110);//매개변수 있는 생성자를 사용한 객체화
		System.out.println(tc1.i);
		
		
	}//main

}//class
