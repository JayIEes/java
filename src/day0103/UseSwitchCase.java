package day0103;

/**
 * switch~case�� ��� 
 * @author user

 */
public class UseSwitchCase {

	public static void main(String[] args) {
		//1.��������
		int i=30;
		
		switch(i) {//Ÿ��=>ã��=>�귯���� �̰� �⺻
		case 0 : System.out.println("0�� ���");
		case 1 : System.out.println("1�� ���");
		case 2 : System.out.println("2�� ���");
		case 3 : System.out.println("3�� ���");
		default : System.out.println("����� ���� ���");
		}//end switch
		
		
		//switch�� ������� �ԷµǴ� ������ ���������� ����� �� �ִ�.
		int j ='A'; //byte, short,int, long,char 
		
		switch (j) { //���ڰ� �� ���
		case 'A':System.out.println("����"); 
	//	case 65 : System.out.println("����");//���ڸ� case�� ����ϵ��� �ƴϸ� unicode���� ����ϴ��� �� �� �ϳ�
		case 1 : 
		}//end switch
		
		
		//JDK1.7�������ʹ� ���ڿ��� ���� �� �ִ�.
		String str="������";
		switch(str) {
		
		}//end switch
		
		//////////////////////////////////////////break ���////////////////////////////////////////
		i=1;
		switch(i) {
		case 0 : System.out.println("A");
		case 1 : System.out.println("B"); break; //switch�� ��������
		case 2 : System.out.println("C");
		case 3 : System.out.println("D"); break;
		default: System.out.println("E");
		}
		
		
		
		
	}//main

}//class
