package day0105.sub;

import day0105.Modifiers;

/**
 * @author user
 * �ٸ� ��Ű���� ��Ӱ���� ������ �ڽ� Ŭ����
 */
public class Modifiers4 extends Modifiers{
	
	
	public static void main(String[] args) {
		System.out.println("�ٸ� ��Ű���� �����ϴ� �ڽ� Ŭ����");
		//��üȭ: �ν��Ͻ� ������ ����ϱ� ����
		//��� ���迡���� "�ڽ�Ŭ����"�� ��üȭ�� �Ѵ�.
		Modifiers4 m = new Modifiers4();
		//������ ���������ڿ� ���� ���� ���Ұ��� �����ȴ�.
		System.out.println("public : "+m.instanceA); //��밡��
		System.out.println("protected : "+m.instanceB);//��밡��
//		System.out.println("default : "+m.instanceC);//���Ұ���
//		System.out.println("private : "+m.instanceD); //���Ұ���
		
		
		
	}//main

}//class
