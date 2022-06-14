package day1228;
/**
단항 연산자<br>
연산자 대상체
~ ! + - ++ --

*/


public class Operator1 {

	public static final int MAX=100;

	public static void main(String[] args) {
		int i =12;
		int j =-19;

	 System.out.println("~"+i+" = "+~i);//양수 : 부호변경 1증가 
	System.out.println("~"+j+" = "+~j);//음수 : 부호변경 1감소 

	i=12;
	j=28;
	//!을 관계 연산자 앞에 사용
	//System.out.println(i+">"+j+ "="+i>j); // i+j문자열이 되어버림
	System.out.println(i+">"+j+ "="+!(i>j)); 

	boolean flag1 = true, flag2=false;
	//!을 boolean형 앞에 사용
	System.out.println("!"+flag1+" = " +!flag1);
	System.out.println("!"+flag2+" = " +!flag2);

	i=12;
	j=-37;

//+연산자는 아무런 일도 하지 않음. 형식적 제공
	System.out.println("+"+i+"="+ +i); //12
	System.out.println("+"+j+"="+ +j); //-37

	System.out.println("-"+i+"="+ -i); //-12
	System.out.println("-"+j+"="+ -j); //37


	//증가연산, 감소연산
	i=10;
	j=12;
	System.out.println("i : "+i+", j :"+j);
	++i;
	i++;
	--j;
	j--;
	System.out.println("증가연산 후 i : "+i+", 감소연산 후 j :"+j);

	int result=0;
	//전위 연산
	result=++i;
	System.out.println("전위연산 후 i= " +i+", result : " +result);
	
	result=0;
	//후위연산 : 대입 후 연산
	result=i++;
	System.out.println("후위연산 후 i= " +i+", result : " +result);//i=14, result=13
	
	System.out.println("전위 : "+ ++i); //i를 증가한 후 method에 할당 15가 출력
	System.out.println(i);

	System.out.println("후위 : "+ i++); //i를 method에 할당한 후 i를 증가, 15 출력
	System.out.println(i); //16

	i=10;
	j=20;
	System.out.println(i++ +--j);//29


//	 i=20++; // 상수에는 증가 또는 감소 연산자를 사용할 수 없다.
//	i=--MAX;// constant에는 증가, 감소 연산자를 사용할 수 없다.



	}
}
