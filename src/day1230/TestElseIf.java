package day1230;
/**
다중 if (else~if)
연관된 여러 조건을 비교할 때 사용.
*/

public class TestElseIf{

	public static void main(String[] args) {
	

	//점수를 입력받아 0점 보다 작았을 때의 실패메세지와 100점보다 컸을 때 실패메세지와
	//성공했을 때 메시지를 출력하시오
	int score=Integer.parseInt(args[0]); // 컴파일 한 번만 하면됨 // -1, 0, 50, 100, 101 (경계값 테스트)
	//int score=101; //컴파일 안했을 때 소스수정 적용이 안됨, 수 바뀔 때마다 매번 컴파일-실행 과정을 거쳐야 함

	System.out.print(score+"점은 ");

	if (score<0){ //0보다 작은 경우
		System.out.println("0보다 작아서 실패");
	}else if(score>100){ // 100보다 큰 경우
		System.out.println("100보다 커서 실패");
	}else{ //그렇지 않은 경우 (0~100 사이의 처리)
		System.out.println("입력성공");
	}//end else
	
	System.out.println();
	
	//수를 입력받아 0~39까지는 "과락", 40~59 '다른 점수 참조", 
	//60~100까지는 "합격" -else를 생략하는 코드 작성
	
	int score2=Integer.parseInt(args[1]);
	System.out.print(score2+"은(는) ");	

	if(score2>-1&&score2<40){
		System.out.println("과락");
	}else if (score2>39&&score2<60){ 
		System.out.println("다른 점수 참조");
	}else if(score2>59&&score2<101){
		System.out.println("합격");
	}/*else{
		System.out.println("유효하지 않습니다");
	}*/


	 //end else if


	}
}
