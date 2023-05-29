package ex3_List;

import java.util.ArrayList;

public class Ex1_ArrayList {
	public static void main(String[] args) {
		//C����� LinkedList���� �Ѿ�� ���信�� ������ �����ؼ� ���� �����Դϴ�.
		
		//List -> �÷��� �������̽�
		//ArrayList : *index���� ����* ���� �߰��ϰų� �����ϴ� �뵵�� Ŭ����
		//�ߺ��� ���� �������� �ʰ� �߰�
		//index��ȣ�� ������ �ִ�.(���� �߿�!!)
		
		//�迭�� ũ�Ⱑ �������߸� �Ѵ�.
		//������ ArrayList������ size�� �þ��� �پ��� �������̴�.
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//ArrayList�� ��� �߰��ϱ�
		list.add(100);
		list.add(100);
		list.add(20);
		System.out.println(list);
		
		//ArrayList����  ��� �ϳ� ��������
		System.out.println("list.get(2) : " + list.get(2));
		
		//for���� ����Ͽ� ArrayList�� ���� ��� ��ҿ� �����ϱ�
		for(int i = 0; i < list.size(); i ++) {
			System.out.print(list.get(i)+ " ");
		}
		System.out.println();
		
		//������ for��(������ roop��)
		//�迭 list�� ���� ������ index ������ �ڵ����� �����Ͽ� ��Ҹ� ������ݴϴ�.
		//Ư�� index�� �������� ������ �Ұ����ϱ� ������ Ư�� index �� ���� �����̳�
		//��� �Ұ����ϴ�.
		for(int i : list) {
			System.out.print(i + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
