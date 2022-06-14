package day0110;

/**
 * @author user
 * String class에서 제공하는 method사용.
 */
public class UseStringMethod {

	public static void main(String[] args) {
		String str="AbcDcEf";//기본형 형식
		String str2=new String("asdfg3874@naver.com"); //참조형 형식
		
		System.out.println(str+"의 글자 수 :"+ str.length());
		System.out.println(str2+"의 글자 수 :"+ str2.length());
		
		System.out.println(str+"을 모두 대문자로 :"+ str.toUpperCase());
		System.out.println(str2+"을 모두 대문자로 :"+ str2.toUpperCase());
		
		System.out.println(str+"을 모두 소문자로 :"+ str.toLowerCase());
		System.out.println(str2+"을 모두 소문자로 :"+ str2.toLowerCase());
		
		str="AbcdEfbcd";
		System.out.println(str+"에서 'c'의 인덱스"+str.indexOf("c"));
		//여러 문자열이 들어가면 가장 앞의 인덱스를 반환
		System.out.println(str+"에서 'c'의 인덱스"+str.indexOf("Efb"));
		//존재하지 않는 문자열은 -1을 반환
		System.out.println(str+"에서 'c'의 인덱스"+str.indexOf("Ek"));
		
		//문자열 뒤에서부터 인덱스 얻기
		System.out.println(str+"에서 뒤로부터 찾아지는 'c'의 인덱스"+str.lastIndexOf("c"));
		System.out.println(str+"에서 뒤로부터 찾아지는 'bcd'의 인덱스"+str.lastIndexOf("bcd"));
		System.out.println(str+"에서 뒤로부터 찾아지는 'k'의 인덱스"+str.lastIndexOf("k"));
		
		
		//특정 인덱스의 문자 얻기
		System.out.println(str+"에서 4번째 인덱스의 해당하는 문자 "+str.charAt(4));
		System.out.println(str+"에서 2번째 인덱스의 해당하는 문자 "+str.charAt(2));
		//존재하지 않는 인덱스를 사용하면 에러 발생
		

		
		
		
		
	}//main

}//class
