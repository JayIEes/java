package day0119;

import java.util.StringTokenizer;

/**
 * @author user
 * ���ڿ��� ª�� �� ����(��ū)���� ������ �� ����ϴ� Ŭ����.
 */
public class UseStringTokenizer {

	public UseStringTokenizer() {
		String msg="�ڹ�,����Ŭ,.JDBC,HTML,CSS"; //CSV Data (Comma Seperated Value) : Ư�� ���ڿ��� ���е� ������ 
	
		//1. StringTokenizer����
//		StringTokenizer stk = new StringTokenizer(msg); // msg�� ���� �ּҸ� �������� //��� �������� ��ū �����ϴ¾�
//		StringTokenizer stk = new StringTokenizer(msg,","); //Ư�����ڿ��� �����Ͽ� ��ū����
//		StringTokenizer stk = new StringTokenizer(msg,",."); //Ư�����ڿ��� �����Ͽ� ��ū���� (or���!)
		//���й��ڿ����� or��� - ���й��ڿ��� �ش��ϴ� ��� ���ڿ��� ��ū���� ����
//		StringTokenizer stk = new StringTokenizer(msg,",.B "); //Ư�����ڿ��� �����Ͽ� ��ū���� (or���!) //������ delim�� �־ �߸���.
//		StringTokenizer stk = new StringTokenizer(msg,",",true); //�Ű�����3�� //���й��ڿ��� ��ū���� �����Ѵ�!
		StringTokenizer stk = new StringTokenizer(msg,",",false); //�Ű�����3�� //���й��ڿ��� ��ū���� �����Ѵ�!
		
		
		
		//2. ��ū�� ��. (��ū�� ����� ������ �����Ѵ�.)
		System.out.println(stk.countTokens());
		
//		//3. ��ũ�� �����ϴ��� 
//		System.out.println(stk.hasMoreTokens());
//		//4.��ū�� ���, �����͸� ���� ��ū������ �̵��ϴ���
//		System.out.println(stk.nextToken());
//		//3. ��ũ�� �����ϴ��� 
//		System.out.println(stk.hasMoreTokens());
//		//4.��ū�� ���, �����͸� ���� ��ū������ �̵��ϴ���
//		System.out.println(stk.nextToken());
//		//3. ��ũ�� �����ϴ��� 
//		System.out.println(stk.hasMoreTokens());
//		//4.��ū�� ���, �����͸� ���� ��ū������ �̵��ϴ���
//		System.out.println(stk.nextToken());
//		//3. ��ũ�� �����ϴ��� 
//		System.out.println(stk.hasMoreTokens());
//		//4.��ū�� ���, �����͸� ���� ��ū������ �̵��ϴ���
//		System.out.println(stk.nextToken());
//		//3. ��ũ�� �����ϴ��� 
//		System.out.println(stk.hasMoreTokens());
//		//4.��ū�� ���, �����͸� ���� ��ū������ �̵��ϴ���
//		System.out.println(stk.nextToken());
//		
//		System.out.println("----------------");
//		
		
		//3. ��ū�� �����ϴ��� 
		String token="";
		while(stk.hasMoreTokens()) {
		//4.��ū�� ���, �����͸� ���� ��ū������ �̵��ϴ���
//			stk.nextToken();
			token=stk.nextToken();
			System.out.println(token);
		}//end while
		
		
		
		
		
		
	}//UseStringTokenizer
	
	public static void main(String[] args) {
		new UseStringTokenizer();
		
		
		
		
	}//main

}//class
