package day0111;

/**
 * ������ �迭�� ���.
 * @author user
 */
public class UseArray {

	public void useArray1(){
		//1.���� : ��������[] �迭��=null;
		int[] arr=null;
		//2. ���� : �迭�� = new ��������[���� ��];
		//heap�� �����ǰ�, �𵷹��� ���� �ڵ� �ʱ�ȭ�ȴ�. - ���� ������ ������ �ʴ´�.(����������)
		arr = new int[5];
	
		
		//3.���Ҵ� : �迭��[���ǹ�ȣ]=��;
		arr[0]=2022;
		arr[1]=1;
		arr[2]=11;
		arr[3]=15;
		arr[4]=7;

		//�� ��� : �迭��[���ǹ�ȣ]
		System.out.println(arr[0]+"/"+arr[1]+"/"+arr[2]+"/"+arr[3]+":"+arr[4]); //�ּҰ� ����
		//�ϰ�ó�� : �Ѳ����� ��Ƽ� ó��
		System.out.println("arr �迭�� ���� ����: "+arr.length);//
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"]="+arr[i]);
		}//end for
		System.out.println();
		
		//�迭�� ¦����° ���� ���� ���
		for(int i=0; i<arr.length;i+=2) { //if�� �Ⱦ��� i+=2 �̷���
			
			System.out.println("arr["+i+"]="+arr[i]);
		}//end for
		
		System.out.println();
		//�迭�� ������ ����� ó�� ����� ���
		for(int i=arr.length-1;i>-1;i--) {
			System.out.println("arr["+i+"]="+arr[i]);
		}//end for
	System.out.println("---------�迭�� �⺻�� ������ ���--------------------");
		int[] arr2=new int[] {10,20,30,40, 50, 60};
		int[] arr3={10,20,30,40, 50, 60};//new ����
		
		System.out.println(arr3.length);
		for(int i=0; i<arr3.length;i++) {
			System.out.printf("arr[%d]=%-5d\n",i,arr3[i]);
		}//end for
		
		
		
	}//useArray1
	
	
	
	
	public static void main(String[] args) {
		
//		UseArray ua =new UseArray();
//		ua.useArray1();
		new UseArray().useArray1(); //method chain���� ȣ�� ����,, new UseArray�� ��ü�̱� ������!
		
		
		
		
		
	}//main

}//class