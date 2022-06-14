package day1227;
/**
강제 형 변환 <br>
개발자가 필요한 데이터형으로 변환하는 것<br>
문법)
(변환활 데이터형)변수명 또는 상수명;
*/

public class Casting {
	public static void main(String[] args) {
	

	char c='A';
	//변수 앞에 강제형 변환
	int i= c;//프로모션 때문에 되는 것 , int i= (int)c; 원래는 이렇게 해줘야함
	System.out.println(c+"의 unicode값"+i);

	//상수 앞에 강제 형 변환
	float f = (float)12.27;//리터럴은 8byte이고, 강제 형변환으로 인해 4byte만 할당됨
	System.out.println("float : "+f);

	i=(int)f; // 값손실 발생
// i=f;는 4byte로 크기는 같지만 값의 종류가 다르므로 할당되지 않는다.
	System.out.println("값 손실 발생: 원래 값 "+f+",변환된 값 : "+i);

	//boolean은 동일 형으로만 변환된다.
	boolean b=true;
	boolean b1=false;
	// i=b; // 에러 : boolean은 다른 형으로 변환되지 않는다.
	b1=b;
	System.out.println(b1+"/" +b);

	
	//기본형 데이터형을 참조형으로 강제 형변환 
	//i=12;
	//String s=i;//(int를 string으로 변환 불가)
	//String s=(String)i;	//기본형 i를 참조형 string으로 casting 할 수 없다.

	
	String s = "2021";
	System.out.println(s);

	//i=(int)s; // 참조형 s를 기본형 int로 casting 할 수 없다.


	}//main
}//class
