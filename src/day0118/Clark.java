package day0118;

/**
 * ��,��,��, �̸�, �Դ� ���� �θ� Ŭ�������� ���ǵ� �ڵ带 ����ϰ�(���:�ڵ��� ���뼺) �ڽŸ��� Ư¡�� ������ Ŭ����<br>
 * �� ��, �Ϲ� ���� �� ��� 2 ���� 1~10����
 * 
 * @author user
 */
public final class Clark extends Person implements Fly {

	public int power;

	/**
	 * ���� 3��
	 */
	public Clark() {
		super(3,1,1); //�θ� Ŭ������ �μ��ִ� �����ε��� �����ڸ� �ҷ��� �Ϲ��ϰ� �ٸ��� ������
		power = 8;
	}// Clark

	/**
	 * ���� ���� ���� �޶�����.
	 * 
	 * @param stone
	 * @return
	 */
	public String power(String stone) {
		String result = "";

		if (stone.equals("ũ���䳪��Ʈ")) { // �������� ��
			result = "~(_-_)~ ���� ������....";
			power = 1;
		} else if (stone.equals("���̾Ƹ��")) { // ����� ���� ��
			result = "(^-^) ����";
			power = 10;
		} else {// ����� ���� ��
			result = "(�Ѥ� +)��� ����";
			power = 12;

		} // end else

		return result;

	}// power
	
	
	//���ּ� ���� �Դ� ���� ���� �Դ� �Ϸ� override
	@Override
	public String eat() {
		return getName()+"��(��) ������ ���� ��Ʈ���� �Դ´�." ;
	}//eat
	
	@Override
	//�Ĵ�ƴ� ����������� ��Դ� override
	public String eat(String menu, int price) {
		return getName()+"��(��) ����������� "+menu+"�� ������ "+price+"$ ���� ��Դ´�.";
	}

	
	/////////////���� ����� interface�� ���� ����////////////////////////
	@Override
	public String upwardForce() {
		return getName()+"�� ����� ����κ��� ��´�.";
	}//upwardForce

	@Override
	public String drivingForce() {
		return getName()+"�� �������� ������ �ݾ ��´�.";
	}//drivingForce
	
	
	
	
	
	

}// class