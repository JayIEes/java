package day0107;

/**
 * @author user
 * 1. ��ī�� Ŭ������ ����Ͽ� ��ü�� �����ϰ�
 * 2. ��ī�� ��ü�� �����ϴ� ����� ���.
 */
public class UseMarker {

	
	public static void main(String[] args) {
		//4.��ī�� Ŭ������ ����Ͽ� ������ ��ī�����
		
		Marker black=new Marker();//������ ���������� ����. (�ڵ��ʱ�ȭ)
		System.out.println(black); //�ּҰ� ���
		
//		black ��ü�� �Ѳ�1��, ��ü1��, �������� �����غ���.
//		black.color("black"); //instance ������ private ���������ڰ� ����Ǿ� �־� �ܺο��� ���� ���� �Ұ�
//		black.cap=1;
		
		//������ ��ī�� ��ü�� ���� ����
//		black.setCap(1);
//		black.setBody(1);
//		black.setColor("����");
		
		System.out.println(black.getColor()+"���� ��ī���� �Ѳ� : "+black.getCap()+"��, ��ü : "+black.getBody()+"��");
		
		//5. ��ī�� Ŭ������ �����ϴ� ��� ���
		System.out.println(black.write());
		
		
		
		////������ ��ī���� �����Ͽ� ���� �ְ� ����غ�����
		Marker red = new Marker(1,1,"����");
		System.out.println(red);
		
//		red.setCap(1);
//		red.setBody(1);
//		red.setColor("����");
		
		System.out.println(red.write());
		System.out.println(red.write("��ſ� �ָ�")+" "+black.write("�ȴ�"));
		
	}//main

}//class
