package day0106;

/**
 * @author user
 * ���� �̸��� ������ ������� ��. ������Ȳ 
 */
public class TestrVariableName {
	//class field : instance(member) variable, static variable
	//class field���� ����Ǵ� ������ �̸��� �����ϴ�.
	int i;
	static int  j;
//	static int  i; //���� �̸��� ������ �����ϱ� ������ error
	
	
	
	
	public static void main(String[] args) {
		//local : local variable
		//������ class field�� ������ �ٸ��� ������ class field�� ����� �̸��� ���� ������ ������ �� �ִ�.
		
		int i=0;;
		System.out.println("�������� "+i); // ���������� �������� �ٷ� ��� ����
		
		
		//�ν��Ͻ� ���� - 2. ��üȭ(Ŭ������ ��ü��=new Ŭ������();) 
		//3. ��ü������ ������ ��� (��ü��.������)
		TestrVariableName tvn =new TestrVariableName();
		System.out.println("�ν��Ͻ� ���� "+tvn.i);
//		int i; //���� local field�ȿ� i�̸����� �̹� ������ ������ �Ǿ��� ������ ����, ���� �̸��� ���� ���Ұ�
		
		
		
	}//main

}//class
