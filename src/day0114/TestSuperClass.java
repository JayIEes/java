package day0114;

/**
 * @author user
 * 부모클래스 :  자식이 사용할 공통 코드 정의 => 코드의 재사용성
 */
public class TestSuperClass {
	public int a;
	protected int b;
	int c;
	private int d; //자식이라도 private은 못쓴다.
	
	public TestSuperClass() {
		System.out.println("부모클래스의 기본생성자");
	
	}//TestSuperClass
	
	public void parentMethod() {
		System.out.println("부모의 method");
	}//parentMethod
	
	
	
	
	
}//class
