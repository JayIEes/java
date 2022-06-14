package day0107;

/**
 * @author user
 * ��ī���� �߻�ȭ�Ͽ� ������ Ŭ����.
 * ����� Ư¡ : �Ѳ� / ��ü / ��
 * ������ Ư¡ : ����.
 */
public class Marker {
	private int cap; //�Ѳ��� ����
	private int body; // ��ü�� ����
	private String color; //��
	
	
	/**
	 * 01-01-2022�� �߰��� �⺻������
	 * �Ѳ� 1 ��ü 1 �������� ��ī�� ��ü ������ �� ����Ѵ�.
	 * ����<br>
	 * Marker ��ü��=new Marker();<br>
	 * �� �������� �����Ͽ� ����Ѵ�.
	 */
	
	public Marker() {
		this(1,1,"����");
//		cap=1;
//		body=1;
//		color="����";
	}//Marker
	

	
	/**
	 * �Էµ� ������ �Ѳ�, ��ü, ���� �����Ͽ� ��ü�� �����ϴ� ������
	 * @param cap �Ѳ��� ����
	 * @param body ��ü�� ����
	 * @param color ��
	 */
	public Marker(int cap, int body, String color) {
		this.cap=cap;
		this.body=body;
		this.color=color;
	}//Marker
	
	
	
	
	
	/**
	 * ������ ��ī�� ��ü�� �Ѳ��� ������ �����ϴ� ���� �ϴ� �޼ҵ�
	 * @param cap ������ �Ѳ��� ����
	 */
	public void setCap(int cap) {
		this.cap=cap;
	}//setCap
	
	/**
	 * ������ ��ī�� ��ü�� ������ �Ѳ� ������ ��ȯ�ϴ� ��
	 * @return �Ѳ��� ����
	 */
	public int getCap() {
		return cap;
	}//getCap
	
	
	/**
	 * ������ ��ī�� ��ü�� ��ü�� ������ �����ϴ� ���� �ϴ� �޼ҵ�
	 * @param body ������ ��ü�� ����
	 */
	public void setBody(int body) {
		this.body=body;
	}//setBody
	
	/**
	 * ������ ��ī�� ��ü�� ������ ��ü�� ������ ��ȯ�ϴ� ��
	 * @return ��ü
	 */
	public int getBody() {
		return body;
	}//getBody
	
	/**
	 * ������ ��ī�� ��ü�� ���� �����ϴ� ���� �ϴ� �޼ҵ�
	 * @param color ������ ��
	 */
	public void setColor(String color) {
		this.color=color;
	}//setColor
	
	/**
	 * ������ ��ī�� ��ü�� ������ ���� ��ȯ�ϴ� ��
	 * @return ��
	 */
	public String getColor() {
		return color;
	}//getColor
	
	
	
	

	/**
	 * @return
	 * ĥ�ǿ� ������ ��ī�� ��ü�� ����Ͽ� "�ȳ��ϼ���?"�� ���� �� ����
	 */
	public String write() {
		return color+"���� ��ī������ \"�ȳ��ϼ���?\"�� ö�ǿ� ����.";
	}//write
	
	/**
	 * @param msg ĥ�ǿ� ����� �޽���
	 * @return �޽���
	 * ĥ�ǿ� ������ ��ī�� ��ü�� ����Ͽ� �Էµ� �޽����� ���� �� ����.
	 */
	public String write(String msg) {
		return color+"���� ��ī������ \""+msg+"\"�� ö�ǿ� ����.";
	}//write
	
	
	
	
	

}//class
