package day0105;

/**
 * @author user
 * static(class) variable : 공용변수<br>
 * 갹체화를 하지 않고 클래스명으로 접근하여 사용하는 변수.
 */
public class UseStaticVariable {
	static int i; // class field에 선언되지만 객체를 생성하지 않고 클래스명으로 직접 접근
	public static int j;
	int insI;//instance variable

	public static void main(String[] args) {
		System.out.println(i);
		System.out.println(UseStaticVariable.j);
		//static 변수는 객체에 속해있지 않은 공용변수로 '객체명.변수명'으로 사용은 되나, 올바른 사용이 아니므로 경고메세지를 보여준다.
		
		
		UseStaticVariable usv=new UseStaticVariable();
		UseStaticVariable usv2=new UseStaticVariable();
		usv.insI=100; //instance variable //객체마다 값이 따로 설정된다.
		usv2.insI=500;
		//static 변수는 객체명으로 사용하더라도 하나의 변수를 사용하는 것이기 때문에
		//변경된 값이 공유된다.
		
		//////////////////////////////잘못된 방법:static변수를 instance 변수의 문법으로 사용/////////////////////////////////////
//		usv.i=1000;
//		System.out.println("static 객체명으로 사용 "+usv.i+", instance variable : "+usv.insI); //warning이 뜸
//		System.out.println("static 객체명으로 사용 "+usv2.i+", instance variable : "+usv2.insI); 
		
		
		/////////////////////////올바른 방법 : static 문법으로 사용//////////////////////////////
		UseStaticVariable.i=1000;
		System.out.println("static 객체명으로 사용 "+UseStaticVariable.i+", instance variable : "+usv.insI); //warning이 뜸
		System.out.println("static 객체명으로 사용 "+UseStaticVariable.i+", instance variable : "+usv2.insI); 
		
		
		
		
		
		
	}//main

}//class
