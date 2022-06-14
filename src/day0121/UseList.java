package day0121;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * @author user
 * java.util.List의 사용
 */
public class UseList {
	
	public void useArrayList() {
		//1. 생성
		List<String> list=new ArrayList<String>();
		
		//2. 값 할당- 값은 순차적으로 할당되며, 값을 할당할 때마다 방의 개수가 증가한다.
		//중복을 허용한다.
		list.add("Java"); //0
		list.add("Oracle");//1
		list.add("JDBC");//2
		list.add("Java");//3
		list.add("HTML");//4
		
		String key="java";
		System.out.println(list.contains(key)?"있음":"없음"); //대소문자 가린다.
		
		
//		list.add(2, "하하하"); //그 자리에 들어가고 뒤로 밀림  //효율 떨어짐-LinkedList를 써야함
		if(list.isEmpty()) {
			System.out.println("리스트가 비어있음");
		}else {
			System.out.println("리스트에 값 있음");
		
			//값 얻기
		String val=list.get(0);
		System.out.println("처음 번째 방의 값: "+val);
		
		//모든 방의 값 출력
		for(int i=1; i<list.size();i++) {
			System.out.printf("list.get(%d)=%s\n",i,list.get(i));
			}//end for //데이터의 개수를 알 수 없을 때 리스트를 쓴다.
		
		}//end else //List 비었는지 물어보고 쓴다.
		
		
		//배열로 복사:Generic이 설정되어야함.
		//1.복사할 배열을 생성하고 
		String[] copy=new String[list.size()];
		System.out.println(list.toArray(copy));
		
		//삭제
		//인덱스
		list.remove(1);
		//방의 내용으로 삭제. 중복 값이 존재한다면 가장 처음 값만 삭제
		list.remove("Java");
		list.clear();
		
		System.out.println(list+" / "+list.size());
		
		System.out.println(Arrays.toString(copy));//배열의 모든 방 출력?
		

		
	}//useArrayList
	
	
	public void useVector() {
		//1. 생성
				List<String> list=new Vector<String>();
				
				//2. 값 할당- 값은 순차적으로 할당되며, 값을 할당할 때마다 방의 개수가 증가한다.
				//중복을 허용한다.
				list.add("Java"); //0
				list.add("Oracle");//1
				list.add("JDBC");//2
				list.add("Java");//3
				list.add("HTML");//4
				
//				list.add(2, "하하하"); //그 자리에 들어가고 뒤로 밀림  //효율 떨어짐-Linkedlist를 써야함
				if(list.isEmpty()) {
					System.out.println("리스트가 비어있음");
				}else {
					System.out.println("리스트에 값 있음");
				
					//값 얻기
				String val=list.get(0);
				System.out.println("처음 번째 방의 값: "+val);
				
				//모든 방의 값 출력
				for(int i=1; i<list.size();i++) {
					System.out.printf("list.get(%d)=%s\n",i,list.get(i));
					}//end for //데이터의 개수를 알 수 없을 때 리스트를 쓴다.
				
				}//end else //List 비었는지 물어보고 쓴다.
				
				
				//배열로 복사:Generic이 설정되어야함.
				//1.복사할 배열을 생성하고 
				String[] copy=new String[list.size()];
				System.out.println(list.toArray(copy));
				
				//삭제
				//인덱스
				list.remove(1);
				//방의 내용으로 삭제. 중복 값이 존재한다면 가장 처음 값만 삭제
				list.remove("Java");
				list.clear();
				
				System.out.println(list+" / "+list.size());
				
				System.out.println(Arrays.toString(copy));//배열의 모든 방 출력?
	}//useVector
	
	public void useLinkedList() {
		//1. 생성
		List<String> list=new LinkedList<String>();
		
		//2. 값 할당- 값은 순차적으로 할당되며, 값을 할당할 때마다 방의 개수가 증가한다.
		//중복을 허용한다.
		list.add("Java"); //0
		list.add("Oracle");//1
		list.add("JDBC");//2
		list.add("Java");//3
		list.add("HTML");//4
		
//		list.add(2, "하하하"); //그 자리에 들어가고 뒤로 밀림  //효율 떨어짐-Linkedlist를 써야함
		if(list.isEmpty()) {
			System.out.println("리스트가 비어있음");
		}else {
			System.out.println("리스트에 값 있음");
		
			//값 얻기
		String val=list.get(0);
		System.out.println("처음 번째 방의 값: "+val);
		
		//모든 방의 값 출력
		for(int i=1; i<list.size();i++) {
			System.out.printf("list.get(%d)=%s\n",i,list.get(i));
			}//end for //데이터의 개수를 알 수 없을 때 리스트를 쓴다.
		
		}//end else //List 비었는지 물어보고 쓴다.
		
		
		//배열로 복사:Generic이 설정되어야함.
		//1.복사할 배열을 생성하고 
		String[] copy=new String[list.size()];
		System.out.println(list.toArray(copy));
		
		//삭제
		//인덱스
		list.remove(1);
		//방의 내용으로 삭제. 중복 값이 존재한다면 가장 처음 값만 삭제
		list.remove("Java");
		list.clear();
		
		System.out.println(list+" / "+list.size());
		
		System.out.println(Arrays.toString(copy));//배열의 모든 방 출력?
		
	}//useLinkedList
	
	public static void main(String[] args) {

		UseList ul=new UseList();
		ul.useArrayList();
		System.out.println("--------ArrayList------------");
		ul.useVector();
		System.out.println("----------Vector----------");
		ul.useLinkedList();
		System.out.println("-----------LinkedList---------");
		
		
	}//main

}//class
