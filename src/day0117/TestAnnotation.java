package day0117;

import java.util.Date;
import java.util.List;

public class TestAnnotation {

	@Deprecated 
	public void test() {
		System.out.println("��...");
	}
	
	
	@SuppressWarnings({"rawtypes", "unused"}) //�޼ҵ� ���� ���� :method���� ��� ����Ȳó��
	public void temp() {
//		@SuppressWarnings("unused") //���� �� ����
		int i;
//	@SuppressWarnings("unused") //������ ����
//	@SuppressWarnings({"rawtypes", "unused"}) //@SuppressWarnings�� �ѹ��� ����ؾ� �ϹǷ� �迭�� ���� ���� ���� �־��ش�. //���� ����Ȳ ��� ó��
	List l=null;
	
	}
	
	
	
	
	public static void main(String[] args) {
	
		
	
		Date date = new Date();
		System.out.println(date.getYear()+1900);
		
		TestAnnotation ta=new TestAnnotation();
		ta.test();
		
	}//main

}//class
