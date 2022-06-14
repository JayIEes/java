package day0124;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * �˻��� ����� ����, �ߺ����� �������� �ʴ� �ڷᱸ��.
 * �Է°��� ���������� ���� �ʴ´�.
 * @author user
 */
public class UseSet {
	
	public UseSet() {
		//1. ����
		Set<String> set=new HashSet<String>();
		
		//2. �� �Ҵ� - �Է� ���� ���������� ���� �ʴ´�.
		set.add("Java");
		set.add("Oracle");
		set.add("JDBC");
		set.add("HTML");
		set.add("CSS");
		set.add("JavaScript"); 
		//�ߺ��� - �ԷµǴ� ���� ������ ���� ���� ������ �Էµ��� �ʴ´�.
		set.add("HTML"); //�ȵ�����.
		set.add("HTML"); //�ȵ�����.
		set.add("Java"); //�ȵ�����.
		
		
		//3. ũ��
		System.out.println(set.size());
		
		
		//4.�迭�� ����
		//�� �迭 ����
		String[] copy=new String[set.size()];
		//����
		set.toArray(copy);
		
		//�˻� - ��� ���� 
//		set.get(0);//get �� �� ����. //error �߻�.
		//������ for�� ����ϸ� Iterator�� ��� ����� �Ǳ� ��.
//		for(String Subject : set) {
//			System.out.println(Subject);
//		}//end for
		
		//�˻� ������ִ� iterator
		//1. Set��ü�� ������� �޴´�.
		Iterator<String> ita=set.iterator();
		//2. Iterator�� ���ؼ� Set�� ��Ұ� �����ϴ��� �˻��� �� ��
		String value="";
		while(ita.hasNext()) {
			System.out.println("�������");
			value=ita.next();
			System.out.println(value);
			//3. ��Ұ� �����Ѵٸ� ���� ���, �����͸� �������� �̵���Ų��.
			
		}//end while
		
		
		
		//5. ���� 
		set.remove("JDBC"); //Ư�� ���� �� ����
		set.clear(); //��� ���� ���� ����
		
		System.out.println(set.isEmpty()); 
		
		System.out.println(set);
		System.out.println("------------����� ��---------------");
		for(int i=0;i<copy.length;i++) {
			System.out.println(copy[i]);
		}//end for
		
		
	}//UseSet

	
	/**
	 * Set�� �ߺ��� ���� ����
	 */
	public void dupVal() {
		//1.����
		Set<TestVO> set = new HashSet<TestVO>();
		//2.�� �Ҵ� -> set�� ���������� ������ ���� �ߺ����� �������� �ʴ´�.
		set.add(new TestVO("������",25)); //new�� ������ ��ü�� �ּҰ� �ٸ��Ƿ�
		set.add(new TestVO("���μ�",24));
		set.add(new TestVO("������",24));
		set.add(new TestVO("������",25));//������ ���� ���� ������ �ص� �Է��̵ȴ�. 
		//�ֳ�, ��ü�� �ּҰ� ����Ȱ��̱� ������ �ߺ��� �ƴϴ�.
		
		TestVO tv=new TestVO("������",26);
		set.add(tv); //�ϳ��� �ּҰ� ���� �� �ԷµǸ� �߰����� �ʴ´�.
		set.add(tv); //�ּҰ� ���� �ֵ��̴� �ߺ����� ������ �ʴ´�.
		
		System.out.println(set);
	}//dupValue
	
	
	
	
	
	public static void main(String[] args) {
		UseSet us = new UseSet();
		System.out.println("-------------�ߺ����� ó��--------------");
		us.dupVal();
		
		
	}//main

}//class
