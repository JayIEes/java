package day0111;

/**
 * ���ڿ��� �ٷ�� String class ���<br>
 * 
 * ���� : java.lang��Ű���� �����ϴ� Ŭ���� �̸����� Ŭ������ �����ϸ� ��Ű���� ������ 
 * 		�����̸��� Ŭ������ ���� ����Ѵ�.(���� ���) (java.lang ��Ű���� Ŭ������ ����ϴ� ���� �ƴϹǷ� ����!)
 * 		-import�� ����ص� ���� ���� 
 * �ذ�: 1. ���� �̸��� Ŭ������ ������ ������ "�ڹٿ��� �����ϴ� Ŭ������ full path"�η� �ĺ��Ͽ� ���.
 * 		full path : Ŭ������ ����� �� ��Ű������ ��� ����Ͽ� ����ϴ� ����.
 * 		String�� ���� java.lang.String
 * 
 * 		2. java.lang��Ű���� �����ϴ� �̸����� Ŭ������ ������ �ʴ´�.
 * @author user
 */
public class UseString {

	public static void main(String[] args) {
		String str = "AbcdEfg"; //�⺻�� ������ ���
		String str2= new String("asdfg3874@naver.com"); //������ ������ ���
		
		//substring(���۹��ڿ�, �� ���ڿ� +1)
		System.out.println(str2.substring(0,7));
		System.out.println(str+"���� 0~2 �ε��� ������ �ڽ� ���ڿ� "+str.substring(0,2));
		System.out.println(str+"���� 'Efg'�� �߶󺸱� "+str.substring(4));
		
		System.out.println(str2+"���� �����ּ� �ڸ��� "+str2.substring(0,str2.indexOf("@")));//��������
		System.out.println(str2+"���� �����ּ� �ڸ��� "+str2.substring(9,19));
		System.out.println(str2+"���� ������ �ּ� �ڸ��� "+str2.substring(str2.indexOf("@")+1,19));
		//substring(���۹��ڿ�) : �� �ε����� �����ϸ� ���ڿ��� ������ �ڸ���.
		System.out.println(str2+"���� ������ �ּ� �ڸ��� "+str2.substring(str2.indexOf("@")+1)); //�� �ε��� ����
	
		
		str="������";
		System.out.println(str+"�� '������'�ΰ�? "+str.equals("������"));
		System.out.println(str+"�� '��'�� �����Ͽ��°�? "+str.startsWith("��"));
		System.out.println(str+"�� '��'���� �����°�? "+str.endsWith("��"));
		
		str="������";
		System.out.println(str+"�� '������'�ΰ�? "+str.equals("������"));
		System.out.println(str+"�� '��'�� �����Ͽ��°�? "+str.startsWith("��"));
		System.out.println(str+"�� '��'���� �����°�? "+str.endsWith("��"));
		
		str="������ ȭ�����Դϴ�.";
		System.out.println(str+" �� '����'�� �����ϰ� �ִ°�? "+str.contains("����"));
		System.out.println(str+" �� '��'�� �����ϰ� �ִ°�? "+str.contains("��"));
		
		str="Java";
		String str3=str.concat("SE");
//		String str3= str+"SE"; //���� �Ȱ���. + �ᵵ ���� ����.
		System.out.println(str3);
		
		
		str="   Java SE   ";
		System.out.println("["+str.trim()+"]"); //���̿� �ִ� ������ ���ŵ��� �ʴ´�.
		
		
		str= "java java java";
		//ġȯ : ã�� ���ڸ� �ٸ� ���ڷ� ����
		System.out.println(str.replaceAll("ja", "ttt"));
		
		str="   Java SE   ";
		//replace ����� ���ڿ� �� ���� ����
		System.out.println("["+str.replaceAll(" ", "")+"]"); 
		
		
		//method chain : method�� ��� �����Ͽ� ����ϴ� ����.
		//
		str= "�� ��� �ù����~, �� �� �� ��!";
//		String filterTxt=str.replaceAll("�ù��","**");
//		String filterTxt=str.replaceAll("��","*").replaceAll("��", "*"); //�����ص� �Ÿ� �� ����
		String filterTxt=str.replaceAll("��","*").replaceAll("��", "*").replaceAll("��","*").replaceAll("��","*");
		
		System.out.println(filterTxt);
		
		int i=11; 
		double l=2022.0111; //���⼭ L�� '�����'�� ���Ѵ�.
		
		str = String.valueOf(i);  // str=i+""; �̰͵� �Ǳ� �ϴµ� �������� �ʴ´�.
		str2=String.valueOf(l);
		
		System.out.println(str+" / "+str2);
		
		////////////////////String�� �ʱ�ȭ////////////////////
		str = null;
		str2="";
		
		if(str==null) {//null�� ���¿����� String class�� �����ϴ� method�� ȣ���� �� ����.
			System.out.println(str+"�� heap�� �ּҸ� �������� �ʾҽ��ϴ�.");
		}//end if
		
		if(str2.equals("")) {//empty�� ���¿����� String class�� �����ϴ� method�� ȣ���� �� �ִ�.
			System.out.println(str2+"�� ���ڿ� ������� �ּҸ� �����Ͽ����ϴ�.");
			
		}
		
		if(str2.isEmpty()) {//empty�� ���¿����� String class�� �����ϴ� method�� ȣ���� �� �ִ�.
			System.out.println(str2+"�� ���ڿ� ������� �ּҸ� �����Ͽ����ϴ�.");
			
		}
		
		
		
		
	}//main


}//class
