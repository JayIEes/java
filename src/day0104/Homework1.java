package day0104;

/**
 * @author user
 * for�� ����
 */
public class Homework1 {

	public static void main(String[] args) {
		
		//���� 1. (3,6,9 ¦)
		for(int i=1;i<101;i++) {
			if(i%10==3||i%10==6||i%10==9){
				System.out.print("¦ ");
			}else if(i/10==3||i/10==6||i/10==9){
				System.out.print("¦ ");
				
			}else{
				System.out.print(i+" ");
			}//end else
		}//end for
		
		
		
		System.out.println();
		System.out.println("------------------------------------------------------");
		//���� 2. ������ ���
		for(int i=1;i<10;i++) {
			for(int j=2; j<10 ; j++) {
				System.out.print(j+"*"+i+"="+(j*i)+" ");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------------");
		
		//���� 3.
		int num=Integer.parseInt(args[0]);
	
		if(num>1&&num<10) {
			System.out.println(num+"��:");
			for(int i=1;i<10;i++) {
				System.out.println(num+"*"+i+"="+(num*i));
			}//end for
		}else {
			System.out.println("�������� 2~9�ܱ��� �����մϴ�.");
		}//end else
		
		
		
		
		
		
	}//main

}//class
