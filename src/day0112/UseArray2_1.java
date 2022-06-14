package day0112;

/**
 * @author user
 *
 */

public class UseArray2_1 {

	String[] names = { "강철수", "강상훈", "김우중", "김지연", "김현정" };
	int[][] score = { { 90, 94, 91 }, { 86, 84, 71 }, { 96, 99, 100 }, { 75, 76, 73 }, { 63, 69, 69 } };

	public void scoreProcess() {

		System.out.println("---------------------------------------------------------");
		System.out.println("번호\t이름\t자바\t오라클\tHTML\t총점\t평균");
		System.out.println("---------------------------------------------------------");

		int totalScore = 0; // 학생 총점
		int totalScoreAll = 0; // 전체총점

		for (int i = 0; i < score.length; i++) { // 행
			System.out.printf("%d\t%s\t", i + 1, names[i]);
			for (int j = 0; j < score[i].length; j++) { // 열 //반복문 안에서 변수를 선언하면 안된다, 병목이 발생하기 때문에
				System.out.printf("%d\t", score[i][j]);
				totalScore += score[i][j];// 한 학생의 점수를 누적 합(+=)

			} // end for
			System.out.printf("%d\t%.2f\n", totalScore, (double) totalScore / score[0].length);
			// (정수/정수)는 정수가 나오기 때문에 실수형에 들어가지 못해!!!!!!!! 강제 형변환을 해주어 함
			totalScoreAll += totalScore;
			totalScore = 0;

			System.out.println();
		} // end for

		System.out.println("----------------------------------------------------------");
		System.out.printf("응시인원[ %d ]명\n", score.length);
		// 숙제. 코드 직접 기술해서 처리.
		System.out.printf("전체 총점[ %d ]점, 전체평균[ %.2f ]\n", totalScoreAll,
				((double) totalScoreAll / score[0].length) / score.length); //
		// 숙제. 아래의 작업을 instance variable과 method를 작성하여 처리 결과를 출력
		System.out.printf("자바 총점[ %d ]점, 오라클 총점[ %d ]점, HTML 총점[ %d ]점\n", total(0), total(1), total(2));
		System.out.printf("자바 최고점수[ %d ]점\n", maxScore(0));
		System.out.printf("1등 학생의 번호[ %d ], 이름[%s]\n", top(), names[top() - 1]);

	}// scoreProcess

	// 과목별 총점
	public int total(int n) {
		int addAll = 0;
		for (int i = 0; i < score.length; i++) {
			addAll += score[i][n];
		} // end for
		return addAll;
	}// totalSubject

	public int maxScore(int n) {
		int max = 0;
		for (int i = 0; i < score.length; i++) {
			if (score[i][n] > max) {
				max = score[i][n];
			} // end if
		} // end for
		return max;
	}// maxScore

	public int top() {
		int totalScore = 0;
		int topScore = 0;
		int num1 = 0;

		for (int i = 0; i < score.length; i++) {// 행
			for (int j = 0; j < score[i].length; j++) { // 열 //반복문 안에서 변수를 선언하면 안된다, 병목이 발생하기 때문에
				totalScore += score[i][j];// 한 학생의 점수를 누적 합(+=)
			} // end for
			if (totalScore > topScore) { // 그냥 총합으로도 1등 구할 수 있는걸 굳이 평균 구할 필요 없다.
				topScore = totalScore;
				num1 = i + 1;
			} // end if
			totalScore = 0;
		} // end for

		return num1;
	}// Top

	public static void main(String[] args) {

		new UseArray2_1().scoreProcess();

	}// main

}// class
