package homework;
class Allowance{
	public static final int A_DAY_MONEY = 30000;
	public static final int ONE_WAY = 3400;

		public static void main(String[] args){
		
		int roundTrip = ONE_WAY*2;
		int lunch = 12000;
		
		System.out.println("하루 용돈 "+A_DAY_MONEY+"원, 편도 차비 "+ONE_WAY+"원, 왕복 차비 "+roundTrip+"원");
		System.out.println("점심값 "+lunch+"원");
		System.out.println("남은 금액 "+(A_DAY_MONEY-(roundTrip+lunch)));
	}
}
