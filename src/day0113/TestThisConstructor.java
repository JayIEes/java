package day0113;

/**
 * @author user
 * this()�� ����� �������� ȣ��
 */
public class TestThisConstructor {

	
	public TestThisConstructor() {
//		this(1); 
		System.out.println("�⺻������");
	}//TestThisConstructor
	
	
	public TestThisConstructor(int i) {
		this(); //ù ��° �ٿ����� �� �� �ִ�.
		System.out.println("Overload�� ������");
//		this(); //�������� ù ��° �ٿ����� ����� �� �ִ�.
	}//TestThisConstructor
	
	
	
	
	public static void main(String[] args) {

//		new TestThisConstructor();
		new TestThisConstructor(13);
		
		
	}//main

}//class
