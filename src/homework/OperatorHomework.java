package homework;
class OperatorHomework {
	public static void main(String[] args) {

	//���� 1.
	int i=12;
//		System.out.println(~12+1);
	System.out.println(~i+1);//i�� ���� ������ i�� ����ؼ� �����ϸ� �˴ϴ�.

	//���� 2.
	i = 10; //�̹� �������� ������ int ���̸� �ȵ�!
	int j = -10;
		System.out.println(i++ - --j); //��� ���� 21�� ���� ������ �����Ͽ���.

	//���� 3.
	i = -1>>>1; //�����ϱ� >>�� ��ĭ�� 1�� ä��Ƿ� ���� ������ ������, >>>�� ����Ѵ�(?)
	System.out.println(i>>27); // �� �̿ܿ� Ȥ�� �ٸ� ����� �������?
	//�����ϴ�. ���ϼ̾��

	i = -1 << 32;
	System.out.println(i);

	i=-1;
		System.out.println(~i);


	}
}
