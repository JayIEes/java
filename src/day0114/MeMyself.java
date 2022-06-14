package day0114;

import day0110.Person;

/**
 * @author user
 * 특징 : 음식 즐기기 // 음식 3개에 따라 변화하는 반응을 1~5로 설정
 */
public class MeMyself extends Person {

	private int joynessLevel;
	
	public MeMyself() {
		joynessLevel=1;
	}//생성자
	
	
	public String enjoyingFood(String food) { //음식에 따른 즐거움 정도를 보여주는 메소드
		String result="";
		
		if(food.equals("치킨")) {
			++joynessLevel;
			result="^0^! 치킨은 맛있다, 나의 내 즐거움이 "+ 1 +"상승하여 "+joynessLevel+"이다.";
			if(joynessLevel>5) {
				joynessLevel=5;
				result="^0^ 치킨은 맛있다,근데 내 즐거움이 5에 달하여 "+joynessLevel+"이다.";
				
			}	
		}else if(food.equals("파스타")) {
			++joynessLevel;
			result="^0^ 파스타는 맛이 좋다, 나의 내 즐거움이 1 상승하여 "+joynessLevel+"이다.";
			if(joynessLevel>5) {
				joynessLevel=5;
				result="^0^! 파스타는 맛있다,근데 내 즐거움이 5에 달하여 "+joynessLevel+"이다.";
			}
		}else if(food.equals("콩밥")) {
			--joynessLevel;
			result="웩 콩밥은 웩, 나의 내 즐거움이 1 하락하여 "+joynessLevel+"이다.";
			if(joynessLevel<1) {
				joynessLevel=1;
				result="웩 콩밥은 웩, 앗 근데 내 즐거움이 1에 달하여 "+joynessLevel+"이다.";
			}
		}
		
		
		return result;
	}//enjoyingFood
	
	
}//class
