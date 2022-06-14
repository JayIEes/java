package day1227;
/**
자동형변환<br>
int의 하위 데이터형이 연산되면 자동으로 int에 저장되어 결과가 반환한다.
*/
public class TestPromotion {

	public static void main(String[] args) {
	
	byte num1=10; //4byte 리터럴이 1byte로 변환되어 할당된다. 
	byte num2=20;
	//byte result=num1+num2; 연산결과가 int로 발생한 값을 byte에 저장하려고 시도하기 때문에 에러발생
	int result=num1+num2;//자동 형변환 프로모션

		System.out.println(num1+"+"+num2+"="+result);


	
	byte result1=(byte)(num1+num2); // 
	System.out.println(num1+"+"+num2+"="+result1);
	}
}
