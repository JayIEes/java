package day0107;

public class UseRamyeon {

	public static void main(String[] args) {

		Ramyeon shin=new Ramyeon();
		
		shin.setName("�Ŷ��");
		shin.setNoodle("�ձ�");
		shin.setPowder("����");
		shin.setSpiciness(3);
		
		System.out.println(shin.getName()+"�� "+shin.getNoodle()+"��� "+shin.getSpiciness()
		+"�ܰ� ������ �ſ� "+shin.getPowder()+"������ ������ �ִ�.");
		System.out.println(shin.eat());
		System.out.println(shin.eat("�ſ��ϸ�"));
		/////////////////////�Ŷ��////////////////////////////////
		System.out.println();
		
		
		Ramyeon O=new Ramyeon();
		
		O.setName("��¡��«��");
		O.setNoodle("�ձ�");
		O.setPowder("����");
		O.setSpiciness(2);
		
		System.out.println(O.getName()+"�� "+O.getNoodle()+"��� "+O.getSpiciness()
		+"�ܰ� ������ �ſ� "+O.getPowder()+"������ ������ �ִ�.");
		System.out.println(O.eat());
		System.out.println(O.eat("���� ������"));
		///////////////////////////��¡��«��//////////////////////
		System.out.println();
		
		
		
		
		Ramyeon jin=new Ramyeon();
		
		jin.setName("�����");
		jin.setNoodle("�׸�");
		jin.setPowder("����");
		jin.setSpiciness(1);
		
		System.out.println(jin.getName()+"�� "+jin.getNoodle()+"��� "+jin.getSpiciness()
		+"�ܰ� ������ �ſ� "+jin.getPowder()+"������ ������ �ִ�.");
		System.out.println(jin.eat());
		System.out.println(jin.eat("ȣȣ�Ҹ�"));
		/////////////////////////////�����/////////////////////////////////
		
		
		
		
		
	}//main

}//class
