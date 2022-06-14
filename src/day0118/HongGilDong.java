package day0118;


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
	
	
	@Override
	public String eat() {
		return getName()+"이 집에서 밥을 먹는다.";
	}
	
	@Override
	//식당이 아닌 주막에서 사먹는 일로 Override
	public String eat(String menu,int price) {
		//name의 부모클래스에서 private 접근지정자로 되어있으므로 외부에서 직접접근을 할 수 없다.
//		return name+"이(가) 식당에서 "+menu+"인 음식을 "+price+"원 내고 사먹는다.";
		//public 인 method를 호출하여 사용한다.
		return getName()+"이(가) 주막에서 "+menu+"인 음식을 "+price+"냥 내고 사먹는다.";
	}
	
	
	
	
}//class
