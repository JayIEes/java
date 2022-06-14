package day0121;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

/**
 * @author user �޷���� ����
 */
public class Work {

	
//���� 1. �޷� ���
	public void calendarPrint() {

		Calendar cal = Calendar.getInstance();
		String[] calendarDay= "��,��,ȭ,��,��,��,��".split(",");
		//�Ͽ�ȭ������� ���
		for(int i=0; i<calendarDay.length;i++){
			System.out.printf("%4s",calendarDay[i]);
		}
		System.out.println();
		System.out.println("--------------------------------");
		
			
		for (int i = 1; i <= cal.getActualMaximum(Calendar.DATE); i++) {
			cal.set(Calendar.DAY_OF_MONTH, i); 
			//cal.DAY_OF_MONTH Constant�� ����Ҷ����� Constant�� Ư����ü�� ���ش� ���� �ƴϱ⶧���� Ŭ������.Constant������ ����ϼž��ؿ�
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

	
	
	
//���� 2. ������ ���� 6~13�� 
	public List<Character> randomLetters() { //1. List ���ٴ� Generic�� ������ּ���. 2. method���� �ҹ��ڷ� �������ּ���;

		String str = "`1234567890-=qwertyuiop[]asdfghjkl;��zxcvbnm,./QWERTYUIOASDFGHJKLZXCVBNM";
		Random ran = new Random();
		List<Character> list = new ArrayList<Character>();

		int num = ran.nextInt(8) + 6;
		for (int i = 0; i < num; i++) {
			list.add(str.charAt(ran.nextInt(str.length() - 1)));
		} // end for
		return list;
	}// RandomLetters

	
	
	//������ ���� List ��� �޼ҵ�
	public void printRandomLetters() { 
		List<Character> l = randomLetters();
		System.out.println(l.size());

		for (int i = 0; i < l.size(); i++) {
			System.out.print(l.get(i));
		}
	}// printRandomLetters

	
	
	
//���� 3. �̸� ���� ���

	public List<String> name() { 
		String name = "������,����,������,�ǿ���,�迹��,������,������,������,������";
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

	
	//�̸� ��� �޼ҵ�
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
