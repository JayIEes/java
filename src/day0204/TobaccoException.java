package day0204;

/**
 * @author user
 * Compile Exception 작성
 */
@SuppressWarnings("serial")
//1. Exception 또는 RuntimeExeption을 상속 받고
public class TobaccoException extends Exception {
//2. 생성자 Overload
	/**
	 * 정해진 예외 메시지 출력할 때
	 */
	public TobaccoException() {
		super("흡연예외 발생");
	}//TobaccoException
	
	/**
	 * 개발자가 상황에 맞는 예외메시지를 만들어서 출력할 때
	 * @param msg
	 */
	public TobaccoException(String msg) {
		super(msg);
	}//TobaccoException
	
}
