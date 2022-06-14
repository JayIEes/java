package day0103;

/**
 * switch~case ���
 * @author user
 */
public class UseSwitchCase2 {

	public static final int ZERO=0; //constant
	public static final int ONE=1; //constant
	public static final int TWO=2; //constant --������ ���!
	
	//���� �񱳿� constant
	public static final int GRADE_A_PLUS=10;
	public static final int GRADE_A=9;
	public static final int GRADE_B=8;
	public static final int GRADE_C=7;
	public static final int GRADE_D=6;

	
	public static void main(String[] args) {
		int i=0;
		int j=0;
		switch(i) { // �Է� ���� ���� 0�̸� zero�� 1-one 2-two �� �� others�� ���
		case ZERO:System.out.println("zero"); break;
		case ONE:System.out.println("one"); break;
		case TWO:System.out.println("two"); break;
		default:System.out.println("others"); //default �ڿ��� break�� ������� �ʾƵ� ����� ������ ���⶧���� ���� ����
		}//end switch
		
		
		//main method�� arguments�� �޾� ���
		//������ �Է¹޾Ƽ� ������ �ش��ϴ� ���� ���
		int score=Integer.parseInt(args[0]);
		System.out.print(score+"���� ������ ");
		
//		char grade=' ';
//		switch(score/10) {
//		case GRADE_A_PLUS
//		case GRADE_A: grade='A'; break;
//		case GRADE_B: grade='B'; break;
//		case GRADE_C:grade='C'; break;
//		case GRADE_D:grade='D'; break;
//		default :grade='F'; break;
//		}//end switch
		
		char grade=64;
		switch(score/10) {
		case GRADE_D:grade++; //64->65
		case GRADE_C:grade++;//65->66
		case GRADE_B:grade++;//66->67
		case GRADE_A:
		case GRADE_A_PLUS:grade++;/*67>68*/ break;
		default : grade+=6;
		}//end switch
		
		System.out.println(grade+"����");
		
		
		
		//�¾ �ظ� �Է¹޾� �츦 ����ϴ� switch~case�� 
		int birth=Integer.parseInt(args[1]);
		int t = birth%12;
			System.out.print(birth+"����� ");	
			
		switch(t) {
		case 0: System.out.print("������");break;
		case 1: System.out.print("��");break;
		case 2: System.out.print("��");break;
		case 3: System.out.print("����");break;
		case 4: System.out.print("��");break;
		case 5: System.out.print("��");break;
		case 6: System.out.print("ȣ����");break;
		case 7: System.out.print("�䳢");break;
		case 8: System.out.print("��");break;
		case 9: System.out.print("��");break;
		case 10: System.out.print("��");break;
		case 11: System.out.print("��");break;
		}
		System.out.print("��");
		
		
		
		
	}//main

}//class
