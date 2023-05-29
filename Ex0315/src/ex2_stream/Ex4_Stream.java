package ex2_stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex4_Stream {
	public static void main(String[] args) {
		//스트림의 최종연산
		//최종연산은 스트림의 요소를 소모하기 떄문에 결과를 
		//최종연산 후에 스트림이 닫히게 되고 더이상 사용할 수 없다.
		
		//forEach()
		//반환타입이 void이므로 스트림의 요소를 출력하는 용도로 사용된다.
		
		//조건검사
		//allMatch() : 지정된 조건에 모든 요소가 일치하면 true
		//anyMatch() : 지정된 조건에 일부 요소가 일치하면 true
		//noneMatch() : 지정된 조건에 어떠한 요소도 일치하지 않으면 true
		//findFirst() : 지정된 조건에 일치하는 첫 번째 요소를 반환
		//findAny() : 지정된 조건이 일치하는 첫 번째 요소를 반환
		
		int[] intArr = {2,4,6};
		
		boolean result = Arrays.stream(intArr).allMatch(x -> x % 2 == 0);
		System.out.println("2의 배수? : " + result);
		
		result = Arrays.stream(intArr).anyMatch(x -> x % 3 == 0);
		System.out.println("3의 배수가 하나라도 있냐? : " + result);
		
		result = Arrays.stream(intArr).noneMatch(x -> x % 3 == 0);
		System.out.println("3의 배수가 하나도 없냐? : " + result);
		
		Stream.of("one","two","three").filter(x -> x.length() > 4).findFirst().ifPresent(System.out::println);
		
		//통계 - count(),sum(),average(),max(),min();
		//IntStream과 같은 기본형 스트림에는 스트림의 요소들에 대한 통계 정보를 
		//얻을 수 있는 메서드들이 있다.
		//기본형 스트림이 아닌경우에는 통계 관련 메서드가 세개만 있다.(count(),max(),min()).
		
		//reduce()
		//스트림의 요소를 줄여나가면서 연산을 수행하고 최종결과를 반환한다.
		//매개변수 타입은 BinaryOperator이다. BinaryOperator는 BiFunction의 하위 인터페이스이다.
		//처음 두 요소를 가지고 연산한 결과를 가지고 그 다음 요소와 연산을 한다.
		
		//스트림을 컬렉션이나 배열로 반환
		//toList(),toSet(),toMap,toCollection(),toArray()
	}
}
