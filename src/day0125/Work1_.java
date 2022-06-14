package day0125;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author user
 * 주말에 해달하는 일자 뽑기
 * 숙제 01/25
 */
public class Work1_ {
	
	private List<Integer> list;
	
	public void weekend(int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year); //입력받은 year로 변경
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>(); // Map
		
		int day = Calendar.DAY_OF_MONTH;
		int dayOfWeek=Calendar.DAY_OF_WEEK;
		
		
		for (int i = 0; i < 12; i++) {
			list = new ArrayList<Integer>(); //List
			cal.set(Calendar.MONTH, i);
			
			for (int j = 1; j <= cal.getActualMaximum(Calendar.DATE); j++) {
				cal.set(day, j);
				
				switch(cal.get(dayOfWeek)) {
				case Calendar.SUNDAY:list.add(cal.get(day)); break; 
				 	case Calendar.SATURDAY: list.add(cal.get(day)); break; //1, 7이라고 쓰지말고, constant로 쓰기..
				 }//end switch
				map.put(i+1, list);
			} // end for
			System.out.println(year+"년 "+(i+1)+"월 주말, "+map.get(i+1));
		} // end for
//		System.out.println(map.get(12));
	}// weekend

	
	
	public static void main(String[] args) {

		Work1_ w1 = new Work1_();
		w1.weekend(2022);

	}// main

}//class
