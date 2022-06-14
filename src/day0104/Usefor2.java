package day0104;

/**
 * @author user 다중 for<br>
 *         형식<br>
 *         바깥 for가 한번 돌 때 안쪽 for가 몇번 반복하는지 알아봐야함 for(초기값;조건식;증감소식){<br>
 *         for(초기값;조건식;증감소식){<br>
 *         반복수행 문장<br>
 *         }<br>
 *         }
 */
public class Usefor2 {

	public static void main(String[] args) {

		for (int i = 0; i<5; i++) {
			for (int j =0; j<6; j++) {
				System.out.println("i= "+i+", j= "+j);
			}
			System.out.println("-------------");
		}//end for
		
		
		System.out.println();
		//구구단은 2~9단까지 존재, 각 단에서 1~9까지 반복
		for(int i=2;i<10;i++) {
			System.out.println(i+"단");
			for(int j=1;j<10;j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println("--------");
		}
		
		System.out.println("********************************************");
		// i j i j i j i j
		// 0 1 0 2 0 3 0 4
		// 1 2 1 3 1 4
		// 2 3 2 4
		// 3 4
		for(int i=0;i<4;i++) {
			for(int j=1;j<5;j++) { //j=i+1로 
			if(j>i) { //얘 있으면 안됐음
				System.out.print(i+" "+j+" ");
				}//end if
			}//end for
			System.out.println();
		}//end for
		
		for(int i=0;i<4;i++) {
			for(int j=i+1;j<5;j++) { //j=i+1로 
				System.out.print(i+" "+j+" ");
				//end if
			}//end for
			System.out.println();
		}//end for
		
		System.out.println();
		
		//i j i j i j i j
		//0 0
		//1 0 1 1
		//2 0 2 1 2 2
		//3 0 3 1 3 2 3 3
		for(int i=0;i<4;i++) {
			for(int j=0;j<=i;j++) { // j<i+1 도 가능
				System.out.print(i+" "+j+ " ");
			}//end for
		System.out.println();
		}//end for
		
		
		
		
		
		
		


	}// main

}// class
