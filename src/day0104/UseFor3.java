package day0104;

/**
 * @author user
 * for���� �پ��� ����
 */
public class UseFor3 {

	public static void main(String[] args) {
		//���ѷ���
//		for( ; ; ) {
//			System.out.println("���ѷ���");
//			break; //���� ����� �ݺ����� ����������.(���ʿ� ��ġ�ؾ���)
//		}//end for
		
	//	System.out.println("�ȳ�"); //���� �߻� - ���ѷ��������� ����� �� ���� ������. (unreachable)
	
		
	//�����ϴ� ���� ���� ���ѷ���
	for (int i = 0; ; i++) {
		System.out.println("���ѷ���"+i);
		break;
	}//end for
		
	
	//�������� �ʱⰪ�� ����ϴ� for��
	for(int i=0, j=10, k=1 ; i<10 ; i++,j--,k+=k) { //���ǽ��� �ϳ���!!!!!!
		System.out.println("i= "+i+", j= "+j+",k="+k);
	}//end for
	
	
	int[] temp= {1,2,3,4,5,6,7};
	//������ for
	for(int i=0;i<temp.length;i++) {
		System.out.println(temp[i]);
	}//end for
	//������ for
	for(int i:temp) {
		System.out.println(i);
	}//end for
	
	
	}//main

}//class
