package day1228;
/**
코딩창에서 다양한 진수 사용.
*/

public class UseRadix{
	public static void main(String[] args) {
	
	int decimal=10;
	int octal=015;
	int hex=0xf; // A 대문자도 가능

	//다양한 진수를 사용하더라도 출력은 10진수로 된다.
	System.out.println("10진수 "+ decimal); //2진수로 저장
	System.out.println("8진수 "+ octal); //2진수로 저장
	System.out.println("16진수 "+ hex); //2진수로 저장
	
	//서로다른 진수를 사용하더라도 연산을 수행한다.
	System.out.println(decimal+octal+hex);//2진수끼리 연산하여 10진수로 나온다


	}
}
