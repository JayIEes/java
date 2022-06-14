package day0105;

/**
 * @author user
 * do~while의 사용
 * 최소1번 수행해 최대 조건까지 수행
 */
public class UseDoWhile {

	public static void main(String[] args) {

		
		int i=1000; //초기값
		do {
			System.out.println(i);//반복수행문장
			i++; //증가또는 감소식 - 이게 없으면 조건에 도달할 수 없기 때문에 무한
		}while(i<10); // 조건식  //무한루프 할 시 여기에 true넣으면 됨
		
		
		System.out.println("-------------------------------------");
		//do while을 이용한 구구단
		//단을 main method arguments로 입력받아 입력받은 단으로 구구단을 출력
		int n =Integer.parseInt(args[0]);
		i =1;
		do {
			System.out.println(n+"*"+i+"="+(n*i));
			i++;
		}while(i<10);
		
		
		
		
		
		
	}//main

}//class
