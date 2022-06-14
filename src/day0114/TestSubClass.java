package day0114;

/**
 * @author user
 * 자식클래스: 
 * TestSuperClass의 자식클래스
 */
public class TestSubClass extends TestSuperClass {

	
	int c;//부모클래스에 존재하는 변수명과 동일한 변수 선언. //자식클래스의 변수를 갖다 씀. 지역변수라 가까이에 있으니까

	
	public TestSubClass() {
		System.out.println("자식클래스의 생성자");
	}//TestSubClass
	
	
	public void parentResource() {
		//상속의 특징: 부모클래스의 자원을 자식클래스에서 자신의 것처럼 사용할 수 있다.
		this.a=10; //public /내꺼처럼 쓸 수 있다. -> 부모꺼 상속받았기 때문에
		this.b=20;//protected 
		this.c=30;//default
		super.c=40; // 같은 이름의 변수가 존재하면 부모의 변수는 super로 자식의 변수는 this로 접근한다.
//		d=10; //private은 쓸 수 없다.
//		System.out.println(super); //super는 출력 불가
		System.out.println(this); //this는 출력이 되지만
		System.out.println("자식 method"+this.a+","+this.b+","+c+","+super.c);
		
		
	}//parentResource
	
	
	
	
}//class
