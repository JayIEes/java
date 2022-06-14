package day0111;

public class Homework0111 {
	
	String identification;//인스턴스 변수는 자동초기화가 되서 일부러 초기화할 필요는 없어요.(지역변수만 초기화해주세요) 잘하셨습니다.
	//다만 str이 저장하고 있는 것이 주민등록번호이니 그 저장용도에 맞게 변수명을 바꿔주시면 더 좋을 것 같아요.
	
	public Homework0111(String num) {//생성자
	 //입력 주민번호를 인스턴스 변수에 저장하고 그 저장된 값을 사용하는 코드로 변경해 보세요
		identification= num;
		//이코드는 main method에서 호출하는 것으로 코드를변경해보세요
	}//생성자		
		
	

	public boolean leng() { //2번. 14자리 확인 method
		return identification.length()==14;
	} //leng
		
	
	public boolean hyphen() {//3번. '-' 올바른 위치 method
		return identification.indexOf("-")==6; 
	}//hyphen
	
	
	public String sentence() {//4번. 생년월일 문자열 반환 method
		
		String month = identification.substring(2,4);
		String day = identification.substring(4,6);
		
		
		if(month.charAt(0)==0) {
			month=month.substring(1);
		}
		
		
		if(day.charAt(0)==0) {
			day=day.substring(1);
		}
		
		return month(identification)+"년 "+month+"월 "+day+"일";
	}//sentence
	
	
	public String month(String num) {//생년 구해주는 method
		String birth1 =num.substring(0,2);
		char birth2 = num.charAt(7);
		
			if( (birth2=='0') || (birth2=='9')) { // 생년
				birth1 = "18"+birth1;
			}else if( (birth2=='1') || (birth2=='2') 
					|| (birth2=='5') || (birth2=='6')) {
				birth1 = "19"+birth1;
			}else {
				birth1 = "20"+birth1;
		}//end if
		return birth1;
	}
	
	
	public int age() { //5번. 나이구하기 method
		int birth = Integer.parseInt(month(identification));
		return (2022-birth)+1;
	}//age

		
	
	public String sex() { //6번. 성별구하기 method
		String s = "남";
		
		if(identification.charAt(7)%2==0) {
			s="여";
		}
		return s;
	}//sex
		
		
	
	public String thee() {
		int birth = Integer.parseInt(month(identification));
		String t = "";
	
//		switch(birth%12) {
//		case 0: t="원숭이"; break;
//		case 1: t="닭"; break;
//		case 2:	t="개";break;
//		case 3:	t="돼지";break;
//		case 4:	t="쥐";break;
//		case 5:	t="소";break;
//		case 6:	t="호랑이";break;
//		case 7:	t="토끼";break;
//		case 8:	t="용";break;
//		case 9:	t="뱀";break;
//		case 10: t="말";break;
//		case 11: t="양";
//		}
		
		String[] theeArr= {"원숭이", "닭", "개", "돼지", "쥐", "소", "호랑이", "토끼", "용", "뱀", "말", "양"};
		return theeArr[birth%12];
	}//thee
	
	
	
	
	
	public static void main(String[] args) {

		Homework0111 num = new Homework0111("010114-4655454");
		
		if(num.leng()) {
			if(num.hyphen()) {
				System.out.println("입력주민번호: "+num.identification );
				System.out.println("생년월일: "+num.sentence());
				System.out.println("나이: "+num.age());
				System.out.println("성별: "+num.sex());
				System.out.println("띠: "+num.thee());
			}else {
				System.out.println("'-'이 정상적인 위치에 없습니다.");
			}
		}else {
			System.out.println("주민번호의 글자 수가 맞지 않습니다.");
		}		
		
		
		
		
		
	}//main

}//class
