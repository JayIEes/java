package day0117;

/**
 * �ڽ�Ŭ����(��ӹ��� (����� Ȯ����)Ŭ������ ����Ѵ�.)
 * �������̵��� ����:
 * �θ�Ŭ������ �����ϴ� ����� �ڽ�Ŭ�������� ���� ������ �ڽ�Ŭ������ �� �ʿ��� ����� ������ �ϴ� ��.<br>
 * ��Ģ:
 * ���������ڴ� �޶󵵵ǰ�,   ��ȯ��, method��, �Ű������� �ݵ�� ���ƾ� �Ѵ�.
 * @author user
 */
public class TestOverrideSub extends TestOverrideSuper{
	
	//temp method�� override
	@Override //annotation
	protected void temp() {
		System.out.println("�ڽ�Ŭ������ override�� temp method");
		super.temp(); //�θ�Ŭ������ ���� temp()�� ȣ��
	}//temp
	
	public void sub() {
		System.out.println("�ڽ�Ŭ������ ���� method");
	}//sub
	
	
	
}//class
