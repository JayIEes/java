package day0106;

public class Homework0106 {

	
	//���� 1.
	public char lastName() {
		return 'S';
	}//lastName
	
	
	//���� 2.
	public boolean score(int i) {
		if(i>-1&&i<101) {
			return true;
		}else{
		return false ;
		}//end else
	}//score
	
	
	//���� 3.
	public char grade(int i) {
		char c = 'A'; //�ʱ�ȭ
		if (i>-1&&i<101){
			if(i>89){
				c= 'A';
			}else if(i>79) {
				c= 'B';
			}else if(i>59) {
				c='C';
			}else if(i>39) {
				c='D';
			}else {
				c='F';
			}
		}else{
			c='N';//end if
		}
		return c;
	}//grade
	
	

	
	//���� 5.
	public void dan() {
		int j=2;
		for(int i=1;i<10; i++) {
			System.out.println(j+"*"+i+"="+(j*i));
		}//end for
	}//dan
	
	
	public void dan(int n) { //�����ε�
			for(int i=1;i<10; i++) {
				System.out.println(n+"*"+i+"="+(n*i));
		}//end for
	}//dan
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Homework0106 hw = new Homework0106();
		
		//���� 1./////////////////////////////////
		char name=hw.lastName();
		System.out.println("�� ���� "+name);
		
		
		//���� 2.///////////////////////////////////
		boolean b =hw.score(0);//�����ϳ� ������ִ°� ������
		System.out.println(b);
		
		
		//���� 3.///////////////////////////////////
		char c=hw.grade(5);
		System.out.println(c+"����");
		
		
		//���� 5./////////////////////////////////////////
		hw.dan();
		System.out.println();
		hw.dan(8);
		
		
		//���� 4.////////////////////////////////////////
		TestOverload tol = new TestOverload();
		tol.printStar(1);
		tol.printStar(2);
		tol.printStar(3);
		tol.printStar(4);
		
		
		
		
	}//main

}//class
