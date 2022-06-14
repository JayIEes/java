package day0111;

/**
 * 일차원 배열의 사용.
 * @author user
 */
public class UseArray {

	public void useArray1(){
		//1.선언 : 데이터형[] 배열명=null;
		int[] arr=null;
		//2. 생성 : 배열명 = new 데이터형[방의 수];
		//heap에 생성되고, 모돈방의 값은 자동 초기화된다. - 방의 개수가 변하지 않는다.(고정길이형)
		arr = new int[5];
	
		
		//3.값할당 : 배열명[방의번호]=값;
		arr[0]=2022;
		arr[1]=1;
		arr[2]=11;
		arr[3]=15;
		arr[4]=7;

		//값 사용 : 배열명[방의번호]
		System.out.println(arr[0]+"/"+arr[1]+"/"+arr[2]+"/"+arr[3]+":"+arr[4]); //주소가 나옴
		//일괄처리 : 한꺼번에 모아서 처리
		System.out.println("arr 배열의 방의 개수: "+arr.length);//
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"]="+arr[i]);
		}//end for
		System.out.println();
		
		//배열의 짝수번째 방의 값만 출력
		for(int i=0; i<arr.length;i+=2) { //if문 안쓰고 i+=2 이렇게
			
			System.out.println("arr["+i+"]="+arr[i]);
		}//end for
		
		System.out.println();
		//배열의 마지막 방부터 처음 방까지 출력
		for(int i=arr.length-1;i>-1;i--) {
			System.out.println("arr["+i+"]="+arr[i]);
		}//end for
	System.out.println("---------배열의 기본형 형식의 사용--------------------");
		int[] arr2=new int[] {10,20,30,40, 50, 60};
		int[] arr3={10,20,30,40, 50, 60};//new 생략
		
		System.out.println(arr3.length);
		for(int i=0; i<arr3.length;i++) {
			System.out.printf("arr[%d]=%-5d\n",i,arr3[i]);
		}//end for
		
		
		
	}//useArray1
	
	
	
	
	public static void main(String[] args) {
		
//		UseArray ua =new UseArray();
//		ua.useArray1();
		new UseArray().useArray1(); //method chain으로 호출 가능,, new UseArray가 객체이기 때문에!
		
		
		
		
		
	}//main

}//class
