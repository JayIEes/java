package day1228;
/**
�ڵ�â���� �پ��� ���� ���.
*/

public class UseRadix{
	public static void main(String[] args) {
	
	int decimal=10;
	int octal=015;
	int hex=0xf; // A �빮�ڵ� ����

	//�پ��� ������ ����ϴ��� ����� 10������ �ȴ�.
	System.out.println("10���� "+ decimal); //2������ ����
	System.out.println("8���� "+ octal); //2������ ����
	System.out.println("16���� "+ hex); //2������ ����
	
	//���δٸ� ������ ����ϴ��� ������ �����Ѵ�.
	System.out.println(decimal+octal+hex);//2�������� �����Ͽ� 10������ ���´�


	}
}
