package day0104;

/**
 * @author user
 * 반복문 (loop statement)
 * 시작과 끝을 알 때 사용하는 반복분 for문.<br>
 * 단일 for문
 */
public class UseFor {

	public static void main(String[] args) {
		
		//0~9까지 10번 반복되는 for문.
		for(int i = 0; i< 10; i++) {
			System.out.println(i);
		}//end for
		
		
		//1~10까지 1씩 증가하는 값을 행으로 출력 (이전과 다음값은 탭으로 구분)
		for(int i=1;i<=10;i++) {
			System.out.print(i+"\t");
		}//end for
		
		System.out.println();
		//1~100까지 수 중에 짝수만 출력
		for(int i=1;i<101;i++) {
			if (i%2==0) {
				System.out.print(i+" ");
			}//end if
		}//end for
		
		System.out.println();
		
		//1~100까지 수 중에 홀수만 출력
		for(int i=1;i<101;i++) {
			if (i%2!=0) { //얘 없이 i++넣어주면 일 수행을 if의 반 밖에 안함.
				System.out.print(i+" ");
			}//end if
		}//end for
		
		System.out.println();
		
		//1~9까지 1씩 증가하여 출력하는 코드, 출력은 열로
		for(int i=1;i<10;i++) {
			System.out.println("2*"+i+"="+(2*i));
		}//end for
		
		//1~100까지의 합(5050)을 출력
		int sum=0;
		for(int i=1;i<101;i++) {
			sum+=i;
		}
		System.out.println("1~100까지의 합은 "+sum);
		
		
		//looping문은 조건이나 증감을 잘못설정하면 무한 루프(infinite loop)에 빠진다.
		//10에서부터 0까지 1씩 감소 
		for(int i=10;i>-1;i--) {
			System.out.print(i+" ");
		}
		
		
		
		
	}//main

}//class
