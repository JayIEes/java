package day0118;

/**
 * @author user
 * ����Ŭ������ static ����ó�� ���.
 */
public class NestedOuter {
	int outI;
	static int outJ;

	public void outInstanceMethod() {
		System.out.println("�ٱ�Ŭ������ �ν��Ͻ� method");
	}//outInstance
	
	public static void outStaticMethod() {
		System.out.println("�ٱ�Ŭ������ static method");
	}//outStaticMethod
	
	/////////////////////////Nested class ����///////////////////////////////
	static class NestedInner{
//		int i; //Ŭ������ ���������� static�̴��� ������ �ν��Ͻ������̴�.  ///��øŬ���������� instance������ ������ �ʴ´�.
		//static ������ ���� �ȸ���
		static int inJ;
		
//		public void inInstanceMethod() { //��øŬ���������� instance method�� ������ �ʴ´�.
//		}
	
		public static void inStaticMethod() {
			System.out.println("��øŬ������ static method");
			System.out.println("-----------------------");
			//�ٱ�Ŭ������ �ڿ� ���
			//�ν��Ͻ� ������ �޼ҵ�� ��� �Ұ�
//			outI=100;
//			outInstanceMethod();
			//�޸� ������ ������� �� �� ����.
			
			//���Ͽ����� ������ method�� ��밡��.
			outJ=200;
			outStaticMethod();
			
			
		}//inStaticMethod//��øŬ���������� instance������ ������ �ʴ´�.
		
	
	}//class
	/////////////////////////Nested class ����///////////////////////////////
	
	
	public static void main(String[] args) {
		//��øŬ������ static�� �ַ� ����Ͽ� ����� ������ ��ü�� �������� �ʰ�, 
		// static ������� Ŭ������.method�� �Ǵ� Ŭ������.������ ���� ����Ѵ�.
		NestedInner.inJ=100;
		NestedInner.inStaticMethod();
	
	
	
	}//main

}//class
