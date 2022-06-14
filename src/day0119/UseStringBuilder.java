package day0119;

/**
 * @author user
 * �� ���ڿ��� �ٷ�� Ŭ����
 */
public class UseStringBuilder {

	public void useStringBuffer() {
		StringBuffer sb=new StringBuffer();
		//�� �߰�. append()
		sb.append(2022); //����
		sb.append('A'); //����
		sb.append(1.19); //�Ǽ�
		sb.append(false); 
	
		
		System.out.println(sb+" "+sb.length());//.toString()������  //����� ���ڿ�
	
		StringBuffer sb2 = new StringBuffer();
		sb2.append("������ ������ �Դϴ�."); //����
		sb2.insert(4, "2022�� 1�� 19�� "); //���̿� ����
		sb2.delete(3, 9);//���� 2022�� //���ε��� +1
		
		System.out.println(sb2);
	
	
	}//useStringBuffer
	
	
	public void useStringBuilder() {
		StringBuilder sb=new StringBuilder();
		//�� �߰�. append()
		sb.append(2022); //����
		sb.append('A'); //����
		sb.append(1.19); //�Ǽ�
		sb.append(false); 
	
		
		System.out.println(sb+" "+sb.length());//.toString()������  //����� ���ڿ�
	
		StringBuilder sb2 = new StringBuilder();
		sb2.append("������ ������ �Դϴ�."); //����
		sb2.insert(4, "2022�� 1�� 19�� "); //���̿� ����
		sb2.delete(3, 9);//���� 2022�� //���ε��� +1
		
		System.out.println(sb2);
		
		
		String fileName="e:/dev/workspave/javase_prj/day0119/Use.String.Builder.java";
		//���� ���/���ϸ��� "e:/dev/workspave/javase_prj/day0119/Use.String.Builder_bak.java"
		//�� ���� ���! UseStringBuilder.java ���ϸ� _bak ����� ���
	
		StringBuilder fn = new StringBuilder(fileName);
		fn.insert(fn.lastIndexOf("."), "_bak");
		System.out.println(fn);
		
		//������ �ڵ�
		StringBuilder sb3= new StringBuilder(fileName);
		sb3.insert(sb3.lastIndexOf("."),"_bak");
		
		System.out.println(sb3);
//		String temp=sb3; //sb3�� StringBuilder�� temp�� String�̶� �Ұ�
//		String temp=sb3.toString();
//		System.out.println(temp.toUpperCase());
		System.out.println(sb3.toString().toUpperCase());
		
	}//useStringBuilder
	
	
	

	
	public static void main(String[] args) {

		UseStringBuilder usb=new UseStringBuilder();
		System.out.println("-------------StringBuffer--------------");
		usb.useStringBuffer();
		System.out.println("--------------StringBuilder------------");
		usb.useStringBuilder();
		
		// +��� append�� �����!!
		
		
		
		
		
		
	}//main

}//class
