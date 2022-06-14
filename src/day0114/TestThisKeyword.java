package day0114;


public class TestThisKeyword {

	private int value;
	
	
	/**
	 * this를 사용하지 않았을 때 매개변수와 인스턴스 변수명이 같다면 heap의 주소를 받을 수 있는 
	 * 매개변수를 선언하고, 주소를 받아 매개변수(stack)와 인스턴스변수(heap)을 식별하여 사용해야한다.
	 * @param value
	 * @param ttk
	 */
	public void nonThis(int value, TestThisKeyword ttk) { //이 방법은 번거로움
		ttk.value=value; 
	}//nonThis
	
	
	
	public void useThis(int value) {
	System.out.println("useThis--->"+this); //this를 사용하면 method를 호출하는 객체의 주소로 변경된다.
	this.value=value;
	}//useThis
	
	
	public int getVAlue() {
		return value;
	}
	
	
	public static void main(String[] args) {
//		value=10; //static 영역이 memory에 처음 로드 되기 때문에 사용 불가
		TestThisKeyword ttk=new TestThisKeyword();
//		ttk.nonThis(100,ttk);
		ttk.useThis(200);
		System.out.println(ttk.getVAlue());
		
		
	}//main

}//class
