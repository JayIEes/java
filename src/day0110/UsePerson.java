package day0110;

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
		//4. 객체화
		Person jisuk=new Person();
		//method 호출 (일을 하기 위해)
//		jisuk.setEye(2);
//		jisuk.setNose(1);
//		jisuk.setMouth(1); //생성자에서 이미 이 일을 하고 있으니 이 코드들은 쓸모없다.
		jisuk.setName("서지숙");
		
		//5. 생성된 객체 사용.
		System.out.println(jisuk.eat());
		System.out.println(jisuk.eat("샌드위치", 10000));
	
		Person jinban=new Person(3,1,1); //객체화 : 사람이 태어난 것.(애기) - 태어난 사람이 아무것도 가지지 않음.
//		jinban.setEye(3);//태어난 이후 눈
//		jinban.setNose(1);//코
//		jinban.setMouth(1);//입을 설정
		
		jinban.setName("천진반");
		System.out.println(jinban.getEye()+" / "+jinban.getNose()+" / "+jinban.getMouth()+ " / "
		+jinban.getName());
	
		
		System.out.println(jinban.eat()); //생성된 객체를 사용
		System.out.println(jinban.eat("선두",0));
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}//class
