package ex2_function;

import java.util.function.Function;

public class Ex4_function {
	public static void main(String[] args) {
		
		//f.andThen(g) : 함수 f를 먼저 적용하고 그 다음에 함수 g를 적용한다.
		
//		Function<String, Integer> f = s -> Integer.parseInt(s,16);//(앞에 들어온 문자열을 16진수로 바꾼다.)
//		Function<Integer, String> g = i -> Integer.toBinaryString(i);//(2진수로 바꿔주는 메서드)
//		Function<String, String> h = f.andThen(g);
//		System.out.println(h.apply("FF")+2);
		
		//f.compose(g) : g를 먼저 적용하고 f를 적용한다.
		
//		Function<Integer, String> g = i -> Integer.toBinaryString(i);
//		Function<String, Integer> f = s -> Integer.parseInt(s,16);
//		Function<Integer, Integer> h = f.compose(g);
//		System.out.println(h.apply(2));//2-> "10" -> 16
		
		//Function.identity() : 함수를 적용하기 이전과 동일한 항등함수, x -> x
		
		Function<String, String> f = x -> x;//항등함수
//		Function<String, String> f = Function.identity();
		System.out.println(f.apply("hello"));
}
}
