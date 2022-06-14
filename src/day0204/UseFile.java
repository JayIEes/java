package day0204;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 * @author user
 * File Ŭ������ ���
 */
public class UseFile {

	public UseFile() {
		//1.���ϻ���
		File file=new File("e:/dev/temp/java_read.txt");
		
		System.out.println(file.exists()?"����":"��� Ȯ��");
		System.out.println(file.length()+"byte");
		System.out.println(file.isFile()?"�����Դϴ�.":"���丮");
		System.out.println(file.isDirectory()?"���丮.":"����");
		System.out.println(file.isHidden()?"��������":"�Ϲ�����");
		System.out.println(file.canRead()?"�бⰡ��":"�б�Ұ���");
		System.out.println(file.canWrite()?"���Ⱑ��":"����Ұ���");
		System.out.println(file.canExecute()?"���󰡴�":"����Ұ���");
		System.out.println(file.lastModified());
		
		long lm=file.lastModified();
		System.out.println("���������� ������ ��¥"+lm);
		
		Date date=new Date(lm);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println("���������� ������ ��¥"+sdf.format(date));
		
		System.out.println("���ϰ�� "+file.getPath());
		System.out.println("���������� "+file.getAbsolutePath());
		try {
			System.out.println("���ϱԹ���� "+file.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}//end catch
		
		System.out.println("������ ���� ������: "+file.getParent());
		System.out.println("���ϸ�: "+file.getName());
		
		
		//���ϸ� ����
		//1.������ �̸��� ���� File����
//		File rename=new File(file.getParent()+"/java_read_1.txt");
//		System.out.println(file.renameTo(rename));
		
		//���� ����
//		System.out.println(file.delete());
		
		
		//���丮 ����
		//1. ������ ���丮�� ������ ����
		File mk=new File("e:/dev_1/temp/test");
		System.out.println(mk.mkdir());
		
		
		
	}//UseFile
	
	public static void main(String[] args) {

		new UseFile();
		
	}//main

}
