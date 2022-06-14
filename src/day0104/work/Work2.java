package day0104.work;

/**
 * 점수를 입력받아 입력받은 점수가 0-100점 사이일 때 0~39점 사이는 "과락"~~
 * @author user

 */
public class Work2 {
	public static void main(String[] args) {
		

		int score=Integer.parseInt(args[0]);
		
		System.out.print(score+"점은 ");
		
		if (score>-1&&score<101) {
			//0~100사이
			if (score<40) {
				System.out.println("과락");
			}else if (score<60) {
				System.out.println("다른점수 참조");
			}else {
				System.out.println("합격");				
			}//end else
		}else {
			System.out.println("유효점수가 아닙니다.");
		}
		
			
			
	}//main

}//class
