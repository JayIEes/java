package day0120;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.print.attribute.standard.JobHoldUntil;

/**
 * Calendar: �������� ��¥ ������ ���� �� ����ϴ� Ŭ����
 * @author user
 */
public class UseCalendar {

	public UseCalendar() {
		
//		Calendar cal=new Calendar(); //�߻�Ŭ�����̹Ƿ� ��üȭ �Ұ���
		
		//is a ������ ��üȭ
		Calendar cal= new GregorianCalendar();
		
		//�ڽ�Ŭ������ ����� ��üȭ
		GregorianCalendar gc=new GregorianCalendar();
		
		//static method���
		Calendar cal2=Calendar.getInstance();
		
		
		System.out.println("cal:"+cal);
		System.out.println("gc:"+gc);
		System.out.println("cal2:"+cal2);
		
		System.out.println(cal2.get(Calendar.YEAR)+"/"+Calendar.YEAR);
	
		System.out.println("-------------------------------------");
		int year=cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH)+1; //MONTH�� 0�� ���� ������ ������
		int day=cal.get(Calendar.DAY_OF_MONTH);
		//�� �� �� �̷��� �� �� �������� �ڵ����� ���� ������ Date�� Simple~���°� ����
		
		int amPm=cal.get(Calendar.AM_PM); //0-���� / 1-����
		int week=cal.get(Calendar.DAY_OF_WEEK); //1-��/2-��/3-ȭ
		//������ ���ڰ� �ƴ� ���ڿ��� ���
//		String stringWeek="";
		String[] weekText="��,��,ȭ,��,��,��,��".split(",");
//		switch(week){
//		case Calendar.SATURDAY: stringWeek="�����"; break; //���ڷ� CASE 0 �̰ͺ��� ����� �Ἥ ������ ���!
//		case Calendar.SUNDAY: stringWeek="�Ͽ���"; break;
//		case Calendar.MONDAY : stringWeek="������"; break; 
//		case Calendar.TUESDAY: stringWeek="ȭ����"; break; 
//		case Calendar.WEDNESDAY: stringWeek="������"; break; 
//		case Calendar.THURSDAY: stringWeek="�����"; break; 
//		case Calendar.FRIDAY: stringWeek="�ݿ���"; break; 
//		}
		
		int dayOfYear=cal.get(Calendar.DAY_OF_YEAR);
		
		int hour=cal.get(Calendar.HOUR);//12�ð���
		int hourOfDay=cal.get(Calendar.HOUR_OF_DAY);//24�ð���
		int min=cal.get(Calendar.MINUTE);
		int second=cal.get(Calendar.SECOND);
		int maximum=cal.getActualMaximum(Calendar.DATE);
		
		System.out.println(year+"-"+month+"-"+day+" "+(amPm==Calendar.AM?"����":"����")+
				" "+ weekText[week-1]+"���� "+dayOfYear+" "+hour+"("+hourOfDay+"):"+
				min+":"+second);
		System.out.println("������ �� : "+maximum);
		
		System.out.println("-----------------------------");
		
		Calendar cal4=Calendar.getInstance();
		//�� ����
		cal4.set(Calendar.YEAR, 2021);
		//�� ���� (����� �����ϴ� ������ 1����)
		cal4.set(Calendar.MONTH, 2);
		//�� ����
		cal4.set(Calendar.DAY_OF_MONTH, 1);
		//���� ���� ���� ��¥�� �����Ǹ� �ڵ����� ������ 1�Ϸ� �����ȴ�.
//		cal4.set(Calendar.DAY_OF_MONTH, 32);//
		cal4.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
		
		
		System.out.println((cal4.get(Calendar.YEAR))+"-"+(cal4.get(Calendar.MONTH)+1)+"-"+
				(cal4.get(Calendar.DAY_OF_MONTH))+"-"+(weekText[cal4.get(Calendar.DAY_OF_WEEK)-1]));
		
		
	}//UseCalendar
	
	
	
	
	public static void main(String[] args) {
		new UseCalendar();
		
		
		
	}//main

}
