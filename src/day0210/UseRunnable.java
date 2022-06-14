package day0210;

/**
 * Runnable interface�� ������ Ŭ����
 * @author user
 */
//1.Runnable�� �����Ѵ�.
public class UseRunnable implements Runnable{

	//2.run() method Override
	@Override
	public void run() {
		//3.���ÿ� ����Ǿ���� �ڵ�, Thread�� �����ؾ��� �ڵ� ����
		for(int i=0; i<500;i++) {
			System.out.println("run i========>"+i);
		}//end for
	}//run
	
	
	public void work() {
		for(int i=0; i<500;i++) {
			System.out.println("work i---=>"+i);
		}//end for
	}//work
	
	
	public static void main(String[] args) {

		//4. Thread�� ������ �ڵ带 ���� Ŭ������ ��üȭ
		UseRunnable ur=new UseRunnable();
		//5. ThreadŬ������ has a ���� ����
		Thread t= new Thread(ur);
		//6. ThreadŬ������ start()ȣ��
		t.start(); //start()�� ���ؼ� run() ȣ��
		System.out.println("---------------------------");
		ur.work();
//		for(int i=0; i<500;i++) {
//			System.out.println("main i------------->"+i);
//		}//end for
		
	}//main

}//class
