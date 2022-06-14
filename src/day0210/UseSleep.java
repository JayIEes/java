package day0210;

//1. Runnable 구현
public class UseSleep implements Runnable {

	//2. run method의 Override
	@Override
	public void run() {
		//3. Thread로 동작해야할 코드 정의
		try {
		for(int i=0;i<10;i++) {
			System.out.println(i);
			//지정한 시간동안 block상태로 이전
			Thread.sleep((60)*1000);
			
		}//end for
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}//run
	
	
	
	public static void main(String[] args) {
		//4.객체화
		UseSleep us=new UseSleep();
		//5.Thread 클래스와 has a 관계
		Thread t=new Thread(us);
		//6.start()호출
		t.start();
		
	}//main


}//class
