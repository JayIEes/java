package day0113;

/**
 * @author user
 * this()를 사용한 생성자의 호출
 */
public class TestThisConstructor {

	
	public TestThisConstructor() {
//		this(1); 
		System.out.println("기본생성자");
	}//TestThisConstructor
	
	
	public TestThisConstructor(int i) {
		this(); //첫 번째 줄에서만 쓸 수 있다.
		System.out.println("Overload된 생성자");
//		this(); //생성자의 첫 번째 줄에서만 기술할 수 있다.
	}//TestThisConstructor
	
	
	
	
	public static void main(String[] args) {

//		new TestThisConstructor();
		new TestThisConstructor(13);
		
		
	}//main

}//class
