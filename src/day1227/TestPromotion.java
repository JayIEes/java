package day1227;
/**
�ڵ�����ȯ<br>
int�� ���� ���������� ����Ǹ� �ڵ����� int�� ����Ǿ� ����� ��ȯ�Ѵ�.
*/
public class TestPromotion {

	public static void main(String[] args) {
	
	byte num1=10; //4byte ���ͷ��� 1byte�� ��ȯ�Ǿ� �Ҵ�ȴ�. 
	byte num2=20;
	//byte result=num1+num2; �������� int�� �߻��� ���� byte�� �����Ϸ��� �õ��ϱ� ������ �����߻�
	int result=num1+num2;//�ڵ� ����ȯ ���θ��

		System.out.println(num1+"+"+num2+"="+result);


	
	byte result1=(byte)(num1+num2); // 
	System.out.println(num1+"+"+num2+"="+result1);
	}
}
