package day0110;

/**
 * @author user
 * String class���� �����ϴ� method���.
 */
public class UseStringMethod {

	public static void main(String[] args) {
		String str="AbcDcEf";//�⺻�� ����
		String str2=new String("asdfg3874@naver.com"); //������ ����
		
		System.out.println(str+"�� ���� �� :"+ str.length());
		System.out.println(str2+"�� ���� �� :"+ str2.length());
		
		System.out.println(str+"�� ��� �빮�ڷ� :"+ str.toUpperCase());
		System.out.println(str2+"�� ��� �빮�ڷ� :"+ str2.toUpperCase());
		
		System.out.println(str+"�� ��� �ҹ��ڷ� :"+ str.toLowerCase());
		System.out.println(str2+"�� ��� �ҹ��ڷ� :"+ str2.toLowerCase());
		
		str="AbcdEfbcd";
		System.out.println(str+"���� 'c'�� �ε���"+str.indexOf("c"));
		//���� ���ڿ��� ���� ���� ���� �ε����� ��ȯ
		System.out.println(str+"���� 'c'�� �ε���"+str.indexOf("Efb"));
		//�������� �ʴ� ���ڿ��� -1�� ��ȯ
		System.out.println(str+"���� 'c'�� �ε���"+str.indexOf("Ek"));
		
		//���ڿ� �ڿ������� �ε��� ���
		System.out.println(str+"���� �ڷκ��� ã������ 'c'�� �ε���"+str.lastIndexOf("c"));
		System.out.println(str+"���� �ڷκ��� ã������ 'bcd'�� �ε���"+str.lastIndexOf("bcd"));
		System.out.println(str+"���� �ڷκ��� ã������ 'k'�� �ε���"+str.lastIndexOf("k"));
		
		
		//Ư�� �ε����� ���� ���
		System.out.println(str+"���� 4��° �ε����� �ش��ϴ� ���� "+str.charAt(4));
		System.out.println(str+"���� 2��° �ε����� �ش��ϴ� ���� "+str.charAt(2));
		//�������� �ʴ� �ε����� ����ϸ� ���� �߻�
		

		
		
		
		
	}//main

}//class
