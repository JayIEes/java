package day0117;

/**
 * �߻�Ŭ������ �ڽ� Ŭ����<br>
 * �θ�Ŭ������ �߻�method�� �ݵ�� override�ؾ��Ѵ�.<br>
 * �ڽ�Ŭ������ �����Ǹ� �θ�Ŭ�������� �����ȴ�.
 * @author user
 */
public class AbstractSub extends AbstractSuper {

	@Override
	public void methodB() { //�θ�Ŭ������ abstract method�� ����(override)
		System.out.println("���������ڴ� �޶� �ǰ�, ��ȯ��, method��, �Ű������� ���� ����");
	}//methodB
	
	@Override
	public int methodC(String name) {
		return name.length();
	}
	
	public static void main(String[] args) {
//		new AbstractSuper();//�߻�Ŭ���� ���� ��üȭ �Ұ�
		AbstractSub as=new AbstractSub(); //�ڽ� Ŭ������ �����ϸ� �θ�Ŭ������ ���� �����ȴ�.
		as.methodA(); //�θ�Ŭ������ method
		as.methodB(); //�ڽ�Ŭ������ override�� method
		System.out.println(as.methodC("�׽�Ʈ"));
		
		//��� ������ ��üȭ(�ڽ��� �θ��̴�=>is a ����)
		//�ڽ�Ŭ���������� �θ�Ŭ������ ������ �� �� �ֱ� ������ �ڽ�Ŭ������ ��ü�� �θ�Ŭ������ ������� ��ü�� �Ҵ�� �� �ִ�.
		System.out.println("----------------------------------");
//		AbstractSub as2=new AbstractSuper();//�θ�� �ڽ��� ��. �Ҵ� �Ұ�
		AbstractSuper as2=new AbstractSub();//is a ������ ��üȭ
		//��ü�� �θ��� ������ ����ϱ� ������ �ڽ��� ��� ����� ����� �� ����.
		as2.methodA(); //�ڽ��� method
		as2.methodB();//�ڽ��� method�� body�� ���� ���� �� �� ������, �ּҸ� �Ҵ���� �ڽ��� method�� �ֿ켱������ ȣ��ȴ�. 
		System.out.println(as2.methodC("â �ۿ� �� �´�~")); //�ڽ��� �������̵��� �޼ҵ�
			
	
		
		
	}//main

}
