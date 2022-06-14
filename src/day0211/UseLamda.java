package day0211;

import java.util.Calendar;

public class UseLamda  {

	
	public static void main(String[] args) {

		//��ȯ�� ����, �Ű������� ���� abstract method�� ���� �������̽��� ���ٽ����� ���.
		Test t=()->{System.out.println("�̰��� ���ٽ�");};
		
		//�������̽��� �߻� method�� ȣ���ϸ� ���ٽ����� ������ �ڵ尡 ȣ��Ǿ� ����ȴ�.
		t.method();
		
		
		
		//��ȯ�� ����, �Ű������� �ִ� abstract method�� ���� �������̽��� ���ٽ����� ���.
		Test2 t2=(int age, String name)->{
			System.out.println("���� : "+age);
			System.out.println("�̸� : "+name);
		};
		
		t2.method(20, "��ö��");
		System.out.println("-------------------------------------");
		
		
		
		//��ȯ�� �ְ�, �Ű������� �ִ� abstract method�� ���� �������̽��� ���ٽ����� ���.
		Test3 t3=(int age)->{
			Calendar cal=Calendar.getInstance();
			int birth=cal.get(Calendar.YEAR)-age+1;
			return " �¾ �� : "+birth;
		};
		
		int age=25;
		String value=t3.method(age);
		System.out.println(age+"����"+value);
		System.out.println("----------------------------");
		
		
		
		//1~100���� ����ϴ� �ڵ带 ���ٽ��� ����Ͽ� Thread�� ó���Ͽ� ���
//		Runnable run=()->{
//			for(int i =1; i<101;i++) {
//				System.out.print(i+" ");
//			}
//		};
//		Thread thread=new Thread(run);
//		thread.start();
	
		Thread thread=new Thread(()->{ //�� �κ��� Runnable�̴ϱ� Thread�����ڿ� �־��൵ �ȴ�.
			for(int i =1; i<101;i++) { 
				System.out.print(i+" ");
			}
		});
		thread.start();
		
		
	}//main

	

}//class
