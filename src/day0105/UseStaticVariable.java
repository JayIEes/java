package day0105;

/**
 * @author user
 * static(class) variable : ���뺯��<br>
 * ��üȭ�� ���� �ʰ� Ŭ���������� �����Ͽ� ����ϴ� ����.
 */
public class UseStaticVariable {
	static int i; // class field�� ��������� ��ü�� �������� �ʰ� Ŭ���������� ���� ����
	public static int j;
	int insI;//instance variable

	public static void main(String[] args) {
		System.out.println(i);
		System.out.println(UseStaticVariable.j);
		//static ������ ��ü�� �������� ���� ���뺯���� '��ü��.������'���� ����� �ǳ�, �ùٸ� ����� �ƴϹǷ� ����޼����� �����ش�.
		
		
		UseStaticVariable usv=new UseStaticVariable();
		UseStaticVariable usv2=new UseStaticVariable();
		usv.insI=100; //instance variable //��ü���� ���� ���� �����ȴ�.
		usv2.insI=500;
		//static ������ ��ü������ ����ϴ��� �ϳ��� ������ ����ϴ� ���̱� ������
		//����� ���� �����ȴ�.
		
		//////////////////////////////�߸��� ���:static������ instance ������ �������� ���/////////////////////////////////////
//		usv.i=1000;
//		System.out.println("static ��ü������ ��� "+usv.i+", instance variable : "+usv.insI); //warning�� ��
//		System.out.println("static ��ü������ ��� "+usv2.i+", instance variable : "+usv2.insI); 
		
		
		/////////////////////////�ùٸ� ��� : static �������� ���//////////////////////////////
		UseStaticVariable.i=1000;
		System.out.println("static ��ü������ ��� "+UseStaticVariable.i+", instance variable : "+usv.insI); //warning�� ��
		System.out.println("static ��ü������ ��� "+UseStaticVariable.i+", instance variable : "+usv2.insI); 
		
		
		
		
		
		
	}//main

}//class