package homework;
class Allowance{
	public static final int A_DAY_MONEY = 30000;
	public static final int ONE_WAY = 3400;

		public static void main(String[] args){
		
		int roundTrip = ONE_WAY*2;
		int lunch = 12000;
		
		System.out.println("�Ϸ� �뵷 "+A_DAY_MONEY+"��, �� ���� "+ONE_WAY+"��, �պ� ���� "+roundTrip+"��");
		System.out.println("���ɰ� "+lunch+"��");
		System.out.println("���� �ݾ� "+(A_DAY_MONEY-(roundTrip+lunch)));
	}
}
