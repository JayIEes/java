package day0107;

public class UseRamyeon {

	public static void main(String[] args) {

		Ramyeon shin=new Ramyeon();
		
		shin.setName("신라면");
		shin.setNoodle("둥근");
		shin.setPowder("가루");
		shin.setSpiciness(3);
		
		System.out.println(shin.getName()+"은 "+shin.getNoodle()+"면과 "+shin.getSpiciness()
		+"단계 정도의 매운 "+shin.getPowder()+"스프를 가지고 있다.");
		System.out.println(shin.eat());
		System.out.println(shin.eat("매워하며"));
		/////////////////////신라면////////////////////////////////
		System.out.println();
		
		
		Ramyeon O=new Ramyeon();
		
		O.setName("오징어짬뽕");
		O.setNoodle("둥근");
		O.setPowder("가루");
		O.setSpiciness(2);
		
		System.out.println(O.getName()+"은 "+O.getNoodle()+"면과 "+O.getSpiciness()
		+"단계 정도의 매운 "+O.getPowder()+"스프를 가지고 있다.");
		System.out.println(O.eat());
		System.out.println(O.eat("냄새 맡으며"));
		///////////////////////////오징어짬뽕//////////////////////
		System.out.println();
		
		
		
		
		Ramyeon jin=new Ramyeon();
		
		jin.setName("진라면");
		jin.setNoodle("네모난");
		jin.setPowder("가루");
		jin.setSpiciness(1);
		
		System.out.println(jin.getName()+"은 "+jin.getNoodle()+"면과 "+jin.getSpiciness()
		+"단계 정도의 매운 "+jin.getPowder()+"스프를 가지고 있다.");
		System.out.println(jin.eat());
		System.out.println(jin.eat("호호불며"));
		/////////////////////////////진라면/////////////////////////////////
		
		
		
		
		
	}//main

}//class
