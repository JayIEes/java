package day0104;

/**
 * @author user
 * for문의 다양한 형태
 */
public class UseFor3 {

	public static void main(String[] args) {
		//무한루프
//		for( ; ; ) {
//			System.out.println("무한루프");
//			break; //가장 가까운 반복문을 빠져나간다.(안쪽에 위치해야함)
//		}//end for
		
	//	System.out.println("안녕"); //에러 발생 - 무한루프로인해 실행될 수 없기 때문에. (unreachable)
	
		
	//증가하는 수를 세는 무한루프
	for (int i = 0; ; i++) {
		System.out.println("무한루프"+i);
		break;
	}//end for
		
	
	//여러개의 초기값을 사용하는 for문
	for(int i=0, j=10, k=1 ; i<10 ; i++,j--,k+=k) { //조건식은 하나만!!!!!!
		System.out.println("i= "+i+", j= "+j+",k="+k);
	}//end for
	
	
	int[] temp= {1,2,3,4,5,6,7};
	//기존의 for
	for(int i=0;i<temp.length;i++) {
		System.out.println(temp[i]);
	}//end for
	//개선된 for
	for(int i:temp) {
		System.out.println(i);
	}//end for
	
	
	}//main

}//class
