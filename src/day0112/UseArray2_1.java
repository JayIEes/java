package day0112;

/**
 * @author user
 *
 */

public class UseArray2_1 {

	String[] names = { "��ö��", "������", "�����", "������", "������" };
	int[][] score = { { 90, 94, 91 }, { 86, 84, 71 }, { 96, 99, 100 }, { 75, 76, 73 }, { 63, 69, 69 } };

	public void scoreProcess() {

		System.out.println("---------------------------------------------------------");
		System.out.println("��ȣ\t�̸�\t�ڹ�\t����Ŭ\tHTML\t����\t���");
		System.out.println("---------------------------------------------------------");

		int totalScore = 0; // �л� ����
		int totalScoreAll = 0; // ��ü����

		for (int i = 0; i < score.length; i++) { // ��
			System.out.printf("%d\t%s\t", i + 1, names[i]);
			for (int j = 0; j < score[i].length; j++) { // �� //�ݺ��� �ȿ��� ������ �����ϸ� �ȵȴ�, ������ �߻��ϱ� ������
				System.out.printf("%d\t", score[i][j]);
				totalScore += score[i][j];// �� �л��� ������ ���� ��(+=)

			} // end for
			System.out.printf("%d\t%.2f\n", totalScore, (double) totalScore / score[0].length);
			// (����/����)�� ������ ������ ������ �Ǽ����� ���� ����!!!!!!!! ���� ����ȯ�� ���־� ��
			totalScoreAll += totalScore;
			totalScore = 0;

			System.out.println();
		} // end for

		System.out.println("----------------------------------------------------------");
		System.out.printf("�����ο�[ %d ]��\n", score.length);
		// ����. �ڵ� ���� ����ؼ� ó��.
		System.out.printf("��ü ����[ %d ]��, ��ü���[ %.2f ]\n", totalScoreAll,
				((double) totalScoreAll / score[0].length) / score.length); //
		// ����. �Ʒ��� �۾��� instance variable�� method�� �ۼ��Ͽ� ó�� ����� ���
		System.out.printf("�ڹ� ����[ %d ]��, ����Ŭ ����[ %d ]��, HTML ����[ %d ]��\n", total(0), total(1), total(2));
		System.out.printf("�ڹ� �ְ�����[ %d ]��\n", maxScore(0));
		System.out.printf("1�� �л��� ��ȣ[ %d ], �̸�[%s]\n", top(), names[top() - 1]);

	}// scoreProcess

	// ���� ����
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

		for (int i = 0; i < score.length; i++) {// ��
			for (int j = 0; j < score[i].length; j++) { // �� //�ݺ��� �ȿ��� ������ �����ϸ� �ȵȴ�, ������ �߻��ϱ� ������
				totalScore += score[i][j];// �� �л��� ������ ���� ��(+=)
			} // end for
			if (totalScore > topScore) { // �׳� �������ε� 1�� ���� �� �ִ°� ���� ��� ���� �ʿ� ����.
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
