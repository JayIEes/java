package day0113;

public class UseArray2 {

	public UseArray2() {//������
		
		int[][] arr = new int[6][7]; //��� ���� �ʱ�ȭ
		
		for(int i=0;i<arr.length;i++) {//��
			for(int j=0;j<arr[i].length;j++) {//��
				if((i==0) || (i==arr.length-1)  //ó�� �� , �������� 
					||j==0 || j==arr[0].length-1) {//ó�� ��, ������ ��
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
