package day0105;

/**
 * @author user
 * while ��� (���۰� ���� �� �� ����ϴ� �ݺ���) <br>
 * �ּ� 0�� ���࿡ �ִ� ���Ǳ��� ����.
 */
public class UseWhile {

	public static void main(String[] args) {

		//1~9���� ���
		int i=1;
		while(i<10) { //���ǽ�
			System.out.print(i+" ");//�ݺ����๮��
			i++; //��,���ҽ�
		}//while�� ���� ���´� �ƴ�. ���� �󸶳� �ݺ��� �ؾ����� �� �� while�� ���� �Ǵµ� �ַ� �޼ҵ带 �����.
		//�ּ� 0�� ����, ������ ������ ����. //���� �����Ͱ� ���� ������ �����ھ�.. �������� ���� ������ �𸣴µ� �����ϴµ������� �����ھ�.
		
//		int i=0; //�������� i �ߺ�����
		i=0;
		
		System.out.println();
//		//1~100���� 3�� ����� ���
		
		i=1;
		while(i<101) {
			if(i%3==0) {
			System.out.println(i+" ");
			}
			i++;
		}
		
		System.out.println();
		//while�� ����Ͽ� ������ 9�� ���
		i=1;
		int j=9; //���� ������ִ°� ȿ����
		while(i<10) {
			System.out.println(j+"*"+i+"="+(j*i));
			i++;
		}
		
		
		//while ���ѷ���
		while(true) {
			System.out.println("���ѷ���");
			break;
		}
		
		
		
		
		
	}//main

}//class
