package day1230;
/**
if~else : �� �� �ϳ��� �ڵ带 �����ؾ��� ��
*/

public class TestIfElse {
	public static void main(String[] args){
	

//�������� ������� �Ǻ��ϴ� �ڵ� �ۼ�

	int num=-12;

	if(num>-1){
		System.out.println("���");
	}else{	
		System.out.println("����");
	}


	//Ȧ��, ¦�� ����
	
	int num1=11;

	System.out.print(num1+"��(��) ");

	if (num1%2==0){
		System.out.println("¦���Դϴ�");
	}else{
		System.out.println("Ȧ���Դϴ�");
	}//end else





	System.out.println();
	
	//�Է¹��� ������ ����ϰ� 0~100 ���̸� "��ȿ����", �׷��� ������ "��ȿ����"
	
	int num2=101;
	System.out.println(num2);

	if (num2>=0&&num2<=100){
		System.out.println("��ȿ����");
	}else{
		System.out.println("��ȿ����");
	}//end else



	//������ �ڵ�
	int score=Integer.parseInt(args[0]);
	
	System.out.print(score+"���� ");
	
	if (num2>-1&&score<101){ //num2>=0&&num2<=100  ---> cpu�� �� �� �����ؾߵ�.
		System.out.println("��ȿ����");
	}else{
		System.out.println("��ȿ����");
	}//end else


System.out.println();

	//args[1]�� �ԷµǴ� ���� ������ ��ȯ�ϰ�, ��ȯ�� ���� �빮���� ������� �빮�ڷ� ����ϰ� 
	//�׷��� �ʴٸ� ���ڸ� �״�� ���
	int score1 = Integer.parseInt(args[1]);

	if (score1>64&&score1<91){ //Uppercase�� ����
		System.out.println((char)score1);
	}else{ //�׷��� ���� ��
		System.out.println(score1);
	}//end else
	



	



	}
}
