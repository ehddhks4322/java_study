package ex2_stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex3_Stream {
	public static void main(String[] args) {
		//스트림의 요소 걸러내기
		//distinct() -> 스트림에서 중복되는 요소 제거하기
		//filter() -> 주어진 조건(Predicate)에 맞지 않는 요소를 걸러낸다.
		
		IntStream intStream = IntStream.rangeClosed(1, 10);//1~10
		intStream.filter(i -> i % 2 == 0).forEach(System.out::println);
		
		Stream.of("ab","a","abc","abcd","abcdef","abcdefg").filter(i -> i.length() > 2).forEach(System.out::println);
	}
}
