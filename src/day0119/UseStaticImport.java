package day0119;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.String.valueOf;
import static java.lang.Integer.parseInt;


//import static java.lang.Byte.MAX_VALUE; //����ϴ� �ڵ忡�� ���� �߻�.



public class UseStaticImport {

	public static void main(String[] args) {
		System.out.println("int�� �ְ� "+Integer.MAX_VALUE); //import������ ��� Ŭ������ �ִ� constant���� �������� �Ѵ�
			System.out.println("int�� �ְ� "+MAX_VALUE); //Ŭ������ ���� ��� ����
			System.out.println("int�� �ְ� "+MAX_VALUE); 
			System.out.println("int�� �ְ� "+MAX_VALUE); //�̷��� ���� �� ���� �ƴ϶�� import���� �ʴ°� ȿ����.
			
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
			double sd=Double.parseDouble(ds); //double�̶� Integer.parseInt. �ȵ�
			System.out.println(sb+"/"+si+"/"+sd);
//			int sb=bs;
//			int sb=is;
//			int sb=ds;
			
			
			
			
	}//main

}//class
