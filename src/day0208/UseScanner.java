package day0208;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Scanner;

public class UseScanner {
	
	public UseScanner() throws IOException {
		
		System.out.println("����� ���̸� �Է����ּ���");
	//���̸� �Է��ϸ� �¾ �ظ� ���Ͽ� ���
		
		////////////Scanner�� ���� �ʾ��� ��//////////////////////////
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		String value=br.readLine();
//		
//		try {
//			int age= Integer.parseInt(value);
//			Calendar cal=Calendar.getInstance();
//			System.out.println("�¾ �ش�"+(cal.get(Calendar.YEAR)-age+1));
//		}catch(NumberFormatException nfe){
//			System.out.println("���̴� �����Դϴ�.");
//		}//end catch
		
		
		/////////////Scanner�� ���� ��/////////////////////////
		Scanner scan=new Scanner(System.in);
		int age=scan.nextInt(); //���ϴ� ������������ �Է¹��� �� �ִ�. util�� ScannerŬ���� �޼ҵ�
		Calendar cal=Calendar.getInstance();
		System.out.println("�¾ �ش�"+(cal.get(Calendar.YEAR)-age+1));
		
		
		
	}//UseSacnner
	

	public static void main(String[] args) {

		try {
			new UseScanner();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}//main

}//class
