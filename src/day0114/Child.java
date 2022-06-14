package day0114;

/**
 * @author user
 * parent의 자식 클래스
 */

public class Child extends Parent {

	public Child() {
		super(20);
//		this(30);
		System.out.println("자식의 기본생성자");
	}//Child
	
	public Child (int i) {
		this();
		System.out.println("자식의 오버로딩된 생성자"+i);
	} //Child
	
	
	
}//class
