package day0204;

import java.util.Random;

/**
 * @author user
 * Somebody 클래스
 */
public class Somebody {

	public String walk() throws TobaccoException {
		String result="";
		
		String[] studentGrade= {"초딩", "중딩","고딩","대딩"};
		
		int tempFlag=new Random().nextInt(studentGrade.length );
		switch(tempFlag){
		case 0: //초딩이 담배를 피우는 상황
			throw new TobaccoException("초딩 흡연은 건강에 해롭습니다.");
//			throw new TobaccoException();
		}//end switch
		
		result=studentGrade[tempFlag]+"님 흡연중 모른척 지나감('' )( '')";
		
		return result;
	}
	
	
	
	public static void main(String[] args) {
		Somebody sb= new Somebody();
		try {
			String result=sb.walk();
			System.out.println("정상적인 상태: "+result);
		}catch(Exception e) {
			System.err.println("비정상적인 상태: "+e);
			e.printStackTrace();
		}
	}//main

}
