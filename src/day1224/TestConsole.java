package day1224;
/**
console ��� ����
*/

//1. �ҽ��ڵ� �ۼ�
public class TestConsole{  
	/*
	main method�� ���� Ŭ������ �ܵ����� ����� �� �ִ� Ŭ����
	�ܵ����� ���� �� �� �ִ� Ŭ������ Java Applicaton�̶�� �Ѵ�.
	*/
	public static void main(String[] args){
		//System.out.print("�ȳ��ϼ���?");
		//System.out.print("today is christmas eve");
		//System.out.println("today is christmas eve");
		//System.out.print("wow");

		System.out.println("������");
		System.out.println(24);//���� ���
		System.out.println(12.24);//�Ǽ� ���
		System.out.println('A');//���ڻ��
		System.out.println(true);//�Ҹ����
		System.out.println("�ȳ�");//���ڿ����

		System.out.println("����");
		int i=12;
		TestConsole t = new TestConsole();//������ ��������

		System.out.println(i);//�⺻�� ���������� ���� ���
		System.out.println(t);//������ �����ʹ� �ּҰ� ���

		System.out.println("12+24="+(12+24));//����� ��� ���
	}//main

}//class

//2. ���� : TestConsole.java

//3. ������ : javac TestConsole.java

//4. ����: java TestConsole