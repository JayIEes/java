package day0106;

/**
 * @author user
 * Variable Arguments�� �����Ͽ� �ۼ��� method�� ���
 */
public class UsePrintf {

	public static void main(String[] args) {

		int i=2022;
		System.out.printf("���� %d\n",i);
		System.out.printf("��������ڸ��� [%8d]\n",i);
		System.out.printf("��������ڸ��� [%-8d]\n",i);

		System.out.println();
		
		char c = 'A';
		System.out.printf("���� %c\n",c);
		System.out.printf("���� ��� �ڸ���: [%5c]\n",c);
		System.out.printf("���� ��� �ڸ���: [%-5c]\n",c);
		
		System.out.println();
		
		
		double d=3.1415;
		System.out.printf("�Ǽ� %f, %.2f\n",d,d);
		System.out.printf("�Ǽ� : [%8.2f]\n",d);
		System.out.printf("�Ǽ� : [%-8.2f]\n",d);
		
		
		System.out.println();
		
		String str="�ȳ��ϼ���?";
		System.out.printf("���ڿ�: %s\n", str);
		System.out.printf("���ڿ�: [%10s]\n", str);
		System.out.printf("���ڿ�: [%-10s]\n", str);
		
		//���� ���� �� ����� �� �ִ�.
		System.out.printf("%d%-4c%.2f\t%9s\n", 3,'B', 12.345,"������ �����");
		
		int year=2022;
		int month=1;
		int day=6;
		char week='T';
		String msg="������ ������Դϴ�.";
		//�� ������ ����Ͽ� printf �� ���
				
		//���� ������ ����Ͽ� printf�� �Ʒ��� ���� ���
		//��¸޽����� ������� �и��� �� �ִ�.
		System.out.printf("������ %d�� %d�� %d�� %c���� ������ �޽��� %s\n", year,month,day,week,msg);
		
		//
		System.out.format("������ %d�� %d�� %d�� %c���� ������ �޽��� %s\n", year,month,day,week,msg);
		
		
		//println���� ��� �� , ��¸޼����� ��°��� �����ִ�.
		System.out.println("������ "+year+"�� "+month+"�� "+day+"�� "+week+"���� "+"������ �޽��� "+msg);
		
		
		
		
		
		
		
	}//main
	

}//class