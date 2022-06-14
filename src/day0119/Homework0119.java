package day0119;

import java.util.StringTokenizer;

public class Homework0119 {
	//선생님 정말 정말 죄송한데 제 자리에 혹시 애플펜슬이 있거나 떨어져있거나 하는지  봐주실 수 있으실까요?ㅠㅠㅠ//////////////////
	//어제 잃어버렸는데 학원에 놓고온 것 같아서요ㅠㅠㅠ..... 정말정말 죄송합니다...ㅠㅠ//////////////////////
	
	
	//숙제 1 : 임시비밀번호 8자리 method
	public char[] password() {
		
		char[][] cArr=new char[3][8]; //이차원 배열 이차원 배열을 사용하지 않으셔도 됩니다. 카톡을 보세요
		char[] password=new char[8]; 
		
		for(int i=0; i<cArr.length;i++) {
			for(int j=0; j<cArr[i].length;j++)
			switch(i) { 
			case 0: cArr[i][j]= (char)((int)(Math.random()*26)+65); break;
			case 1: cArr[i][j]= (char)((int)(Math.random()*26)+97); break;
			case 2: cArr[i][j]= (char)((int)(Math.random()*10)+48);
			}//end switch
		}//end for
		
		for(int i=0; i<password.length;i++) { //랜덤으로 값 넣어주기
			password[i]=cArr[(int)(Math.random()*3)][i];
		}//end for
		
		return password;
	}//password
	
	
	
	
	
	
	
//	숙제 2. 로또번호 생성
	public int[] lottoNum() {
		int[] lottoArr=new int[6];
		
		for(int i=0; i<lottoArr.length;i++) {
			lottoArr[i]=(int)((Math.random()*45)+1);
//			System.out.println(lottoArr[i]);
			for(int j=0;j<i;j++) {
				if(lottoArr[i]==lottoArr[j]) {
					continue;
				}//end if
			}//end for
		}//end for
		return lottoArr;
	}//lottoNum
	
		
	
	public void lottoResult() {
		lottoNum();
		for(int i : lottoNum()) {
			System.out.printf("%d ",i);
		}
	}//lottoResult
	
		
		




	//숙제 3. 기준문자열
	public String[] csv() {
		String csvData="우짤래미,저짤래미.뇌절티비~쿠쿠루삥뽕,포항항";
		StringTokenizer stk= new StringTokenizer(csvData,",.~");
		
		String[] strArr = new String[stk.countTokens()];
		
		String token="";
		int i=0;
		while(stk.hasMoreTokens()) {
			token=stk.nextToken();
			strArr[i]=token;
			i++;
		}//end while
		
		return strArr;
	}//


	//csv 매소드 출력하는 메소드
	public void printCsv() {
		for(String s : csv()) {
			System.out.println(s);
		}
	}//printCsv

	
	
	
	
	//숙제 4. '성'에 해당하는 이름 몇 개?
	public int lastNameCount(String lastname) {
		
		String data= "김의정,강명준,권용현,정인선,김예진,강산,김진영,김현우,박설진,서지숙,신유철,이내혁,강현모,장정우,김정하,장형근,전민정,정시헌,최연이,황성준,서희수";
		String[] arr = data.split(",");

		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].toString().indexOf(lastname)==0) {
				cnt+=1;
			}//end if
		}//end for
		System.out.println(cnt);
		
		return cnt; 
	}//lastNameCount
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Homework0119 hw0119 = new Homework0119();
		
		//임시비밀번호 출력
		System.out.println(hw0119.password());
		
	
		System.out.println();
		//로또
		hw0119.lottoResult();
		System.out.println();
		
		
		System.out.println();
		//문자열 구분하는 메소드 출력하는 메소드
		hw0119.printCsv();
		
		System.out.println();
		//성에 해당하는 이름 몇 개
		hw0119.lastNameCount("김");
		
		
		
	}//main

}
