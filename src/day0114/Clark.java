package day0114;

/**
 * 눈,코,입, 이름, 먹는 일은 부모 클래스에서 정의된 코드를 사용하고(상속:코드의 재사용성) 자신만의 특징을 정의한 클래스<br>
 * 힘 쎔, 일반 성인 힘 평균 2 힘은 1~10까지
 * 
 * @author user
 */
public class Clark extends Person {

	public int power;

	/**
	 * 눈이 3개
	 */
	public Clark() {
		super(3,1,1); //부모 클래스의 인수있는 오버로딩된 생성자를 불러서 일반일과 다르게 만들자
		power = 8;
	}// Clark

	/**
	 * 돌에 따라서 힘이 달라진다.
	 * 
	 * @param stone
	 * @return
	 */
	public String power(String stone) {
		String result = "";

		if (stone.equals("크립토나이트")) { // 힘빠지는 돌
			result = "~(_-_)~ 힘이 빠진다....";
			power = 1;
		} else if (stone.equals("다이아몬드")) { // 기분이 좋은 돌
			result = "(^-^) 감사";
			power = 10;
		} else {// 기분이 나쁜 돌
			result = "(ㅡㅡ +)기분 나쁨";
			power = 12;

		} // end else

		return result;

	}// power
	
	


}// class
