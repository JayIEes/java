package day1229;
/**
	main method에 외부값 입력해 사용히기

*/

public class UseArguments{
	public static void main(String[] args) {
		System.out.println("처음 값 : "+args[0]); //에러
		System.out.println("두 번째 값 : "+args[1]); //에러2 인수가 없었기 때문에
		
	//	System.out.println(args[0]*args[1]); //컴파일 에러남 * 안됨
		System.out.println(args[0]+args[1]); //두 열을 붙여라

//	int i=args[0]; // 문자열을 기본형에 담을 수 없어서 에러남
//	int j=args[1]; // 에러
	
	int i=Integer.parseInt(args[0]); //문자열을 int형으로 변환하여 int형 변수에 할당 (숫자형의 문자열만 바꿀 수 있는거임!!)
	int j=Integer.parseInt(args[1]); //

	System.out.println(args[0]+" + "+args[1] +" = " +(i+j)); 
	
	System.out.println("i="+i+", j="+j+ " "+(i>j? i+"가 큽니다.":j+"가 큽니다."));

	}
}
