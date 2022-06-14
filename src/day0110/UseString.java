package day0110;

/**
 * 문자열(String)을 저장할 수 있는 클래스(java.lang.String)의 사용법.
 * @author user
 */
public class UseString {

	public static void main(String[] args) {
		//기본형 형식의 사용. str객체가 문자열저장소의 주소를 직접 저장
		String str="ABCDE";
		
		//참조형 형식의 사용, str2객체는 heap의 주소를 저장했고, heap안에서 문자열 저장소의 주고 저장
		String str2=new String("ABCDE");
		
		System.out.println("str :" +str); //문자열 
		System.out.println("str2 :" +str2);
		
		System.out.println("기본형 형식 == 비교 : "+(str=="ABCDE"));
		System.out.println("참조형 형식 == 비교 : "+(str2=="ABCDE"));
		System.out.println("기본형 형식 equals : "+str.equals("ABCDE"));
		System.out.println("참조형 형식 equals : "+str2.equals("ABCDE"));
		
	}//main

}//class
