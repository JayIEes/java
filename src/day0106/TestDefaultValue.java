package day0106;

/**
 * @author user
 * class field�� ����Ǵ� ������ �ڵ��ʱ�ȭ�ȴ�. <br>
 * �����ڰ� �ʱⰪ�� ���� �ʿ䰡 ����.
 */
public class TestDefaultValue {
	
	//��״� instance variable
	int i; //������ : 0
	char c; //������ : \u0000
	double d; //�Ǽ���:0.0
	boolean b;//�Ҹ��� :false
	TestDefaultValue tdv;//������ :null
	String str; //������ :null
	int[] arr; //������ :null
		
	
	public static void main(String[] args) {

		TestDefaultValue instance=new TestDefaultValue(); //���⼭ instance�� �ν��Ͻ��̴�. (instance varible �ƴ�)
		System.out.println("������ ["+instance.i+"]");
		System.out.println("������ ["+instance.c+"]");
		System.out.println("�Ǽ��� ["+instance.d+"]");
		System.out.println("�Ҹ��� ["+instance.b+"]");
		System.out.println("������ class ["+instance.tdv+"]");
		System.out.println("������ String ["+instance.str+"]");
		System.out.println("������ array ["+instance.arr+"]");
		
		
	}//main

}//class
