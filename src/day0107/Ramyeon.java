package day0107;

public class Ramyeon {

	private String noodle; //����� �� ���� (�ձ� / �׸�)
	private String powder; //������ ���� (���� / �׻�)
	private int spiciness; //����� �ſ����� (1�ܰ�,2, 3 / ���� Ŭ���� �ſ�)
	private String name; //����� �̸�
	
	
	/**
	 * ������ ��� ��ü�� ���� ���¸� �����ϴ� ���� �ϴ� �޼ҵ�
	 * @param noodle ������ ��� ���� ����
	 */
	public void setNoodle(String noodle) {
		this.noodle=noodle;
	}//setNoodle
	
	/**
	 * ������ ��� ��ü�� ������ ���� ���¸� ��ȯ�ϴ� ��
	 * @return ����� �� ����
	 */
	public String getNoodle() {
		return noodle;
	}
	
	
	/**
	 * ������ ��� ��ü�� ������ ���¸� �����ϴ� ���� �ϴ� �޼ҵ�
	 * @param powder ������ ������ ����
	 */
	public void setPowder(String powder) {
		this.powder=powder;
	}//setPowder
	
	
	/**
	 * ������ ��� ��ü�� ������ ������ ���¸� ��ȯ�ϴ� ��
	 * @return ����� ���� ����
	 */
	public String getPowder() {
		return powder;
	}
	
	
	/**
	 * ������ ��� ��ü�� �ſ� ������ �����ϴ� ���� �ϴ� �޼ҵ�
	 * @param spiciness ������ �ſ�����
	 */
	public void setSpiciness(int spiciness) {
		this.spiciness=spiciness;
	}
	
	
	/**
	 * ������ ��� ��ü�� ������ �ſ������� ��ȯ�ϴ� ��
	 * @return ����� �ſ�����
	 */
	public int getSpiciness() {
		return spiciness;
	}
	
	
	/**
	 * ������ ��� ��ü�� �̸��� �����ϴ� ���� �ϴ� �޼ҵ�
	 * @param name ������ ����� �̸�
	 */
	public void setName(String name) {
		this.name=name;
	}
	
	/**
	 * ������ ��� ��ü�� ������ �̸��� ��ȯ�ϴ� ��
	 * @return ����� �̸�
	 */
	public String getName() {
		return name;
	}
	
	
	
	
	/**
	 * ������ ����� ��ü�� ����Ͽ� "���ְ� �Դ´�"�� �Դ� ���� ����
	 * @return
	 */
	public String eat() {
		return name+"�� ���ְ� �Դ´�.";
	}//eat
	
	
	/**
	 * ����� �̸��� ������ ��� �Դ����� ������ �����ϴ� �޼ҵ�
	 * @return ����� �̸�
	 */
	public String eat(String rname) {
		return name+"�� "+rname+" ���ְ� �Դ´�.";
	}//eat
	
	
	
	public static void main(String[] args) {

		
		
		
		
	}//main

}//class
