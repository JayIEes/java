package day0105;

/**
 * @author user
 * do~while�� ���
 * �ּ�1�� ������ �ִ� ���Ǳ��� ����
 */
public class UseDoWhile {

	public static void main(String[] args) {

		
		int i=1000; //�ʱⰪ
		do {
			System.out.println(i);//�ݺ����๮��
			i++; //�����Ǵ� ���ҽ� - �̰� ������ ���ǿ� ������ �� ���� ������ ����
		}while(i<10); // ���ǽ�  //���ѷ��� �� �� ���⿡ true������ ��
		
		
		System.out.println("-------------------------------------");
		//do while�� �̿��� ������
		//���� main method arguments�� �Է¹޾� �Է¹��� ������ �������� ���
		int n =Integer.parseInt(args[0]);
		i =1;
		do {
			System.out.println(n+"*"+i+"="+(n*i));
			i++;
		}while(i<10);
		
		
		
		
		
		
	}//main

}//class
