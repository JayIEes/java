package day0106;

/**
 * @author user
 * 숙제 풀이
 */
public class Work {
	
	
	/**
	 * 성(last name)을 반환하는 일 - 고정 값 형태
	 * @return 성
	 */
	public char lastName() {
		return 'S';
	}//lastName
	
	
	/**
	 * 입력되는 점수의 판정.<br> 가변값
	 * 0~100tkdlaus true가, 그렇지 않으면 false 
	 * @param score 판정할 점수
	 * @return 판정결과
	 */
	public boolean scoreJudge(int score) {
//		boolean flag=score > -1 && score<101;//지역변수 초기화
		
//		if(score > -1 && score<101) { //얘도 필요없음
//			flag=true;
//		}
//		else {
//			flag=false; //초기화 해줬기 때문에 얘는 필요없음.
//		}//end else
		
		return  score > -1 && score<101;
	}//scoreJudge
	
	/**
	 * 학점을 입력받아 학점에 맞는 문자를 구해서 반환 - 가변값
	 * @param score 점수
	 * @return 구해진 학점의 문자
	 */
	public char gradeText(int score) {
		char temp = '\u0000';
		if(score >89 && score<101) {//값을 제어
			temp='A';
		}else if(score >79 && score<90){
			temp='B';
		}else if(score >69 && score<80) {
			temp= 'C';
		}else if(score >59 && score<70) {
			temp= 'D';
		}else {
			temp= 'F';
		}//end else 
			return temp;//가장 마지막에 제어된 값을 반환
	}//gradeText
	
	
	/**
	 * 별을 출력 - 고정일
	 * 다른 클래스에 존재하는 method를 상황에 맞게 호출
	 */
	public void printStar() {
		//printStar method를 구현한 클래스를 객체화
		TestOverload to=new TestOverload(); //for문 안에서 변수 선언하지 않는다.
		
				for(int i=0;i<4;i++) {
					for(int j=0;j<i+1;j++) {
						if(i%2==0) {
						to.printStar();//검은별
						}else {
						to.printStar(1);//흰별
						}//end else
						//System.out.print(i+" "+j+" ");
					}//end for
				System.out.println();
				
				}//end for
	}//printStar
	
	
	/**
	 * 구구단 2단 출력
	 */
	public void multilcationTable() {
		System.out.println("2단");
		for(int i=1; i<10;i++) {
			System.out.println("2x"+i+" = "+(2*i));
		}
	}
	/**
	 * 구구단을 호출하는 메소드 오버로드
	 * @param level
	 */
	public void multilcationTable(int level) {
		System.out.println(level+"단");
		for(int i=1; i<10;i++) {
			System.out.println(level+"x"+i+" = "+(level*i));
		}
	}
	
	
	
	
	public static void main(String[] args) {

		//객체화:instance method를 호출.
		//1번문제 호출
		Work w=new Work();
		char familyName=w.lastName();
		System.out.println("내 성은 "+familyName);
		
		//2번 문제 호출
		int score = 99;
		boolean flag=w.scoreJudge(score);
		System.out.println(score+"점 "+flag);
		
		//3번 문제 호출
		if(flag) {
		char gradeText=w.gradeText(score);
		System.out.println("입력점수 : "+score+"점, 학점 "+gradeText);
		}
		
		//4번 문제 호춝
		w.printStar();
		
		//5번 문제 호출
		w.multilcationTable();
		w.multilcationTable(5);
		
		
		
	}//main

}
