package day0121;

import java.awt.RadialGradientPaint;
import java.util.Random;

/**
 * 난수의 사용
 * @author user
 */
public class UseRandom {

	public UseRandom() {
		//1. 객체생성
		Random ran = new Random(); 
//		Random ran = new Random(1); //다음 수를 예측하지 못하게 seed 
//		Random ran = new Random(new Random().nextLong()); //더 안전 but 많은 자원이 소비됨.
		//2. method사용
		int r1=ran.nextInt();
		System.out.println("발생한 정수 난수 : "+ r1);
		System.out.println("발생한 범위 정수 난수 : "+ r1%10); // 큰 수 % 범위의 수
		System.out.println("발생한 범위 양수 정수 난수 : "+ Math.abs(r1%10)); // 큰 수 % 범위의 수
		
		int r2=ran.nextInt(10);
		System.out.println("발생한 범위 양수 정수 난수 : "+ r2); // 큰 수 % 범위의 수
		
		//불린의 난수
		System.out.println(ran.nextBoolean());
		System.out.println(ran.nextBoolean());
		System.out.println(ran.nextBoolean());
		System.out.println(ran.nextBoolean());
		System.out.println(ran.nextBoolean());
		
		//실수의 난수
		float rf=ran.nextFloat();
		double rd=ran.nextDouble();
		System.out.println();
		System.out.println("발생한 난수:"+rf);
		System.out.println("발생한 난수 범위: "+rd); //난수*범위
		System.out.println("발생한 난수 범위: "+rd*10); //난수*범위
		System.out.println("발생한 난수 범위: "+(int)(rd*10)); //난수*범위
		
		Integer ii=new Integer(10);
		int i=ii;
		
		
	}//UseRandom
	
	
	
	
	
	public static void main(String[] args) {
		new UseRandom();
		
		
	}//main

}//class
