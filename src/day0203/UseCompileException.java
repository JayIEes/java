package day0203;

import java.io.FileNotFoundException;

/**
 * @author user
 * Compile Exception
 * �ڵ� �ÿ� ���ܰ� �߻��ϴ� ����(bytecode�� ����� ����������� ����.)
 */
public class UseCompileException {

	public UseCompileException() {
		
		//new�� ������� �ʰ� �ܺ� Ŭ������ ��ü�� ������ ��
		try {
//		Class obj=Class.forName("java.lang.String");
		Class obj=Class.forName("day0203.UseRuntimeException1");
		System.out.println(obj);
		}catch(ClassNotFoundException cnfe) {
			System.err.println("Ŭ������ �̸��� Ȯ���ϼ���.");
			
			String msg=cnfe.getMessage();
			System.err.println("������ �޽��� "+msg);
			
			String msg1=cnfe.toString();
			System.err.println("����ó�� ��ü�� ������ �޽��� "+msg1);
			
			cnfe.printStackTrace(); //console��µ� �Բ� ����
			System.out.println("----------------------------------------------");
		}
		
//			//try~������ �ڵ尡 ���ܸ� Throws������ �͸� catch �����ϴ�.
//		}catch(FileNotFoundException n) { 
		
//		}
		
		
	}//UseCompileException
	
	
	public static void main(String[] args) {
		new UseCompileException();
		
	}//main

}
