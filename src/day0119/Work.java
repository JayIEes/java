package day0119;

/**
 * @author user
 * ����, ������ �빮��, ������ �ҹ��ڷ� ������ �ӽ� ��й�ȣ�� 8�ڷ� �����Ͽ� char[]�� 
   ��ȯ�ϴ� method�� �����. (������ 8�ڸ� �߻����� �迭�� ������ ���� ��ȯ)
  
   ���� method�� ȣ���Ͽ� ��ȯ�� char[] �� ���� �����Ͽ� ����غ�����.

 */
public class Work {
	public static final int UPPER_CASE=0;
	public static final int LOWER_CASE=1;
	public static final int NUMBER=2;

	/**
	 * �ӽ� ��й�ȣ�� �����ϴ� ��
	 * @return
	 */
	public char[] tempPassword() {
		char[] temp = new char[8];

		int flag=0;
		for(int i=0; i<temp.length;i++) {
			flag=(int)(Math.random()*3); 
			switch(flag) {
			case UPPER_CASE: temp[i]=(char)((Math.random()*26)+65); break;
			case LOWER_CASE: temp[i]=(char)((Math.random()*26)+65); break;
			case NUMBER:temp[i]=(char)((Math.random()*10)+48); break;
			}
		}//end for
		
		return temp;
	}//tempPassword 1�� ° ���
	
	
	public char[] tempPassword2() {
		char[] temp = new char[8];

		int tempNum=0;
		for(int i=0; i<temp.length;) {
			tempNum=(int)(Math.random()*123);
			if( (tempNum>47&&tempNum<58) || (tempNum>64&&tempNum<91) || (tempNum>96&&tempNum<123) ) {
				temp[i]=(char)tempNum;
				i++;
			}//end if
		}//end for
		
		return temp;
	}//tempPassword2
	
	

	public char[] tempPassword3() {
		char[] temp = new char[8];
		
		String passwordSet="111123456789qwertyuiopasdfghjklzzzzxcvbnm";
		
		int passSetSize=passwordSet.length();
		for(int i =0;i<temp.length;i++) {
			temp[i]=passwordSet.charAt((int)(Math.random()*passSetSize));
		}
				
		
		return temp;
	}//tempPassword3
	
	
	/**
	 * ��й�ȣ�� ����ϴ� ��
	 */
	public void printPassword(char[] tempPass) {
		System.out.println(tempPass); //char�迭�� �״�� ��µȴ�.
	}//printPassword
	
	
	
	
	public static void main(String[] args) {

		Work work=new Work();
		char[] temp=work.tempPassword3();
		work.printPassword(temp);
		
		
		
		
	}//main

}
