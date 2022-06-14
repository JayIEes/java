package day0121;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

/**
 * @author user 달력출력 숙제
 */
public class Work {

	
//숙제 1. 달력 출력
	public void calendarPrint() {

		Calendar cal = Calendar.getInstance();
		String[] calendarDay= "일,월,화,수,목,금,토".split(",");
		//일월화수목금토 출력
		for(int i=0; i<calendarDay.length;i++){
			System.out.printf("%4s",calendarDay[i]);
		}
		System.out.println();
		System.out.println("--------------------------------");
		
			
		for (int i = 1; i <= cal.getActualMaximum(Calendar.DATE); i++) {
			cal.set(Calendar.DAY_OF_MONTH, i); 
			//cal.DAY_OF_MONTH Constant를 사용할때에는 Constant는 특정객체어 속해는 것이 아니기때문에 클래스명.Constant명으로 사용하셔야해요
			switch (i) {
			case 1:
				System.out.printf("%d\n", cal.get(Calendar.DAY_OF_MONTH));
				break;
			default:
				System.out.print(cal.get(Calendar.DAY_OF_MONTH));
				if (cal.get(Calendar.DAY_OF_WEEK) == 7) {
					System.out.println();
				}//end if
			}// end switch
		} // end for
	}// calendarPrint

	
	
	
//숙제 2. 임의의 숫자 6~13자 
	public List<Character> randomLetters() { //1. List 보다는 Generic를 사용해주세요. 2. method명은 소문자로 시작해주세요;

		String str = "`1234567890-=qwertyuiop[]asdfghjkl;’zxcvbnm,./QWERTYUIOASDFGHJKLZXCVBNM";
		Random ran = new Random();
		List<Character> list = new ArrayList<Character>();

		int num = ran.nextInt(8) + 6;
		for (int i = 0; i < num; i++) {
			list.add(str.charAt(ran.nextInt(str.length() - 1)));
		} // end for
		return list;
	}// RandomLetters

	
	
	//임의의 문자 List 출력 메소드
	public void printRandomLetters() { 
		List<Character> l = randomLetters();
		System.out.println(l.size());

		for (int i = 0; i < l.size(); i++) {
			System.out.print(l.get(i));
		}
	}// printRandomLetters

	
	
	
//숙제 3. 이름 랜덤 출력

	public List<String> name() { 
		String name = "강명준,강산,강현모,권용현,김예진,김의정,김정하,김진영,김현우";
		String[] nameArr = name.split(",");

		Random ran = new Random();
		int randomNum = ran.nextInt(11) + 10;

		List<String> list = new ArrayList<String>();
		for (int i = 0; i < randomNum; i++) {
			list.add(nameArr[ran.nextInt(nameArr.length)]);
		} // end for

		System.out.println(list.size());
		return list;
	}// name

	
	//이름 출력 메소드
	public void printName() { 

		for (String sList : name()) {
			System.out.print(sList+" ");
		} // end for
	}//printName
	
	
	

	public static void main(String[] args) {
		Work w = new Work();
		w.calendarPrint();
		System.out.println();
		System.out.println("=======================================");
		w.printRandomLetters();
		System.out.println();
		System.out.println("=======================================");	
		w.printName();
	}// main

}// class
