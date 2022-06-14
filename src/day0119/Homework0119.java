package day0119;

import java.util.StringTokenizer;

public class Homework0119 {
	//������ ���� ���� �˼��ѵ� �� �ڸ��� Ȥ�� �����潽�� �ְų� �������ְų� �ϴ���  ���ֽ� �� �����Ǳ��?�ФФ�//////////////////
	//���� �Ҿ���ȴµ� �п��� ����� �� ���Ƽ���ФФ�..... �������� �˼��մϴ�...�Ф�//////////////////////
	
	
	//���� 1 : �ӽú�й�ȣ 8�ڸ� method
	public char[] password() {
		
		char[][] cArr=new char[3][8]; //������ �迭 ������ �迭�� ������� �����ŵ� �˴ϴ�. ī���� ������
		char[] password=new char[8]; 
		
		for(int i=0; i<cArr.length;i++) {
			for(int j=0; j<cArr[i].length;j++)
			switch(i) { 
			case 0: cArr[i][j]= (char)((int)(Math.random()*26)+65); break;
			case 1: cArr[i][j]= (char)((int)(Math.random()*26)+97); break;
			case 2: cArr[i][j]= (char)((int)(Math.random()*10)+48);
			}//end switch
		}//end for
		
		for(int i=0; i<password.length;i++) { //�������� �� �־��ֱ�
			password[i]=cArr[(int)(Math.random()*3)][i];
		}//end for
		
		return password;
	}//password
	
	
	
	
	
	
	
//	���� 2. �ζǹ�ȣ ����
	public int[] lottoNum() {
		int[] lottoArr=new int[6];
		
		for(int i=0; i<lottoArr.length;i++) {
			lottoArr[i]=(int)((Math.random()*45)+1);
//			System.out.println(lottoArr[i]);
			for(int j=0;j<i;j++) {
				if(lottoArr[i]==lottoArr[j]) {
					continue;
				}//end if
			}//end for
		}//end for
		return lottoArr;
	}//lottoNum
	
		
	
	public void lottoResult() {
		lottoNum();
		for(int i : lottoNum()) {
			System.out.printf("%d ",i);
		}
	}//lottoResult
	
		
		




	//���� 3. ���ع��ڿ�
	public String[] csv() {
		String csvData="��©����,��©����.����Ƽ��~�������,������";
		StringTokenizer stk= new StringTokenizer(csvData,",.~");
		
		String[] strArr = new String[stk.countTokens()];
		
		String token="";
		int i=0;
		while(stk.hasMoreTokens()) {
			token=stk.nextToken();
			strArr[i]=token;
			i++;
		}//end while
		
		return strArr;
	}//


	//csv �żҵ� ����ϴ� �޼ҵ�
	public void printCsv() {
		for(String s : csv()) {
			System.out.println(s);
		}
	}//printCsv

	
	
	
	
	//���� 4. '��'�� �ش��ϴ� �̸� �� ��?
	public int lastNameCount(String lastname) {
		
		String data= "������,������,�ǿ���,���μ�,�迹��,����,������,������,�ڼ���,������,����ö,�̳���,������,������,������,������,������,������,�ֿ���,Ȳ����,�����";
		String[] arr = data.split(",");

		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].toString().indexOf(lastname)==0) {
				cnt+=1;
			}//end if
		}//end for
		System.out.println(cnt);
		
		return cnt; 
	}//lastNameCount
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Homework0119 hw0119 = new Homework0119();
		
		//�ӽú�й�ȣ ���
		System.out.println(hw0119.password());
		
	
		System.out.println();
		//�ζ�
		hw0119.lottoResult();
		System.out.println();
		
		
		System.out.println();
		//���ڿ� �����ϴ� �޼ҵ� ����ϴ� �޼ҵ�
		hw0119.printCsv();
		
		System.out.println();
		//���� �ش��ϴ� �̸� �� ��
		hw0119.lastNameCount("��");
		
		
		
	}//main

}
