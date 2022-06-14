package day0118;

/**
 * @author user
 * TestA, TestB를 상속받는 하위 인터페이스
 */
public interface TestC extends TestA,TestB {
	
	public abstract void testC(); //추상 method / abstract은 붙여도 괜찮고~
	
	//부모 인터페이스의 추상method는 자식인터페이스에서 구현(OVerride)할 필요가 없다.
//	@Override
//	public abstract void testA(); //아무 차이도 없다.
	
}//TestA
