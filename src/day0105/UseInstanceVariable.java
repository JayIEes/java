package day0105;

/**
 * @author user
 * instance (member) variable ���. <br>
 * 1. ���� : ���������� �������� ������;<br> (���������� ������ �������� ��, ���������� ���������� ������.)
 * 2. ��ü���� : Ŭ������ ��ü�� = new Ŭ������();<br>
 * 3. ��ü���� ����ؼ� ���� �� �Ҵ� : ��ü��.������= ��;<br>
 * 4. ��ü���� ����Ͽ� ������� : ��ü��.������<br> 
 */
public class UseInstanceVariable {
	// 1. ����
	int i; //default ���������ڸ� ���� �ν��Ͻ�(���)���� i
	int j; //default ���������ڸ� ���� �ν��Ͻ�(���)���� j

	
	
	public static void main(String[] args) {
	//	System.out.println(i); //�ν��Ͻ� ������ static�������� ��ü�� ���� ���� ����� �� ����.//
	//2. ��üȭ //int 
		UseInstanceVariable uiv=new UseInstanceVariable();
	//3. �� �Ҵ�
		uiv.i=2022;
		
		
	//4. �� ��� : �ν��Ͻ�(���)������ �ڵ��ʱ�ȭ���ȴ�.
		System.out.println(uiv.i);
		
		
		//Ŭ������ ��ü�� ��� ���� �� �ִ�.
		UseInstanceVariable uiv1=new UseInstanceVariable();
		UseInstanceVariable uiv2=new UseInstanceVariable();
		//������ ��ü�� (uiv1 �Ǵ� uiv2)���� ���� �̸��� ���� i�� ���� ������.
		uiv1.i=1;
		uiv2.i=5;
		System.out.println(uiv.i+"/"+uiv1.i+"/"+uiv2.i);
		
		
		
	}//main

}//class
