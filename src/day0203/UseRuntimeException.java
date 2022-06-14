package day0203;

/**
 * @author user
 * RuntimeException
 * �ڵ� �ÿ��� ���ܰ� �߻����� �ʰ�(���������δ� ������ ����) ���� �ÿ� �߻��ϴ� ����
 */
public class UseRuntimeException {

	public void testRuntimeException(String[] args) {
		
		// 1. args[0]�� args[1]�� �޾Ƽ� 2. ������ ��ȯ�� �� 3. ������ ���� �۾��� ���� ���.

		try {

			int num1 = Integer.parseInt(args[0]); //ArrayIndexOutOfBoundsException �߻� ����
			int num2 = Integer.parseInt(args[1]); //ArrayIndexOutOfBoundsException �߻� ����
			int result = 0;

			result = num1 / num2; //ArithmeticException �߻� ����

			System.out.println(num1 + "/" + num2 + "=" + result);
			
		}catch(NumberFormatException nfe) {
			System.err.println("�Է� ���� �������¸� �����մϴ�.");
			
		}catch(ArithmeticException ae) {
			System.err.println("0���� ���� �� �����ϴ�.");
			
		}catch (ArrayIndexOutOfBoundsException aioobe) {
			System.err.println("����) java UseRuntimeException ��1 ��2");
			aioobe.printStackTrace();
			
		}catch(Exception e) { //�θ� �Ʒ���
			System.err.println("�����ڰ� �ν����� ���� ����");
		
		}finally {
			System.out.println("�ݵ�� ����Ǿ�� �� �ڵ�");
		}//end finally

	}// testRuntimeException

	
	
	public static void main(String[] args) {

		UseRuntimeException ure = new UseRuntimeException();
		ure.testRuntimeException(args);
	}// main

}// class
