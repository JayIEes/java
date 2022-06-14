package day0105;

/**
 * @author user
 * continue 사용 (반복문의 반복 실행을 건너뛰고 증가 또는 감소식으로 이동합니다.)
 */
public class UseContinue {

	public static void main(String[] args) {
		for(int i=1;i<101;i++) {
			System.out.println("필수반복");
			if(i%2==1) {
				continue;//반복문 안에서만 특정조건에 만족할 때만 실행되도록 조건문 안에서만 작성.
				
			}//end if
			System.out.print("상황반복"+i+" ");
		}//end for
		
		
		
		for(int i=1;i<101;i++) {
		}//for문의 i는 지역변수.
		
		
		
	}//main

}//class
