package day0105;

public class Homework0105 {

	public void age(int a){ //age메소드 - No.1나이 구하기
		int year = 2022; 
		System.out.println("당신의 나이는 "+((year-a)+1)+"살입니다.");
	}
	
	
	public void range(int b) { //range메소드 - No.2 범위 안
		if( (b>64&&b<91) || (b>96&&b<123) || (b>47&&b<58) ) {
			System.out.println("입력하신 정수는 " +(char)b+"에 해당합니다");
		}else {
			System.out.println(b+"는 대문자, 소문자, 숫자에 해당하지 않습니다.");
			}
	}
	
	
	
	
	
	public static void main(String[] args) {

		//No.1
		int birth = 2001;
		Homework0105 h = new Homework0105(); //age()method를 쓰기 위한 객체화
		h.age(birth); // age메소드 호출
		
		
		
		//No.2
		int num =59;
		Homework0105 hw = new Homework0105(); 
		hw.range(num);
		
		
	}//main

}//class
