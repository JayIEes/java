package day0204;

/**
 * @author user
 * Compile Exception �ۼ�
 */
@SuppressWarnings("serial")
//1. Exception �Ǵ� RuntimeExeption�� ��� �ް�
public class TobaccoException extends Exception {
//2. ������ Overload
	/**
	 * ������ ���� �޽��� ����� ��
	 */
	public TobaccoException() {
		super("������ �߻�");
	}//TobaccoException
	
	/**
	 * �����ڰ� ��Ȳ�� �´� ���ܸ޽����� ���� ����� ��
	 * @param msg
	 */
	public TobaccoException(String msg) {
		super(msg);
	}//TobaccoException
	
}
