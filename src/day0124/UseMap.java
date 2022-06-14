package day0124;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Ű�� ���� ������ �� �ڷᱸ�� - Map
 * 
 * @author user
 */
public class UseMap {

	/**
	 * Hashtable: �⺻�����ڸ� ����ؼ� �����ϸ� 11���� ���� �����ȴ�. ����ȭ ó�� O
	 */
	public void UseHashtable() {
		// 1. ����
//		Map<String, String> map = new Hashtable<String, String>(200);
		Map<String, String> map = new Hashtable<String, String>();

		// 2. �� �Ҵ�
		map.put("A", "�����ϴ�, ģ���ϴ�.^0^");
		map.put("B", "���� �巴��.(�Ѥ�+)");
		map.put("AB", "������ @_@.");
		map.put("O", "�����δ��ϴ�.~(^^~)(~^^)~");

		// �ߺ� ���� ���� ����, Ű�� �ߺ��� �� ����, ���� �ߺ��ȴ�.
		map.put("A", "�ҽ��ϴ�."); // Ű�� �ߺ����� �ʴ´�.
		map.put("a", "�ҽ��ϴ�."); // ���� �ߺ��� �� �ִ�.

		System.out.println(map);

		// Ű�� �����ϴ���
		System.out.println(map.containsKey("A"));

		// �� ��� : Ű�� �����ϸ� ���� ��ȯ�ǰ�, Ű�� ������ null�� ��ȯ�ȴ�.
		System.out.println(map.get("a") + "/" + map.get("ab"));

		// ��� Ű ���
		Set<String> keys = map.keySet();

		// ��� Ű ���
		Iterator<String> itr = keys.iterator();
		String value = "";
		while (itr.hasNext()) {
			value = itr.next(); // ���� ��� �����͸� ���� ��ġ�� �̵���Ų��.
			System.out.println(value + " " + map.get(value));
		} // end while

		System.out.println("���� ��: " + map.size());
		System.out.println("map�� ���� ����? " + map.isEmpty());
		map.remove("O");
		map.clear();

		System.out.println("map�� ���� ����? " + map.isEmpty());
		System.out.println("���� ��: " + map.size());

		System.out.println(map);

	}// UseHashTable

	/**
	 * HashMap: �⺻�����ڸ� ����ؼ� �����ϸ� 16���� ���� �����ȴ�. ����ȭ ó�� X
	 */
	public void UseHashMap() {
		// 1. ����
		Map<String, String> map = new HashMap<String, String>();

		// 2. �� �Ҵ�
		map.put("A", "�����ϴ�, ģ���ϴ�.^0^");
		map.put("B", "���� �巴��.(�Ѥ�+)");
		map.put("AB", "������ @_@.");
		map.put("O", "�����δ��ϴ�.~(^^~)(~^^)~");

		// �ߺ� ���� ���� ����, Ű�� �ߺ��� �� ����, ���� �ߺ��ȴ�.
		map.put("A", "�ҽ��ϴ�."); // Ű�� �ߺ����� �ʴ´�.
		map.put("a", "�ҽ��ϴ�."); // ���� �ߺ��� �� �ִ�.

		System.out.println(map);

		// Ű�� �����ϴ���
		System.out.println(map.containsKey("A"));

		// �� ��� : Ű�� �����ϸ� ���� ��ȯ�ǰ�, Ű�� ������ null�� ��ȯ�ȴ�.
		System.out.println(map.get("a") + "/" + map.get("ab"));

		// ��� Ű ���
		Set<String> keys = map.keySet();

		// ��� Ű ���
		Iterator<String> itr = keys.iterator();
		String value = "";
		while (itr.hasNext()) {
			value = itr.next(); // ���� ��� �����͸� ���� ��ġ�� �̵���Ų��.
			System.out.println(value + " " + map.get(value));
		} // end while
	

		System.out.println("���� ��: " + map.size());
		System.out.println("map�� ���� ����? " + map.isEmpty());
		map.remove("O");
		map.clear();

		System.out.println("map�� ���� ����? " + map.isEmpty());
		System.out.println("���� ��: " + map.size());

		System.out.println(map);

	}// UseHashMap

	public static void main(String[] args) {

		UseMap um = new UseMap();
		System.out.println("---------------HashTable----------------");
		um.UseHashtable();
		System.out.println("---------------HashMap-----------------");
		um.UseHashMap();

	}// main

}// class