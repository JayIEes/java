package day0105;

/**
 * @author user
 * while 사용 (시작과 끝을 모를 때 사용하는 반복문) <br>
 * 최소 0번 수행에 최대 조건까지 수행.
 */
public class UseWhile {

	public static void main(String[] args) {

		//1~9까지 출력
		int i=1;
		while(i<10) { //조건식
			System.out.print(i+" ");//반복수행문장
			i++; //증,감소식
		}//while의 고유 형태는 아님. 내가 얼마나 반복을 해야할지 모를 때 while을 쓰게 되는데 주로 메소드를 사용함.
		//최소 0번 수행, 조건이 맞으면 수행. //나는 데이터가 있을 때까지 돌리겠어.. 데이터의 존재 유무는 모르는데 존재하는데까지는 돌리겠어.
		
//		int i=0; //지역변수 i 중복선언
		i=0;
		
		System.out.println();
//		//1~100까지 3의 배수만 출력
		
		i=1;
		while(i<101) {
			if(i%3==0) {
			System.out.println(i+" ");
			}
			i++;
		}
		
		System.out.println();
		//while을 사용하여 구구단 9단 출력
		i=1;
		int j=9; //변수 만들어주는게 효율적
		while(i<10) {
			System.out.println(j+"*"+i+"="+(j*i));
			i++;
		}
		
		
		//while 무한루프
		while(true) {
			System.out.println("무한루프");
			break;
		}
		
		
		
		
		
	}//main

}//class
