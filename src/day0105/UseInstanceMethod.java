/**
 * 
 */
package day0105;

/**
 * @author user
 * instance method�� �ۼ�, ȣ��
 */
public class UseInstanceMethod {

		/**
		 * instance method 
		 */
	public void test() {
			System.out.println("test method ȣ��!!!");
	}//test
	
	
	public static void main(String[] args) {
		
		//test(); // static ���������� instance method�� ���� ȣ���� �� ����. ************************�ٽú���
		//2. ��üȭ
		UseInstanceMethod uim = new UseInstanceMethod();
		
		//3.ȣ��
		uim.test();
		
		
		
		
		
		
		
		
	}//main

}//class
