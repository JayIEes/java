package day0104;

/**
 * @author user
 * �ݺ��� (loop statement)
 * ���۰� ���� �� �� ����ϴ� �ݺ��� for��.<br>
 * ���� for��
 */
public class UseFor {

	public static void main(String[] args) {
		
		//0~9���� 10�� �ݺ��Ǵ� for��.
		for(int i = 0; i< 10; i++) {
			System.out.println(i);
		}//end for
		
		
		//1~10���� 1�� �����ϴ� ���� ������ ��� (������ �������� ������ ����)
		for(int i=1;i<=10;i++) {
			System.out.print(i+"\t");
		}//end for
		
		System.out.println();
		//1~100���� �� �߿� ¦���� ���
		for(int i=1;i<101;i++) {
			if (i%2==0) {
				System.out.print(i+" ");
			}//end if
		}//end for
		
		System.out.println();
		
		//1~100���� �� �߿� Ȧ���� ���
		for(int i=1;i<101;i++) {
			if (i%2!=0) { //�� ���� i++�־��ָ� �� ������ if�� �� �ۿ� ����.
				System.out.print(i+" ");
			}//end if
		}//end for
		
		System.out.println();
		
		//1~9���� 1�� �����Ͽ� ����ϴ� �ڵ�, ����� ����
		for(int i=1;i<10;i++) {
			System.out.println("2*"+i+"="+(2*i));
		}//end for
		
		//1~100������ ��(5050)�� ���
		int sum=0;
		for(int i=1;i<101;i++) {
			sum+=i;
		}
		System.out.println("1~100������ ���� "+sum);
		
		
		//looping���� �����̳� ������ �߸������ϸ� ���� ����(infinite loop)�� ������.
		//10�������� 0���� 1�� ���� 
		for(int i=10;i>-1;i--) {
			System.out.print(i+" ");
		}
		
		
		
		
	}//main

}//class
