package day0208;

import java.io.Serializable;

/**
 * @author user
 * Stream을 타고 JVM외부로 나갈 수 있는 클래스
 */

public class MyData implements Serializable  {

	

	/**
	 * 이 번호는 객체를 식별하기 위한 번호이고 1년 후에는 다른 번호로 변경됩니다.
	 */
	private static final long serialVersionUID = -392373309419751319L;
	
	//transient:직렬화 방지 키워드. 기본형데이터형,참조형데이터령이 직렬화되지 못하도록 막을 때 사용!
	
	
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
