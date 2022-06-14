package day1230;
/**
if~else : 둘 중 하나의 코드를 실행해야할 때
*/

public class TestIfElse {
	public static void main(String[] args){
	

//음수인지 양수인지 판별하는 코드 작성

	int num=-12;

	if(num>-1){
		System.out.println("양수");
	}else{	
		System.out.println("음수");
	}


	//홀수, 짝수 구분
	
	int num1=11;

	System.out.print(num1+"은(는) ");

	if (num1%2==0){
		System.out.println("짝수입니다");
	}else{
		System.out.println("홀수입니다");
	}//end else





	System.out.println();
	
	//입력받은 점수를 출력하고 0~100 사이면 "유효점수", 그렇지 않으면 "무효점수"
	
	int num2=101;
	System.out.println(num2);

	if (num2>=0&&num2<=100){
		System.out.println("유효점수");
	}else{
		System.out.println("무효점수");
	}//end else



	//선생님 코드
	int score=Integer.parseInt(args[0]);
	
	System.out.print(score+"점은 ");
	
	if (num2>-1&&score<101){ //num2>=0&&num2<=100  ---> cpu가 두 번 생각해야됨.
		System.out.println("유효점수");
	}else{
		System.out.println("무효점수");
	}//end else


System.out.println();

	//args[1]로 입력되는 값을 정수로 변환하고, 변환된 값이 대문자의 범위라면 대문자로 출력하고 
	//그렇지 않다면 숫자를 그대로 출력
	int score1 = Integer.parseInt(args[1]);

	if (score1>64&&score1<91){ //Uppercase의 범위
		System.out.println((char)score1);
	}else{ //그렇지 않을 때
		System.out.println(score1);
	}//end else
	



	



	}
}
