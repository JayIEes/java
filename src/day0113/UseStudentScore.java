package day0113;

/**
 * @author user StudentScore Ŭ���� ����ϴ� Ŭ����
 */
public class UseStudentScore {

	public static void main(String[] args) {

		// 2. �迭 ����
		StudentScore[] stdScore = new StudentScore[4];

		// �� �Է�
		stdScore[0] = new StudentScore("������", 89, 88, 91, 0, 0.0);
		stdScore[1] = new StudentScore("������", 90, 76, 82, 0, 0.0);
		stdScore[2] = new StudentScore("������", 77, 77, 76, 0, 0.0);
		stdScore[3] = new StudentScore("Ȳ����", 100, 94, 97, 0, 0.0);

		// 3. ���������� ��� ����.
		for (int i = 0; i < stdScore.length; i++) {
			int num = stdScore[i].getJavaScore() + stdScore[i].getOracleScore() + stdScore[i].getHtmlScore();
			double avg = (double) num / 3;
			stdScore[i].setTotalScore(num);
			stdScore[i].setAvgScore(avg);
		}

		// 4. ��� ���� �� ���
		for (StudentScore std : stdScore) {
			System.out.printf("�̸�: %s, �ڹ�����: %d, ����Ŭ����: %d, HTML����: %d, ��������: %d, �������: %.2f\n", std.getName(),
					std.getJavaScore(), std.getOracleScore(), std.getHtmlScore(), std.getTotalScore(),
					std.getAvgScore());
		} // end for
		System.out.println();
		int kimJavaTotal = 0;
		int kimCount = 0;
		for (StudentScore a : stdScore) { //2022-01-16 ����
			if (a.getName().startsWith("��")) {
				kimJavaTotal += a.getJavaScore();
				++kimCount;
			} // end if
		} // end for

		System.out.printf("���� '��'���� �л����� �ڹ������� ���� %d�̰�, ����� %.2f�̴�", kimJavaTotal, (double) kimJavaTotal / kimCount);

	}// main

}// class
