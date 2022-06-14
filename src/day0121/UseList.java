package day0121;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * @author user
 * java.util.List�� ���
 */
public class UseList {
	
	public void useArrayList() {
		//1. ����
		List<String> list=new ArrayList<String>();
		
		//2. �� �Ҵ�- ���� ���������� �Ҵ�Ǹ�, ���� �Ҵ��� ������ ���� ������ �����Ѵ�.
		//�ߺ��� ����Ѵ�.
		list.add("Java"); //0
		list.add("Oracle");//1
		list.add("JDBC");//2
		list.add("Java");//3
		list.add("HTML");//4
		
		String key="java";
		System.out.println(list.contains(key)?"����":"����"); //��ҹ��� ������.
		
		
//		list.add(2, "������"); //�� �ڸ��� ���� �ڷ� �и�  //ȿ�� ������-LinkedList�� �����
		if(list.isEmpty()) {
			System.out.println("����Ʈ�� �������");
		}else {
			System.out.println("����Ʈ�� �� ����");
		
			//�� ���
		String val=list.get(0);
		System.out.println("ó�� ��° ���� ��: "+val);
		
		//��� ���� �� ���
		for(int i=1; i<list.size();i++) {
			System.out.printf("list.get(%d)=%s\n",i,list.get(i));
			}//end for //�������� ������ �� �� ���� �� ����Ʈ�� ����.
		
		}//end else //List ������� ����� ����.
		
		
		//�迭�� ����:Generic�� �����Ǿ����.
		//1.������ �迭�� �����ϰ� 
		String[] copy=new String[list.size()];
		System.out.println(list.toArray(copy));
		
		//����
		//�ε���
		list.remove(1);
		//���� �������� ����. �ߺ� ���� �����Ѵٸ� ���� ó�� ���� ����
		list.remove("Java");
		list.clear();
		
		System.out.println(list+" / "+list.size());
		
		System.out.println(Arrays.toString(copy));//�迭�� ��� �� ���?
		

		
	}//useArrayList
	
	
	public void useVector() {
		//1. ����
				List<String> list=new Vector<String>();
				
				//2. �� �Ҵ�- ���� ���������� �Ҵ�Ǹ�, ���� �Ҵ��� ������ ���� ������ �����Ѵ�.
				//�ߺ��� ����Ѵ�.
				list.add("Java"); //0
				list.add("Oracle");//1
				list.add("JDBC");//2
				list.add("Java");//3
				list.add("HTML");//4
				
//				list.add(2, "������"); //�� �ڸ��� ���� �ڷ� �и�  //ȿ�� ������-Linkedlist�� �����
				if(list.isEmpty()) {
					System.out.println("����Ʈ�� �������");
				}else {
					System.out.println("����Ʈ�� �� ����");
				
					//�� ���
				String val=list.get(0);
				System.out.println("ó�� ��° ���� ��: "+val);
				
				//��� ���� �� ���
				for(int i=1; i<list.size();i++) {
					System.out.printf("list.get(%d)=%s\n",i,list.get(i));
					}//end for //�������� ������ �� �� ���� �� ����Ʈ�� ����.
				
				}//end else //List ������� ����� ����.
				
				
				//�迭�� ����:Generic�� �����Ǿ����.
				//1.������ �迭�� �����ϰ� 
				String[] copy=new String[list.size()];
				System.out.println(list.toArray(copy));
				
				//����
				//�ε���
				list.remove(1);
				//���� �������� ����. �ߺ� ���� �����Ѵٸ� ���� ó�� ���� ����
				list.remove("Java");
				list.clear();
				
				System.out.println(list+" / "+list.size());
				
				System.out.println(Arrays.toString(copy));//�迭�� ��� �� ���?
	}//useVector
	
	public void useLinkedList() {
		//1. ����
		List<String> list=new LinkedList<String>();
		
		//2. �� �Ҵ�- ���� ���������� �Ҵ�Ǹ�, ���� �Ҵ��� ������ ���� ������ �����Ѵ�.
		//�ߺ��� ����Ѵ�.
		list.add("Java"); //0
		list.add("Oracle");//1
		list.add("JDBC");//2
		list.add("Java");//3
		list.add("HTML");//4
		
//		list.add(2, "������"); //�� �ڸ��� ���� �ڷ� �и�  //ȿ�� ������-Linkedlist�� �����
		if(list.isEmpty()) {
			System.out.println("����Ʈ�� �������");
		}else {
			System.out.println("����Ʈ�� �� ����");
		
			//�� ���
		String val=list.get(0);
		System.out.println("ó�� ��° ���� ��: "+val);
		
		//��� ���� �� ���
		for(int i=1; i<list.size();i++) {
			System.out.printf("list.get(%d)=%s\n",i,list.get(i));
			}//end for //�������� ������ �� �� ���� �� ����Ʈ�� ����.
		
		}//end else //List ������� ����� ����.
		
		
		//�迭�� ����:Generic�� �����Ǿ����.
		//1.������ �迭�� �����ϰ� 
		String[] copy=new String[list.size()];
		System.out.println(list.toArray(copy));
		
		//����
		//�ε���
		list.remove(1);
		//���� �������� ����. �ߺ� ���� �����Ѵٸ� ���� ó�� ���� ����
		list.remove("Java");
		list.clear();
		
		System.out.println(list+" / "+list.size());
		
		System.out.println(Arrays.toString(copy));//�迭�� ��� �� ���?
		
	}//useLinkedList
	
	public static void main(String[] args) {

		UseList ul=new UseList();
		ul.useArrayList();
		System.out.println("--------ArrayList------------");
		ul.useVector();
		System.out.println("----------Vector----------");
		ul.useLinkedList();
		System.out.println("-----------LinkedList---------");
		
		
	}//main

}//class
