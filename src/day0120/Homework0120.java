package day0120;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Homework0120 {
	//���� 1.
	public String countryDate(int localeNum) {
		
		Locale locale=Locale.KOREA;
		
			switch(localeNum) {
			case 1: locale=Locale.US; break;
			case 2: locale=Locale.CHINA; break;
			case 3: locale=Locale.JAPAN; break;
			case 4: locale=Locale.UK; break;
			default :locale=Locale.KOREA; 
			}//
			
		
		Date date=new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("MM-dd-yyyy EEEE HH:mm",locale);
		
		return sdf.format(date);
	}//countryDate
	
	
	
	
	//���� 2
	public String resultDayOfWeek(DateClass date) {
		Calendar cal=Calendar.getInstance();
		date.setYear(2022);
		date.setMonth(1);
		date.setDay(25);
		
		cal.set(date.getYear(),date.getMonth()-1,date.getDay());  //2���� �ڹ����״� 1��
		
		String[] sArr= "��,��,ȭ,��,��,��,��".split(",");
		System.out.println(cal.get(Calendar.YEAR)+"-"+(cal.get(Calendar.MONTH)+1)+
				"-"+cal.get(Calendar.DAY_OF_MONTH));
		
		return sArr[cal.get(Calendar.DAY_OF_WEEK)-1]+"����";
	}//resultDayOfWeek
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Homework0120 hw0120=new Homework0120();
		System.out.println(hw0120.countryDate(2));
		
		DateClass dc =new DateClass();
		System.out.println(hw0120.resultDayOfWeek(dc));
		
	}//main

}//class


	class DateClass{
		
		private int year; //instance����
		private int month;
		private int day;
		
		//instance ������ private���� �����Ͻð�, getter method�� setter method�� ȣ���ؼ� ����� ������.
		
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public int getMonth() {
			return month;
		}
		public void setMonth(int month) {
			this.month = month;
		}
		public int getDay() {
			return day;
		}
		public void setDay(int day) {
			this.day = day;
		}
	
	}//class
