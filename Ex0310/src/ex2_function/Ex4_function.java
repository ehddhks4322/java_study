package ex2_function;

import java.util.function.Function;

public class Ex4_function {
	public static void main(String[] args) {
		
		//f.andThen(g) : �Լ� f�� ���� �����ϰ� �� ������ �Լ� g�� �����Ѵ�.
		
//		Function<String, Integer> f = s -> Integer.parseInt(s,16);//(�տ� ���� ���ڿ��� 16������ �ٲ۴�.)
//		Function<Integer, String> g = i -> Integer.toBinaryString(i);//(2������ �ٲ��ִ� �޼���)
//		Function<String, String> h = f.andThen(g);
//		System.out.println(h.apply("FF")+2);
		
		//f.compose(g) : g�� ���� �����ϰ� f�� �����Ѵ�.
		
//		Function<Integer, String> g = i -> Integer.toBinaryString(i);
//		Function<String, Integer> f = s -> Integer.parseInt(s,16);
//		Function<Integer, Integer> h = f.compose(g);
//		System.out.println(h.apply(2));//2-> "10" -> 16
		
		//Function.identity() : �Լ��� �����ϱ� ������ ������ �׵��Լ�, x -> x
		
		Function<String, String> f = x -> x;//�׵��Լ�
//		Function<String, String> f = Function.identity();
		System.out.println(f.apply("hello"));
}
}
