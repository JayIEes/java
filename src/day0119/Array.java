package day0119;

public class Array {

	
	public static void main(String[] args) {

		int[] temp= {86,77,75,100,96};
		int tmp;
		for(int i=0; i<temp.length;i++) {
			for(int j=0; j<temp.length-1;j++) {
				if(temp[j]>temp[j+1]) {
					
					tmp=temp[j]; //반복문 안에서 변수 선언하면 병목현상 발생
					temp[j]=temp[j+1];
					temp[j+1]=tmp;
					
				}//end if
			}//end for
		}//end for

		for(int arr : temp) {
			System.out.println(arr);
		}
		
		
	}//main

}
