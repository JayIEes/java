package day0114;

/**
 * @author user
 * parent�� �ڽ� Ŭ����
 */

public class Child extends Parent {

	public Child() {
		super(20);
//		this(30);
		System.out.println("�ڽ��� �⺻������");
	}//Child
	
	public Child (int i) {
		this();
		System.out.println("�ڽ��� �����ε��� ������"+i);
	} //Child
	
	
	
}//class
