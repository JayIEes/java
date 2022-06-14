package day0110;

public class Homework0110 {


	/**
	 * 이메일의 유효성 검증 메소드
	 * @param email
	 * @return
	 */
	public boolean eMail(String email) {
		//return 이 나와야한다면 가장 마지막줄에 한번만 나오도록 코딩해주세요.
		boolean flag=false;
		int atIndex=email.indexOf("@");
		int dotIndex=email.indexOf(".");
		if((email.length() >= 5) && ((atIndex!=-1) &&
				(dotIndex!=-1)) && ( atIndex < dotIndex)) {
				flag=true;
		}
		return flag;
	}//eMail
	//////왜 다중 if문은 return값이에 boolean이 아니라고 나올까?????? 점검 필요 2022.01.10
	
	
	
	
	
	/**
	 * 문자열 입력 받아 어쩔 저쩔 뇌절 포함하면 mz세대 아니면 늙은 세대 반환하는 메소드
	 * @param str
	 * @return
	 */
	
	public String generation(String str) {
		
		String txt = "늙은세대";
		if( (str.indexOf("어쩔")!=-1)|| (str.indexOf("저쩔")!=-1) || (str.indexOf("뇌절")!=-1) ){
			txt= "MZ세대";
		}

		return txt;
	}//generation
	
	
	
	
	
	
	public static void main(String[] args) {
		

		Homework0110 str = new Homework0110();
		String email = "asdfg3874@naver.com";
		System.out.println(str.eMail(email));
		

		System.out.println(str.generation("어쩔티비"));
		
		
	}//main

}//class
