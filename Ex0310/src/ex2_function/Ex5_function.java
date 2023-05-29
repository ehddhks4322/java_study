package ex2_function;

import java.util.function.Predicate;

public class Ex5_function {
	public static void main(String[] args) {
		//Consumer<T> 인터페이스 -> void accept (T t)
		//Function<T,R> 인터페이스 -> R apply (T t)
		//Predicate<T> 인터페이스 -> boolean Test (T t)
		
		//Predicate를 and(), or(), negate()로 연결해서 하나의 새로운 Predicate로 결합할 수 있다.
		//Predicate의 끝에 negate()를 붙이면 조건식 전체가 부정이 된다.
		
		//Predicate<T> 인터페이스 -> boolean Test(T t);
		Predicate<Integer> p = i -> i < 100;
		Predicate<Integer> q = i -> i < 200;
		
		Predicate<Integer> r = p.and(q);//논리곱
		System.out.println(r.test(99));
		
		Predicate<Integer> s = p.or(q);//논리합
		System.out.println(s.test(101));
		
		Predicate<Integer> notP = p.negate();// i>=100
		System.out.println("p.test(100) : "+p.test(100));
		System.out.println("notP.test(100) : "+notP.test(100));
	}
}
