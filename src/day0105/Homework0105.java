package day0105;

public class Homework0105 {

	public void age(int a){ //age�޼ҵ� - No.1���� ���ϱ�
		int year = 2022; 
		System.out.println("����� ���̴� "+((year-a)+1)+"���Դϴ�.");
	}
	
	
	public void range(int b) { //range�޼ҵ� - No.2 ���� ��
		if( (b>64&&b<91) || (b>96&&b<123) || (b>47&&b<58) ) {
			System.out.println("�Է��Ͻ� ������ " +(char)b+"�� �ش��մϴ�");
		}else {
			System.out.println(b+"�� �빮��, �ҹ���, ���ڿ� �ش����� �ʽ��ϴ�.");
			}
	}
	
	
	
	
	
	public static void main(String[] args) {

		//No.1
		int birth = 2001;
		Homework0105 h = new Homework0105(); //age()method�� ���� ���� ��üȭ
		h.age(birth); // age�޼ҵ� ȣ��
		
		
		
		//No.2
		int num =59;
		Homework0105 hw = new Homework0105(); 
		hw.range(num);
		
		
	}//main

}//class
