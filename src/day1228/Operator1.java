package day1228;
/**
���� ������<br>
������ ���ü
~ ! + - ++ --

*/


public class Operator1 {

	public static final int MAX=100;

	public static void main(String[] args) {
		int i =12;
		int j =-19;

	 System.out.println("~"+i+" = "+~i);//��� : ��ȣ���� 1���� 
	System.out.println("~"+j+" = "+~j);//���� : ��ȣ���� 1���� 

	i=12;
	j=28;
	//!�� ���� ������ �տ� ���
	//System.out.println(i+">"+j+ "="+i>j); // i+j���ڿ��� �Ǿ����
	System.out.println(i+">"+j+ "="+!(i>j)); 

	boolean flag1 = true, flag2=false;
	//!�� boolean�� �տ� ���
	System.out.println("!"+flag1+" = " +!flag1);
	System.out.println("!"+flag2+" = " +!flag2);

	i=12;
	j=-37;

//+�����ڴ� �ƹ��� �ϵ� ���� ����. ������ ����
	System.out.println("+"+i+"="+ +i); //12
	System.out.println("+"+j+"="+ +j); //-37

	System.out.println("-"+i+"="+ -i); //-12
	System.out.println("-"+j+"="+ -j); //37


	//��������, ���ҿ���
	i=10;
	j=12;
	System.out.println("i : "+i+", j :"+j);
	++i;
	i++;
	--j;
	j--;
	System.out.println("�������� �� i : "+i+", ���ҿ��� �� j :"+j);

	int result=0;
	//���� ����
	result=++i;
	System.out.println("�������� �� i= " +i+", result : " +result);
	
	result=0;
	//�������� : ���� �� ����
	result=i++;
	System.out.println("�������� �� i= " +i+", result : " +result);//i=14, result=13
	
	System.out.println("���� : "+ ++i); //i�� ������ �� method�� �Ҵ� 15�� ���
	System.out.println(i);

	System.out.println("���� : "+ i++); //i�� method�� �Ҵ��� �� i�� ����, 15 ���
	System.out.println(i); //16

	i=10;
	j=20;
	System.out.println(i++ +--j);//29


//	 i=20++; // ������� ���� �Ǵ� ���� �����ڸ� ����� �� ����.
//	i=--MAX;// constant���� ����, ���� �����ڸ� ����� �� ����.



	}
}
