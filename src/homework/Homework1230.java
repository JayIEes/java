package homework;
class Homework1230{
	
	public static final int MA_BUS=800;
	public static final int BUS=1250;
	public static final int SUBWAY=1300;
	

	public static void main(String[] args) {

	//�� Ŭ������ ���� 3�� �� �߽��ϴ�!

	//���� 1. �¾ �ظ� �Է¹޾� �츦 ����ϴ� �ڵ�
	int birth = Integer.parseInt(args[0]);
		System.out.print(birth+"����� ");
	
	if(birth%12==0){
		System.out.print("������");
	}else if(birth%12==1){
		System.out.print("��");
	}else if(birth%12==2){
		System.out.print("��");
	}else if(birth%12==3){
		System.out.print("����");
	}else if(birth%12==4){
		System.out.print("��");
	}else if(birth%12==5){
		System.out.print("��");
	}else if(birth%12==6){
		System.out.print("ȣ����");
	}else if(birth%12==7){
		System.out.print("�䳢");
	}else if(birth%12==8){
		System.out.print("��");
	}else if(birth%12==9){
		System.out.print("��");
	}else if(birth%12==10){
		System.out.print("��");
	}else { //if(birth%12==11){ //else�� �ᵵ�� 
		System.out.print("��");
	}//end else
			System.out.print("��");


System.out.println();
//////////////////////////////////////////////////////////


	//���� 2. ����

	int score=Integer.parseInt(args[1]);
	System.out.print(score+"��(��) ");	

	if(score>-1&&score<40){
		System.out.println("����");
	}else if(score>39&&score<60){ 
		System.out.println("�ٸ� ���� ����");
	}else if(score>59&&score<101){
		System.out.println("�հ�");
	}else{
		System.out.println("��ȿ������ �ƴմϴ�");
	}

	
	
	
	
	
///////////////////////////////////////////
	
	// ���� 3. ���߱������
	
	int distance = Integer.parseInt(args[3]); //�Ÿ� �Է� ���� ��ȯ
	int extra=0;
	//���߱�������� ����� Constant�� ���� ����غ�����.
//	int maBus = 800; //�������� �⺻���
//	int bus = 1250; //���� �⺻���
//	int subway = 1300; //����ö �⺻���
	
	//�ʰ������ �������� ������ 10km�� �ʰ����� ������ �������ϴ�.//////////////////////////////////
	if(distance>10) {
		extra = (((distance-10)/5)*100); //�߰���� ����
	}


	if (args[2].equals("��������")){ //�������� ���
			System.out.print("�������: "+args[2]+", �̵��Ÿ�: "+distance);
			System.out.print("km, �⺻���: "+MA_BUS+"��, �ʰ����: "+extra+"��");
			System.out.println(", �Ѵ� 20�� ���� �����: "+((MA_BUS+extra)*20)+"��");

	}else if(args[2].equals("����")){ //���� ���
			System.out.print("�������: "+args[2]+", �̵��Ÿ�: "+distance);
			System.out.print("km, �⺻���: "+BUS+"��, �ʰ����: "+extra+"��");
			System.out.println(", �Ѵ� 20�� ���� �����: "+((BUS+extra)*20)+"��");

	}else if(args[2].equals("����ö")){ //����ö ���
			System.out.print("�������: "+args[2]+", �̵��Ÿ�: "+distance);
			System.out.print("km, �⺻���: "+SUBWAY+"��, �ʰ����: "+extra+"��");
			System.out.println(", �Ѵ� 20�� ���� �����: "+((SUBWAY+extra)*20)+"��");
	}else{ //���߱��� �ƴ� ����
			System.out.println(args[2]+"��(��) ���߱����� �ƴմϴ�.");
	}//end else


	}//main
}//class
