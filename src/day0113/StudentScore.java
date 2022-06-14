package day0113;

/**
 * @author user
 * 사용자 정의 자료형 숙제 01-13
 */
public class StudentScore {

	private String name;
	private int javaScore;
	private int oracleScore;
	private int htmlScore;
	private int totalScore;
	private double avgScore;
	
	
	

	public StudentScore() {
		
	}//StudentScore() 생성자


	public StudentScore(String name, int javaScore, int oracleScore, 
			int htmlScore, int totalScore,double avgScore) {
		super();
		this.name = name;
		this.javaScore = javaScore;
		this.oracleScore = oracleScore;
		this.htmlScore = htmlScore;
		this.totalScore = totalScore;
		this.avgScore = avgScore;
	}//StudentScore() 오버로드 생성자


	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getJavaScore() {
		return javaScore;
	}


	public void setJavaScore(int javaScore) {
		this.javaScore = javaScore;
	}


	public int getOracleScore() {
		return oracleScore;
	}


	public void setOracleScore(int oracleScore) {
		this.oracleScore = oracleScore;
	}


	public int getTotalScore() {
		return totalScore;
	}


	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}


	public double getAvgScore() {
		return avgScore;
	}


	public void setAvgScore(double avgScore) {
		this.avgScore = avgScore;
	}


	public int getHtmlScore() {
		return htmlScore;
	}


	public void setHtmlScore(int htmlScore) {
		this.htmlScore = htmlScore;
	}
	
	
	
	
	
	
	
	
	
	
	
}//class
