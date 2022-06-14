package day0207_Poject2;

import java.io.IOException;
import java.util.HashMap;

public class UserLogString {
	
	public static void main(String[] args) {
		UserLog ul = new UserLog();
//		int startLine = Integer.parseInt(args[0]); //시작라인
//		int endLine = Integer.parseInt(args[1]); //끝라인
		try {
//			ul.readFile(startLine, endLine);
			ul.readFile(); 
		}
		catch (IOException e) {
			e.printStackTrace();
		} // end catch
		ul.dispose();

		// 최다사용 키의 횟수
		HashMap<String, Integer> keyMap = ul.countKeyword(ul.getKeyArr()); //키를 {키, 키횟수}로 변환
		String mostReqKey = ul.mostFreqReq(keyMap)[0]; //키
		String mostReqCnt = ul.mostFreqReq(keyMap)[1]; //키 횟수

//		System.out.println(keyMap); 변환한 키맵
		System.out.print("1. 최다사용 키의 이름과 횟수 | "+" ㅇㅇ");
		System.out.print(mostReqKey + " ");
		System.out.println(mostReqCnt + "회");
		System.out.println("--------------------------------");

		// 브라우저별 접속 횟수
//		System.out.println(browserMap); 변환한 브라우저맵
		System.out.println("2. 브라우저별 접속 횟수, 비율");
		System.out.println(ul.browserPerRatio()); 
		System.out.println("--------------------------------");

		// http요청 발생 횟수, 비율
		HashMap<String, Integer> httpCodeMap = ul.countKeyword(ul.getHttpCodeArr()); 
		System.out.println(httpCodeMap);
		System.out.println("3. 서비스를 성공적으로 수행한 횟수(200), 실패(404)");

		System.out.println("성공(200): " + httpCodeMap.get("200") + "회");
		System.out.println("실패(404): " + httpCodeMap.get("404") + "회");

		System.out.println("--------------------------------");

		// 요청이 가장 많은 시간
		HashMap<String, Integer> reqTimeMap = ul.countKeyword(ul.getReqTimeArr());
		String mostReqTime = ul.mostFreqReq(reqTimeMap)[0];

		System.out.println(reqTimeMap);
		System.out.printf("4. 요청이 가장 많은 시간 ");
		System.out.println(mostReqTime + "시");

		System.out.println("--------------------------------");
		System.out.println("5. 비정상적인 요청(403)이 발생한 횟수, 비율");
		System.out.println("실패(403): " + httpCodeMap.get("403") + "회");
		System.out.println("403: " + ul.calRatio(httpCodeMap, "403") + "%");

		System.out.println("--------------------------------");
		System.out.println("6. 요청에 대한 에러(500)가 발생한 횟수, 비율");
		System.out.println("실패(500): " + httpCodeMap.get("500") + "회");
		System.out.println("500: " + ul.calRatio(httpCodeMap, "500") + "%");

	}// main

}
