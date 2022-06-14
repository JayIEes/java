package day0118;

public class UseAnonymous {

	/**
	 * 클래스(인터페이스)를 매개변수로 받는 method
	 * @param ta
	 */
	public void useTestA(TestA ta) {
		ta.testA();
	}
	
	public static void main(String[] args) {
		//1. 클래스를 객체화
		UseAnonymous ua =new UseAnonymous();
		
//		ua.useTestA(new TestA());//인터페이스는 일반 메소드를 가질 수 없기 때문에 불가
		//3. 인터페이스를 구현한 클래스 객체화
		TestAImpl tai=new TestAImpl();//TestAImpl은 TestA이다. (is a 관계)
		
		//4. 3번에서 생성된 객체를 arguments로 입력하여 method를 호출.
		ua.useTestA(tai);
		ua.useTestA(tai); //한 번 이상 호출하더라도 객체만 생성하여 호출하면 된다. => 중복코드가 줄어든다.
		
		System.out.println("-------------anonymous inner class--------------------");
		//1. 클래스를 객체화
		UseAnonymous ua2=new UseAnonymous();
		//2.anonymous inner class로 객체를 생성하여 arguments로 입력한다.
		ua2.useTestA(new TestA() {
			@Override
			public void testA() {
				System.out.println("anonymous inner class로 생성된 객체");
			}
		});
		
		ua2.useTestA(new TestA() {
			@Override
			public void testA() {
				System.out.println("한 번 이상 호출되면 중복 코드의 양이 증가");
			}
		});
		
		
				
	}//main

}//class
