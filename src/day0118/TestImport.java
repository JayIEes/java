package day0118;

import java.util.ArrayList;
import java.util.List;
//import java.awt.List; //패키지는 다르고 이름이 같다면 둘 중 하나만 import받을 수 있다.

import day0105.Modifiers;

//import day0105.*; //권장 안함

/**
 * @author user
 * 다른 패키지의 클래스를 참조하여 사용할 때
 */
public class TestImport {

	public static void main(String[] args) {
		//day0105에 존재하는 Modifiers라는 클래스를 사용
		Modifiers m = new Modifiers();
		//java에서 제작 배포하는 패키지 사용
		List list = new ArrayList();
		java.awt.List test=null; //full path
		
		
		
		
	}//main

}//class
