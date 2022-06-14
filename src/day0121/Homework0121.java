package day0121;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * @author user
 * 다른 사람 코드
 */
public class Homework0121 {
	int cnt;
	public static final int START_DAY=1; //월에 시작하는 일
	
	
	public void password() {
		String passwordSet = "`1234567890-=qwertyuiop[]asdfghjkl;’zxcvbnm,./QWERTYUIOASDFGHJKLZXCVBNM";
		int ran = (int)(Math.random()*6)+7, ranPass;

		List<String> passList=new ArrayList<String>();

		for(int i=0; i<ran; i++) {
			ranPass=(int)(Math.random()*passwordSet.length());
			passList.add(i, passwordSet.substring(ranPass,ranPass+1));
			System.out.print(passList.get(i));
		}
		System.out.println();
	}//password
	
	
	
	//달력
	public void realCalendar(int year, int month) {
		Calendar cal = Calendar.getInstance(); //시스템의 현재 날짜 정보
		String[] weekDay = "일,월,화,수,목,금,토".split(",");
//		cal.set(year, month-1,1);  
		//입력되는 년과 월에 해당하는 날짜를 출력하기 위해 입력되는 년과 월로 cal객체를 설정.
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		//사용자가 보고싶은 년, 월로 설정
		
//		int lastDate = cal.getActualMaximum(Calendar.DATE);
//		int weekday = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.printf("------------------%d년 %d월 달력------------------------\n", year,month);
		for(String week : weekDay) {
			System.out.print(week+"\t");
		}
		System.out.println();

		int dayOfWeek=cal.get(Calendar.DAY_OF_WEEK);//요일
		for(int tempDay=1; ;tempDay++) { //1일로부터 시작하고 끝일은 알 수 없음.
			cal.set(Calendar.DAY_OF_MONTH,tempDay);//증가하는 임시 날짜로 달력의 '일' 설정
			if(tempDay!=cal.get(Calendar.DAY_OF_MONTH)){ 
				//증가하는 날짜와 달력에서 얻어온 일자가 다르면 끝 일이므로 반복을 빠져나간다.
				break; 
			}//end if
			switch(tempDay) {//1일을 출력하기 전에 공백 넣기
			case START_DAY: 
				for(int blank=1 ; blank<dayOfWeek;blank++) {
					System.out.print("\t"); ///1일의 요일에 맞게 공백을 넣는다.
				}//end for
			}//end switch
			System.out.printf("%d\t",tempDay);//일 출력
			
			switch(dayOfWeek) {//임시일자로 설정된 날의 요일을 얻고
			case Calendar.SATURDAY: System.out.println();//토요일이면 줄을 변경 7말고 Calendar.SATURDAY 써라
			} //end switch
		}//end for
		
		
		
//		for(int i=1; i<=lastDate;i++) {
//			if(i==1) {
//				for(int j=1; j<weekday;j++) {
//					System.out.print("\t");
//				}
//			}
//			System.out.print(i+"\t");
//			if(weekday%7==0) {
//				System.out.println();
//			}
//			weekday++;
//		}
//		System.out.println();
	}//realCalendar
	

	public List<String> randomPerson() {
		String[] students = {"강명준","강산","강현모","권용현","김예진","김의정","김정하","김진영","김현우"};
		int imsi = (int)(Math.random()*10)+10, stu;
		List<String> stuList = new ArrayList<String>();

		for(int i=0; i<imsi; i++) {
			stu  = (Math.abs(new Random().nextInt())%students.length);
			stuList.add(students[stu]);
		}
		return stuList;
	}//randomPerson
	

	public void sameStudent() {
		List<String> stulist = randomPerson();
		List<Integer> sameStuList = new ArrayList<Integer>();
		System.out.println(stulist);
		for(int i=0; i<stulist.size();i++) {
			for(int j=0; j<i; j++) {
				if(stulist.get(i).equals(stulist.get(j))){
					cnt++;
				}
			}
			sameStuList.add(cnt);
			System.out.println(stulist.get(i)+" 반복횟수: "+ sameStuList.get(i));			
			cnt=0;
		}		
	}//sameStudent
		
	
	public static void main(String[] args) {
		Homework0121 hw = new Homework0121();

		System.out.println("-------------임시 비밀번호----------------");
		hw.password();
		
		hw.realCalendar(2022,1);
		System.out.println("-------------학생들 목록----------------");
		for(String students : hw.randomPerson()) {
			System.out.print(students+" ");
		}
		System.out.println();
		
		System.out.println("-------------중복 학생 수----------------");
		//hw.sameStudent();
		List<String> stulist = hw.randomPerson();
		Set<String> set = new HashSet<String>(stulist);
		System.out.println(stulist);
		for(String stu: set) {
			System.out.println(stu +" 중복횟수: "+Collections.frequency(stulist, stu)+"번");
		}

		

		
	}//main
}//class


