package day0120;

import java.util.Date;

/**
 * DateŬ������ ���
 * @author user
 */
public class UseDate {

	
	
	
	public static void main(String[] args) {
		//CMOS ��¥ ���
		long ctm=System.currentTimeMillis(); //1970-01-01 00:00:00�������� ��������� �ð��� ms
		System.out.println(ctm);//SystemŬ������ OS�� ������ ��ȯ�� �� �ִ� ������ Ŭ����.
		
		//1.��üȭ
		Date date= new Date();
		Date date2= new Date(ctm);
		
		System.out.println(date); //��ü ����ߴµ� ���� ���� ������ java.lang.ObjectŬ������ toString()�� Override�ؼ� �׷���.
		System.out.println(date2); //��ü ����ߴµ� ���� ���� ������ java.lang.ObjectŬ������ toString()�� Override�ؼ� �׷���.
		
		
		
		
		
		
	}//main

}
