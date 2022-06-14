package day0204;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInputStream�� ����� ������ ���� �б�
 * @author user
 */
public class UseFileInputStream {

	public UseFileInputStream() throws IOException {
		//1. ���Ͽ� ��Ʈ���� ����
		File file=new File("e:/dev/temp/java_read.txt");
		FileInputStream fis=null;
		if(file.exists()) {
			try {
				fis=new FileInputStream(file);//���Ͽ� ��Ʈ���� ����Ͽ� �����ϰ�
				//����� ���Ͽ��� ���� 1byte�� �о���δ�.
//				int data=fis.read(); //����� ��Ʈ������ 1byte�� �����´�.
//				System.out.println("�о���� ������ "+ (char)data); //�ѱ� ������
//			}catch (IOException ie) { //FileNotFoundException�� �� exists�� �ߺ��Ǵϱ� ����
//				ie.printStackTrace();
			
				//����� ���Ͽ��� ��� �����͸� 1byte�� �о���δ�.
				int data=0;
				while((data=fis.read()) != -1) {//EOF
					System.out.print((char)data);
				}
			
			}finally { //�� �ڵ带 �ݵ�� �����Ű������ try~ finally�κ��� ����� �ȵȴ�.
				if(fis!=null) {
					fis.close(); //3. ��Ʈ���� ����� �����ٸ� �޸� ������ �������� �ݵ�� �ݾ��ش�.
				}
			}//end finally
			
		}else {
			System.out.println(file.getAbsolutePath()+"�� �������� �ʽ��ϴ�.");
		}//end else
		
	}//UseFileInputStream
	
	public static void main(String[] args) {
		try {
			new UseFileInputStream();
		} catch (IOException e) {
			//�������� ���� �࿡�� �߻��� IOExceoption�� �ѹ��� ��Ƽ� ó���� �� �ִ�.
			e.printStackTrace();
		}//end catch
	}

}
