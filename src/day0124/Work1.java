package day0124;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author user
 * �ָ��� �ش��ϴ� ���� �̱�
 * ���� 01/25
 */
public class Work1 {
	
	
	/**
	 * �Է��� �⵵�� ������ ���ϴ� ��
	 * @param year
	 */
	public Map<String,List<Integer>> weekend(int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year); //�Է¹��� year�� ����
		
		Map<String, List<Integer>> map = new HashMap<String, List<Integer>>(); // Map
		
//		int day = Calendar.DAY_OF_MONTH;//����� ������ �����ؼ� ������ �� ����.
//		int dayOfWeek=Calendar.DAY_OF_WEEK;
		
		List<Integer> list=null; //�ν��Ͻ� ������ �ö󰡸� ��� ����ϴ� �Ȱ͸� �ö󰡾��� �״ϱ� ����� �;���, �ʱ�ȭ! ���������ϱ�
		int lastDay=0;
		
		for (int i = 0; i < 12; i++) {
			list = new ArrayList<Integer>(); //������ ���� �� List����
			cal.set(Calendar.MONTH, i); //0��~11���� ����
			System.out.println(i+" "+cal.getActualMaximum(Calendar.DATE));
			lastDay=cal.getActualMaximum(Calendar.DATE)+1;//������ ���� ������ �� ���
			
			for (int j = 1; j <lastDay; j++) {
				cal.set(Calendar.DAY_OF_MONTH, j); //���� ���� 
				
				switch(cal.get(Calendar.DAY_OF_WEEK)) { //������ ������ ���� ��
					case Calendar.SUNDAY: /* list.add(cal.get(day)); break; */
				 	case Calendar.SATURDAY: list.add(j); break; //1, 7�̶�� ��������, constant�� ����..
				 }//end switch
				map.put(String.valueOf(i+1), list);
			} // end for
			
			//���� �����ϱ� ���� ��� ���� �����ϴ� �Ϸ� �ʱ�ȭ
			cal.set(Calendar.DAY_OF_MONTH, 1);
			
//			System.out.println(year+"�� "+(i+1)+"�� �ָ�, "+map.get(i+1)); //���� �и��� ��Ű��. �޼ҵ� �ϳ��� �ϳ��� ��
		} // end for
//		System.out.println(map.get(12));
		return map;
	}// weekend

	
	/**
	 * map�� �޾Ƽ� ����ϴ� ��
	 */
	public void printWeekend(Map<String,List<Integer>> map,int year) {
		System.out.println(year+"�� ���� ����");
		for(int i=1; i<13;i++) {
			System.out.println((i)+"�� �ָ�,"+map.get(String.valueOf(i)));
		}
	}
	
	
	public static void main(String[] args) {

		Work1 w1 = new Work1();
		int year=2022;
		w1.printWeekend(w1.weekend(year),year);

	}// main

}//class
