package day0117;

/**
 * 추상클래스의 자식 클래스<br>
 * 부모클래스의 추상method를 반드시 override해야한다.<br>
 * 자식클래스가 생성되면 부모클래스부터 생성된다.
 * @author user
 */
public class AbstractSub extends AbstractSuper {

	@Override
	public void methodB() { //부모클래스의 abstract method를 구현(override)
		System.out.println("접근지정자는 달라도 되고, 반환형, method형, 매개변수를 같게 설정");
	}//methodB
	
	@Override
	public int methodC(String name) {
		return name.length();
	}
	
	public static void main(String[] args) {
//		new AbstractSuper();//추상클래스 직접 객체화 불가
		AbstractSub as=new AbstractSub(); //자식 클래스를 생성하면 부모클래스가 먼저 생성된다.
		as.methodA(); //부모클래스의 method
		as.methodB(); //자식클래스가 override한 method
		System.out.println(as.methodC("테스트"));
		
		//상속 관계의 객체화(자식은 부모이다=>is a 관계)
		//자식클래스에서는 부모클래스의 정보를 알 수 있기 때문에 자식클래스의 객체는 부모클래스로 만들어진 객체에 할당될 수 있다.
		System.out.println("----------------------------------");
//		AbstractSub as2=new AbstractSuper();//부모는 자식을 모름. 할당 불가
		AbstractSuper as2=new AbstractSub();//is a 관계의 객체화
		//객체는 부모의 정보를 사용하기 때문에 자식의 모든 기능을 사용할 수 없다.
		as2.methodA(); //자신의 method
		as2.methodB();//자신의 method는 body가 없어 일을 할 수 없지만, 주소를 할당받은 자식의 method가 최우선적으로 호출된다. 
		System.out.println(as2.methodC("창 밖에 눈 온다~")); //자식이 오버라이딩한 메소드
			
	
		
		
	}//main

}
