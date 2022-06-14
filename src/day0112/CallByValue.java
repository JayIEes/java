package day0112;

/**
 * 값 복사 : method의 매개변수로 기본형 데이터형을 사용되면 값이 복사 되어 들어간다.
 * @author user
 */
public class CallByValue {

	/**
	 * 매개변수로 선언된 i와 j의 값을 서로 바꾸는 일.
	 * @param i
	 * @param j
	 */
	public void swap(int i, int j) {
		int temp=0;
		temp=i;
		i=j;
		j=temp;
		System.out.printf("swap method 안 : i=%d, j=%d\n",i,j); //300, 100
		
		
	}//swap
	
	
	public static void main(String[] args) {
		
		CallByValue cbv = new CallByValue();
		int i=100,  j=300;
		System.out.printf("swap 전 i=%d, j=%d\n", i, j); //100, 300
		cbv.swap(i, j); //값이 복사되어 들어간다. 
		System.out.printf("swap 후 i=%d, j=%d\n", i, j); //100, 300
		
		
		
	}//main

}//class
