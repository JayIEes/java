package day0114;


/**
 * @author user
 * 사람의 공통 특징(눈,코,입, 먹는일)은 Person 클래스에서 가져다 사용하고, 자신의 특징만 정의하는 자식클래스
 * 자식클래스<br>
 * 홍길동은 싸움을 잘하는 특징
 * 싸움레벨은 1~10까지 존재<br> 평균 성인의 싸움 등급 3으로 본다.
 */
public class HongGilDong extends Person {

	private int myLevel; 
	
	
	
	public HongGilDong() {
		super();
		myLevel=5;
	}//HongGilDong
	
	public String fight(int yourLevel) {
	String resultMsg="";
		
	if(myLevel<yourLevel) {//지는 경우
		resultMsg="OTL 싸움에서 졌음";
		myLevel--;
		if(myLevel<1) {//이긴 경우
		myLevel=1;
		}
	}else if(myLevel>yourLevel) {
		resultMsg="s('.^)V 싸움에서 이겼음";
		myLevel++;
		if(myLevel>10) {
			myLevel=10;
		}
	}else {//비기는 경우
		resultMsg="(ㅡㅡ+)싸움에서 비겼음.";
	}
	
	return resultMsg;
	}//fight
	
	
	//식당이 아닌 주막에서 사먹는 일로 Override
	public String eat(String food, int won) {
		return name+"이(가) 집에서 밥을 먹는다." ;
	}
	
	
	
	
}//class
