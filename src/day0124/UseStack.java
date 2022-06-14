package day0124;

import java.util.Stack;

/**
 * LIFO 자료구조의 특징을 구현한 클래스 - Stack
 * @author user
 */
public class UseStack {
	
	public UseStack() {
		
		//1.Stack 생성
		Stack<String> stk = new Stack<String>();
		
		//2. 값 넣기
		stk.push("하세요1.");
		stk.push("안녕2.");
		stk.push("오늘은 월요일3.");
		
		//2. 값 얻기, 스택에 아이템이 존재할 때 까지 얻기
		while(!stk.empty()) { //비었을 때 true 비어있지 않으면 false 이걸 뒤집는다 NOT으로!
			System.out.println(stk.pop());
		}//end while
		//push 만큼 pop으로 꺼내야 한다. 
		
		
		
		System.out.println(stk);//toString매소드를 오버라이딩 했기 때문에 주소가 아니라 값이 나옴
		
	}//UseStack
	
	
	
	
	
	public static void main(String[] args) {
		new UseStack();
		
		
		
	}//main

}//class
