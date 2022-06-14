package day0114;

/**
 * ����� ������� ��ü�𵨸��Ͽ� �ۼ��� Ŭ����.<br>
 * ����� Ư¡ : �� �� �� �̸� 
 * ������ Ư¡ : �Դ� ��
 * @author user
 */
public class Person {

	private int eye, nose, mouth;
	public String name;
	
	
	/**
	 * ��� ��ü�� ������ �� �⺻������ ������ �־�� �� �� �����ϴ� �⺻ ������<br>
	 *  �� 2��, �� 1��, �� 1��
	 */
	public Person() {
		//��� ��ü�� ������ �� �⺻������ ������ �־���� �� ����
		this(2,1,1); //01-13-2022�� �����ڸ� ȣ���ϴ� �ڵ�� ����.
	}//Person
	
	/**
	 * ��, ��, ���� ������ �ٸ� �����ü�� ������ �� ����ϴ� ������ (overload�� ������)
	 * @param eye ��
	 * @param nose ��
	 * @param mouth ��
	 */
	public Person(int eye, int nose, int mouth) {
		this.eye=eye;
		this.nose=nose;
		this.mouth=mouth;
			
	}
	
	
	
	
	/**
	 *setter method : �Էµ� ���� instance variable�� �����ϴ� ��.
	 *������ ��� ��ü�� ���� ������ �����ϴ� ��
	 * @return ������ ���� ����
	 */
	public void setEye(int eye) {
		this.eye=eye;
	}//setEye
	
	/**
	 * ������ ��� ��ü�� ���� ������ �����ϴ� ��
	 * @param nose ������ ���� ����
	 */
	public void setNose(int nose) {
		this.nose=nose;
	}//setNose
	
	
	/**
	 * ������ ��� ��ü�� ���� ������ �����ϴ� ��.
	 * @param mouth ������ ���� ����
	 */
	public void setMouth(int mouth) {
		this.mouth=mouth;
	}//setMouth
	
	/**
	 * ������ ��� ��ü�� �̸��� �����ϴ� ��.
	 * @param name ������ �̸�
	 */
	public void setName(String name) {
		this.name=name;
	}
	
	
	
	/**
	 * getter method : ��ü�� ������ �ִ� instance variable�� ���� ��� ��
	 * @return ��ü�� ���� ����.
	 */
	public int getEye() {
		return eye;
	}//getEye
	
	
	/**
	 * ������ ��� ��ü�� ������ �ִ� nose ������ ���� ��� ��.
	 * @return ��ü�� ���� ����
	 */
	public int getNose() {
		return nose;
	}//getNose
	
	
	/**
	 * ������ ��� ��ü�� ������ �ִ�  mouth ������ ���� ��� ��.
	 * @return ��ü�� ���� ����
	 */
	public int getMouth() {
		return mouth;
	}//getMouth
	
	
	/**
	 * ������ ��� ��ü�� ������ �ִ�  name ������ ���� ��� ��.
	 * @return ��ü�� �̸�
	 */
	public String getName() {
		return name;
	}//getName
	
	
	
	
	
	/**
	 * ������ Ư¡ ����
	 * ������ ��� ��ü�� ������ ���� �Դ� ��
	 * @return ���� �Դ� ��
	 */
	public String eat() {
		return name+"��(��) ������ ���� �Դ´�." ;
	}
	
	/**
	 * ������ ��� ��ü�� �ۿ��� ������ ��Դ� ��
	 * @param menu ������ ����
	 * @param price ������ ����
	 * @return �ۿ��� ��Դ� ��
	 */
	public String eat(String menu,int price) {
		return name+"��(��) �Ĵ翡�� "+menu+"�� ������ "+price+"�� ���� ��Դ´�.";
	}
	
	
}//class
