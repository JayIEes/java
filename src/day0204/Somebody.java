package day0204;

import java.util.Random;

/**
 * @author user
 * Somebody Ŭ����
 */
public class Somebody {

	public String walk() throws TobaccoException {
		String result="";
		
		String[] studentGrade= {"�ʵ�", "�ߵ�","���","���"};
		
		int tempFlag=new Random().nextInt(studentGrade.length );
		switch(tempFlag){
		case 0: //�ʵ��� ��踦 �ǿ�� ��Ȳ
			throw new TobaccoException("�ʵ� ���� �ǰ��� �طӽ��ϴ�.");
//			throw new TobaccoException();
		}//end switch
		
		result=studentGrade[tempFlag]+"�� ���� ��ô ������('' )( '')";
		
		return result;
	}
	
	
	
	public static void main(String[] args) {
		Somebody sb= new Somebody();
		try {
			String result=sb.walk();
			System.out.println("�������� ����: "+result);
		}catch(Exception e) {
			System.err.println("���������� ����: "+e);
			e.printStackTrace();
		}
	}//main

}
