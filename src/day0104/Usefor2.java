package day0104;

/**
 * @author user ���� for<br>
 *         ����<br>
 *         �ٱ� for�� �ѹ� �� �� ���� for�� ��� �ݺ��ϴ��� �˾ƺ����� for(�ʱⰪ;���ǽ�;�����ҽ�){<br>
 *         for(�ʱⰪ;���ǽ�;�����ҽ�){<br>
 *         �ݺ����� ����<br>
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
		//�������� 2~9�ܱ��� ����, �� �ܿ��� 1~9���� �ݺ�
		for(int i=2;i<10;i++) {
			System.out.println(i+"��");
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
			for(int j=1;j<5;j++) { //j=i+1�� 
			if(j>i) { //�� ������ �ȵ���
				System.out.print(i+" "+j+" ");
				}//end if
			}//end for
			System.out.println();
		}//end for
		
		for(int i=0;i<4;i++) {
			for(int j=i+1;j<5;j++) { //j=i+1�� 
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
			for(int j=0;j<=i;j++) { // j<i+1 �� ����
				System.out.print(i+" "+j+ " ");
			}//end for
		System.out.println();
		}//end for
		
		
		
		
		
		
		


	}// main

}// class
