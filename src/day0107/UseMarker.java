package day0107;

/**
 * @author user
 * 1. 마카펜 클래스를 사용하여 객체를 생성하고
 * 2. 마카펜 객체가 제공하는 기능을 사용.
 */
public class UseMarker {

	
	public static void main(String[] args) {
		//4.마카펜 클래스를 사용하여 검은색 마카펜생성
		
		Marker black=new Marker();//참조형 데이터형을 생성. (자동초기화)
		System.out.println(black); //주소가 출력
		
//		black 객체에 뚜껑1개, 몸체1개, 검은색을 설정해보자.
//		black.color("black"); //instance 변수에 private 접근지정자가 선언되어 있어 외부에서 절대 접근 불가
//		black.cap=1;
		
		//생성된 마카펜 객체에 값을 설정
//		black.setCap(1);
//		black.setBody(1);
//		black.setColor("검은");
		
		System.out.println(black.getColor()+"색인 마카펜의 뚜껑 : "+black.getCap()+"개, 몸체 : "+black.getBody()+"개");
		
		//5. 마카펜 클래스가 제공하는 기능 사용
		System.out.println(black.write());
		
		
		
		////빨간색 마카펜을 생성하여 값을 넣고 사용해보세요
		Marker red = new Marker(1,1,"빨간");
		System.out.println(red);
		
//		red.setCap(1);
//		red.setBody(1);
//		red.setColor("빨간");
		
		System.out.println(red.write());
		System.out.println(red.write("즐거운 주말")+" "+black.write("안뇽"));
		
	}//main

}//class
