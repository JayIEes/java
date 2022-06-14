package day0113;

/**
 * int, String, int, String, double 로 구성된 사용자 정의 자료형을 사용.
 * @author user
 */
public class UseStudentData {

	
	
	public static void main(String[] args) {
	Student jisuk=new Student(1,"서지숙",26,"O",166.5);
	Student mina=new Student(2,"김미나",24,"AB",163.5);
	
	
	
	
	System.out.printf("%s 학생은 %d번이고 %d살 혈액형은 %s형 키는 %.2f입니다.\n"
					,jisuk.getName(),jisuk.getNum(),jisuk.getAge(),jisuk.getBloodType(), jisuk.getHeight());
		
	System.out.printf("%s 학생은 %d번이고 %d살 혈액형은 %s형 키는 %.2f입니다.\n"
			,mina.getName(),mina.getNum(),mina.getAge(),mina.getBloodType(), mina.getHeight());
		
	jisuk.setAge(jisuk.getAge()+1);
	mina.setAge(mina.getAge()+1);
		
	System.out.printf("%s 학생은 %d번이고 %d살 혈액형은 %s형 키는 %.2f입니다.\n"
			,jisuk.getName(),jisuk.getNum(),jisuk.getAge(),jisuk.getBloodType(), jisuk.getHeight());
	
	System.out.printf("%s 학생은 %d번이고 %d살 혈액형은 %s형 키는 %.2f입니다.\n"
			,mina.getName(),mina.getNum(),mina.getAge(),mina.getBloodType(), mina.getHeight());
	
	
	
	
	// 객체 배열 , 방에 객체의 주소를 저장하는 배열
	//선언, 생성
	Student[] students=new Student[3];
	//값할당 : 방에는 사용자 정의 자료형(Student)으로 생성한 객체를 할당한다.
	students[0]=new Student(1, "김철수", 24, "A",176.2);
	students[1]=new Student(1, "박번개", 26, "A",182.2);
	students[2]=new Student(1, "강열혈", 27, "A",180.2);
	
	System.out.println(students[0]+"/"+students[1]);
	
	Student temp=null;
	for(int i=0;i<students.length;i++) {
//		System.out.println(students[i].getName());
	temp=students[i];
	System.out.println(temp.getName()+"/"+temp.getAge());
	}//end for
	System.out.println("-------------------------------------------");
	
	
	
	for(Student st : students) {
		System.out.printf("이름: %s , 나이: %d, 키: %.1f, 태어난 해: %d"
							, st.getName(),st.getAge(),st.getHeight(),2022-st.getAge()+1);
		System.out.println();
	}//end for
	
	
	
	
	
	
	
	
	
		
	}//main

}//class
