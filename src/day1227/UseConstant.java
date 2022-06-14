package day1227;
/*
다른 클래스에 존재하는 constant 사용
**/


public class UseConstant {
	
	public static void main(String[] args) {
		
//	System.out.println(MAX_SCORE); //클래스가 없으면 현재 클래스에서 constant를 찾는다.

	System.out.println(Constant.MAX_SCORE);
	System.out.println(Constant.MIN_SCORE);

	System.out.println(Byte.MIN_VALUE+" "+Byte.MAX_VALUE);
	}
}
