package day0119;

import java.util.StringTokenizer;

public class Homework0119 {
	//識持還 舛源 舛源 阻勺廃汽 薦 切軒拭 箸獣 蕉巴謎十戚 赤暗蟹 恭嬢閃赤暗蟹 馬澗走  坐爽叔 呪 赤生叔猿推?ばばば//////////////////
	//嬢薦 籍嬢獄携澗汽 俳据拭 兜壱紳 依 旭焼辞推ばばば..... 舛源舛源 阻勺杯艦陥...ばば//////////////////////
	
	
	//寿薦 1 : 績獣搾腔腰硲 8切軒 method
	public char[] password() {
		
		char[][] cArr=new char[3][8]; //戚託据 壕伸 戚託据 壕伸聖 紫遂馬走 省生偲亀 桔艦陥. 朝套聖 左室推
		char[] password=new char[8]; 
		
		for(int i=0; i<cArr.length;i++) {
			for(int j=0; j<cArr[i].length;j++)
			switch(i) { 
			case 0: cArr[i][j]= (char)((int)(Math.random()*26)+65); break;
			case 1: cArr[i][j]= (char)((int)(Math.random()*26)+97); break;
			case 2: cArr[i][j]= (char)((int)(Math.random()*10)+48);
			}//end switch
		}//end for
		
		for(int i=0; i<password.length;i++) { //沓棋生稽 葵 隔嬢爽奄
			password[i]=cArr[(int)(Math.random()*3)][i];
		}//end for
		
		return password;
	}//password
	
	
	
	
	
	
	
//	寿薦 2. 稽暁腰硲 持失
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
	
		
		




	//寿薦 3. 奄層庚切伸
	public String[] csv() {
		String csvData="酔息掘耕,煽息掘耕.噛箭銅搾~庭庭欠紙四,匂牌牌";
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


	//csv 古社球 窒径馬澗 五社球
	public void printCsv() {
		for(String s : csv()) {
			System.out.println(s);
		}
	}//printCsv

	
	
	
	
	//寿薦 4. '失'拭 背雁馬澗 戚硯 護 鯵?
	public int lastNameCount(String lastname) {
		
		String data= "沿税舛,悪誤層,映遂薄,舛昔識,沿森遭,悪至,沿遭慎,沿薄酔,酵竺遭,辞走寿,重政旦,戚鎧舶,悪薄乞,舌舛酔,沿舛馬,舌莫悦,穿肯舛,舛獣賠,置尻戚,伐失層,辞費呪";
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
		
		//績獣搾腔腰硲 窒径
		System.out.println(hw0119.password());
		
	
		System.out.println();
		//稽暁
		hw0119.lottoResult();
		System.out.println();
		
		
		System.out.println();
		//庚切伸 姥歳馬澗 五社球 窒径馬澗 五社球
		hw0119.printCsv();
		
		System.out.println();
		//失拭 背雁馬澗 戚硯 護 鯵
		hw0119.lastNameCount("沿");
		
		
		
	}//main

}
