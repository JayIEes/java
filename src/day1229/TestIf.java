package day1229;
/**
���� if�� ���.<br>
���ǿ� ���� �� �����ϴ� �����
*/
public class TestIf {
	public static void main(String[] args) {
	int i=Integer.parseInt(args[0]);
	int num=Integer.parseInt(args[1]);

	
	//�Է��� ���� ����ϰ� �Է��� ���� 5�� ���ٸ� "��"�� ���
	System.out.println(i); // or (args[0])
	if(i==5){
		
	System.out.println("��");
	 }//end if

	
	if (num<0){ // �Էµ� num�� �����̹Ƿ�
		num = -num; //��ȣ�� �����Ͽ� �ٽ� �����Ѵ�.
	}//end if

	System.out.println(args[1]+"�� ���밪�� "+num+" �Դϴ�"); //�μ� �Է� 2���� �־�� ������ �ȳ�

	//���ڿ� �� 
	//�Էµ� 3��° ���� "����" �̶�� "2021-12-29"�� ����Ѵ�.
	System.out.println(args[2]);
	if (args[2].equals("����")){ // ���ڿ� ��(�Ϻ��ϰ� �������� ���ؼ��� ��)
		System.out.println("2021-12-29"); //if�� �����߾� --> if�� ����!
		}//end if
	


 }
}
