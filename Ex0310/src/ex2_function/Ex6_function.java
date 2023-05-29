package ex2_function;

import java.util.function.BiPredicate;

public class Ex6_function {
	public static void main(String[] args) {
		
//메서드 참조
//람다식을 더욱 간결하게 표현할 수 있다.
//람다식이 하나의 메서드만 호출하는 경우에는 메서드 참조(method reference)라는 방법으로 람다식을 간결하게 할 수 있다.
//하나의 메서드만 호출하는 람다식은 클래스이름::메서드이름 또는 참조변수::메서드이름으로 바꿀 수 있다.
//참조 타입 (byte,short,char,int,long,float,double,boolean)기본 타입을 제외하고 배열,열거,클래스,인터페이스 등을 말한다.
//참조 타입의 변수에는 객체(메모리)의 주소가 저장된다.
		
//		boolean result = isEqualString("abc","abc",(s1,s2) -> s1.equals(s2));
//		System.out.println(result);
		
		boolean result = isEqualString("abc","abc",String::equals);
		System.out.println(result);
		
	}
	
	public static boolean isEqualString(String s1, String s2, BiPredicate<String, String> predicate) {
		return predicate.test(s1, s2);
	}
}
