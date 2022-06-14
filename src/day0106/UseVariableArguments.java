package day0106;

/**
 * @author user
 * 가변인수 사용
 */

 
public class UseVariableArguments {

	/**
	 * variable arguments를 사용한 method로 jdk1.5+에서부터 사용할 수 있다.
	 * Variable argumentssms method내부에서 배열(주소를 가지고 있는 참조형 데이터형)로 사용된다.
	 * @param param
	 */
	public void useVA(int ... param ){
		//System.out.println(param);//참조형데이터형은 주소가 출력
		for(int i=0; i<param.length;i++) {
			System.out.print(param[i]+" ");
		}//end for
	}//useVA
	
	
//	public void useVA2(int ... paramI, int paramJ) { //VA는 가장 마지막 parameter로만 정의된다.
	public void useVA2(int paramI, int ... paramJ) { //VA는 가장 마지막 parameter로만 정의된다.
	
		
	}//useVA2
	
	
	
	
	public static void main(String[] args) {
		//객체화 : 인스턴스 method나 변수를 사용하기 위해.
		UseVariableArguments uva=new UseVariableArguments();
		uva.useVA(0);
		System.out.println("-----------------------------------");
		uva.useVA(1);
		System.out.println("-----------------------------------");
		uva.useVA(1,2,3,4,5,100,1000); //동일형으로 n개의 값을 넣을 수 있다.
		System.out.println("---------------------------------");
		uva.useVA(1,'a'); //동일형으로 n개의 값을 넣을 수 있다.
		System.out.println();
		uva.useVA2(1, 1,2,3,4);
		uva.useVA2(4); //int형은 반드시 값이 입력되어야한다. / VA는 생략가능
		
		
		
		
		
	}//main

}//class
