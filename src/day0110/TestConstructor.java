package day0110;

/**
 * �������� ���ǿ� ȣ��
 * @author user
 */
public class TestConstructor {

	private int i; //iv�ν��Ͻ� ����, ��üȭ �� �� heap�޸𸮿� �ڵ��ʱ�ȭ(0)�Ǿ� �ö󰣴�.
	
	
	public TestConstructor() {
		i=2022;
		//��ü ������ �� �ν��Ͻ� ������ ���� 2022�� �ʱ�ȭ �ϰ� �ʹ�.
		System.out.println("�⺻������");
	}//TestConstructor
	
	public void test() {
		System.out.println("test method!");
	}//test
	
	
	/**
	 * ������ overload : ��Ģ ���������� ����, ��ȯ�� ����, method�� ����, �Ű������� �ٸ���
	 * @param i ��ü�� ������ �� �� �ʱⰪ.
	 */
	public TestConstructor(int i) {
		this.i=i;
			System.out.println("�μ��ִ� ������");
//			test();//�Ϲ� method ȣ�� ����
//			TestConstructor();//�����ڴ� �Ϲ� method ȣ�⹮������ ���� ȣ���� �� ����. 
	}//TestConstructor
	
	
	
	public static void main(String[] args) {
		TestConstructor tc = new TestConstructor(); //�⺻ �����ڸ� ����Ͽ� ��üȭ
		System.out.println(tc.i);
		TestConstructor tc1=new TestConstructor(110);//�Ű����� �ִ� �����ڸ� ����� ��üȭ
		System.out.println(tc1.i);
		
		
	}//main

}//class
