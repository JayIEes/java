package day1229;
/**
���� ������
> < >= <= == !=
*/

public class Operator4 {
	public static void main(String[] args) {
		
	int i=10, j=12, k=10; //��������, �ʱ�ȭ�� �ϰ� ��� ������ �� ����.
	//== ���� ���ٸ� true, ���� �ٸ��ٸ� false�� ��ȯ
	//System.out.println(i+" == "+k+" = " +i==k); //����� ��������-���ڿ��� �������, �񱳺Ұ� 
	System.out.println(i+" == "+k+" = " +(i==k)); //������ �켱������ �ٲ��ش�.
	System.out.println(i+" == "+j+" = " +(i==j));

	//!= ���� ���ٸ� false, ���� �ٸ��ٸ� true�� ��ȯ
	System.out.println(i+" != "+k+" = " +(i!=k));
	System.out.println(i+" != "+j+" = " +(i!=j));

	}
}
