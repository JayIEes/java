package day0114;

import day0110.Person;

/**
 * @author user
 * Ư¡ : ���� ���� // ���� 3���� ���� ��ȭ�ϴ� ������ 1~5�� ����
 */
public class MeMyself extends Person {

	private int joynessLevel;
	
	public MeMyself() {
		joynessLevel=1;
	}//������
	
	
	public String enjoyingFood(String food) { //���Ŀ� ���� ��ſ� ������ �����ִ� �޼ҵ�
		String result="";
		
		if(food.equals("ġŲ")) {
			++joynessLevel;
			result="^0^! ġŲ�� ���ִ�, ���� �� ��ſ��� "+ 1 +"����Ͽ� "+joynessLevel+"�̴�.";
			if(joynessLevel>5) {
				joynessLevel=5;
				result="^0^ ġŲ�� ���ִ�,�ٵ� �� ��ſ��� 5�� ���Ͽ� "+joynessLevel+"�̴�.";
				
			}	
		}else if(food.equals("�Ľ�Ÿ")) {
			++joynessLevel;
			result="^0^ �Ľ�Ÿ�� ���� ����, ���� �� ��ſ��� 1 ����Ͽ� "+joynessLevel+"�̴�.";
			if(joynessLevel>5) {
				joynessLevel=5;
				result="^0^! �Ľ�Ÿ�� ���ִ�,�ٵ� �� ��ſ��� 5�� ���Ͽ� "+joynessLevel+"�̴�.";
			}
		}else if(food.equals("���")) {
			--joynessLevel;
			result="�� ����� ��, ���� �� ��ſ��� 1 �϶��Ͽ� "+joynessLevel+"�̴�.";
			if(joynessLevel<1) {
				joynessLevel=1;
				result="�� ����� ��, �� �ٵ� �� ��ſ��� 1�� ���Ͽ� "+joynessLevel+"�̴�.";
			}
		}
		
		
		return result;
	}//enjoyingFood
	
	
}//class
