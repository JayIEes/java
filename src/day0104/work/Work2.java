package day0104.work;

/**
 * ������ �Է¹޾� �Է¹��� ������ 0-100�� ������ �� 0~39�� ���̴� "����"~~
 * @author user

 */
public class Work2 {
	public static void main(String[] args) {
		

		int score=Integer.parseInt(args[0]);
		
		System.out.print(score+"���� ");
		
		if (score>-1&&score<101) {
			//0~100����
			if (score<40) {
				System.out.println("����");
			}else if (score<60) {
				System.out.println("�ٸ����� ����");
			}else {
				System.out.println("�հ�");				
			}//end else
		}else {
			System.out.println("��ȿ������ �ƴմϴ�.");
		}
		
			
			
	}//main

}//class
