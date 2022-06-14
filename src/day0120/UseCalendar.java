package day0120;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.print.attribute.standard.JobHoldUntil;

/**
 * Calendar: 개별적인 날짜 정보를 얻을 때 사용하는 클래스
 * @author user
 */
public class UseCalendar {

	public UseCalendar() {
		
//		Calendar cal=new Calendar(); //추상클래스이므로 객체화 불가능
		
		//is a 관계의 객체화
		Calendar cal= new GregorianCalendar();
		
		//자식클래스를 사용한 객체화
		GregorianCalendar gc=new GregorianCalendar();
		
		//static method사용
		Calendar cal2=Calendar.getInstance();
		
		
		System.out.println("cal:"+cal);
		System.out.println("gc:"+gc);
		System.out.println("cal2:"+cal2);
		
		System.out.println(cal2.get(Calendar.YEAR)+"/"+Calendar.YEAR);
	
		System.out.println("-------------------------------------");
		int year=cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH)+1; //MONTH는 0월 부터 나오기 때문에
		int day=cal.get(Calendar.DAY_OF_MONTH);
		//년 월 일 이렇게 막 다 얻으려면 코딩양이 많기 때문에 Date와 Simple~쓰는게 낫다
		
		int amPm=cal.get(Calendar.AM_PM); //0-오전 / 1-오후
		int week=cal.get(Calendar.DAY_OF_WEEK); //1-일/2-월/3-화
		//요일을 숫자가 아닌 문자열로 출력
//		String stringWeek="";
		String[] weekText="일,월,화,수,목,금,토".split(",");
//		switch(week){
//		case Calendar.SATURDAY: stringWeek="토요일"; break; //숫자로 CASE 0 이것보단 상수를 써서 가독성 향상!
//		case Calendar.SUNDAY: stringWeek="일요일"; break;
//		case Calendar.MONDAY : stringWeek="월요일"; break; 
//		case Calendar.TUESDAY: stringWeek="화요일"; break; 
//		case Calendar.WEDNESDAY: stringWeek="수요일"; break; 
//		case Calendar.THURSDAY: stringWeek="목요일"; break; 
//		case Calendar.FRIDAY: stringWeek="금요일"; break; 
//		}
		
		int dayOfYear=cal.get(Calendar.DAY_OF_YEAR);
		
		int hour=cal.get(Calendar.HOUR);//12시간제
		int hourOfDay=cal.get(Calendar.HOUR_OF_DAY);//24시간제
		int min=cal.get(Calendar.MINUTE);
		int second=cal.get(Calendar.SECOND);
		int maximum=cal.getActualMaximum(Calendar.DATE);
		
		System.out.println(year+"-"+month+"-"+day+" "+(amPm==Calendar.AM?"오전":"오후")+
				" "+ weekText[week-1]+"요일 "+dayOfYear+" "+hour+"("+hourOfDay+"):"+
				min+":"+second);
		System.out.println("마지막 날 : "+maximum);
		
		System.out.println("-----------------------------");
		
		Calendar cal4=Calendar.getInstance();
		//년 변경
		cal4.set(Calendar.YEAR, 2021);
		//월 변경 (사람이 생각하는 월보다 1적게)
		cal4.set(Calendar.MONTH, 2);
		//일 변경
		cal4.set(Calendar.DAY_OF_MONTH, 1);
		//현재 월에 없는 날짜가 설정되면 자동으로 다음달 1일로 설정된다.
//		cal4.set(Calendar.DAY_OF_MONTH, 32);//
		cal4.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
		
		
		System.out.println((cal4.get(Calendar.YEAR))+"-"+(cal4.get(Calendar.MONTH)+1)+"-"+
				(cal4.get(Calendar.DAY_OF_MONTH))+"-"+(weekText[cal4.get(Calendar.DAY_OF_WEEK)-1]));
		
		
	}//UseCalendar
	
	
	
	
	public static void main(String[] args) {
		new UseCalendar();
		
		
		
	}//main

}
