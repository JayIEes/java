package day0203;

import javax.security.auth.login.FailedLoginException;

/**
 * @author user
 * Ư�� ��Ȳ���� ���ܸ� ������ �߻����� ó��.
 */
public class UseThrow {

	public void login(String id, String password) throws FailedLoginException { //2. �߻��� ���ܸ� ������
		if(!(id.equals("admin")&&password.equals("1234"))) {
			
			//1. ���� ������ �߻�
			
//			try {
//				throw new Exception("�α��� ����. ���̵� ��й�ȣ�� Ȯ�����ּ���."); //���� method�� �ϰ� �߻��Ǵ� ���ܰ� ������ ����.
				throw new FailedLoginException("�α��� ����. ���̵� ��й�ȣ�� Ȯ�����ּ���.");
//			}catch(Exception e) { //�������� �ʴ´�.
			
		}//end if
		System.out.println(id+"���� �α��� �ϼ̽��ϴ�.");
	}
	
	
	
	public static void main(String[] args) {
		
		UseThrow ut=new UseThrow();
		
		String id= "admin";
		String password = "123";
		
		
		try {
			ut.login(id, password); //3. ȣ���� ������ throws ���ܸ� ó���Ѵ�.
		} catch (Exception e) { //����(method)�� ���þ��� �̸��� ���ܰ� ó���Ǿ���.
			System.err.println("������ �޼��� : "+e.getMessage());
			System.err.println("����ó�� ��ü��� �޼��� : "+e);
			System.err.println("-------------�ڼ��� ����------------");
			e.printStackTrace();
		}
		
	}//main

}
