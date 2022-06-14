package day0114;

public class Parent {
	
	public Parent() { //기본생성자
		
		System.out.println("부모의 기본생성자");
	}//Parent
	
	public Parent(int i) { //오버로딩 생성자 //만약에 매개변수있는 생성자가 만들어져있으면 기본생성자는 자동으로 생기지 않음
		this();
		System.out.println("부모의 오버로딩된 생성자 "+i);
	}//Parent
	
	
	
	
}//class
