package day0104.work;

/**
 * ���߱�����ܰ� �Ÿ� �Է�,( ���߱��� ������ �������� ���� ����ö)////�� ��������� �Ʒ��� �⺻ ���ü�踦 ������.
��������	800
����	1250
����ö	1300
�߰���� : �⺻����� 10km���� ��ȿ�ϸ� 10km�ʰ� �� �� 5km���� �߰���� 100�� �ٴ´�.
���߱����� ��� ���:
�Է� ������� ��xx�� �̵��Ÿ� xxkm / �⺻��� xx�� �ʰ���� xx�� / �Ѵ� 20�� ���� ����� xx�� /���߱������ �ƴϸ� ���߱����� �ƴմϴ� ���
 * @author user
 */
public class Work3 {
	//���߱��� ����� �� ������� �ʴ� ���̹Ƿ� constant�� ����
	public static final int MA_BUS=800;
	public static final int BUS=1250;
	public static final int SUBWAY=1300;
	
	
	public static void main(String[] args) {
		
			
		if(args[0].equals("��������")||args[0].equals("����")||args[0].equals("����ö")) {//���߱���
			int distance=0;//�Էµ� �̵��Ÿ�
			int fare=0;//���
			int overFare=0;//�ʰ����
			distance=Integer.parseInt(args[1]);
			
			//�Էµ� ��������� �⺻��� �ĺ��Ͽ� ����
			if(args[0].equals("��������")) {
				fare=Work3.MA_BUS;
			}else if (args[0].equals("����")) {
				fare=Work3.BUS;
			}else {
				fare=Work3.SUBWAY;				
			}//end else
			
			//�ʰ����
			if(distance>10) {
				overFare=(((distance-10)/5)+1)*100;
			}//end if
			
			
			System.out.println("������� : "+args[0]+" �̵��Ÿ� : "+distance+" �⺻��� : "
			+fare+" �ʰ���� : "+overFare+"�� �Ѵ�20�ϱ��� : "+((fare+overFare)*20)+"��");
		
			
		}else {//���߱��� �ƴѰ��
			System.out.println("�Է��Ͻ� "+args[0]+"��(��) ���߱�������� �ƴմϴ�.");
		}//end else
		
		
		
		
	}//main

}//class
