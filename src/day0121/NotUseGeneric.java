package day0121;

import java.util.ArrayList;
import java.util.List;

import day0120.UseCalendar;
import day0120.UseDate;

/**
 * Generic�� ������� �ʰ� List ���
 * @author user
 */
public class NotUseGeneric {

	@SuppressWarnings({"rawtypes","unchecked"})
	public NotUseGeneric() {
		//1. List����
		List list=new ArrayList();
		
		//2. �� �Ҵ� : ������ ����Ʈ �濡 ��� ���� ���� �� �ִ�. =>��� �� ����(���Ǽ�)
		list.add(2022);
		list.add(1);
		list.add(12.42);
		list.add("�ȳ��ϼ���");
		list.add(new UseDate());
		
		System.out.println("-------------------------");
		//3. �ϰ�ó���Ͽ� ���� ���
		for(int i=0 ; i<list.size();i++) {
			System.out.println(list.get(i)); //��� �����Ͱ� ���´�.
		}
		
//		for(int i=0 ; i<list.size();i++) {
//			System.out.println(list.get(i)*10); //��� �����Ͱ� ���´�.//�����߻�
//		}
		
		
	}//NotUseGeneric
	
	public static void main(String[] args) {

		new NotUseGeneric();
		
		
//		Interger ii=new Integer();
		Integer ii= Integer.valueOf(10);
//		Integer ii=10; //autoboxing
		
		int i=ii.intValue();
				
		
		
	}//main

}//class
