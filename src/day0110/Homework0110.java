package day0110;

public class Homework0110 {


	/**
	 * �̸����� ��ȿ�� ���� �޼ҵ�
	 * @param email
	 * @return
	 */
	public boolean eMail(String email) {
		//return �� ���;��Ѵٸ� ���� �������ٿ� �ѹ��� �������� �ڵ����ּ���.
		boolean flag=false;
		int atIndex=email.indexOf("@");
		int dotIndex=email.indexOf(".");
		if((email.length() >= 5) && ((atIndex!=-1) &&
				(dotIndex!=-1)) && ( atIndex < dotIndex)) {
				flag=true;
		}
		return flag;
	}//eMail
	//////�� ���� if���� return���̿� boolean�� �ƴ϶�� ���ñ�?????? ���� �ʿ� 2022.01.10
	
	
	
	
	
	/**
	 * ���ڿ� �Է� �޾� ��¿ ��¿ ���� �����ϸ� mz���� �ƴϸ� ���� ���� ��ȯ�ϴ� �޼ҵ�
	 * @param str
	 * @return
	 */
	
	public String generation(String str) {
		
		String txt = "��������";
		if( (str.indexOf("��¿")!=-1)|| (str.indexOf("��¿")!=-1) || (str.indexOf("����")!=-1) ){
			txt= "MZ����";
		}

		return txt;
	}//generation
	
	
	
	
	
	
	public static void main(String[] args) {
		

		Homework0110 str = new Homework0110();
		String email = "asdfg3874@naver.com";
		System.out.println(str.eMail(email));
		

		System.out.println(str.generation("��¿Ƽ��"));
		
		
	}//main

}//class
