package day1227;
/**
Constant : ���α׷����� ���ذ��� �������� �ְ� ����� ��.
*/

public class Constant{
	//���ذ����� ����ϴ� constant�� class field������ ������ �� �ִ�.
	public static final int MAX_SCORE=100;
	public static final int MIN_SCORE=0;

		public static void main(String[] args) {
		

	int myScore=85;
	// MAX_SCORE=99; // ����� �����ϴ� �࿡���� ���� �Ҵ��� �� �ִ�.
	System.out.println(MAX_SCORE+"/"+MIN_SCORE); //Ŭ������ ����
	
	System.out.println(Constant.MAX_SCORE+"/"+Constant.MIN_SCORE);
	System.out.println("ȹ�� ������ �ְ� ������ �� "+(MAX_SCORE-myScore));



	}
}