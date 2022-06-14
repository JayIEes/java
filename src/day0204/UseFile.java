package day0204;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 * @author user
 * File 클래스의 사용
 */
public class UseFile {

	public UseFile() {
		//1.파일생성
		File file=new File("e:/dev/temp/java_read.txt");
		
		System.out.println(file.exists()?"존재":"경로 확인");
		System.out.println(file.length()+"byte");
		System.out.println(file.isFile()?"파일입니다.":"디렉토리");
		System.out.println(file.isDirectory()?"디렉토리.":"파일");
		System.out.println(file.isHidden()?"숨김파일":"일반파일");
		System.out.println(file.canRead()?"읽기가능":"읽기불가능");
		System.out.println(file.canWrite()?"쓰기가능":"쓰기불가능");
		System.out.println(file.canExecute()?"실헹가능":"실행불가능");
		System.out.println(file.lastModified());
		
		long lm=file.lastModified();
		System.out.println("마지막으로 수정된 날짜"+lm);
		
		Date date=new Date(lm);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println("마지막으로 수정된 날짜"+sdf.format(date));
		
		System.out.println("파일경로 "+file.getPath());
		System.out.println("파일절대경로 "+file.getAbsolutePath());
		try {
			System.out.println("파일규범경로 "+file.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}//end catch
		
		System.out.println("파일은 가진 폴더명: "+file.getParent());
		System.out.println("파일명: "+file.getName());
		
		
		//파일명 변경
		//1.변경할 이름을 가진 File생성
//		File rename=new File(file.getParent()+"/java_read_1.txt");
//		System.out.println(file.renameTo(rename));
		
		//파일 삭제
//		System.out.println(file.delete());
		
		
		//디렉토리 생성
		//1. 생성할 디렉토리의 파일을 생성
		File mk=new File("e:/dev_1/temp/test");
		System.out.println(mk.mkdir());
		
		
		
	}//UseFile
	
	public static void main(String[] args) {

		new UseFile();
		
	}//main

}
