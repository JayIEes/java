package day0111;

public class UseArray2 {
	
	public UseArray2() {
		//�л� 7���� ���� ó���ϴ� ���α׷�
		//89 77 91 99 63 100 86
		//������ ����Ͽ� �ۼ�.
		int num1=89;
		int num2=77;
		int num3=91;
		int num4=99;
		int num5=63; 
		int num6=100;
		int num7=86;
		
		//��� �л� ���� ���
		System.out.println("1��: "+num1);
		System.out.println("2��: "+num2);
		System.out.println("3��: "+num3);
		System.out.println("4��: "+num4);
		System.out.println("5��: "+num5);
		System.out.println("6��: "+num6);
		System.out.println("7��: "+num7);
		
		int totalScore=num1+num2+num3+num4+num5+num6+num7;
		System.out.println("�� ���� "+totalScore);
		
		System.out.println("-----------------------------------");
		
		int[] studentScore = {89,77,91,99,63,100, 86, 100};
		
		totalScore=0;
		for(int i=0; i < studentScore.length;i++) {
			System.out.printf("%d�� : %d��, %s\n",i+1,studentScore[i], gradeText(studentScore[i]));
			totalScore+=studentScore[i];
		}
		System.out.println("�� ���� "+totalScore);
		
		int top=topScore(studentScore); // call by reference
		System.out.printf("�ְ����� %d\n",top);
		
		//char������ �迭�� �����, �迭���� ����ϸ� �ٸ� �迭�İ� �ٸ��� ���� ��µȴ�.
		System.out.println(studentScore);
		char[] tempArr= {'A','b','c','D','e'};
		System.out.println(tempArr);
		
		for(int i=0; i<tempArr.length;i++) {//���� ��� ����, ���� �̷��� �� �ʿ����.
			System.out.print(tempArr[i]);
		}
		
		System.out.println("-------------------------------------------");
		//������ for������ ��� ���� ���� ���
		for( char value: tempArr) {
			System.out.print(value);
		}//end ���� for
		
		
		
	}//UseArray2
		
	public int topScore(int[] score) {
		int topScore=score[0];
		/////////////////����  for//////////////////////
//		for(int i=0; i<score.length;i++) {
//			if(score[i]>topScore) {
//				topScore=score[i];
//			}//end if
//		}//end for
		
		
		////////////////////���� for////////////////////
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
	
//	public String gradeText(int score) { //������ ���ϴ� ���� -������ �ڵ� 
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
		
//		UseArray2 ua2 = new UseArray2(); //ua2�� ���� �����Ƿ� ���� ����� ������ �ǹ���
		new UseArray2(); //
		
		
		
		
	}//main

}//class
