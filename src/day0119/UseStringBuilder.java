package day0119;

/**
 * @author user
 * 긴 문자열을 다루는 클래스
 */
public class UseStringBuilder {

	public void useStringBuffer() {
		StringBuffer sb=new StringBuffer();
		//값 추가. append()
		sb.append(2022); //정수
		sb.append('A'); //문자
		sb.append(1.19); //실수
		sb.append(false); 
	
		
		System.out.println(sb+" "+sb.length());//.toString()들어간거임  //결과는 문자열
	
		StringBuffer sb2 = new StringBuffer();
		sb2.append("오늘은 수요일 입니다."); //붙임
		sb2.insert(4, "2022년 1월 19일 "); //사이에 삽입
		sb2.delete(3, 9);//삭제 2022년 //끝인덱스 +1
		
		System.out.println(sb2);
	
	
	}//useStringBuffer
	
	
	public void useStringBuilder() {
		StringBuilder sb=new StringBuilder();
		//값 추가. append()
		sb.append(2022); //정수
		sb.append('A'); //문자
		sb.append(1.19); //실수
		sb.append(false); 
	
		
		System.out.println(sb+" "+sb.length());//.toString()들어간거임  //결과는 문자열
	
		StringBuilder sb2 = new StringBuilder();
		sb2.append("오늘은 수요일 입니다."); //붙임
		sb2.insert(4, "2022년 1월 19일 "); //사이에 삽입
		sb2.delete(3, 9);//삭제 2022년 //끝인덱스 +1
		
		System.out.println(sb2);
		
		
		String fileName="e:/dev/workspave/javase_prj/day0119/Use.String.Builder.java";
		//위의 경로/파일명을 "e:/dev/workspave/javase_prj/day0119/Use.String.Builder_bak.java"
		//로 변경 출력! UseStringBuilder.java 파일명에 _bak 만들어 출력
	
		StringBuilder fn = new StringBuilder(fileName);
		fn.insert(fn.lastIndexOf("."), "_bak");
		System.out.println(fn);
		
		//선생님 코드
		StringBuilder sb3= new StringBuilder(fileName);
		sb3.insert(sb3.lastIndexOf("."),"_bak");
		
		System.out.println(sb3);
//		String temp=sb3; //sb3는 StringBuilder고 temp는 String이라 불가
//		String temp=sb3.toString();
//		System.out.println(temp.toUpperCase());
		System.out.println(sb3.toString().toUpperCase());
		
	}//useStringBuilder
	
	
	

	
	public static void main(String[] args) {

		UseStringBuilder usb=new UseStringBuilder();
		System.out.println("-------------StringBuffer--------------");
		usb.useStringBuffer();
		System.out.println("--------------StringBuilder------------");
		usb.useStringBuilder();
		
		// +대신 append를 쓰면돼!!
		
		
		
		
		
		
	}//main

}//class
