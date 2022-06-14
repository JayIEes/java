package day1227;
/**
기본형 데이터형으로 변수 선언 <br>
형명시 사용
*/

public class UseDataType{

	public static void main(String[] args) {
		//정수를 저장할 수 있는 데이터형 byte int short long
		//signed value 저장 (양수 음수 저장가능)
	byte a=-127;
	short b=10;
	int c=2147483647;
	long d = 10; // 형명시를 생략
	long e=2147483648L;//정수 상수를 저장하는 리터럴의 크기가 4byte 이므로 상수 값은 4byte를 초과하는 상수 값을 작성할 수 없다.

	//문자를 저장할 수 있는 데이터형 : char
	//문자를 할당하면 문자에 해당되는 unicode값이 할당
	//charg형 기본값은 \u0000
	char f= 65; //char f='A'; 와 같다
	char g= '0';
	char h='가';
	char temp='\u0000';
	//char temp=''; 에러 

	System.out.println("byte : "+a+", short : "+b+", int : "+c+", long : "+e); 

	System.out.println("g= "+g+"f"+f+h); // 코드값을 가진 char변수를 출력하면 코드 값에 대한 문자가 출력

	float i = 12.27f;
	double j=12.27;

	System.out.println(i);
	System.out.println(j);

	//boolean 
	boolean l=true; //boolean l=1;에러 오직 true 와 false만 가능
 	boolean m=false;
	
	System.out.println("boolean "+  l+","+m);

	



	}//main
}//class
