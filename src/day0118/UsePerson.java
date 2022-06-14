package day0118;

/**
 * @author user
 * Person 클래스를 객체화하여 사용할 목적으로 만드는 클래스
 */
public class UsePerson {

	/**
	 * java application
	 * @param args
	 */
	public static void main(String[] args) {
	
		HongGilDong hgd=new HongGilDong();
		//코드의 재사용성. : 부모 클래스의 자원을 자식 클래스에 존재하는 것 처럼 사용한다.
		hgd.setName("홍길동");
		System.out.printf("%s의 눈은 %d개, 코 %d개, 입 %d개\n",hgd.getName(),hgd.getEye(),
							hgd.getNose(),hgd.getMouth());
		System.out.println(hgd.eat());
		System.out.println(hgd.eat("뜨끈한 국밥",1));
		
		//자신만의 특징을 구현한 method 호출
		System.out.println(hgd.fight(4));//5>6
		System.out.println(hgd.fight(5));//6>7
		System.out.println(hgd.fight(7));//7
		System.out.println(hgd.fight(10));//7>6
		System.out.println(hgd.fight(6));//6>6
		
		System.out.println("==================================================");
		Clark superman=new Clark();
		//코드의 재사용성
		superman.setName("클락 켄드");
		
		System.out.printf("%s의 눈은 %d개, 코 %d개, 입 %d개\n",superman.getName(),superman.getEye(),
						superman.getNose(),superman.getMouth());
		System.out.println(superman.eat());
		System.out.println(superman.eat("스테이크",10));
		
		///자신만의 특징을 구현
		String stone="짱돌";
		System.out.println(superman.power(stone));
		stone="다이아몬드";
		System.out.println(superman.power(stone));
		stone="크립토나이트";
		System.out.println(superman.power(stone));
		
		////날기위한 작업
		System.out.println(superman.drivingForce());
		System.out.println(superman.upwardForce());
		
		
		
		
		System.out.println("==================================================");
//		MeMyself mm= new MeMyself();
//		mm.setName("서지숙");
//		System.out.printf("%s의 눈은 %d개, 코 %d개, 입 %d개\n",mm.getName(),mm.getEye(),
//							mm.getNose(),mm.getMouth());
//		System.out.println(mm.eat());
//		System.out.println(mm.eat("라면",3000));
//		
//		String food="치킨";
//		System.out.println(mm.enjoyingFood("파스타"));
//		System.out.println(mm.enjoyingFood("치킨"));
//		System.out.println(mm.enjoyingFood("파스타"));
//		System.out.println(mm.enjoyingFood("콩밥"));
//		System.out.println(mm.enjoyingFood("치킨"));
//		System.out.println(mm.enjoyingFood("파스타"));
//		System.out.println(mm.enjoyingFood("치킨"));
//		System.out.println(mm.enjoyingFood("파스타"));
	
		
		
		
	}//main

}//class
