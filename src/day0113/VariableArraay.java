package day0113;

/**
 * �ึ�� ���� ������ �ٸ� �迭
 * @author user
 */
public class VariableArraay {

	public VariableArraay() {
		
		//1.����) ��������[][] �迭��=null;
		int[][] arr=null; //���� ������� ���������� �������� ���� ���
		
		//2.����) �迭��=new ��������[���� ��][]; //���� ������ �������� �ʴ´�.
		arr=new int[5][]; //���� ���� ������� �׳� ������ �迭�� ��
		
		//3. �ึ�� ���� ����) �迭��[���ǹ�ȣ]=new ��������[���� ��];
		arr[0]=new int[4]; // heap�� ��������鼭 �ʱ�ȭ�� ��
		arr[1]=new int[3];
		arr[2]=new int[1];
		arr[3]=new int[] {1,2,3,4,5};
		arr[4]=new int[]{10,20,30};
		
		for(int i=0 ; i<arr.length; i++) {
			System.out.println("arr["+i+"]��, ���� ����: "+arr[i].length);
		}//end for
		
		//4.�� �Ҵ�) -�ε��� ����!
		arr[0][0]=100;
		arr[1][1]=200;
		
		
		//5. �� ���) -�ε��� ����!
		System.out.println(arr[0][0]+"/"+arr[0][1]);
		
		//�ϰ�ó��
		for(int i=0 ; i<arr.length; i++) { // ��
			for(int j=0 ; j<arr[i].length; j++) {//��
				System.out.printf("arr[%d][%d]=%d\t",i, j,arr[i][j]);
			}//end for
			System.out.println();
		}//end for
	System.out.println("-----------------------------");	
	//�⺻�� ������ ��� : �� ���а�ȣ���� ���� ������ �ٸ��� ���´�.
	int[][] arr2= { {10,20,30} , {40} , {50,60,70,80} };
	
		for(int i=0 ; i<arr2.length; i++) {//��
			System.out.println("arr2["+i+"]��, ���� ����: "+arr2[i].length);
			}//end for
			
		//������ for
		for(int[] tempArr1 : arr2) {
			for(int value : tempArr1) {
				System.out.printf("%-4d", value);
			}
			System.out.println();
		}//end for
		
//		int[] temp=arr2[0]; //������ �迭�� ���� �������迭�� ���� �� �ִ�.
		temp(arr2[0]);//������ �迭�� ���� �������迭�� �̷��� �ִ�.
	
	}//VariableArraay ������
	
	
	public void temp(int[] arr) {
		for(int i=0; i<arr.length ; i++) {
			System.out.println(arr[i]);
		}//end for
	}//temp
	
	
	
	
	
	
	
	public static void main(String[] args) {

		new VariableArraay();
		
		
		
		
	}//main

}//class
