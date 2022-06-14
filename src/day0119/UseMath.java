package day0119;

/**
 * 수학 관련 클래스
 * @author user
 */
public class UseMath {

	public UseMath() {
		//객체를 생성하지 않고 사용하는 클래스
//		Math m=new Math(); //생성자가 보이지 않으므로 객체화 할 수 없다.
		int i=-19;
		System.out.println(i+"의 절대값 "+Math.abs(i));
		
		double d=10.5;
		System.out.println(d+"의 반올림 "+Math.round(d));
		d=10.1;
		System.out.println(d+"의 올림 "+Math.ceil(d));
		d=10.9;
		System.out.println(d+"의 내림 "+Math.floor(d));
		//자바는 버림이 없어, 소수점 이하 버리기는 캐스팅을 한다.
		
		double num=Math.random();
		System.out.println("발생한 난수"+num); //16자리정도 까지의 소수점이 나옴
		System.out.println("범위의 난수"+num*10);
		System.out.println("범위의 난수에서 정수"+(int)(num*10)); //(int)num*10이러면 (int)num이 먼저 계산되어 0이 된다!!!!
		
		//1~100사이의 난수 얻기
		System.out.println((int)((num*100)+1));
		int temp=(int)(Math.random()*100)+1;
		System.out.println(temp);
		
		//대문자 A~Z 중 하나를 얻기
		char c=(char)((int)((Math.random()*26)+1)+64);//1~25
		System.out.println(c);
		
		//선생님 코드
		temp=(int)(Math.random()*26)+65;
		System.out.println((char)temp);
		
		//소문자
		temp=(int)(Math.random()*26)+97;
		System.out.println((char)temp);
		
		
		//숫자0~9중 하나 얻기
		temp=(int)((Math.random()*10)+48);
		System.out.println((char)temp);
		
		
		char cdr=(char)((Math.random()*10)+48);
		System.out.println(cdr);
		
		
		
		
		
	}//UseMath
	
	
	public static void main(String[] args) {
		new UseMath();
		
	}//main

}//class
