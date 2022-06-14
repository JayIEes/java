package day0208;

import java.io.Serializable;

/**
 * @author user
 * Stream�� Ÿ�� JVM�ܺη� ���� �� �ִ� Ŭ����
 */

public class MyData implements Serializable  {

	

	/**
	 * �� ��ȣ�� ��ü�� �ĺ��ϱ� ���� ��ȣ�̰� 1�� �Ŀ��� �ٸ� ��ȣ�� ����˴ϴ�.
	 */
	private static final long serialVersionUID = -392373309419751319L;
	
	//transient:����ȭ ���� Ű����. �⺻����������,�����������ͷ��� ����ȭ���� ���ϵ��� ���� �� ���!
	
	
	private /*transient*/ String name;
	private double height;
	private /*transient*/ double weight; 
	
	public MyData() {
		
	}
	
	public MyData(String name, double height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	
	
}
