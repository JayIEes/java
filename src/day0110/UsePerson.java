package day0110;

/**
 * @author user
 * Person Ŭ������ ��üȭ�Ͽ� ����� �������� ����� Ŭ����
 */
public class UsePerson {

	/**
	 * java application
	 * @param args
	 */
	public static void main(String[] args) {
		//4. ��üȭ
		Person jisuk=new Person();
		//method ȣ�� (���� �ϱ� ����)
//		jisuk.setEye(2);
//		jisuk.setNose(1);
//		jisuk.setMouth(1); //�����ڿ��� �̹� �� ���� �ϰ� ������ �� �ڵ���� �������.
		jisuk.setName("������");
		
		//5. ������ ��ü ���.
		System.out.println(jisuk.eat());
		System.out.println(jisuk.eat("������ġ", 10000));
	
		Person jinban=new Person(3,1,1); //��üȭ : ����� �¾ ��.(�ֱ�) - �¾ ����� �ƹ��͵� ������ ����.
//		jinban.setEye(3);//�¾ ���� ��
//		jinban.setNose(1);//��
//		jinban.setMouth(1);//���� ����
		
		jinban.setName("õ����");
		System.out.println(jinban.getEye()+" / "+jinban.getNose()+" / "+jinban.getMouth()+ " / "
		+jinban.getName());
	
		
		System.out.println(jinban.eat()); //������ ��ü�� ���
		System.out.println(jinban.eat("����",0));
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}//class
