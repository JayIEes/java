package day0118;


/**
 * @author user
 * ����� ���� Ư¡(��,��,��, �Դ���)�� Person Ŭ�������� ������ ����ϰ�, �ڽ��� Ư¡�� �����ϴ� �ڽ�Ŭ����
 * �ڽ�Ŭ����<br>
 * ȫ�浿�� �ο��� ���ϴ� Ư¡
 * �ο򷹺��� 1~10���� ����<br> ��� ������ �ο� ��� 3���� ����.
 */
public class HongGilDong extends Person {

	private int myLevel; 
	
	
	
	public HongGilDong() {
		super();
		myLevel=5;
	}//HongGilDong
	
	public String fight(int yourLevel) {
	String resultMsg="";
		
	if(myLevel<yourLevel) {//���� ���
		resultMsg="OTL �ο򿡼� ����";
		myLevel--;
		if(myLevel<1) {//�̱� ���
		myLevel=1;
		}
	}else if(myLevel>yourLevel) {
		resultMsg="s('.^)V �ο򿡼� �̰���";
		myLevel++;
		if(myLevel>10) {
			myLevel=10;
		}
	}else {//���� ���
		resultMsg="(�Ѥ�+)�ο򿡼� �����.";
	}
	
	return resultMsg;
	}//fight
	
	
	@Override
	public String eat() {
		return getName()+"�� ������ ���� �Դ´�.";
	}
	
	@Override
	//�Ĵ��� �ƴ� �ָ����� ��Դ� �Ϸ� Override
	public String eat(String menu,int price) {
		//name�� �θ�Ŭ�������� private ���������ڷ� �Ǿ������Ƿ� �ܺο��� ���������� �� �� ����.
//		return name+"��(��) �Ĵ翡�� "+menu+"�� ������ "+price+"�� ���� ��Դ´�.";
		//public �� method�� ȣ���Ͽ� ����Ѵ�.
		return getName()+"��(��) �ָ����� "+menu+"�� ������ "+price+"�� ���� ��Դ´�.";
	}
	
	
	
	
}//class
