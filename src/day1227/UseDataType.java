package day1227;
/**
�⺻�� ������������ ���� ���� <br>
����� ���
*/

public class UseDataType{

	public static void main(String[] args) {
		//������ ������ �� �ִ� �������� byte int short long
		//signed value ���� (��� ���� ���尡��)
	byte a=-127;
	short b=10;
	int c=2147483647;
	long d = 10; // ����ø� ����
	long e=2147483648L;//���� ����� �����ϴ� ���ͷ��� ũ�Ⱑ 4byte �̹Ƿ� ��� ���� 4byte�� �ʰ��ϴ� ��� ���� �ۼ��� �� ����.

	//���ڸ� ������ �� �ִ� �������� : char
	//���ڸ� �Ҵ��ϸ� ���ڿ� �ش�Ǵ� unicode���� �Ҵ�
	//charg�� �⺻���� \u0000
	char f= 65; //char f='A'; �� ����
	char g= '0';
	char h='��';
	char temp='\u0000';
	//char temp=''; ���� 

	System.out.println("byte : "+a+", short : "+b+", int : "+c+", long : "+e); 

	System.out.println("g= "+g+"f"+f+h); // �ڵ尪�� ���� char������ ����ϸ� �ڵ� ���� ���� ���ڰ� ���

	float i = 12.27f;
	double j=12.27;

	System.out.println(i);
	System.out.println(j);

	//boolean 
	boolean l=true; //boolean l=1;���� ���� true �� false�� ����
 	boolean m=false;
	
	System.out.println("boolean "+  l+","+m);

	



	}//main
}//class
