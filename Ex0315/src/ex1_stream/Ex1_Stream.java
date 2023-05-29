package ex1_stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex1_Stream {
	public static void main(String[] args) {
		
		//Stream<T> stream.of(T...values) //가변인자
		//Stream<T> stream.of(T[])
		//Stream<T> Arrays.stream(T[])
		//Stream<T> Arrays.stream(T[] array, int startInclusive, int endExclusive)
		
		String[] strArray = {"홍길동","신용권","김미나"};
		
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(item -> System.out.print(item + ","));
		System.out.println();
		
		int[] intArray = {1,2,3,4,5};
		
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(x -> System.out.print(x+","));
	}
}
