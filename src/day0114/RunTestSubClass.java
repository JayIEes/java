package day0114;

/**
 * @author user
 * Ŭ������ ����ϴ� Ŭ����
 */
public class RunTestSubClass {

	public static void main(String[] args) {
		//��Ӱ��迡���� �ڽ� Ŭ������ ����Ͽ� ��üȭ�Ѵ�. �θ�Ŭ������ ���� ��üȭ �� �� �ڽ� Ŭ������ ��üȭ�ȴ�.
		TestSubClass tsc =new TestSubClass();
		tsc.parentResource();
		
		//��ü�����ε� ��밡��
		System.out.println("main method���� �ڽ�Ŭ������ ��ü�� "+tsc.a+","+tsc.b+","+tsc.c);
		tsc.parentMethod();
		
		
		
		
	}//main

}//class
