package day0117;

import java.util.Date;

public class RunTestOverride {

	@Override
	public String toString() {
		return "��ü�� ��µ� �� �ּҰ� �ƴ� �ٸ� �޽����� ����ϵ��� ����"+ super.toString(); //�޽����� ��ü �ּ� �Ѵ� ���
	}
	
	public static void main(String[] args) {
		//��Ӱ����� ��üȭ : �ڽ�Ŭ������ �����Ͽ� �θ�Ŭ������ �����Ѵ�. - �θ�Ŭ������ �ڿ��� ��� ����
		//�θ�Ŭ������ ��ü��=new �ڽ�Ŭ����������();
		TestOverrideSuper tos= new TestOverrideSub();
		tos.test(); //�θ𿡸� ���ǵ� method
		tos.temp(); //�θ��� �޼ҵ带 �ҷ����� overriding�� �� �ڽ�Ŭ������ �޼ҵ尡 �ֿ켱������ ȣ��.
//		tos.sub(); //�ڽ�Ŭ������ ���� �ڿ��� ����� �� ����.
		
		System.out.println("-----------------------------------------");
		//�ڽ�Ŭ������ ��üȭ : �θ�Ŭ������ ��� �ڿ��� �ڽ�Ŭ������ ��� �ڿ��� ����� �� �ִ�.
		TestOverrideSub tos1=new TestOverrideSub();
		tos1.test(); //�ڵ��� ���뼺
		tos1.sub();//�ڽ�Ŭ������ ���� method
		tos1.temp(); // �������̵��� �޼ҵ�� �ڽ� �޼ҵ尡 ȣ��ȴ�.
		
		System.out.println("----------------------------");
		RunTestOverride rto=new RunTestOverride();
		System.out.println(rto); //heap�� �ּ� ���
		
		String str=new String("������ �������Դϴ�.");
		System.out.println(str.toString()); //�޽��� ���
		
		Date date=new Date();
		System.out.println(date.toString()); //�޽���
		
		System.out.println(tos1);//heap
				
		
		
	}//main

}//class
