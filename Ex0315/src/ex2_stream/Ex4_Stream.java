package ex2_stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex4_Stream {
	public static void main(String[] args) {
		//��Ʈ���� ��������
		//���������� ��Ʈ���� ��Ҹ� �Ҹ��ϱ� ������ ����� 
		//�������� �Ŀ� ��Ʈ���� ������ �ǰ� ���̻� ����� �� ����.
		
		//forEach()
		//��ȯŸ���� void�̹Ƿ� ��Ʈ���� ��Ҹ� ����ϴ� �뵵�� ���ȴ�.
		
		//���ǰ˻�
		//allMatch() : ������ ���ǿ� ��� ��Ұ� ��ġ�ϸ� true
		//anyMatch() : ������ ���ǿ� �Ϻ� ��Ұ� ��ġ�ϸ� true
		//noneMatch() : ������ ���ǿ� ��� ��ҵ� ��ġ���� ������ true
		//findFirst() : ������ ���ǿ� ��ġ�ϴ� ù ��° ��Ҹ� ��ȯ
		//findAny() : ������ ������ ��ġ�ϴ� ù ��° ��Ҹ� ��ȯ
		
		int[] intArr = {2,4,6};
		
		boolean result = Arrays.stream(intArr).allMatch(x -> x % 2 == 0);
		System.out.println("2�� ���? : " + result);
		
		result = Arrays.stream(intArr).anyMatch(x -> x % 3 == 0);
		System.out.println("3�� ����� �ϳ��� �ֳ�? : " + result);
		
		result = Arrays.stream(intArr).noneMatch(x -> x % 3 == 0);
		System.out.println("3�� ����� �ϳ��� ����? : " + result);
		
		Stream.of("one","two","three").filter(x -> x.length() > 4).findFirst().ifPresent(System.out::println);
		
		//��� - count(),sum(),average(),max(),min();
		//IntStream�� ���� �⺻�� ��Ʈ������ ��Ʈ���� ��ҵ鿡 ���� ��� ������ 
		//���� �� �ִ� �޼������ �ִ�.
		//�⺻�� ��Ʈ���� �ƴѰ�쿡�� ��� ���� �޼��尡 ������ �ִ�.(count(),max(),min()).
		
		//reduce()
		//��Ʈ���� ��Ҹ� �ٿ������鼭 ������ �����ϰ� ��������� ��ȯ�Ѵ�.
		//�Ű����� Ÿ���� BinaryOperator�̴�. BinaryOperator�� BiFunction�� ���� �������̽��̴�.
		//ó�� �� ��Ҹ� ������ ������ ����� ������ �� ���� ��ҿ� ������ �Ѵ�.
		
		//��Ʈ���� �÷����̳� �迭�� ��ȯ
		//toList(),toSet(),toMap,toCollection(),toArray()
	}
}
