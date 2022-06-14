package day0104;

/**
 * @author user
 * for¹® ¼÷Á¦
 */
public class Homework1 {

	public static void main(String[] args) {
		
		//¼÷Á¦ 1. (3,6,9 Â¦)
		for(int i=1;i<101;i++) {
			if(i%10==3||i%10==6||i%10==9){
				System.out.print("Â¦ ");
			}else if(i/10==3||i/10==6||i/10==9){
				System.out.print("Â¦ ");
				
			}else{
				System.out.print(i+" ");
			}//end else
		}//end for
		
		
		
		System.out.println();
		System.out.println("------------------------------------------------------");
		//¼÷Á¦ 2. ±¸±¸´Ü Ãâ·Â
		for(int i=1;i<10;i++) {
			for(int j=2; j<10 ; j++) {
				System.out.print(j+"*"+i+"="+(j*i)+" ");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------------");
		
		//¼÷Á¦ 3.
		int num=Integer.parseInt(args[0]);
	
		if(num>1&&num<10) {
			System.out.println(num+"´Ü:");
			for(int i=1;i<10;i++) {
				System.out.println(num+"*"+i+"="+(num*i));
			}//end for
		}else {
			System.out.println("±¸±¸´ÜÀº 2~9´Ü±îÁö °¡´ÉÇÕ´Ï´Ù.");
		}//end else
		
		
		
		
		
		
	}//main

}//class
