package day0117;


public interface TestInterface {
//	int i; //instance variable를 가질 수 없다.
//	int i=100; //instance 처럼 썼지만 static으로 판단함
	public static final int i=100;

//	public TestInterface() { //interface는 생성자를 가질 수 없다. 그래서 객체화를 못한다.
//	}
	
//	public void test() { //일반 method를 가질 수 없다. =>일을 할 수 없다.
//	}
	
	public void test(); //abstract이 없는 abstract method -body만 없으면 돼
	public abstract String test(int i); //abstract이 있는 abstract method
	
	public default String temp() { //바로 부를 수 없다!
		return "JDK 1.8에서부터 추가된 default method";
	}//end
	
	
	
	
	
}//class
