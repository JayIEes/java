package day1229;
/**
관계 연산자
> < >= <= == !=
*/

public class Operator4 {
	public static void main(String[] args) {
		
	int i=10, j=12, k=10; //지역변수, 초기화를 하고 써야 에러가 덜 난다.
	//== 값이 같다면 true, 값이 다르다면 false를 반환
	//System.out.println(i+" == "+k+" = " +i==k); //산술이 먼저연산-문자열이 만들어짐, 비교불가 
	System.out.println(i+" == "+k+" = " +(i==k)); //연산의 우선순위를 바꿔준다.
	System.out.println(i+" == "+j+" = " +(i==j));

	//!= 값이 같다면 false, 값이 다르다면 true를 반환
	System.out.println(i+" != "+k+" = " +(i!=k));
	System.out.println(i+" != "+j+" = " +(i!=j));

	}
}
