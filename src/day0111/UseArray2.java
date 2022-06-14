package day0111;

public class UseArray2 {
	
	public UseArray2() {
		//학생 7명의 점수 처리하는 프로그램
		//89 77 91 99 63 100 86
		//변수를 사용하여 작성.
		int num1=89;
		int num2=77;
		int num3=91;
		int num4=99;
		int num5=63; 
		int num6=100;
		int num7=86;
		
		//모든 학생 점수 출력
		System.out.println("1번: "+num1);
		System.out.println("2번: "+num2);
		System.out.println("3번: "+num3);
		System.out.println("4번: "+num4);
		System.out.println("5번: "+num5);
		System.out.println("6번: "+num6);
		System.out.println("7번: "+num7);
		
		int totalScore=num1+num2+num3+num4+num5+num6+num7;
		System.out.println("총 점수 "+totalScore);
		
		System.out.println("-----------------------------------");
		
		int[] studentScore = {89,77,91,99,63,100, 86, 100};
		
		totalScore=0;
		for(int i=0; i < studentScore.length;i++) {
			System.out.printf("%d번 : %d점, %s\n",i+1,studentScore[i], gradeText(studentScore[i]));
			totalScore+=studentScore[i];
		}
		System.out.println("총 점수 "+totalScore);
		
		int top=topScore(studentScore); // call by reference
		System.out.printf("최고점수 %d\n",top);
		
		//char형으로 배열을 만들고, 배열명을 출력하면 다른 배열ㅔ과 다르게 값이 출력된다.
		System.out.println(studentScore);
		char[] tempArr= {'A','b','c','D','e'};
		System.out.println(tempArr);
		
		for(int i=0; i<tempArr.length;i++) {//위와 결과 같음, 굳이 이렇게 할 필요없다.
			System.out.print(tempArr[i]);
		}
		
		System.out.println("-------------------------------------------");
		//개선된 for문으로 모든 방의 값을 출력
		for( char value: tempArr) {
			System.out.print(value);
		}//end 개선 for
		
		
		
	}//UseArray2
		
	public int topScore(int[] score) {
		int topScore=score[0];
		/////////////////기존  for//////////////////////
//		for(int i=0; i<score.length;i++) {
//			if(score[i]>topScore) {
//				topScore=score[i];
//			}//end if
//		}//end for
		
		
		////////////////////개선 for////////////////////
		for(int value : score) {
			if(topScore<value) {
				topScore=value;
			}//end if
		}//end for
		return topScore;
	}
		
	
	

	public String gradeText(int score) {
		String txt="";
		if(score>-1&&score<101) {
			if(score>89) {
				txt= "A";
			}else if(score>79) {
				txt= "B";
			}else if(score>69) {
				txt= "c";
			}else if(score>59) {
				txt= "D";
			}else {
				txt= "F";
			}
		}
		
		return txt;
	}//gradeText
	
//	public String gradeText(int score) { //학점을 구하는 업무 -선생님 코드 
//		String txt="F";
//		switch(score/10) {
//		case 10:txt="A"; break;
//		case 9:txt="B";break;
//		case 8:txt="C";break;
//		case 7:txt="D";break;
//		case 6:txt="E";break;
//		default: txt="F";
//		}
//		return txt;
//	}//gradeText
	
	
		
	
	
	
	
	
	
	public static void main(String[] args) {
		
//		UseArray2 ua2 = new UseArray2(); //ua2는 쓰지 않으므로 괜히 만드는 변수가 되버림
		new UseArray2(); //
		
		
		
		
	}//main

}//class
