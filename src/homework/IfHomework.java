package homework;
class IfHomework{
	
	public static void main(String[] args) {
	
	
	int num = Integer.parseInt(args[0]);
	int num2 = Integer.parseInt(args[1]);
	int num3 = Integer.parseInt(args[2]);

	//¼÷Á¦ 1
		System.out.println(args[0]); 

	if (num>64&&num<91){
		char c = (char)num;
		System.out.println(c);
	}

System.out.println();

	//¼÷Á¦ 2
	
		System.out.println(num2);
	if (num2%3==0){
		System.out.println("ÂÓ!");
		
	}
	
System.out.println();

	//¼÷Á¦ 3
	System.out.println(num3);
	if ((num3>64&&num3<91)||
		(num3>96&&num3<123)||
		(num3>47&&num3<58)){ //ÀÌ ¹æ¹ı ÀÌ¿Ü¿¡µµ ÀÖÀ»±î¿ä?
		char ch = (char)num3;
		System.out.println(ch);
	}
System.out.println();

	//¼÷Á¦ 4

	System.out.println(args[3]);	
	if (args[3].equals("¹ö½º")||
		args[3].equals("ÁöÇÏÃ¶")||
		args[3].equals("¸¶À»¹ö½º")||
		args[3].equals("ÅÃ½Ã")){
		System.out.println("´ëÁß±³Åë");
	}

	int e=(int)'a';
		System.out.println(e);
	}
}
