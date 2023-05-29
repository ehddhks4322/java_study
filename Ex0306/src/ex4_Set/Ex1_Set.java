package ex4_Set;

import java.util.HashSet;
import java.util.Random;

public class Ex1_Set {
	public static void main(String[] args) {
		//�÷���(collection) : java.util ��Ű���� �ִ� �������̽�
		//�迭�� ������ �����Ͽ� index������ �������� ���� �ټ��� ��ü��
		//�ٷ�� ���� ����ϴ� ���α׷��� ���
		
		//Set,Map,List -> �÷��� �������̽�
		
		//Set�������̽��� �����ϰ� �ִ� Ŭ����
		//HashSet,TreeSet
		
		//Set���� �������� �߻�޼��尡 �������̵�(������)�� �� �Ǿ��ִ�.
		HashSet<String> hs1 = new HashSet<String>();
		System.out.println(hs1.add("a")); 
		hs1.add("b");
		hs1.add("f");
		hs1.add("d");
		
		//HashSet�� ����ִ� ����� ������ ���� �޼���
		System.out.println("hs1�� ����� ���� : " + hs1.size());
		
		//HashSet�� �ߺ��� �����͸� �߰��� �� ����.
		//���� ���� �߰� �ҷ��� �ϸ� true, �ִ� ���� �߰� �ҷ��� �ϸ� false
		System.out.println(hs1.add("a"));
		hs1.add("b");
		System.out.println("hs1�� ����� ���� : " + hs1.size());
		
		//HashSet�� ����Ǿ� �ִ� �����͸� �����ϴ� ��
		hs1.remove("a");
		
		//HashSet�� ���
		System.out.println(hs1);
		
		//HashSet�� ����Ǿ� �ִ� ��� �����͸� �����ϴ� ��
		hs1.removeAll(hs1);//����� �������� ��ȯ
		hs1.clear();//�����ϰ� ��ȯ�ϴ� ���� ����.
		System.out.println(hs1);
		
		System.out.println("--------------------");
		
		//HashSet ��ü hs2�� ����� ���� 6���� ��ҷ� �־ ����ϱ�
		
		HashSet<Integer> hs2 = new HashSet<Integer>();
		
		Random rnd = new Random();
		
		while(true) {
			int n = rnd.nextInt(45)+1;
			hs2.add(n);
			
			if(hs2.size() == 6) {
				break;
			}
		
		}
		System.out.println(hs2);
		
		HashSet<Integer> hs3 = new HashSet<Integer>();
		
		while(hs3.size() < 6) {
		int rnd2 = new Random().nextInt(45)+1;
		hs3.add(rnd2);
		}
		System.out.println(hs3);
		
		
		//index�� ���� ������ ��� �ϳ��ϳ��� ������ �� ���� ���ٴ� ��
		//set -> �迭�� ��ȯ
		
		//Integer[0] --> �迭�� ���� ������ 0���� ������ set�� add�ص� ����� ���ļ���ŭ
		//�˾Ƽ� ���� ������ش�.
		Integer[] arr = hs2.toArray(new Integer[0]);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] : %d\n",i,arr[i]);
		}
		
		
		
		
		
		
		
		
	}
}
