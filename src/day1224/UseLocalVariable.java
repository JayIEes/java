package day1224;
/**
	���������� ��� 
*/

public class UseLocalVariable {
	//java application
	public static void main(String[] args) {
	//1. ���� ���� : �������� �ٸ��ٸ� ��� ������ �� �ִ�.
	int i; //�ʱ�ȭ�� ���� ���� ����
	int age = 0; //�ʱ�ȭ�� ����
	//2. �� �Ҵ�
	i = 2021;
	age = 25;
	System.out.println(age);
	age = 22;
	age = 55;
	//double age; ���������� �޶� �������� ���ٸ� Error �߻�!
	
	//3. �� ���
	System.out.println(i+1);
	System.out.println(age+"��");

	int ���� = 0;
	System.out.println(����);
		
	}//main

}//class
