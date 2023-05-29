package ex1_stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Stream;

public class Ex2_Stream {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("홍길동");
		set.add("김자바");
		set.add("람다식");
		
//		for(String str : set) {
//			System.out.println(str);
//		}
		
		//Stream을 이용한 요소 반복처리
		Stream<String> stream = set.stream();
		set.forEach(System.out::println);
		System.out.println();
		//Stream은 Iterator와 비슷한 반복자이지만, 다음과 같은 차이점을 갖고 있다.
		//1) 내부 반복자이므로 처리속도가 빠르고, 병렬처리에 효과적이다.
		//2) 람다식으로 다양한 요소 처리를 정의할 수 있다.
		//3) 중간 처리와 최종 처리를 수행하도록 파이프라인을 형성할 수 있다.
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("김자바");
		list.add("람다식");
		
		Stream<String> stream2 = list.stream();
		stream2.forEach(System.out::println);
		System.out.println();
	}
}
