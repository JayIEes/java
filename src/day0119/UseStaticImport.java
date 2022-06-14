package day0119;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.String.valueOf;
import static java.lang.Integer.parseInt;


//import static java.lang.Byte.MAX_VALUE; //사용하는 코드에서 에러 발생.



public class UseStaticImport {

	public static void main(String[] args) {
		System.out.println("int의 최고값 "+Integer.MAX_VALUE); //import안했을 때어떤 클래스에 있는 constant인지 명시해줘야 한다
			System.out.println("int의 최고값 "+MAX_VALUE); //클래스명 빼고 사용 가능
			System.out.println("int의 최고값 "+MAX_VALUE); 
			System.out.println("int의 최고값 "+MAX_VALUE); //이렇게 여러 번 쓸게 아니라면 import하지 않는게 효율적.
			
			byte b =10;
			int i=20;
			double d=2022.01;
			
//			String bs=new Byte(b).toString(); 
//			String bs=String.valueOf(b);
//			String is=String.valueOf(i);
//			String ds=String.valueOf(d);
			
			String bs=valueOf(b);
			String is=valueOf(i);
			String ds=valueOf(d);
			System.out.println(bs+"/"+is+"/"+ds);

			
			int sb=parseInt(bs);
			int si=parseInt(is);
			double sd=Double.parseDouble(ds); //double이라 Integer.parseInt. 안됨
			System.out.println(sb+"/"+si+"/"+sd);
//			int sb=bs;
//			int sb=is;
//			int sb=ds;
			
			
			
			
	}//main

}//class
