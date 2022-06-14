package day0111;

/**
 * 문자열을 다루는 String class 사용<br>
 * 
 * 주의 : java.lang패키지에 존재하는 클래스 이름으로 클래스를 생성하면 패키지에 정의한 
 * 		같은이름의 클래스를 먼저 사용한다.(내꺼 사용) (java.lang 패키지의 클래스를 사용하는 것이 아니므로 에러!)
 * 		-import를 사용해도 동일 적용 
 * 해결: 1. 같은 이름의 클래스를 정의할 때에는 "자바에서 제공하는 클래스를 full path"로로 식별하여 사용.
 * 		full path : 클래스를 사용할 때 패키지명을 모두 명시하여 사용하는 문법.
 * 		String이 아인 java.lang.String
 * 
 * 		2. java.lang패키지에 존재하는 이름으로 클래스를 만들지 않는다.
 * @author user
 */
public class UseString {

	public static void main(String[] args) {
		String str = "AbcdEfg"; //기본형 형식의 사용
		String str2= new String("asdfg3874@naver.com"); //참조형 형식의 사용
		
		//substring(시작문자열, 끝 문자열 +1)
		System.out.println(str2.substring(0,7));
		System.out.println(str+"에서 0~2 인덱스 사이의 자식 문자열 "+str.substring(0,2));
		System.out.println(str+"에서 'Efg'를 잘라보기 "+str.substring(4));
		
		System.out.println(str2+"에서 메일주소 자르기 "+str2.substring(0,str2.indexOf("@")));//동적으로
		System.out.println(str2+"에서 메일주소 자르기 "+str2.substring(9,19));
		System.out.println(str2+"에서 도메인 주소 자르기 "+str2.substring(str2.indexOf("@")+1,19));
		//substring(시작문자열) : 끝 인덱스를 생략하면 문자열의 끝까지 자른다.
		System.out.println(str2+"에서 도메인 주소 자르기 "+str2.substring(str2.indexOf("@")+1)); //끝 인덱스 생략
	
		
		str="서지숙";
		System.out.println(str+"은 '서지숙'인가? "+str.equals("서지숙"));
		System.out.println(str+"은 '서'로 시작하였는가? "+str.startsWith("서"));
		System.out.println(str+"은 '숙'으로 끝났는가? "+str.endsWith("숙"));
		
		str="김지숙";
		System.out.println(str+"은 '서지숙'인가? "+str.equals("서지숙"));
		System.out.println(str+"은 '서'로 시작하였는가? "+str.startsWith("서"));
		System.out.println(str+"은 '숙'으로 끝났는가? "+str.endsWith("숙"));
		
		str="오늘은 화요일입니다.";
		System.out.println(str+" 은 '요일'을 포함하고 있는가? "+str.contains("요일"));
		System.out.println(str+" 은 '수'를 포함하고 있는가? "+str.contains("수"));
		
		str="Java";
		String str3=str.concat("SE");
//		String str3= str+"SE"; //위와 똑같음. + 써도 문제 없다.
		System.out.println(str3);
		
		
		str="   Java SE   ";
		System.out.println("["+str.trim()+"]"); //사이에 있는 공백은 제거되지 않는다.
		
		
		str= "java java java";
		//치환 : 찾은 글자를 다른 글자로 변경
		System.out.println(str.replaceAll("ja", "ttt"));
		
		str="   Java SE   ";
		//replace 사용한 문자열 내 공백 제거
		System.out.println("["+str.replaceAll(" ", "")+"]"); 
		
		
		//method chain : method를 계속 연결하여 사용하는 문법.
		//
		str= "너 어딘데 시방새야~, ㅆ ㅣ ㅂ ㅏ!";
//		String filterTxt=str.replaceAll("시방새","**");
//		String filterTxt=str.replaceAll("시","*").replaceAll("방", "*"); //띄어쓰기해도 거를 수 있음
		String filterTxt=str.replaceAll("시","*").replaceAll("방", "*").replaceAll("ㅆ","*").replaceAll("ㅣ","*");
		
		System.out.println(filterTxt);
		
		int i=11; 
		double l=2022.0111; //여기서 L은 '형명시'를 말한다.
		
		str = String.valueOf(i);  // str=i+""; 이것도 되기 하는데 권장하지 않는다.
		str2=String.valueOf(l);
		
		System.out.println(str+" / "+str2);
		
		////////////////////String의 초기화////////////////////
		str = null;
		str2="";
		
		if(str==null) {//null인 상태에서는 String class가 제공하는 method를 호출할 수 없다.
			System.out.println(str+"은 heap에 주소를 저장하지 않았습니다.");
		}//end if
		
		if(str2.equals("")) {//empty인 상태에서는 String class가 제공하는 method를 호출할 수 있다.
			System.out.println(str2+"는 문자열 저장소의 주소를 저장하였습니다.");
			
		}
		
		if(str2.isEmpty()) {//empty인 상태에서는 String class가 제공하는 method를 호출할 수 있다.
			System.out.println(str2+"는 문자열 저장소의 주소를 저장하였습니다.");
			
		}
		
		
		
		
	}//main


}//class
