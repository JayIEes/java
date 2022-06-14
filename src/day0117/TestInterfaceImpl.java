package day0117;

/**
 * @author user
 * interface�� ������(implements) class
 */
public class TestInterfaceImpl implements TestInterface{

	@Override
	public void test() {
		System.out.println("Override�� test method");
	}
	
	@Override
	public String test(int i) {
		return String.valueOf(i);
	}
	
	
	public static void main(String[] args) {
		//interface�� ��üȭ�� ���� �ʴ´�.
//		TestInterface ti=new TestInterface(); //������ ���� ������ ��üȭ�� �� ����.
		
		//default method�� static method�� �ƴϹǷ� ���� ȣ���� �� ����.
//		TestInterface.temp(); //temp�� ����Ʈ��� ���� �θ� �� �ִ°� �ƴ�. static �ƴ��ڳ�
		
		//�ڽ�Ŭ������ ��üȭ (interface�� default method�� override�� method ��� ��밡��)
		TestInterfaceImpl tii = new TestInterfaceImpl();
		System.out.println(tii.temp()); //default method
		tii.test();//override
		System.out.println(tii.test(2022)); //override
		
		System.out.println("---------------------------------------");
		//is a ������ ��üȭ 
		TestInterface ti= new TestInterfaceImpl();
		System.out.println(ti.temp()); //default method
		ti.test();//override
		System.out.println(ti.test(17)); //override
		
		
		
		
	}//main

}
