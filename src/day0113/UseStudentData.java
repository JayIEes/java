package day0113;

/**
 * int, String, int, String, double �� ������ ����� ���� �ڷ����� ���.
 * @author user
 */
public class UseStudentData {

	
	
	public static void main(String[] args) {
	Student jisuk=new Student(1,"������",26,"O",166.5);
	Student mina=new Student(2,"��̳�",24,"AB",163.5);
	
	
	
	
	System.out.printf("%s �л��� %d���̰� %d�� �������� %s�� Ű�� %.2f�Դϴ�.\n"
					,jisuk.getName(),jisuk.getNum(),jisuk.getAge(),jisuk.getBloodType(), jisuk.getHeight());
		
	System.out.printf("%s �л��� %d���̰� %d�� �������� %s�� Ű�� %.2f�Դϴ�.\n"
			,mina.getName(),mina.getNum(),mina.getAge(),mina.getBloodType(), mina.getHeight());
		
	jisuk.setAge(jisuk.getAge()+1);
	mina.setAge(mina.getAge()+1);
		
	System.out.printf("%s �л��� %d���̰� %d�� �������� %s�� Ű�� %.2f�Դϴ�.\n"
			,jisuk.getName(),jisuk.getNum(),jisuk.getAge(),jisuk.getBloodType(), jisuk.getHeight());
	
	System.out.printf("%s �л��� %d���̰� %d�� �������� %s�� Ű�� %.2f�Դϴ�.\n"
			,mina.getName(),mina.getNum(),mina.getAge(),mina.getBloodType(), mina.getHeight());
	
	
	
	
	// ��ü �迭 , �濡 ��ü�� �ּҸ� �����ϴ� �迭
	//����, ����
	Student[] students=new Student[3];
	//���Ҵ� : �濡�� ����� ���� �ڷ���(Student)���� ������ ��ü�� �Ҵ��Ѵ�.
	students[0]=new Student(1, "��ö��", 24, "A",176.2);
	students[1]=new Student(1, "�ڹ���", 26, "A",182.2);
	students[2]=new Student(1, "������", 27, "A",180.2);
	
	System.out.println(students[0]+"/"+students[1]);
	
	Student temp=null;
	for(int i=0;i<students.length;i++) {
//		System.out.println(students[i].getName());
	temp=students[i];
	System.out.println(temp.getName()+"/"+temp.getAge());
	}//end for
	System.out.println("-------------------------------------------");
	
	
	
	for(Student st : students) {
		System.out.printf("�̸�: %s , ����: %d, Ű: %.1f, �¾ ��: %d"
							, st.getName(),st.getAge(),st.getHeight(),2022-st.getAge()+1);
		System.out.println();
	}//end for
	
	
	
	
	
	
	
	
	
		
	}//main

}//class
