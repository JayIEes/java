package day0106;

/**
 * @author user
 * method의 4가지 형태와 호출
 */
public class TestMethodType {

	/**
	 * 고정일 (반환형 없고, 매개변수 없는 형)형태의 method
	 */
	public void typeA() {
		System.out.println("고정일 : 호출을 하더라도 항상 같은 일을 수행한다.");
	}//typeA
	
	
	/**
	 * 가변 일 (반환형 없고, 매개변수 있는 형)형태의 method <br>
	 * 입력되는 값으로 동적인 일을 수행할 수 있다.
	 * @param i 입력값
	 */
	public void typeB(int i) {
		System.out.println("가변일: 입력값에 따라 다른 일을 수행한다." + i);
	}//typeB
	
	
	/**
	 * 고정값 (반환형 있고, 매개변수 없는 형)형태의 method <br>
	 * 항상 같은 값이 반환된다.
	 * @return
	 */
	public int typeC() {
		int i=2022;
		return i;
	}//typeC
	
	
	/**
	 * 가변값 (반환형 있고, 매개변수 있는 형) 형태의 method.
	 * 매개변수에 따라 다른 결과가 반환된다.(동적)
	 * @param d 실수형의 입력 값
	 * @return 정수의 반환 값
	 */
	public int typeD(double d) {
		
		return (int)d; //반환형이 int니까
	}
	
	
	
	
	public static void main(String[] args) {
		//객체화 : 인스턴스 변수나 인스턴스 메소드를 사용하기 위해 반드시 필요한 작업
		TestMethodType tmt=new TestMethodType();		
		
		tmt.typeA(); //고정일
//		tmt.typeA();
//		tmt.typeA();
//		tmt.typeA();
		
		tmt.typeB(0);//가변일
//		tmt.typeB(20);
//		tmt.typeB(30);
		
		int value=tmt.typeC();//고정 값. 처리결과를 변수에 저장
		System.out.println("고정값 : 호출하면 항상 같은 값이 반화된다. "+value);
//		int value2=tmt.typeC();
//		System.out.println("고정값 : 호출하면 항상 같은 값이 반화된다. "+value2);
		
		
		int value3=tmt.typeD(2022.0106);
		System.out.println("가변값 : 매개변수에 따라 호출했을 때 다른 값이 반환된다."+value3);
		int value4=tmt.typeD(2021.0106);
		System.out.println("가변값 : 매개변수에 따라 호출했을 때 다른 값이 반환된다."+value4);
		
	}//main

}//class
