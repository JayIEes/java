package day0124;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Homework0124_ {

	//���� 0124
	public String usePublicTransport(String transport, int distance) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("��������",800);
		map.put("����",1250);
		map.put("����ö",1300);
		
		int fare=0;//�⺻��� ����
		int extraCharge=0;//�ʰ���� ����
		String strResult=""; //��ȯ String
		
		if(map.containsKey(transport)) {
			fare = map.get(transport);
			extraCharge=0;
			if(distance>10) {
				extraCharge=(((distance-10)/5)*100)+100;
			}//end if
			strResult="�Է� �������: "+transport+" | �̵��Ÿ�: "+distance+"km | �⺻���: "+fare
					+"�� | �ʰ����: "+extraCharge+"��" ;
		}else {
			strResult="���߱����� �ƴմϴ�.";
		}
		
		//���ڿ� ��ȯ
		return strResult;
	}//usePublicTransport
	
	
	public void printPublicTransport() {
		Random ran=new Random();
		List<String> list = new ArrayList<String>();
		
		String[] strArr= "����,����ö,��������,������".split(",");
		String transport ="";// strArr[ran.nextInt(4)]; //������ ������� //������ ����� ������� �ʰ� �־��.
		
		int distance= 0;//ran.nextInt(30)+1; //������ �Ÿ�
		int usingPeriods=ran.nextInt(3)+20; //�������
		
		for(int i=1;i<=usingPeriods;i++) {
//			list.add(usePublicTransport(transport,distance));
			transport = strArr[ran.nextInt(4)];
			distance= ran.nextInt(30)+1;
			list.add(usePublicTransport(transport,distance));
		}//end for
		
		for(String s : list) {
			System.out.println(s);
		}//end for
		
		
		
	}//printPublicTransport
	
	
	
	
	
	
	public static void main(String[] args) {
		Homework0124_ hw=new Homework0124_();
		hw.printPublicTransport();
		
		
		
	}//main 

}//class
