package day0210;

import java.util.Random;

public class Work0210 implements Runnable {

	
	@Override
	public void run() {
		
		Random r=new Random();
		
		System.out.print("loading ");
		
		try {
			for(int i=0; i<20;i++) {
					System.out.print(".");
					Thread.sleep((long)(r.nextInt(900)));
			}//end for
			
			System.out.println(" finish");
		
		}catch(InterruptedException e){
			e.printStackTrace();
		}//end catch
	}//run
	
	
	
	public static void main(String[] args) {

		Work0210 w=new Work0210();
		Thread t=new Thread(w);
		t.start();
		
	}//main


}
