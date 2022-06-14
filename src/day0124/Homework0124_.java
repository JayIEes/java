package day0124;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Homework0124_ {

	//숙제 0124
	public String usePublicTransport(String transport, int distance) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("마을버스",800);
		map.put("버스",1250);
		map.put("지하철",1300);
		
		int fare=0;//기본요금 변수
		int extraCharge=0;//초과요금 변수
		String strResult=""; //반환 String
		
		if(map.containsKey(transport)) {
			fare = map.get(transport);
			extraCharge=0;
			if(distance>10) {
				extraCharge=(((distance-10)/5)*100)+100;
			}//end if
			strResult="입력 교통수단: "+transport+" | 이동거리: "+distance+"km | 기본요금: "+fare
					+"원 | 초과요금: "+extraCharge+"원" ;
		}else {
			strResult="대중교통이 아닙니다.";
		}
		
		//문자열 반환
		return strResult;
	}//usePublicTransport
	
	
	public void printPublicTransport() {
		Random ran=new Random();
		List<String> list = new ArrayList<String>();
		
		String[] strArr= "버스,지하철,마을버스,따릉이".split(",");
		String transport ="";// strArr[ran.nextInt(4)]; //임의의 교통수단 //변수를 만들고 사용하지 않고 있어요.
		
		int distance= 0;//ran.nextInt(30)+1; //임의의 거리
		int usingPeriods=ran.nextInt(3)+20; //사용일자
		
		for(int i=1;i<=usingPeriods;i++) {
//			list.add(usePublicTransport(transport,distance));
			transport = strArr[ran.nextInt(4)];
			distance= ran.nextInt(30)+1;
			list.add(usePublicTransport(transport,distance));
		}//end for
		
		for(String s : list) {
			System.out.println(s);
		}//end for
		
		
		
	}//printPublicTransport
	
	
	
	
	
	
	public static void main(String[] args) {
		Homework0124_ hw=new Homework0124_();
		hw.printPublicTransport();
		
		
		
	}//main 

}//class
