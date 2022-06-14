package day0124;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 검색의 기능이 없고, 중복값을 저장하지 않는 자료구조.
 * 입력값은 순차적으로 들어가지 않는다.
 * @author user
 */
public class UseSet {
	
	public UseSet() {
		//1. 생성
		Set<String> set=new HashSet<String>();
		
		//2. 값 할당 - 입력 값은 순차적으로 들어가지 않는다.
		set.add("Java");
		set.add("Oracle");
		set.add("JDBC");
		set.add("HTML");
		set.add("CSS");
		set.add("JavaScript"); 
		//중복값 - 입력되는 값과 동일한 값이 있을 때에는 입력되지 않는다.
		set.add("HTML"); //안들어가진다.
		set.add("HTML"); //안들어가진다.
		set.add("Java"); //안들어가진다.
		
		
		//3. 크기
		System.out.println(set.size());
		
		
		//4.배열로 복사
		//빈 배열 생성
		String[] copy=new String[set.size()];
		//복사
		set.toArray(copy);
		
		//검색 - 기능 없음 
//		set.get(0);//get 쓸 수 없다. //error 발생.
		//개선된 for를 사용하면 Iterator가 없어도 출력이 되기 함.
//		for(String Subject : set) {
//			System.out.println(Subject);
//		}//end for
		
		//검색 대신해주는 iterator
		//1. Set객체의 제어권을 받는다.
		Iterator<String> ita=set.iterator();
		//2. Iterator를 통해서 Set의 요소가 존재하는지 검색을 한 후
		String value="";
		while(ita.hasNext()) {
			System.out.println("요소존재");
			value=ita.next();
			System.out.println(value);
			//3. 요소가 존재한다면 값을 얻고, 포인터를 다음으로 이동시킨다.
			
		}//end while
		
		
		
		//5. 삭제 
		set.remove("JDBC"); //특정 방의 값 삭제
		set.clear(); //모든 방의 값을 삭제
		
		System.out.println(set.isEmpty()); 
		
		System.out.println(set);
		System.out.println("------------복사된 값---------------");
		for(int i=0;i<copy.length;i++) {
			System.out.println(copy[i]);
		}//end for
		
		
	}//UseSet

	
	/**
	 * Set의 중복값 저장 여부
	 */
	public void dupVal() {
		//1.생성
		Set<TestVO> set = new HashSet<TestVO>();
		//2.값 할당 -> set이 일차적으로 저장한 값은 중복값을 저장하지 않는다.
		set.add(new TestVO("정시헌",25)); //new로 생성된 객체의 주소가 다르므로
		set.add(new TestVO("정인선",24));
		set.add(new TestVO("장정우",24));
		set.add(new TestVO("정시헌",25));//이전의 같은 값을 가진다 해도 입력이된다. 
		//왜냐, 객체의 주소가 저장된것이기 때문에 중복이 아니다.
		
		TestVO tv=new TestVO("전민정",26);
		set.add(tv); //하나의 주소가 여러 번 입력되면 추가되지 않는다.
		set.add(tv); //주소가 같은 애들이니 중복값이 허용되지 않는다.
		
		System.out.println(set);
	}//dupValue
	
	
	
	
	
	public static void main(String[] args) {
		UseSet us = new UseSet();
		System.out.println("-------------중복값의 처리--------------");
		us.dupVal();
		
		
	}//main

}//class
