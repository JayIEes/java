package day0118;

/**
 * @author user
 * 안쪽클래스를 static 변수처럼 사용.
 */
public class NestedOuter {
	int outI;
	static int outJ;

	public void outInstanceMethod() {
		System.out.println("바깥클래스의 인스턴스 method");
	}//outInstance
	
	public static void outStaticMethod() {
		System.out.println("바깥클래스의 static method");
	}//outStaticMethod
	
	/////////////////////////Nested class 시작///////////////////////////////
	static class NestedInner{
//		int i; //클래스의 접근지정자 static이더라도 안쪽은 인스턴스영역이다.  ///중첩클래스에서는 instance변수를 만들지 않는다.
		//static 생성자 굳이 안만듦
		static int inJ;
		
//		public void inInstanceMethod() { //중첩클래스에서는 instance method를 만들지 않는다.
//		}
	
		public static void inStaticMethod() {
			System.out.println("중첩클래스의 static method");
			System.out.println("-----------------------");
			//바깥클래스의 자원 사용
			//인스턴스 변수나 메소드는 사용 불가
//			outI=100;
//			outInstanceMethod();
			//메모리 영역을 벗어나서는 쓸 수 없다.
			
			//동일영역의 변수나 method만 사용가능.
			outJ=200;
			outStaticMethod();
			
			
		}//inStaticMethod//중첩클래스에서는 instance변수를 만들지 않는다.
		
	
	}//class
	/////////////////////////Nested class 시작///////////////////////////////
	
	
	public static void main(String[] args) {
		//중첩클래스는 static을 주로 사용하여 만들기 때문에 객체를 생성하지 않고, 
		// static 방식으로 클래스명.method명 또는 클래스명.변수명 으로 사용한다.
		NestedInner.inJ=100;
		NestedInner.inStaticMethod();
	
	
	
	}//main

}//class
