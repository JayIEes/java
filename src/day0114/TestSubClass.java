package day0114;

/**
 * @author user
 * �ڽ�Ŭ����: 
 * TestSuperClass�� �ڽ�Ŭ����
 */
public class TestSubClass extends TestSuperClass {

	
	int c;//�θ�Ŭ������ �����ϴ� ������� ������ ���� ����. //�ڽ�Ŭ������ ������ ���� ��. ���������� �����̿� �����ϱ�

	
	public TestSubClass() {
		System.out.println("�ڽ�Ŭ������ ������");
	}//TestSubClass
	
	
	public void parentResource() {
		//����� Ư¡: �θ�Ŭ������ �ڿ��� �ڽ�Ŭ�������� �ڽ��� ��ó�� ����� �� �ִ�.
		this.a=10; //public /����ó�� �� �� �ִ�. -> �θ� ��ӹ޾ұ� ������
		this.b=20;//protected 
		this.c=30;//default
		super.c=40; // ���� �̸��� ������ �����ϸ� �θ��� ������ super�� �ڽ��� ������ this�� �����Ѵ�.
//		d=10; //private�� �� �� ����.
//		System.out.println(super); //super�� ��� �Ұ�
		System.out.println(this); //this�� ����� ������
		System.out.println("�ڽ� method"+this.a+","+this.b+","+c+","+super.c);
		
		
	}//parentResource
	
	
	
	
}//class
