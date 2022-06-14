package day0111;

public class Homework0111 {
	
	String identification;//�ν��Ͻ� ������ �ڵ��ʱ�ȭ�� �Ǽ� �Ϻη� �ʱ�ȭ�� �ʿ�� �����.(���������� �ʱ�ȭ���ּ���) ���ϼ̽��ϴ�.
	//�ٸ� str�� �����ϰ� �ִ� ���� �ֹε�Ϲ�ȣ�̴� �� ����뵵�� �°� �������� �ٲ��ֽø� �� ���� �� ���ƿ�.
	
	public Homework0111(String num) {//������
	 //�Է� �ֹι�ȣ�� �ν��Ͻ� ������ �����ϰ� �� ����� ���� ����ϴ� �ڵ�� ������ ������
		identification= num;
		//���ڵ�� main method���� ȣ���ϴ� ������ �ڵ带�����غ�����
	}//������		
		
	

	public boolean leng() { //2��. 14�ڸ� Ȯ�� method
		return identification.length()==14;
	} //leng
		
	
	public boolean hyphen() {//3��. '-' �ùٸ� ��ġ method
		return identification.indexOf("-")==6; 
	}//hyphen
	
	
	public String sentence() {//4��. ������� ���ڿ� ��ȯ method
		
		String month = identification.substring(2,4);
		String day = identification.substring(4,6);
		
		
		if(month.charAt(0)==0) {
			month=month.substring(1);
		}
		
		
		if(day.charAt(0)==0) {
			day=day.substring(1);
		}
		
		return month(identification)+"�� "+month+"�� "+day+"��";
	}//sentence
	
	
	public String month(String num) {//���� �����ִ� method
		String birth1 =num.substring(0,2);
		char birth2 = num.charAt(7);
		
			if( (birth2=='0') || (birth2=='9')) { // ����
				birth1 = "18"+birth1;
			}else if( (birth2=='1') || (birth2=='2') 
					|| (birth2=='5') || (birth2=='6')) {
				birth1 = "19"+birth1;
			}else {
				birth1 = "20"+birth1;
		}//end if
		return birth1;
	}
	
	
	public int age() { //5��. ���̱��ϱ� method
		int birth = Integer.parseInt(month(identification));
		return (2022-birth)+1;
	}//age

		
	
	public String sex() { //6��. �������ϱ� method
		String s = "��";
		
		if(identification.charAt(7)%2==0) {
			s="��";
		}
		return s;
	}//sex
		
		
	
	public String thee() {
		int birth = Integer.parseInt(month(identification));
		String t = "";
	
//		switch(birth%12) {
//		case 0: t="������"; break;
//		case 1: t="��"; break;
//		case 2:	t="��";break;
//		case 3:	t="����";break;
//		case 4:	t="��";break;
//		case 5:	t="��";break;
//		case 6:	t="ȣ����";break;
//		case 7:	t="�䳢";break;
//		case 8:	t="��";break;
//		case 9:	t="��";break;
//		case 10: t="��";break;
//		case 11: t="��";
//		}
		
		String[] theeArr= {"������", "��", "��", "����", "��", "��", "ȣ����", "�䳢", "��", "��", "��", "��"};
		return theeArr[birth%12];
	}//thee
	
	
	
	
	
	public static void main(String[] args) {

		Homework0111 num = new Homework0111("010114-4655454");
		
		if(num.leng()) {
			if(num.hyphen()) {
				System.out.println("�Է��ֹι�ȣ: "+num.identification );
				System.out.println("�������: "+num.sentence());
				System.out.println("����: "+num.age());
				System.out.println("����: "+num.sex());
				System.out.println("��: "+num.thee());
			}else {
				System.out.println("'-'�� �������� ��ġ�� �����ϴ�.");
			}
		}else {
			System.out.println("�ֹι�ȣ�� ���� ���� ���� �ʽ��ϴ�.");
		}		
		
		
		
		
		
	}//main

}//class
