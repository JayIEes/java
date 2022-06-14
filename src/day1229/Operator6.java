package day1229;
/**
삼항(조건) 연산자
? :
*/
public class Operator6 {
	public static void main(String[] args) {
		
	int i=0;
	
	System.out.println(i+"은(는) "+(i>-1 ?"양수":"음수"));

	i=13;
	//i가 홀수인지 짝수인지를 출력하는 코드
	System.out.println(i+"은(는) " +( i%2==0 ? "짝수" : "홀수"));


	}
}
