package day0113;

public class UseArray2 {

	public UseArray2() {//생성자
		
		int[][] arr = new int[6][7]; //모든 방이 초기화
		
		for(int i=0;i<arr.length;i++) {//행
			for(int j=0;j<arr[i].length;j++) {//열
				if((i==0) || (i==arr.length-1)  //처음 행 , 마지막행 
					||j==0 || j==arr[0].length-1) {//처음 열, 마지막 열
					arr[i][j]=1;
				}//end if
				System.out.printf("%-3d",arr[i][j]);
			}//end for
			System.out.println();
		}//end for
	
	}
	
	
	public static void main(String[] args) {

		new UseArray2();

	}//main

}//class
