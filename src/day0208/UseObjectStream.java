package day0208;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

/**
 * @author user
 * ��ü�� ���ų� �б� ���� Stream
 */
public class UseObjectStream  {

	
	
	public void writeObject() throws IOException {
		System.out.println("��ü����");
		MyData md=new MyData("��ö��",177.2,69.2); //����ȭ ���ü ����
		//��ü(ObjextOutputStream)�� ����(FileOutputStream)�� ����� �� �ִ� Stream ����
		ObjectOutputStream oos=null;
		
		try {
			//1.��Ʈ�� ����
			oos=new ObjectOutputStream(new FileOutputStream(new File("e:/dev/temp/writeObj.dat")));
			//2.��ü����
			oos.writeObject(md);
			//3.��Ʈ�� ���� ����
			oos.flush();
			JOptionPane.showMessageDialog(null, "��ü�� ��Ʈ���� ����Ͽ����ϴ�.");
			
			
		}finally {
			if(oos!=null) {oos.close();}
			
		}
		
	}//writeObject
	
	
	public void readObject() throws IOException, ClassNotFoundException {
		System.out.println("��ü�б�");
		
		ObjectInputStream ois=null;
		
		try {
			//1. ��Ʈ�� ����
			ois=new ObjectInputStream(new FileInputStream(new File ("e:/dev/temp/writeObj.dat")));
			//2.��ü �б�
			MyData md=(MyData) ois.readObject();
			//3.�о���� ��ü ���
			StringBuilder readData=new StringBuilder();
			readData.append("�̸�: ").append(md.getName()).append("\n");
			readData.append("Ű: ").append(md.getHeight()).append("\n");
			readData.append("������: ").append(md.getWeight()).append("\n");
			
			JOptionPane.showMessageDialog(null, readData.toString());
		}finally {
			if(ois!=null) {ois.close();}
		}
		
		
	}//readObject
	
	public static void main(String[] args) {
		UseObjectStream uos=new UseObjectStream();
		
		String inputMenu="";
		boolean exitFlag=false;
		do {
			inputMenu=JOptionPane.showInputDialog("1.��ü���� 2.��ü�б� 3.����");
			if(inputMenu!=null) {
			
			switch(inputMenu) {
			case "1":
				try {
					uos.writeObject();
				} catch (IOException e) {
					JOptionPane.showMessageDialog(null, "��ü�� �� �� �����ϴ�.");
					e.printStackTrace();
				} 
				break;
			case "2":
				try {
					uos.readObject();
				} catch (IOException e) {
					JOptionPane.showMessageDialog(null, "��ü�� �о���� �� �����ϴ�.");
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					JOptionPane.showMessageDialog(null, "�о���� ���Ͽ� ��ü�� �������� �ʽ��ϴ�.");
					e.printStackTrace();
				} //end catch
				break;
			case "3": 
				exitFlag=true;
				break;
			default:
				JOptionPane.showMessageDialog(null, "�޴��� 1,2,3�� �� �ϳ��� �Է����ּ���.");
			}
		}//end if
		}while(!exitFlag);
		JOptionPane.showMessageDialog(null, "������ּż� �����մϴ�.");
		
		
	}//main

}
