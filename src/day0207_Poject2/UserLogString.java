package day0207_Poject2;

import java.io.IOException;
import java.util.HashMap;

public class UserLogString {
	
	public static void main(String[] args) {
		UserLog ul = new UserLog();
//		int startLine = Integer.parseInt(args[0]); //���۶���
//		int endLine = Integer.parseInt(args[1]); //������
		try {
//			ul.readFile(startLine, endLine);
			ul.readFile(); 
		}
		catch (IOException e) {
			e.printStackTrace();
		} // end catch
		ul.dispose();

		// �ִٻ�� Ű�� Ƚ��
		HashMap<String, Integer> keyMap = ul.countKeyword(ul.getKeyArr()); //Ű�� {Ű, ŰȽ��}�� ��ȯ
		String mostReqKey = ul.mostFreqReq(keyMap)[0]; //Ű
		String mostReqCnt = ul.mostFreqReq(keyMap)[1]; //Ű Ƚ��

//		System.out.println(keyMap); ��ȯ�� Ű��
		System.out.print("1. �ִٻ�� Ű�� �̸��� Ƚ�� | "+" ����");
		System.out.print(mostReqKey + " ");
		System.out.println(mostReqCnt + "ȸ");
		System.out.println("--------------------------------");

		// �������� ���� Ƚ��
//		System.out.println(browserMap); ��ȯ�� ��������
		System.out.println("2. �������� ���� Ƚ��, ����");
		System.out.println(ul.browserPerRatio()); 
		System.out.println("--------------------------------");

		// http��û �߻� Ƚ��, ����
		HashMap<String, Integer> httpCodeMap = ul.countKeyword(ul.getHttpCodeArr()); 
		System.out.println(httpCodeMap);
		System.out.println("3. ���񽺸� ���������� ������ Ƚ��(200), ����(404)");

		System.out.println("����(200): " + httpCodeMap.get("200") + "ȸ");
		System.out.println("����(404): " + httpCodeMap.get("404") + "ȸ");

		System.out.println("--------------------------------");

		// ��û�� ���� ���� �ð�
		HashMap<String, Integer> reqTimeMap = ul.countKeyword(ul.getReqTimeArr());
		String mostReqTime = ul.mostFreqReq(reqTimeMap)[0];

		System.out.println(reqTimeMap);
		System.out.printf("4. ��û�� ���� ���� �ð� ");
		System.out.println(mostReqTime + "��");

		System.out.println("--------------------------------");
		System.out.println("5. ���������� ��û(403)�� �߻��� Ƚ��, ����");
		System.out.println("����(403): " + httpCodeMap.get("403") + "ȸ");
		System.out.println("403: " + ul.calRatio(httpCodeMap, "403") + "%");

		System.out.println("--------------------------------");
		System.out.println("6. ��û�� ���� ����(500)�� �߻��� Ƚ��, ����");
		System.out.println("����(500): " + httpCodeMap.get("500") + "ȸ");
		System.out.println("500: " + ul.calRatio(httpCodeMap, "500") + "%");

	}// main

}
