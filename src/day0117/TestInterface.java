package day0117;


public interface TestInterface {
//	int i; //instance variable�� ���� �� ����.
//	int i=100; //instance ó�� ������ static���� �Ǵ���
	public static final int i=100;

//	public TestInterface() { //interface�� �����ڸ� ���� �� ����. �׷��� ��üȭ�� ���Ѵ�.
//	}
	
//	public void test() { //�Ϲ� method�� ���� �� ����. =>���� �� �� ����.
//	}
	
	public void test(); //abstract�� ���� abstract method -body�� ������ ��
	public abstract String test(int i); //abstract�� �ִ� abstract method
	
	public default String temp() { //�ٷ� �θ� �� ����!
		return "JDK 1.8�������� �߰��� default method";
	}//end
	
	
	
	
	
}//class
