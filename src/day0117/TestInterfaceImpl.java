package day0117;

/**
 * @author user
 * interface를 구현한(implements) class
 */
public class TestInterfaceImpl implements TestInterface{

	@Override
	public void test() {
		System.out.println("Override한 test method");
	}
	
	@Override
	public String test(int i) {
		return String.valueOf(i);
	}
	
	
	public static void main(String[] args) {
		//interface는 객체화가 되지 않는다.
//		TestInterface ti=new TestInterface(); //생성자 없기 때문에 객체화될 수 없다.
		
		//default method는 static method가 아니므로 직접 호출할 수 없다.
//		TestInterface.temp(); //temp는 디폴트라고 직접 부를 수 있는게 아님. static 아니자나
		
		//자식클래스의 객체화 (interface의 default method와 override한 method 모두 사용가능)
		TestInterfaceImpl tii = new TestInterfaceImpl();
		System.out.println(tii.temp()); //default method
		tii.test();//override
		System.out.println(tii.test(2022)); //override
		
		System.out.println("---------------------------------------");
		//is a 관계의 객체화 
		TestInterface ti= new TestInterfaceImpl();
		System.out.println(ti.temp()); //default method
		ti.test();//override
		System.out.println(ti.test(17)); //override
		
		
		
		
	}//main

}
