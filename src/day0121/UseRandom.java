package day0121;

import java.awt.RadialGradientPaint;
import java.util.Random;

/**
 * ������ ���
 * @author user
 */
public class UseRandom {

	public UseRandom() {
		//1. ��ü����
		Random ran = new Random(); 
//		Random ran = new Random(1); //���� ���� �������� ���ϰ� seed 
//		Random ran = new Random(new Random().nextLong()); //�� ���� but ���� �ڿ��� �Һ��.
		//2. method���
		int r1=ran.nextInt();
		System.out.println("�߻��� ���� ���� : "+ r1);
		System.out.println("�߻��� ���� ���� ���� : "+ r1%10); // ū �� % ������ ��
		System.out.println("�߻��� ���� ��� ���� ���� : "+ Math.abs(r1%10)); // ū �� % ������ ��
		
		int r2=ran.nextInt(10);
		System.out.println("�߻��� ���� ��� ���� ���� : "+ r2); // ū �� % ������ ��
		
		//�Ҹ��� ����
		System.out.println(ran.nextBoolean());
		System.out.println(ran.nextBoolean());
		System.out.println(ran.nextBoolean());
		System.out.println(ran.nextBoolean());
		System.out.println(ran.nextBoolean());
		
		//�Ǽ��� ����
		float rf=ran.nextFloat();
		double rd=ran.nextDouble();
		System.out.println();
		System.out.println("�߻��� ����:"+rf);
		System.out.println("�߻��� ���� ����: "+rd); //����*����
		System.out.println("�߻��� ���� ����: "+rd*10); //����*����
		System.out.println("�߻��� ���� ����: "+(int)(rd*10)); //����*����
		
		Integer ii=new Integer(10);
		int i=ii;
		
		
	}//UseRandom
	
	
	
	
	
	public static void main(String[] args) {
		new UseRandom();
		
		
	}//main

}//class
