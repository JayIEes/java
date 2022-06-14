package day0204;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * ���ڿ� �����͸� ������ ���Ϸ� ���.
 * @author user
 */
@SuppressWarnings("serial")
public class UseFileWriter{

	public void writeData() throws IOException {
		String msg="������ ��ſ� �ݿ����Դϴ�.";
		
		
		File file=new File("e:/dev/temp/write_data.txt");
		//������ �����ϸ� ConfirmDialog�� ������ ������ ����� "��"�� ������ ��쿡�� �����.
		//���� ������ �������� ������ ������ �����Ѵ�.
		FileWriter fw=null; //
		try{
		
		int flag=0;
		
			if(file.exists()) {
				flag=JOptionPane.showConfirmDialog(null, "������ ����ڽ��ϱ�?");
				switch(flag) {
				case JOptionPane.OK_OPTION : 
					//1.��Ʈ���� ����
					fw=new FileWriter(file); //��Ʈ���� �����Ǹ� ������ �����.
					//2. ��Ʈ���� �����͸� ���
					fw.write(msg);
					//3. ��Ʈ���� ��ϵ� �����͸� �������� ����
					fw.flush();
					System.out.println("������ �������ϴ�.");
					break;
				case JOptionPane.CANCEL_OPTION:
					System.out.println("��Ҹ� �����̽��ϴ�."); break;
					
				case JOptionPane.NO_OPTION:
					System.out.println("�ƴϿ��� �����̽��ϴ�.");
				}//end switch
			
			}else {
				System.out.println(file.createNewFile()? "������ ���� �����Ͽ����ϴ�." : "�����߽��ϴ�.");
			
			}//end else
				System.out.println("���Ϸ� �����͸� ����Ͽ����ϴ�.");
				
		}finally {
			//4.��Ʈ���� ���´�.(�޸� ���� ����)
			if(fw!=null) {fw.close();}//end if
		}//end finally
		
		
		
		
	}//writeData
	
	
	
	public static void main(String[] args) {

		UseFileWriter ufw=new UseFileWriter();
		try {
			ufw.writeData();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}//main

}
