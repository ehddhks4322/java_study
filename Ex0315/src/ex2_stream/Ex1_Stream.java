package ex2_stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex1_Stream {
	public static void main(String[] args) {
		//지연된 연산
		//- 최종연산이 수행되기 전까지 중간연산이 수행되지 않는다.
		//- 중간 연산을 호출하는 것은 단순이 어떤 작업이 수행되어야 하는지를 지정해주는 것
		//- 최종 연산이 수행되어야 스트림의 요소들이 중간 연산을 거쳐 최종 연산에서 소모된다.
		
		Integer[] nums = {1,2,3,4,5,6,7,8,9,10};
		
		Stream<Integer> stream = Arrays.stream(nums);
		int sum = stream.reduce(0, (x,y) -> x+y);
		System.out.println(sum);
	}
}
