package day0104;

/**
 * @author user
 * Ư�������� ���
 */
public class UseEscapeCharacter {

	public static void main(String[] args) {
		
	//�ȳ��ϼ���?�� �� �� ����ϴ� �ڵ��ۼ�
	//\���� <=Ư�����ڴ� ����� ������ ����� �� �ִ�.
	System.out.println("�ȳ��ϼ���?");
	System.out.println("'�ȳ��ϼ���?'");
	System.out.println("\"�ȳ��ϼ���?\"");
//	System.out.println("\a�ȳ��ϼ���"); //�������� �ʴ� Ư������
	System.out.println("�ȳ�\n�ϼ���");
	System.out.println("�ȳ�\r�ϼ���");//\r�� ���� ���� ���� ���������� TextArea���� enter key�� ������ \r\r �ڵ� 2���� �����.
	System.out.println("�ȳ�\t�ϼ���?");
	System.out.println("������\"ȭ����\"�Դϴ�.");
	System.out.println("�� ������ e:\\temp\\new.txt���� �Դϴ�.");
	System.out.println("�ȳ�\b");
	
	}//main

}//class
