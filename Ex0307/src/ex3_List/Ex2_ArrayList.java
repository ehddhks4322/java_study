package ex3_List;

import java.util.ArrayList;

public class Ex2_ArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(10);
		list.add(1,14);
		list.add(1,20);//���� index�� ���� ���������� ��ĭ �и��� �ȴ�.
		list.set(2,30);//index 2���� ���� 30���� ����
		
		System.out.println(list);
		
		//ArrayList�� ��� �����ϱ�
		list.remove(1);//index 1���� �ִ� ��� �����ϱ�
		//�߰��� �ִ� ��Ҹ� �����ϸ� �������� ��ĭ�� �������.
		
		
		//ArrayList�� ����� �ε����� �˾Ƴ���
		//�ߺ��� ���� ��� ���� ���� ������ ����� �ε����� ��ȯ
		//�⺻���� Ž�� ������ ���ʿ��� ������
		System.out.println("30�� index : " + list.indexOf(30));
		
		//�����ʿ��� �������� Ž���ϸ鼭 ���� ���� ������ ����� index�� ��ȯ
		System.out.println("lastIndexOf 10�� index : " + list.lastIndexOf(10));
		
		//ArrayList�� ��Ұ� ���ԵǾ��ִ��� Ȯ��
		list.contains(30);//������ true, ������ false�� ��ȯ
		
		//ArrayList ����
		if(list.removeAll(list)) {
			System.out.println("list �����");
		}
		list.clear();
		
		//ArrayList�� ����ִ��� Ȯ��
		list.isEmpty();//����� ������ true, ��������� ������ false�� ��ȯ
		
		
		System.out.println(list);
		
		
		
		
	}
}
