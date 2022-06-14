package day0106;

/**
 * @author user
 * 같은 이름의 변수를 사용했을 때. 에러상황 
 */
public class TestrVariableName {
	//class field : instance(member) variable, static variable
	//class field에서 선언되는 변수의 이름은 유일하다.
	int i;
	static int  j;
//	static int  i; //같은 이름의 변수가 존재하기 때문에 error
	
	
	
	
	public static void main(String[] args) {
		//local : local variable
		//지역은 class field와 영역이 다르기 때문에 class field에 선언된 이름과 같은 변수를 선언할 수 있다.
		
		int i=0;;
		System.out.println("지역변수 "+i); // 지역변수는 변수명을 바로 사용 가능
		
		
		//인스턴스 변수 - 2. 객체화(클래스명 객체명=new 클래스명();) 
		//3. 객체명으로 변수를 사용 (객체명.변수명)
		TestrVariableName tvn =new TestrVariableName();
		System.out.println("인스턴스 변수 "+tvn.i);
//		int i; //같은 local field안에 i이름으로 이미 변수가 선언이 되었기 때문에 오류, 같은 이름의 변수 사용불가
		
		
		
	}//main

}//class
