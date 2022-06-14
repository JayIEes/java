package day0117;

public class UsePolymorphism {

	
	/**
	 * 객체다형성을 사용하기 위한 method
	 * @param tp
	 */
	public void usePoly(TestPoly tp) {
		//tp객체를 사용하는데 다른 결과를 얻는 것.
		System.out.println("입력 객체 사용");
		tp.polymorphism(); //객체가 하나의 모양이 아니야 - 객체의 다형성
	}
	
	
	
	
	public static void main(String[] args) {
		UsePolymorphism up=new UsePolymorphism();
		up.usePoly(new Poly2());
		up.usePoly(new Poly3());
		up.usePoly(new TestPoly());
		
		
		
		
	}//main

}
