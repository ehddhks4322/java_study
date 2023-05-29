package ex1_TreeSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class Ex1_TreeSet {
	public static void main(String[] args) {
		//TreeSet�� ����Ž��Ʈ�� �߿����� ������ ����Ų ����-��Ʈ��(Red-Black Tree)�� �����Ǿ��ֽ��ϴ�.
		//���� �� Ʈ���� �θ��庸�� ���� ���� ������ ���� ���� �ڽ�����, ū ���� ������ ���� ������ �ڽ����� ��ġ�Ͽ�
		//�������� �߰��� ���� �� Ʈ���� �������� ġ�������� �ʵ��� ������ ���߾��ݴϴ�.
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		//TreeSet<Integer> ts = new TreeSet<Integer>(set1);
		//set1�� ���� ��� ���� TreeSet���� ����
		
		//TreeSet<Integer> ts = new TreeSet<Integer>(Arrays.asList(1,2,3));
		//�ʱⰪ�� ���� TreeSet�� ����
		
		//TreeSet�� ��� �߰��ϱ�
		ts.add(7);
		ts.add(4);
		ts.add(9);
		ts.add(1);
		ts.add(5);
		
		//TreeSet�� �� ����
		ts.remove(1);//�� 1����
		
		//TreeSet�� ��� �� ����
		ts.clear();
		
		TreeSet<Integer> ts2 = new TreeSet<Integer>(Arrays.asList(7,4,9,1,5));//�ʱⰪ 7,4,9,1,5 ����
		
		//TreeSet�� ũ�� ���ϱ�
		System.out.println("Ʈ������ ũ��  : " + ts.size());
		
		//TreeSet�� �� ����ϱ�
		System.out.println(ts2);//������ �� ���·� ���
		
		System.out.println("�ּҰ� ��� : " + ts2.first());
		System.out.println("�ִ밪 ��� : " + ts2.last());
		
		//���ǿ� �����ϴ� ���� ���ٸ� null���� ��ȯ�Ѵ�.
		System.out.println("�Է°����� ū ������ �� �ּҰ� ��� : " + ts2.higher(3));
		System.out.println("�Է°����� ���� ������ �� �ִ밪 ��� : " + ts.lower(3));
		
		//HashSet�� �̿��Ͽ� 5 * 5�� ���� ������ �����
		HashSet<Integer> hs = new HashSet<Integer>();
		int[][] board = new int[5][5];
		
		while(true) {
			hs.add(new Random().nextInt(50)+1);
			
			if(hs.size() == 25) {
				break;
			}
		}
		
		//Set������ Ư�� �ε����� ������ �� ���� ������, ������ ���������� ������ ���ؼ��� 
		//iterator��� �ϴ� �ݺ��ڸ� �̿��ؾ� �Ѵ�.
		
		//Iterator<Integer> ���ͷ����͸� = �÷��ǰ�ü.iterator();
		Iterator<Integer> it = hs.iterator();
		
		//it.hasNext();
		//iterator�ȿ� �������� ����ִ��� Ȯ���Ͽ�
		//������ true, ������ false
		
		//it.next();
		//iterator�� ������ ��������(ó������ ������)
		
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				board[i][j] = it.next();
				System.out.printf("%02d ",board[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
}
