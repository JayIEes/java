package day0107;

public class Ramyeon {

	private String noodle; //라면의 면 형태 (둥근 / 네모난)
	private String powder; //스프의 형태 (가루 / 액상)
	private int spiciness; //라면의 매운정도 (1단계,2, 3 / 수가 클수록 매움)
	private String name; //라면의 이름
	
	
	/**
	 * 생성된 라면 객체의 면의 형태를 설정하는 일을 하는 메소드
	 * @param noodle 설정할 라면 면의 형태
	 */
	public void setNoodle(String noodle) {
		this.noodle=noodle;
	}//setNoodle
	
	/**
	 * 생성된 라면 객체에 설정된 면의 형태를 반환하는 일
	 * @return 라면의 면 형태
	 */
	public String getNoodle() {
		return noodle;
	}
	
	
	/**
	 * 생성된 라면 객체의 스프의 형태를 설정하는 일을 하는 메소드
	 * @param powder 설정할 스프의 형태
	 */
	public void setPowder(String powder) {
		this.powder=powder;
	}//setPowder
	
	
	/**
	 * 생성된 라면 객체에 설정된 스프의 형태를 반환하는 일
	 * @return 라면의 스프 형태
	 */
	public String getPowder() {
		return powder;
	}
	
	
	/**
	 * 생성된 라면 객체의 매운 정도를 설정하는 일을 하는 메소드
	 * @param spiciness 설정할 매운정도
	 */
	public void setSpiciness(int spiciness) {
		this.spiciness=spiciness;
	}
	
	
	/**
	 * 생성된 라면 객체에 설정된 매운정도를 반환하는 일
	 * @return 라면의 매운정도
	 */
	public int getSpiciness() {
		return spiciness;
	}
	
	
	/**
	 * 생성된 라면 객체의 이름을 설정하는 일을 하는 메소드
	 * @param name 설정할 라면의 이름
	 */
	public void setName(String name) {
		this.name=name;
	}
	
	/**
	 * 생성된 라면 객체에 설정된 이름을 반환하는 일
	 * @return 라면의 이름
	 */
	public String getName() {
		return name;
	}
	
	
	
	
	/**
	 * 생성된 라면의 갹체를 사용하여 "맛있게 먹는다"는 먹는 행위 구현
	 * @return
	 */
	public String eat() {
		return name+"을 맛있게 먹는다.";
	}//eat
	
	
	/**
	 * 라면의 이름을 가지고 어떻게 먹는지의 행위를 구현하는 메소드
	 * @return 라면의 이름
	 */
	public String eat(String rname) {
		return name+"을 "+rname+" 맛있게 먹는다.";
	}//eat
	
	
	
	public static void main(String[] args) {

		
		
		
		
	}//main

}//class
