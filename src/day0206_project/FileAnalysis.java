package day0206_project;

import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class FileAnalysis extends JFrame {
	
	private JButton viewJbtn;
	private JButton reportJbtn;
	private List<String> list;
	
	public FileAnalysis() throws IOException {
		
		//view�� report��ư�� ���� ������
		super("File �м�");
		
		//���ϴ� ���� ���� ����
		//������ log ���� ���� ���
		FileDialog fd = new FileDialog(this,"log ���� ����", FileDialog.LOAD); 
		fd.setVisible(true);
		
		String filePath=fd.getDirectory();
		String fileName=fd.getFile();
		
		File file=new File(filePath+fileName);
		
		//������ ������ List
		list=new ArrayList<String>(); 
		
		
		
		if(file.exists()) {
			//view��ư report��ư ����
			viewJbtn=new JButton("view"); 
			reportJbtn=new JButton("report"); 
			
			
			
			
			//��ư �̺�Ʈ ���
			ButtonEvt be=new ButtonEvt(this);
			viewJbtn.addActionListener(be);
			reportJbtn.addActionListener(be);
			
			
			
			//*******��ư ��ġ �����ϱ�
			add(viewJbtn); 
			add(reportJbtn);
			
			setLayout(new FlowLayout());
			setBounds(300,300,300,150);
			setVisible(true);
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			//���� ������ ó��
			BufferedReader br=null;
			
			try {
				br=new BufferedReader(new FileReader(file));
			
				String data="";
				StringBuilder dataFromFile=new StringBuilder();
				while((data=br.readLine())!=null){
					dataFromFile.append(data).append("\n");
				}//end while
				
				String str=dataFromFile.toString();
//				System.out.println(str);
				
				StringTokenizer sToken=new StringTokenizer(str,"\n",false);
				
				
				while(sToken.hasMoreTokens()){
					list.add(sToken.nextToken());
				}
				
				for(String st : list) {
					System.out.println(st);
				}
//				System.out.println(list.size());
			
				System.out.println(mostUsedKey());
				
			
			}finally{
				if(br!=null) {br.close();}//end if
			}//end finally
			
			
			
		}else { //������ �������� �ʾҰų� �������� ���� ��
			setVisible(false);
			
			//��Ҵ����� terminate�ǰ� ������ ��
		}
	
		
		
		
		
	}//������FileAnalysis
	
	
	
	public String mostUsedKey() {
		String result="z";
		
		Set<String> set=new HashSet<String>();

		//List �迭��
		String[] strArr=new String[list.size()];
		list.toArray(strArr);
		
		//key �������� �˱����� �ڵ�
		String keyName="";
		for(int i=0; i<strArr.length;i++) {
			if(strArr[i].contains("=")&&strArr[i].contains("&")) {
				
				int begin= strArr[i].indexOf("=")+1;
				int end= strArr[i].indexOf("&");
//			strArr[i].toString().substring(begin, end+1);
//				System.out.println(strArr[i].substring(begin, end));
				keyName=strArr[i].substring(begin, end);
				set.add(keyName);
			}
		
		}
		System.out.println(set);
		
		//Ű �̸� �迭
		String[] keyNameArr=new String[set.size()];
		set.toArray(keyNameArr);

		Map<String, Integer> map = new HashMap<String, Integer>();
		
		int[] cnt=new int[keyNameArr.length];
		for(int j=0; j<keyNameArr.length;j++){
			int count=0;
			for(int i=0; i<strArr.length;i++) {
				if(strArr[i].contains(keyNameArr[j])) {
				count++;
				}
			}
			map.put(keyNameArr[j], count);
			cnt[j]=count;
		}
		System.out.println(map);
		
		
		
		int temp=0;
		for(int i=0; i<cnt.length;i++) {
			if(i!=cnt.length-1) {
				if(cnt[i]>cnt[i+1]) {
					temp=cnt[i];
					cnt[i]=cnt[i+1];
					cnt[i+1]=temp;
				}
			}
		}
		System.out.println(cnt[cnt.length-1]);
		
		
		String no1Key="";
		for(int i=0; i<cnt.length;i++) {
			if(cnt[cnt.length-1]== map.get(keyNameArr[i])) {
				no1Key=keyNameArr[i];
			}
		}
		
		result=no1Key+" "+cnt[cnt.length-1]+"ȸ";
		
		
		return result;
	}
	
	
	





	public JButton getViewJbtn() {
		return viewJbtn;
	}//getViewJbtn




	public JButton getReportJbtn() {
		return reportJbtn;
	}//getReportJbtn











	public static void main(String[] args) {
		try {
			new FileAnalysis();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}//main

}//class
