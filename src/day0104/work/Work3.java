package day0104.work;

/**
 * 대중교통수단과 거리 입력,( 대중교통 수단은 마을버스 버스 지하철)////각 교통수단은 아래의 기본 요금체계를 가진다.
마을버스	800
버스	1250
지하철	1300
추가요금 : 기본요금은 10km까지 유효하며 10km초과 시 매 5km마다 추가요금 100원 붙는다.
대중교통일 경우 출력:
입력 교통수단 “xx” 이동거리 xxkm / 기본요금 xx원 초과요금 xx원 / 한달 20일 기준 교통비 xx원 /대중교통수단 아니면 대중교통이 아닙니다 출력
 * @author user
 */
public class Work3 {
	//대중교통 요금은 잘 변경되지 않는 값이므로 constant로 설정
	public static final int MA_BUS=800;
	public static final int BUS=1250;
	public static final int SUBWAY=1300;
	
	
	public static void main(String[] args) {
		
			
		if(args[0].equals("마을버스")||args[0].equals("버스")||args[0].equals("지하철")) {//대중교통
			int distance=0;//입력된 이동거리
			int fare=0;//요금
			int overFare=0;//초과요금
			distance=Integer.parseInt(args[1]);
			
			//입력된 교통수단의 기본요금 식별하여 저장
			if(args[0].equals("마을버스")) {
				fare=Work3.MA_BUS;
			}else if (args[0].equals("버스")) {
				fare=Work3.BUS;
			}else {
				fare=Work3.SUBWAY;				
			}//end else
			
			//초과요금
			if(distance>10) {
				overFare=(((distance-10)/5)+1)*100;
			}//end if
			
			
			System.out.println("교통수단 : "+args[0]+" 이동거리 : "+distance+" 기본요금 : "
			+fare+" 초과요금 : "+overFare+"원 한달20일기준 : "+((fare+overFare)*20)+"원");
		
			
		}else {//대중교통 아닌경우
			System.out.println("입력하신 "+args[0]+"은(는) 대중교통수단이 아닙니다.");
		}//end else
		
		
		
		
	}//main

}//class
