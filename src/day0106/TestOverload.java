package day0106;

/**
 * method overload. 같은 이름의 method를 여러 개 작성하는 것.
 * 매개변수를 다르게 설정한다.
 * @author user
 */
public class TestOverload {

	/**
	 * 별을 하나 출력하는 메소드
	 */
	public void printStar() {
		
		System.out.print("★");
		
	}//printStar
	
	/**
	 * 입력된 수대로 병을 출력하는 일
	 * @param cnt 출력할 별의 개수
	 */
	public void printStar(int cnt) {
		
			for(int i=0;i<cnt;i++) {
				System.out.print("☆");	
				}
			
		}
	
	
	
	public static void main(String[] args) {

		TestOverload to = new TestOverload();
		//별하나 출력
		to.printStar();
		//별 여러 개 출력
		to.printStar(5);
		
		
		
		
		
	}//main

}//class
