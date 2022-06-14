package day0107;

/**
 * @author user
 * 마카펜을 추상화하여 생서한 클래스.
 * 명사적 특징 : 뚜껑 / 몸체 / 색
 * 동사적 특징 : 쓴다.
 */
public class Marker {
	private int cap; //뚜껑의 개수
	private int body; // 몸체의 개수
	private String color; //색
	
	
	/**
	 * 01-01-2022에 추가된 기본생성자
	 * 뚜껑 1 몸체 1 검은색인 마카펜 객체 생성할 때 사용한다.
	 * 사용법<br>
	 * Marker 객체명=new Marker();<br>
	 * 의 문법으로 생성하여 사용한다.
	 */
	
	public Marker() {
		this(1,1,"검은");
//		cap=1;
//		body=1;
//		color="검은";
	}//Marker
	

	
	/**
	 * 입력된 값으로 뚜껑, 몸체, 색을 설정하여 객체를 생성하는 생성자
	 * @param cap 뚜껑의 개수
	 * @param body 몸체의 개수
	 * @param color 색
	 */
	public Marker(int cap, int body, String color) {
		this.cap=cap;
		this.body=body;
		this.color=color;
	}//Marker
	
	
	
	
	
	/**
	 * 생성된 마카펜 객체의 뚜껑의 개수를 설정하는 일을 하는 메소드
	 * @param cap 설정할 뚜껑의 개수
	 */
	public void setCap(int cap) {
		this.cap=cap;
	}//setCap
	
	/**
	 * 생성된 마카펜 객체에 설정된 뚜껑 개수를 반환하는 일
	 * @return 뚜껑의 개수
	 */
	public int getCap() {
		return cap;
	}//getCap
	
	
	/**
	 * 생성된 마카펜 객체의 몸체의 개수를 설정하는 일을 하는 메소드
	 * @param body 설정할 몸체의 개수
	 */
	public void setBody(int body) {
		this.body=body;
	}//setBody
	
	/**
	 * 생성된 마카펜 객체에 설정된 몸체의 개수를 반환하는 일
	 * @return 몸체
	 */
	public int getBody() {
		return body;
	}//getBody
	
	/**
	 * 생성된 마카펜 객체의 색을 설정하는 일을 하는 메소드
	 * @param color 설정할 색
	 */
	public void setColor(String color) {
		this.color=color;
	}//setColor
	
	/**
	 * 생성된 마카펜 객체에 설정된 색을 반환하는 일
	 * @return 색
	 */
	public String getColor() {
		return color;
	}//getColor
	
	
	
	

	/**
	 * @return
	 * 칠판에 생성된 마카펜 객체를 사용하여 "안녕하세요?"를 쓰는 일 구현
	 */
	public String write() {
		return color+"색인 마카펜으로 \"안녕하세요?\"를 철판에 쓴다.";
	}//write
	
	/**
	 * @param msg 칠판에 기록할 메시지
	 * @return 메시지
	 * 칠판에 생성된 마카펜 객체를 사용하여 입력된 메시지를 쓰는 일 구현.
	 */
	public String write(String msg) {
		return color+"색인 마카펜으로 \""+msg+"\"를 철판에 쓴다.";
	}//write
	
	
	
	
	

}//class
