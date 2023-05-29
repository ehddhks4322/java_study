package ex2_stream;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex2_Stream {
	public static void main(String[] args) {
		//�⺻Ÿ���� ��Ʈ��
		//���׸��� ������� �ʰ� ���������� �ش� Ÿ���� ��Ʈ���� �ٷ� �� �ִ�.
		//����� Ÿ���� T�� ��Ʈ���� �⺻������ Stream�ε�, �⺻�ڷ����� �ٷ����
		//����ڽ� & ��ڽ��� �߻��Ͽ� ��ȿ������ �����Ѵ�.(Integer <-> int)
		//IntStream, LongStream, DoubleStream
		//�⺻�ڷ����� �����ϰ� ����� �� �ִ� �޼��带 �����Ѵ�.
		
		//1~10������ ������ ���ϴ� �ڵ� �ۼ��غ��� 
		int total = 0;
		for(int i = 1; i <= 10; i++) {
			total += i;
		}
		System.out.println("1���� 10������ ���� : " + total);
		
		//range(���۰�,����) : ���۰��� ���� ������ �̸�
		//rangeClosed(���۰�,����) : ���۰��� ���� ������ �̸�
		int result = IntStream.range(1, 11).sum();
		System.out.println("1~10������ ���� : " + result);
		
		//IntStream ints(���۰�,���ᰪ) ���۰� ����, ���ᰪ �̸�
		//LongStream longs(���۰�,���ᰪ) ���۰� ����, ���ᰪ �̸�
		//DoubleStream doubles(���۰�,���ᰪ) ���۰� ����, ���ᰪ �̸�
		
		Random rnd = new Random();
		IntStream stream = rnd.ints(1,46);//�������ϱ�
		stream.distinct().limit(6).forEach(System.out::println);
		
		System.out.println();
		//�� ��Ʈ���� ����
		String[] str1 = {"123","456","789"};
		String[] str2 = {"abc","def","ghi"};
		
		Stream<String> stream1 = Stream.of(str1);
		Stream<String> stream2 = Stream.of(str2);
		Stream<String> stream3 = Stream.concat(stream1, stream2);
		stream3.forEach(item ->  System.out.println(item + " "));
	}
}
