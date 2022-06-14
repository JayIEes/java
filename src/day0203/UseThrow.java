package day0203;

import javax.security.auth.login.FailedLoginException;

/**
 * @author user
 * 특정 상황에서 예외를 강제로 발생시켜 처리.
 */
public class UseThrow {

	public void login(String id, String password) throws FailedLoginException { //2. 발생된 예외를 던지고
		if(!(id.equals("admin")&&password.equals("1234"))) {
			
			//1. 예외 강제로 발생
			
//			try {
//				throw new Exception("로그인 실패. 아이디나 비밀번호를 확인해주세요."); //현재 method의 일과 발생되는 예외가 관련이 없다.
				throw new FailedLoginException("로그인 실패. 아이디나 비밀번호를 확인해주세요.");
//			}catch(Exception e) { //권장하지 않는다.
			
		}//end if
		System.out.println(id+"님이 로그인 하셨습니다.");
	}
	
	
	
	public static void main(String[] args) {
		
		UseThrow ut=new UseThrow();
		
		String id= "admin";
		String password = "123";
		
		
		try {
			ut.login(id, password); //3. 호출한 곳에서 throws 예외를 처리한다.
		} catch (Exception e) { //업무(method)와 관련없는 이름의 예외가 처리되었다.
			System.err.println("간단한 메세지 : "+e.getMessage());
			System.err.println("예외처리 객체명과 메세지 : "+e);
			System.err.println("-------------자세한 예외------------");
			e.printStackTrace();
		}
		
	}//main

}
