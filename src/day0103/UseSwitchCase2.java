package day0103;

/**
 * switch~case 사용
 * @author user
 */
public class UseSwitchCase2 {

	public static final int ZERO=0; //constant
	public static final int ONE=1; //constant
	public static final int TWO=2; //constant --가독성 향상!
	
	//학점 비교용 constant
	public static final int GRADE_A_PLUS=10;
	public static final int GRADE_A=9;
	public static final int GRADE_B=8;
	public static final int GRADE_C=7;
	public static final int GRADE_D=6;

	
	public static void main(String[] args) {
		int i=0;
		int j=0;
		switch(i) { // 입력 값에 따라 0이면 zero를 1-one 2-two 그 외 others를 출력
		case ZERO:System.out.println("zero"); break;
		case ONE:System.out.println("one"); break;
		case TWO:System.out.println("two"); break;
		default:System.out.println("others"); //default 뒤에는 break를 기술하지 않아도 실행될 문장이 없기때문에 생략 가능
		}//end switch
		
		
		//main method의 arguments를 받아 출력
		//점수를 입력받아서 점수에 해당하는 학점 출력
		int score=Integer.parseInt(args[0]);
		System.out.print(score+"점의 학점은 ");
		
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
		
		System.out.println(grade+"학점");
		
		
		
		//태어난 해를 입력받아 띠를 출력하는 switch~case문 
		int birth=Integer.parseInt(args[1]);
		int t = birth%12;
			System.out.print(birth+"년생은 ");	
			
		switch(t) {
		case 0: System.out.print("원숭이");break;
		case 1: System.out.print("닭");break;
		case 2: System.out.print("개");break;
		case 3: System.out.print("돼지");break;
		case 4: System.out.print("쥐");break;
		case 5: System.out.print("소");break;
		case 6: System.out.print("호랑이");break;
		case 7: System.out.print("토끼");break;
		case 8: System.out.print("용");break;
		case 9: System.out.print("뱀");break;
		case 10: System.out.print("말");break;
		case 11: System.out.print("양");break;
		}
		System.out.print("띠");
		
		
		
		
	}//main

}//class
