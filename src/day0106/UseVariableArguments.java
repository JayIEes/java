package day0106;

/**
 * @author user
 * �����μ� ���
 */

 
public class UseVariableArguments {

	/**
	 * variable arguments�� ����� method�� jdk1.5+�������� ����� �� �ִ�.
	 * Variable argumentssms method���ο��� �迭(�ּҸ� ������ �ִ� ������ ��������)�� ���ȴ�.
	 * @param param
	 */
	public void useVA(int ... param ){
		//System.out.println(param);//���������������� �ּҰ� ���
		for(int i=0; i<param.length;i++) {
			System.out.print(param[i]+" ");
		}//end for
	}//useVA
	
	
//	public void useVA2(int ... paramI, int paramJ) { //VA�� ���� ������ parameter�θ� ���ǵȴ�.
	public void useVA2(int paramI, int ... paramJ) { //VA�� ���� ������ parameter�θ� ���ǵȴ�.
	
		
	}//useVA2
	
	
	
	
	public static void main(String[] args) {
		//��üȭ : �ν��Ͻ� method�� ������ ����ϱ� ����.
		UseVariableArguments uva=new UseVariableArguments();
		uva.useVA(0);
		System.out.println("-----------------------------------");
		uva.useVA(1);
		System.out.println("-----------------------------------");
		uva.useVA(1,2,3,4,5,100,1000); //���������� n���� ���� ���� �� �ִ�.
		System.out.println("---------------------------------");
		uva.useVA(1,'a'); //���������� n���� ���� ���� �� �ִ�.
		System.out.println();
		uva.useVA2(1, 1,2,3,4);
		uva.useVA2(4); //int���� �ݵ�� ���� �ԷµǾ���Ѵ�. / VA�� ��������
		
		
		
		
		
	}//main

}//class
