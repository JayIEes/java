package day0113;

/**
 * 이차원 배열의 기본형 형식의 사용
 * 
 * @author user
 */
public class UseArray2_2 {

	public static final int JAVA_IDX = 0;
	public static final int ORACLE_IDX = 1;
	public static final int HTML_IDX = 2;

	private int javaTotal, oracleTotal, htmlTotal;
	private int javaTopScore, oracleTopScore, htmlTopScore;
	private int topNumber;
	private String topName;

	public void scoreProcess() {
		String[] names = { "강명준", "권용현", "김정하", "김현우", "김진영" };
		int[][] score = { { 90, 94, 91 }, { 86, 84, 71 }, { 96, 99, 100 }, { 75, 76, 73 }, { 63, 69, 69 } };

		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("번호\t이름\t자바\t오라클\tHTML\t총점\t평균");
		System.out.println("---------------------------------------------------------------------------------");

		int totalScore = 0;// 학생 총점
		int allTotalScore = 0; // 모든학생 전체총점

		for (int i = 0; i < score.length; i++) {// 행
			System.out.printf("%d\t%s\t", i + 1, names[i]);
			for (int j = 0; j < score[i].length; j++) {// 열
				System.out.printf("%d\t", score[i][j]);
				totalScore += score[i][j];// 한 학생의 점수를 누적 합(+=)
			} // end for
			System.out.printf("%d\t%.2f\n", totalScore, (double) totalScore / score[0].length);
			allTotalScore += totalScore;
			totalScore = 0;// 한학생의 총점 초기화
		} // end for
		System.out.println("---------------------------------------------------------------------------------");
		System.out.printf("응시인원 [ %d ]명\n", score.length);
		// 숙제. 코드를 직접기술해서 처리.
		System.out.printf("전체 총점 [ %d ]점,전체 평균[%.2f]\n", allTotalScore,
				((double) allTotalScore / (score.length * score[0].length)));

		// 숙제. 아래의 작업을 instance variable과 method를 작성하여 처리 결과를 출력.
		System.out.printf("자바 총점 [ %d ]점, 오라클 총점[ %d ], HTML 총점[ %d ]\n", javaTotal, oracleTotal, htmlTotal);
		System.out.printf("자바 총점 [ %d ]점, 오라클 총점[ %d ], HTML 총점[ %d ]\n", subjectTotalScore(score, JAVA_IDX),
				subjectTotalScore(score, ORACLE_IDX), subjectTotalScore(score, HTML_IDX)); // 이게 더 유연 , 위의 것과 같지만

		javaTopScore(score);
		System.out.printf("자바 최고점수 [ %d ]점\n", javaTopScore);
		System.out.printf("자바 최고점수 [ %d ]점\n", javaTopScoreSec(score));

		topStudent(score, names);
		System.out.printf("1등학생의 번호[ %d ], 이름[ %s ]\n", topNumber, topName);
		int topNum = topStudentNumber(score);
		System.out.printf("1등학생의 번호[ %d ], 이름[ %s ]\n", topNum, topStudentName(names, topNum));
	}// scoreProcess

	/**
	 * 과목별 총점
	 */
	public void subjectTotalScore(int[][] score) {
		// score배열은 scoreProcess() method 안에 선언된 배열(지역변수) 1.자동초기화x 2.method안에서만 사용
		// subjectTotalScore에서 다른 method안에 지역변수를 사용하려면 전달(매개변수) 받아야한다.
		for (int i = 0; i < score.length; i++) {
			javaTotal = score[i][JAVA_IDX];
			oracleTotal = score[i][ORACLE_IDX];
			htmlTotal = score[i][HTML_IDX];
		} // end for
	}// subjectTotalScore

	public int subjectTotalScore(int[][] score, int subjectidx) {
		// score배열은 scoreProcess() method 안에 선언된 배열(지역변수) 1.자동초기화x 2.method안에서만 사용
		// subjectTotalScore에서 다른 method안에 지역변수를 사용하려면 전달(매개변수) 받아야한다.
		int someTotal = 0;

		for (int i = 0; i < score.length; i++) {
			someTotal += score[i][subjectidx];
		} // end for
		return someTotal;
	}// subjectTotalScore

	public void javaTopScore(int[][] score) {
		for (int i = 0; i < score.length; i++) {
			if (javaTopScore < score[i][JAVA_IDX]) {
				javaTopScore = score[i][JAVA_IDX];
			}
		}
	}// javaTopScore

	public int javaTopScoreSec(int[][] score) {
		int javaTopScore = 0;
		for (int i = 0; i < score.length; i++) {
			if (javaTopScore < score[i][JAVA_IDX]) {
				javaTopScore = score[i][JAVA_IDX];
			}
		}
		return javaTopScore;
	}// javaTopScoreSec

	public void topStudent(int[][] score, String[] names) {
		int totalScore = 0;
		int topScore = 0;

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				totalScore += score[i][j];// 총합 점수 구하고
			} // end for
			if (topScore < totalScore) {// 구해진 총합 점수가 최고 점수인지 비교
				topScore = totalScore; // 변경
				topNumber = i; // 최고번호를 구한다.
			} // end if
			totalScore = 0;
		} // end for
		topName = names[topNumber];
		topNumber++;
	}// topStudent

	public int topStudentNumber(int[][] score) {
		int totalScore = 0;
		int topScore = 0;

		int topNumber = 0;

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				totalScore += score[i][j];// 총합 점수 구하고
			} // end for
			if (topScore < totalScore) {// 구해진 총합 점수가 최고 점수인지 비교
				topScore = totalScore; // 변경
				topNumber = i; // 최고번호를 구한다.
			} // end if
			totalScore = 0;
		} // end for
		return ++topNumber;
	}// topStudent

	public String topStudentName(String[] names, int number) {
		return names[topNumber - 1];
	}

	public static void main(String[] args) {
		new UseArray2_2().scoreProcess();
	}// main

}// class
