package day0105;

/**
 * @author user
 * instance(member) variable의 접근 지정자<br>
 */
public class Modifiers {
	public int instanceA; //패키지에 상관없이 접근 가능하다.
	protected int instanceB; //같은 패키지의 클래스에서 접근가능. 패키지가 다르면 상속관계의 자식클래스에서만 접근 가능.
	int instanceC; //같은 패키지의 클래스에서 접근 가능
	private int instanceD; //클래스 안에서만 접근 가능
	
	
	public static void main(String[] args) {
		//객체화: 인스턴스 변수를 사용하기 위해 
		Modifiers m = new Modifiers();
		//변수를 가진 클래스 안에서는 접근지정자에 상관없이 사용할 수 있다.
		System.out.println("public : "+m.instanceA);
		System.out.println("protected : "+m.instanceB);
		System.out.println("default : "+m.instanceC);
		System.out.println("private : "+m.instanceD);
		
		
		
	}//main

}//class
