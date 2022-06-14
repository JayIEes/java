package day0117;

import java.util.Date;
import java.util.List;

public class TestAnnotation {

	@Deprecated 
	public void test() {
		System.out.println("일...");
	}
	
	
	@SuppressWarnings({"rawtypes", "unused"}) //메소드 위에 설정 :method내의 모든 경고상황처리
	public void temp() {
//		@SuppressWarnings("unused") //변수 위 설정
		int i;
//	@SuppressWarnings("unused") //변수위 설정
//	@SuppressWarnings({"rawtypes", "unused"}) //@SuppressWarnings를 한번만 사용해야 하므로 배열을 통해 여러 개를 넣어준다. //여러 경고상황 묶어서 처리
	List l=null;
	
	}
	
	
	
	
	public static void main(String[] args) {
	
		
	
		Date date = new Date();
		System.out.println(date.getYear()+1900);
		
		TestAnnotation ta=new TestAnnotation();
		ta.test();
		
	}//main

}//class
