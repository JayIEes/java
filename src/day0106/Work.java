package day0106;

/**
 * @author user
 * ¼÷Á¦ Ç®ÀÌ
 */
public class Work {
	
	
	/**
	 * ¼º(last name)À» ¹İÈ¯ÇÏ´Â ÀÏ - °íÁ¤ °ª ÇüÅÂ
	 * @return ¼º
	 */
	public char lastName() {
		return 'S';
	}//lastName
	
	
	/**
	 * ÀÔ·ÂµÇ´Â Á¡¼öÀÇ ÆÇÁ¤.<br> °¡º¯°ª
	 * 0~100tkdlaus true°¡, ±×·¸Áö ¾ÊÀ¸¸é false 
	 * @param score ÆÇÁ¤ÇÒ Á¡¼ö
	 * @return ÆÇÁ¤°á°ú
	 */
	public boolean scoreJudge(int score) {
//		boolean flag=score > -1 && score<101;//Áö¿ªº¯¼ö ÃÊ±âÈ­
		
//		if(score > -1 && score<101) { //¾êµµ ÇÊ¿ä¾øÀ½
//			flag=true;
//		}
//		else {
//			flag=false; //ÃÊ±âÈ­ ÇØÁá±â ¶§¹®¿¡ ¾ê´Â ÇÊ¿ä¾øÀ½.
//		}//end else
		
		return  score > -1 && score<101;
	}//scoreJudge
	
	/**
	 * ÇĞÁ¡À» ÀÔ·Â¹Ş¾Æ ÇĞÁ¡¿¡ ¸Â´Â ¹®ÀÚ¸¦ ±¸ÇØ¼­ ¹İÈ¯ - °¡º¯°ª
	 * @param score Á¡¼ö
	 * @return ±¸ÇØÁø ÇĞÁ¡ÀÇ ¹®ÀÚ
	 */
	public char gradeText(int score) {
		char temp = '\u0000';
		if(score >89 && score<101) {//°ªÀ» Á¦¾î
			temp='A';
		}else if(score >79 && score<90){
			temp='B';
		}else if(score >69 && score<80) {
			temp= 'C';
		}else if(score >59 && score<70) {
			temp= 'D';
		}else {
			temp= 'F';
		}//end else 
			return temp;//°¡Àå ¸¶Áö¸·¿¡ Á¦¾îµÈ °ªÀ» ¹İÈ¯
	}//gradeText
	
	
	/**
	 * º°À» Ãâ·Â - °íÁ¤ÀÏ
	 * ´Ù¸¥ Å¬·¡½º¿¡ Á¸ÀçÇÏ´Â method¸¦ »óÈ²¿¡ ¸Â°Ô È£Ãâ
	 */
	public void printStar() {
		//printStar method¸¦ ±¸ÇöÇÑ Å¬·¡½º¸¦ °´Ã¼È­
		TestOverload to=new TestOverload(); //for¹® ¾È¿¡¼­ º¯¼ö ¼±¾ğÇÏÁö ¾Ê´Â´Ù.
		
				for(int i=0;i<4;i++) {
					for(int j=0;j<i+1;j++) {
						if(i%2==0) {
						to.printStar();//°ËÀºº°
						}else {
						to.printStar(1);//Èòº°
						}//end else
						//System.out.print(i+" "+j+" ");
					}//end for
				System.out.println();
				
				}//end for
	}//printStar
	
	
	/**
	 * ±¸±¸´Ü 2´Ü Ãâ·Â
	 */
	public void multilcationTable() {
		System.out.println("2´Ü");
		for(int i=1; i<10;i++) {
			System.out.println("2x"+i+" = "+(2*i));
		}
	}
	/**
	 * ±¸±¸´ÜÀ» È£ÃâÇÏ´Â ¸Ş¼Òµå ¿À¹ö·Îµå
	 * @param level
	 */
	public void multilcationTable(int level) {
		System.out.println(level+"´Ü");
		for(int i=1; i<10;i++) {
			System.out.println(level+"x"+i+" = "+(level*i));
		}
	}
	
	
	
	
	public static void main(String[] args) {

		//°´Ã¼È­:instance method¸¦ È£Ãâ.
		//1¹ø¹®Á¦ È£Ãâ
		Work w=new Work();
		char familyName=w.lastName();
		System.out.println("³» ¼ºÀº "+familyName);
		
		//2¹ø ¹®Á¦ È£Ãâ
		int score = 99;
		boolean flag=w.scoreJudge(score);
		System.out.println(score+"Á¡ "+flag);
		
		//3¹ø ¹®Á¦ È£Ãâ
		if(flag) {
		char gradeText=w.gradeText(score);
		System.out.println("ÀÔ·ÂÁ¡¼ö : "+score+"Á¡, ÇĞÁ¡ "+gradeText);
		}
		
		//4¹ø ¹®Á¦ È£­x
		w.printStar();
		
		//5¹ø ¹®Á¦ È£Ãâ
		w.multilcationTable();
		w.multilcationTable(5);
		
		
		
	}//main

}
