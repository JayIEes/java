package day0117;

/**
 * @author user
 * ��üȭ ���� �ʴ� Ŭ����
 */
public abstract class AbstractSuper {

	
	int i;
	
	
	public AbstractSuper() { //�ڽ� Ŭ������ ���ؼ��� ȣ��
		System.out.println("�߻�Ŭ������ ������");
	}//AbstractSuper ����
	
	
	public void methodA() {
		System.out.println("�θ��� �Ϲ� method");
	
	}
	
	public abstract void methodB(); //�߻� method
	
	
	
	public abstract int methodC(String name);//�߻� method
	
	
	
//	public static void main(String[] args) {
//
//		new AbstractSuper(); //�߻� Ŭ�����̱� ������ ��ü ���� �Ұ�.
//	}//main �ּ��� �����߾��

}//class
