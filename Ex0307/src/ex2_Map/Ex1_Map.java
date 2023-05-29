package ex2_Map;

import java.util.HashMap;

public class Ex1_Map {
	public static void main(String[] args) {
		//Map������ Ű(Key)�� ��(Value)�� �� ���� �����ͷ� ����˴ϴ�.
		//Map������ Key���� ����  Value���� �˻��ϱ� ������ �������� �����͸�
		//��ȸ�ϴµ� �־ �ſ� �پ ������ �����մϴ�.
		
		//Map�� �������̽� �̰� Map�������̽��� �����ϴ� Ŭ���� �� ���� ���Ǵ�
		//Ŭ������ HashMap �Դϴ�.
		
		HashMap<Integer, Character> map = new HashMap<Integer, Character>();
		
		//HashMap�� ��Ҹ� �߰��� ��
		map.put(1,'A');
		map.put(2,'B');
		map.put(3,'C');
		
		//map�� ����Ǵ� value���� �ߺ��� �� �� �ִ�.
		map.put(4,'A');//���� Ű������ �߰��� �ϸ� ���Ӱ� �߰��� �ȴ�.
		
		//map�� ����Ǵ� key���� �ߺ���  �� �� ����.
		map.put(1,'f');//������ ���� �̸��� ���� key�� �ִٸ� value�� �����Ѵ�.
		
		//HashMap�� ũ��
		System.out.println("map�� ũ�� : " + map.size());
		
		//HashMap�� ��� �����ϱ�
		map.remove(3);//key���� �̿��Ͽ� ��Ҹ� �����մϴ�.
		
		//HashMap ���
		System.out.println(map);
		
		//HashMap���� value�� ����ϱ�
		char ch = map.get(1);//key���� ���� Value���� �����´�.
		System.out.println("map.get(1) : " + ch);
	}
}
