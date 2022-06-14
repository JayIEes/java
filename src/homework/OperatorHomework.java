package homework;
class OperatorHomework {
	public static void main(String[] args) {

	//숙제 1.
	int i=12;
//		System.out.println(~12+1);
	System.out.println(~i+1);//i에 값이 있으니 i를 사용해서 연산하면 됩니다.

	//숙제 2.
	i = 10; //이미 변수선언 했으니 int 붙이면 안됨!
	int j = -10;
		System.out.println(i++ - --j); //결과 값이 21로 나올 것으로 예상하였다.

	//숙제 3.
	i = -1>>>1; //음수니까 >>는 빈칸을 1로 채우므로 값이 변하지 않으니, >>>를 사용한다(?)
	System.out.println(i>>27); // 이 이외에 혹시 다른 방법이 있을까요?
	//없습니다. 잘하셨어요

	i = -1 << 32;
	System.out.println(i);

	i=-1;
		System.out.println(~i);


	}
}
