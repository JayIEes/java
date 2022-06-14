package homework;
class Homework1230{
	
	public static final int MA_BUS=800;
	public static final int BUS=1250;
	public static final int SUBWAY=1300;
	

	public static void main(String[] args) {

	//한 클래스에 숙제 3개 다 했습니다!

	//숙제 1. 태어난 해를 입력받아 띠를 출력하는 코드
	int birth = Integer.parseInt(args[0]);
		System.out.print(birth+"년생은 ");
	
	if(birth%12==0){
		System.out.print("원숭이");
	}else if(birth%12==1){
		System.out.print("닭");
	}else if(birth%12==2){
		System.out.print("개");
	}else if(birth%12==3){
		System.out.print("돼지");
	}else if(birth%12==4){
		System.out.print("쥐");
	}else if(birth%12==5){
		System.out.print("소");
	}else if(birth%12==6){
		System.out.print("호랑이");
	}else if(birth%12==7){
		System.out.print("토끼");
	}else if(birth%12==8){
		System.out.print("용");
	}else if(birth%12==9){
		System.out.print("뱀");
	}else if(birth%12==10){
		System.out.print("말");
	}else { //if(birth%12==11){ //else만 써도됨 
		System.out.print("양");
	}//end else
			System.out.print("띠");


System.out.println();
//////////////////////////////////////////////////////////


	//숙제 2. 점수

	int score=Integer.parseInt(args[1]);
	System.out.print(score+"은(는) ");	

	if(score>-1&&score<40){
		System.out.println("과락");
	}else if(score>39&&score<60){ 
		System.out.println("다른 점수 참조");
	}else if(score>59&&score<101){
		System.out.println("합격");
	}else{
		System.out.println("유효점수가 아닙니다");
	}

	
	
	
	
	
///////////////////////////////////////////
	
	// 숙제 3. 대중교통수단
	
	int distance = Integer.parseInt(args[3]); //거리 입력 정수 변환
	int extra=0;
	//대중교통수단의 요금은 Constant로 만들어서 사용해보세요.
//	int maBus = 800; //마을버스 기본요금
//	int bus = 1250; //버스 기본요금
//	int subway = 1300; //지하철 기본요금
	
	//초과요금이 구해지는 조건은 10km를 초과했을 때에만 구해집니다.//////////////////////////////////
	if(distance>10) {
		extra = (((distance-10)/5)*100); //추가요금 변수
	}


	if (args[2].equals("마을버스")){ //마을버스 출력
			System.out.print("교통수단: "+args[2]+", 이동거리: "+distance);
			System.out.print("km, 기본요금: "+MA_BUS+"원, 초과요금: "+extra+"원");
			System.out.println(", 한달 20일 기준 교통비: "+((MA_BUS+extra)*20)+"원");

	}else if(args[2].equals("버스")){ //버스 출력
			System.out.print("교통수단: "+args[2]+", 이동거리: "+distance);
			System.out.print("km, 기본요금: "+BUS+"원, 초과요금: "+extra+"원");
			System.out.println(", 한달 20일 기준 교통비: "+((BUS+extra)*20)+"원");

	}else if(args[2].equals("지하철")){ //지하철 출력
			System.out.print("교통수단: "+args[2]+", 이동거리: "+distance);
			System.out.print("km, 기본요금: "+SUBWAY+"원, 초과요금: "+extra+"원");
			System.out.println(", 한달 20일 기준 교통비: "+((SUBWAY+extra)*20)+"원");
	}else{ //대중교통 아닌 수단
			System.out.println(args[2]+"은(는) 대중교통이 아닙니다.");
	}//end else


	}//main
}//class
