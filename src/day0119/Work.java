package day0119;

/**
 * @author user
 * 숫자, 영문자 대문자, 영문자 소문자로 구성된 임시 비밀번호를 8자로 생성하여 char[]로 
   반환하는 method를 만든다. (난수로 8자를 발생시켜 배열에 저장한 다음 반환)
  
   위의 method를 호출하여 반환된 char[] 의 값을 저장하여 출력해보세요.

 */
public class Work {
	public static final int UPPER_CASE=0;
	public static final int LOWER_CASE=1;
	public static final int NUMBER=2;

	/**
	 * 임시 비밀번호를 생성하는 일
	 * @return
	 */
	public char[] tempPassword() {
		char[] temp = new char[8];

		int flag=0;
		for(int i=0; i<temp.length;i++) {
			flag=(int)(Math.random()*3); 
			switch(flag) {
			case UPPER_CASE: temp[i]=(char)((Math.random()*26)+65); break;
			case LOWER_CASE: temp[i]=(char)((Math.random()*26)+65); break;
			case NUMBER:temp[i]=(char)((Math.random()*10)+48); break;
			}
		}//end for
		
		return temp;
	}//tempPassword 1번 째 방법
	
	
	public char[] tempPassword2() {
		char[] temp = new char[8];

		int tempNum=0;
		for(int i=0; i<temp.length;) {
			tempNum=(int)(Math.random()*123);
			if( (tempNum>47&&tempNum<58) || (tempNum>64&&tempNum<91) || (tempNum>96&&tempNum<123) ) {
				temp[i]=(char)tempNum;
				i++;
			}//end if
		}//end for
		
		return temp;
	}//tempPassword2
	
	

	public char[] tempPassword3() {
		char[] temp = new char[8];
		
		String passwordSet="111123456789qwertyuiopasdfghjklzzzzxcvbnm";
		
		int passSetSize=passwordSet.length();
		for(int i =0;i<temp.length;i++) {
			temp[i]=passwordSet.charAt((int)(Math.random()*passSetSize));
		}
				
		
		return temp;
	}//tempPassword3
	
	
	/**
	 * 비밀번호를 출력하는 일
	 */
	public void printPassword(char[] tempPass) {
		System.out.println(tempPass); //char배열은 그대로 출력된다.
	}//printPassword
	
	
	
	
	public static void main(String[] args) {

		Work work=new Work();
		char[] temp=work.tempPassword3();
		work.printPassword(temp);
		
		
		
		
	}//main

}
