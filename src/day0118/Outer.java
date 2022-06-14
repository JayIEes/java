package day0118;


/**
 * Inner class
 * @author user
 */
public class Outer {
	private int outI;
	
	public Outer() {
		System.out.println("바깥클래스의 생성자");
	}//Outer
	
	
	public void outMethod() {
		System.out.println("바깥클래스의 method");
		
//		inI=10; //바깥 클래스에서는 안쪽클래스의 변수를 직접 사용 불가능.
//		inMethod();//바깥 클래스에서는 안쪽클래스의 method를 직접 사용 불가능.
		System.out.println("---------------------------------");
		//instance method에서 inner class를 객체화
//		Inner in = this.new Inner();
		Inner in = new Inner(); //instance 영역안에서는 this 생략해서 사용 가능
		System.out.println(in);
		
	}//outMethod
	
	
	
	
	////////////////////안쪽 클래스의 시작//////////////////////////////
	public class Inner{
		int inI;
		
		public Inner() {
			System.out.println("안쪽 클래스의 생성자");
		}//Inner
		
		
		public void inMethod() {
			System.out.println("안쪽 클래스의 method");
			
			//바깥 클래스의 자원을 직접 사용할 수 있다. 
			outI=100;
			outMethod();
		}//inMethod
		
		
		
	}//class
	////////////////////안쪽 클래스의 끝//////////////////////////////
	
	
	
	public static void main(String[] args) {
		
		//1. 바깥클래스의 객체화 : 클래스명 객체명=new 생성자();
		Outer out=new Outer();
		
		//2. 안쪽클래스의 객체화 : 바깥클.안쪽클 객체명=바깥클객체명.new 안쪽클생성자();
		//바깥클래스명 생략가능
		Outer.Inner in= out.new Inner();
//		Inner in= out.new Inner(); //바깥클래스명 생략가능
		
		//3. 안쪽클래스의 자원 사용
		in.inI=200;
		in.inMethod();
		
		System.out.println(out.outI);
		
		
	}//main
	
	
}//class
