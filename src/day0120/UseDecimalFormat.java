package day0120;

import java.text.DecimalFormat;

/**
 * 숫자포맷
 * # : 데이터가 존재할 때만 출력
 * 0 : 값이 없는 부분에 0을 넣어 출력
 * @author user
 */
public class UseDecimalFormat {

	public UseDecimalFormat() {
		int i= 1_500_000;//JDK 1.7에서부터는 숫자에 구분자로 _를 넣어 가독성 향상
		//_는 출력되지 않음
		System.out.println(i);
		
		DecimalFormat df=new DecimalFormat("##,###,###");
		System.out.println(df.format(i));
		
		DecimalFormat df2=new DecimalFormat("00,000,000");
		System.out.println(df2.format(i));
		
		
		double d=2020.0120;
		DecimalFormat df3=new DecimalFormat("##,###,###.##"); //소수점 이하 2자리까지만 출력
		System.out.println(df3.format(d));
		
		DecimalFormat df4=new DecimalFormat("00,000,000.00"); 
		System.out.println(df4.format(d));

		i=11111111;
		i=Integer.MAX_VALUE;
		
		DecimalFormat df5=new DecimalFormat("#,###"); //숫자가 몇개인지 모르겠을때 이렇게 넣어줌
		System.out.println(df5.format(i));
	}//UseDecimalFormat
	
	
	
	
	public static void main(String[] args) {

	new UseDecimalFormat();
		
		
	}//main

}
