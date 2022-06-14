package day0106;

/**
 * @author user
 * ���� Ǯ��
 */
public class Work {
	
	
	/**
	 * ��(last name)�� ��ȯ�ϴ� �� - ���� �� ����
	 * @return ��
	 */
	public char lastName() {
		return 'S';
	}//lastName
	
	
	/**
	 * �ԷµǴ� ������ ����.<br> ������
	 * 0~100tkdlaus true��, �׷��� ������ false 
	 * @param score ������ ����
	 * @return �������
	 */
	public boolean scoreJudge(int score) {
//		boolean flag=score > -1 && score<101;//�������� �ʱ�ȭ
		
//		if(score > -1 && score<101) { //�굵 �ʿ����
//			flag=true;
//		}
//		else {
//			flag=false; //�ʱ�ȭ ����� ������ ��� �ʿ����.
//		}//end else
		
		return  score > -1 && score<101;
	}//scoreJudge
	
	/**
	 * ������ �Է¹޾� ������ �´� ���ڸ� ���ؼ� ��ȯ - ������
	 * @param score ����
	 * @return ������ ������ ����
	 */
	public char gradeText(int score) {
		char temp = '\u0000';
		if(score >89 && score<101) {//���� ����
			temp='A';
		}else if(score >79 && score<90){
			temp='B';
		}else if(score >69 && score<80) {
			temp= 'C';
		}else if(score >59 && score<70) {
			temp= 'D';
		}else {
			temp= 'F';
		}//end else 
			return temp;//���� �������� ����� ���� ��ȯ
	}//gradeText
	
	
	/**
	 * ���� ��� - ������
	 * �ٸ� Ŭ������ �����ϴ� method�� ��Ȳ�� �°� ȣ��
	 */
	public void printStar() {
		//printStar method�� ������ Ŭ������ ��üȭ
		TestOverload to=new TestOverload(); //for�� �ȿ��� ���� �������� �ʴ´�.
		
				for(int i=0;i<4;i++) {
					for(int j=0;j<i+1;j++) {
						if(i%2==0) {
						to.printStar();//������
						}else {
						to.printStar(1);//��
						}//end else
						//System.out.print(i+" "+j+" ");
					}//end for
				System.out.println();
				
				}//end for
	}//printStar
	
	
	/**
	 * ������ 2�� ���
	 */
	public void multilcationTable() {
		System.out.println("2��");
		for(int i=1; i<10;i++) {
			System.out.println("2x"+i+" = "+(2*i));
		}
	}
	/**
	 * �������� ȣ���ϴ� �޼ҵ� �����ε�
	 * @param level
	 */
	public void multilcationTable(int level) {
		System.out.println(level+"��");
		for(int i=1; i<10;i++) {
			System.out.println(level+"x"+i+" = "+(level*i));
		}
	}
	
	
	
	
	public static void main(String[] args) {

		//��üȭ:instance method�� ȣ��.
		//1������ ȣ��
		Work w=new Work();
		char familyName=w.lastName();
		System.out.println("�� ���� "+familyName);
		
		//2�� ���� ȣ��
		int score = 99;
		boolean flag=w.scoreJudge(score);
		System.out.println(score+"�� "+flag);
		
		//3�� ���� ȣ��
		if(flag) {
		char gradeText=w.gradeText(score);
		System.out.println("�Է����� : "+score+"��, ���� "+gradeText);
		}
		
		//4�� ���� ȣ�x
		w.printStar();
		
		//5�� ���� ȣ��
		w.multilcationTable();
		w.multilcationTable(5);
		
		
		
	}//main

}
