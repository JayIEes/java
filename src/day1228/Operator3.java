package day1228;
/**
����Ʈ������ <br>
<< : left shift - ��Ʈ�� �������� �а� �о ��ĭ�� �׻� 0���� ä���.
>> : right shift - ��Ʈ�� ���������� �а�, �о� ��ĭ�� �ֻ��� ��ȣ ��Ʈ�� ���� ����� 0�� 
������ 1�� ä���.
>>> :unsigned right shift-��Ʈ�� ���������� �а�, �о ��ĭ�� 0���� ä���.
*/

public class Operator3{
	public static void main(String[] args) {
		
	int i=6;// 0000 0110 << 4    -> 0011 0000
 System.out.println(i+" << 3 = "+(i<<3)); // ��ȣ ������ ������, ����� ���� ����Ǳ� ����

	i=1; // 0000 0000 0000 0000 0000 0000 0000 0001 <<31 = 1000 0000 0000 0000 0000 0000 0000 0000 
	System.out.println(i<<31); //������ �ְ� ����
	System.out.println(i<<32);
	System.out.println(i<<34); 
//��Ʈ�� �з� ��ȣ��Ʈ�� �ö󰡸� ��ȣ�� ����ȴ�.

	i=80; // 0101 0000 >> 4 = 0000 0101
	System.out.println(i+">>4 = "+(i>>4));

	i=37; //0010 0101
/* �⺻�� ���������� ���� ����� �� ������ wrapperŬ������ �� �̿ܿ��� �������� ���(��=method)�� ����� �� �ִ�. 
	System.out.println(i+"i�� 2������ " + Integer.toBinaryString(i));
	System.out.println(i+"i�� 16������ " + Integer.toHexString(i));
	System.out.println(i+"i�� 8������ " + Integer.toOctalString(i));
	*/

	System.out.println(i+">> 3 : "+(i>>3)); //0010 0101 >>3 = 0000 0100
	
	i=-1; // 1111 1111
	System.out.println(i+">> 100 = " +(i>>100)); // 1�� ä���� 


	i=45; //0010 1101 >>>2   0000 1011 (11)
	System.out.println(i+">>> 2 = "+(i>>>2)); // 1�� ä���� 
	
	i=-1; // 1111 1111 1111 1111 1111 1111 1111 1111; -> 0111 1111 1111 1111 1111 1111 1111 1111(����� ���� �� �ִ� �ִ밪)
	System.out.println(i+">>> 1 = " +(i>>>1)); // 1�� ä���� 
	

//	i=Integer.MIN_VALUE;
	System.out.println();

	}
}
