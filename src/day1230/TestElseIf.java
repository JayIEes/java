package day1230;
/**
���� if (else~if)
������ ���� ������ ���� �� ���.
*/

public class TestElseIf{

	public static void main(String[] args) {
	

	//������ �Է¹޾� 0�� ���� �۾��� ���� ���и޼����� 100������ ���� �� ���и޼�����
	//�������� �� �޽����� ����Ͻÿ�
	int score=Integer.parseInt(args[0]); // ������ �� ���� �ϸ�� // -1, 0, 50, 100, 101 (��谪 �׽�Ʈ)
	//int score=101; //������ ������ �� �ҽ����� ������ �ȵ�, �� �ٲ� ������ �Ź� ������-���� ������ ���ľ� ��

	System.out.print(score+"���� ");

	if (score<0){ //0���� ���� ���
		System.out.println("0���� �۾Ƽ� ����");
	}else if(score>100){ // 100���� ū ���
		System.out.println("100���� Ŀ�� ����");
	}else{ //�׷��� ���� ��� (0~100 ������ ó��)
		System.out.println("�Է¼���");
	}//end else
	
	System.out.println();
	
	//���� �Է¹޾� 0~39������ "����", 40~59 '�ٸ� ���� ����", 
	//60~100������ "�հ�" -else�� �����ϴ� �ڵ� �ۼ�
	
	int score2=Integer.parseInt(args[1]);
	System.out.print(score2+"��(��) ");	

	if(score2>-1&&score2<40){
		System.out.println("����");
	}else if (score2>39&&score2<60){ 
		System.out.println("�ٸ� ���� ����");
	}else if(score2>59&&score2<101){
		System.out.println("�հ�");
	}/*else{
		System.out.println("��ȿ���� �ʽ��ϴ�");
	}*/


	 //end else if


	}
}
