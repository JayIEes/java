package day0113;

/**
 * �л��� ������ ������ �� �ִ� ��������
 * �л��� ������ �й� �̸� ���� ������ Ű �� ����Ǿ�� ��
 * @author user
 */
public class Student {

	private int num;
	private String name;
	private int age;
	private String bloodType;
	private double height;
	
	public Student() {
	}//Student 

	public Student(int num, String name, int age, String bloodType, double height) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
		this.height = height;
	}//Student

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
	
	
	
	
	
	
}//class
