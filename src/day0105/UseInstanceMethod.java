/**
 * 
 */
package day0105;

/**
 * @author user
 * instance method를 작성, 호출
 */
public class UseInstanceMethod {

		/**
		 * instance method 
		 */
	public void test() {
			System.out.println("test method 호출!!!");
	}//test
	
	
	public static void main(String[] args) {
		
		//test(); // static 영역에서는 instance method를 직접 호출할 수 없다. ************************다시보기
		//2. 객체화
		UseInstanceMethod uim = new UseInstanceMethod();
		
		//3.호출
		uim.test();
		
		
		
		
		
		
		
		
	}//main

}//class
