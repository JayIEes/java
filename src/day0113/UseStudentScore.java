package day0113;

/**
 * @author user StudentScore 클래스 사용하는 클래스
 */
public class UseStudentScore {

	public static void main(String[] args) {

		// 2. 배열 생성
		StudentScore[] stdScore = new StudentScore[4];

		// 값 입력
		stdScore[0] = new StudentScore("김진영", 89, 88, 91, 0, 0.0);
		stdScore[1] = new StudentScore("정시헌", 90, 76, 82, 0, 0.0);
		stdScore[2] = new StudentScore("김현우", 77, 77, 76, 0, 0.0);
		stdScore[3] = new StudentScore("황성준", 100, 94, 97, 0, 0.0);

		// 3. 총합점수와 평균 점수.
		for (int i = 0; i < stdScore.length; i++) {
			int num = stdScore[i].getJavaScore() + stdScore[i].getOracleScore() + stdScore[i].getHtmlScore();
			double avg = (double) num / 3;
			stdScore[i].setTotalScore(num);
			stdScore[i].setAvgScore(avg);
		}

		// 4. 모든 방의 값 출력
		for (StudentScore std : stdScore) {
			System.out.printf("이름: %s, 자바점수: %d, 오라클점수: %d, HTML점수: %d, 총합점수: %d, 평균점수: %.2f\n", std.getName(),
					std.getJavaScore(), std.getOracleScore(), std.getHtmlScore(), std.getTotalScore(),
					std.getAvgScore());
		} // end for
		System.out.println();
		int kimJavaTotal = 0;
		int kimCount = 0;
		for (StudentScore a : stdScore) { //2022-01-16 수정
			if (a.getName().startsWith("김")) {
				kimJavaTotal += a.getJavaScore();
				++kimCount;
			} // end if
		} // end for

		System.out.printf("성이 '김'씨인 학생들의 자바점수의 합은 %d이고, 평균은 %.2f이다", kimJavaTotal, (double) kimJavaTotal / kimCount);

	}// main

}// class
