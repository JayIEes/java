package day0119;

/**
 * ���� ���� Ŭ����
 * @author user
 */
public class UseMath {

	public UseMath() {
		//��ü�� �������� �ʰ� ����ϴ� Ŭ����
//		Math m=new Math(); //�����ڰ� ������ �����Ƿ� ��üȭ �� �� ����.
		int i=-19;
		System.out.println(i+"�� ���밪 "+Math.abs(i));
		
		double d=10.5;
		System.out.println(d+"�� �ݿø� "+Math.round(d));
		d=10.1;
		System.out.println(d+"�� �ø� "+Math.ceil(d));
		d=10.9;
		System.out.println(d+"�� ���� "+Math.floor(d));
		//�ڹٴ� ������ ����, �Ҽ��� ���� ������� ĳ������ �Ѵ�.
		
		double num=Math.random();
		System.out.println("�߻��� ����"+num); //16�ڸ����� ������ �Ҽ����� ����
		System.out.println("������ ����"+num*10);
		System.out.println("������ �������� ����"+(int)(num*10)); //(int)num*10�̷��� (int)num�� ���� ���Ǿ� 0�� �ȴ�!!!!
		
		//1~100������ ���� ���
		System.out.println((int)((num*100)+1));
		int temp=(int)(Math.random()*100)+1;
		System.out.println(temp);
		
		//�빮�� A~Z �� �ϳ��� ���
		char c=(char)((int)((Math.random()*26)+1)+64);//1~25
		System.out.println(c);
		
		//������ �ڵ�
		temp=(int)(Math.random()*26)+65;
		System.out.println((char)temp);
		
		//�ҹ���
		temp=(int)(Math.random()*26)+97;
		System.out.println((char)temp);
		
		
		//����0~9�� �ϳ� ���
		temp=(int)((Math.random()*10)+48);
		System.out.println((char)temp);
		
		
		char cdr=(char)((Math.random()*10)+48);
		System.out.println(cdr);
		
		
		
		
		
	}//UseMath
	
	
	public static void main(String[] args) {
		new UseMath();
		
	}//main

}//class
