package day0117;

/**
 * @author user
 * 객체화 되지 않는 클래스
 */
public abstract class AbstractSuper {

	
	int i;
	
	
	public AbstractSuper() { //자식 클래스에 의해서만 호출
		System.out.println("추상클래스의 생성자");
	}//AbstractSuper 생성
	
	
	public void methodA() {
		System.out.println("부모의 일반 method");
	
	}
	
	public abstract void methodB(); //추상 method
	
	
	
	public abstract int methodC(String name);//추상 method
	
	
	
//	public static void main(String[] args) {
//
//		new AbstractSuper(); //추상 클래스이기 때문에 객체 생성 불가.
//	}//main 주석을 누락했어요

}//class
