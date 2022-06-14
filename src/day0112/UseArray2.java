package day0112;

/**
 * 이차원 배열: 행과 열로 구성된 배열<br>
 * 행의 수 : 배열명.length<br>
 * 열의 수 : 배열명[행의번호].length
 * @author user
 */
public class UseArray2 {

	
	public UseArray2() {//생성자
		//이차원 배열 사용
		//1. 선언) 데이터형[][] 배열명=null; (데이터형 배열명[][]=null;)-권장은 안함 
		int[][] arr=null;
		
		//2. 생성) 배열명= new 데이터형[행][열]; 모든 방의 값이 초기화된다!
		arr=new int[4][3];
		System.out.printf("행의 수: %d행, 열의 수 %d열\n", arr.length, arr[0].length);
		
		//값 할당) 배열명[행의번호][열의번호]=값;
		arr[0][0]=2022;
		arr[3][2]=12;
		
		//4. 값 사용) 배열며[행의번호][열의번]
		System.out.println(arr[0][0]+" / "+arr[0][1]);
		
		
		/* i j i j i j
		 * 0 0 0 1 0 2
		 * 1 0 1 1 1 2
		 * 2 0 2 1 2 2
		 * 3 0 3 1 3 2
		 */
		
		System.out.println();
		for(int i=0;i<arr.length; i++) {
			for(int j=0;j<arr[i].length;j++) { //열의 수 [i] 이거 빼지 않도록 주의
				System.out.printf("arr[%d][%d]=%d\t", i, j,arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("----------------기본형 형식의 사용-----------------");
		//행 구분 괄호를 사용하여, 행과 열을 만든다.
		int[][] arr2= { {10, 20, 30, 40},{ 50, 60, 70, 80},{ 90, 100, 110, 120}};
		System.out.printf("%d행 %d열\n",arr2.length, arr2[0].length);
		arr2[0][2]=3000;
		
		//일괄처리
		for(int i=0;i<arr2.length;i++) {//행
			System.out.printf("arr2[%d]행 시작\n",i);
			
			for(int j=0;j<arr2[i].length;j++) {//열
			System.out.printf("arr2[%d][%d]=%d\t",i,j, arr2[i][j]);
			}//end for
			
			System.out.printf("\narr2[%d]행 끝\n",i);
			System.out.println();
		}//end for
		
		System.out.println("-----------------------------------------");
		for(int[] arr1 : arr2) {//이차원 배열의 한 행은 일차원 배열
			for(int value:arr1) { //일차원 배열의 한 행은 단일형
				System.out.printf("%-6d",value);
			}//end for
		System.out.println();
		}
		
		
		
		
		
	}//UseArray2
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {

	new UseArray2(); //
		
		
		
	}//main

}//class
