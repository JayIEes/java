package day1227;
/**
���� �� ��ȯ <br>
�����ڰ� �ʿ��� ������������ ��ȯ�ϴ� ��<br>
����)
(��ȯȰ ��������)������ �Ǵ� �����;
*/

public class Casting {
	public static void main(String[] args) {
	

	char c='A';
	//���� �տ� ������ ��ȯ
	int i= c;//���θ�� ������ �Ǵ� �� , int i= (int)c; ������ �̷��� �������
	System.out.println(c+"�� unicode��"+i);

	//��� �տ� ���� �� ��ȯ
	float f = (float)12.27;//���ͷ��� 8byte�̰�, ���� ����ȯ���� ���� 4byte�� �Ҵ��
	System.out.println("float : "+f);

	i=(int)f; // ���ս� �߻�
// i=f;�� 4byte�� ũ��� ������ ���� ������ �ٸ��Ƿ� �Ҵ���� �ʴ´�.
	System.out.println("�� �ս� �߻�: ���� �� "+f+",��ȯ�� �� : "+i);

	//boolean�� ���� �����θ� ��ȯ�ȴ�.
	boolean b=true;
	boolean b1=false;
	// i=b; // ���� : boolean�� �ٸ� ������ ��ȯ���� �ʴ´�.
	b1=b;
	System.out.println(b1+"/" +b);

	
	//�⺻�� ���������� ���������� ���� ����ȯ 
	//i=12;
	//String s=i;//(int�� string���� ��ȯ �Ұ�)
	//String s=(String)i;	//�⺻�� i�� ������ string���� casting �� �� ����.

	
	String s = "2021";
	System.out.println(s);

	//i=(int)s; // ������ s�� �⺻�� int�� casting �� �� ����.


	}//main
}//class
