package ex2_function;

import java.util.function.Function;
import java.util.function.Supplier;

public class Ex7_function {
	public static void main(String[] args) {
		//메서드의 참조
		//람다식을 더욱 간결하게 표현할 수 있다.
		//람다식이 하나의 메서드만 호출하는 경우에는 메서드 참조(method reference)라는
		//방법으로 람다식을 간결하게 할 수 있다.
		//하나의 메서드만 호출하는 람다식은
		//클래스이름 :: 메서드이름
		//참조변수 :: 메서드이름
		//으로 바꿀수 있다.
		//참조타입 : 기본자료형을 제외하고, 배열,열거형,클래스,인터페이스등을 말한다.
		//참조타입의 변수에는 객체의 주소가 저장된다.
		
		Function<String, Integer> f = (String s) -> Integer.parseInt(s);
		Function<String, Integer> f2 = Integer::parseInt;//메서드 참조
		
		//이미 생성된 객체의 메서드를 람다식에서 사용한 경우에는 클래스 이름 대신 그 객체의 이름을 적어주면 된다.
		//MyClass obj = new MyClass();
		//Function<String, Boolean> f = (x) -> obj.equals(x);//람다식
		//Function<String, Boolean> f = (x) -> obj::equals;
		
		//int[] nums = createArray(10,x -> new int[x]);
		int[] nums = createArray(10, int[]::new);
		
		//Object obj = getObject(()->new Object());
		Object obj = getObject((Object::new));
		
	}
	
	public static int[] createArray(int x, Function<Integer, int[]> function) {
		return function.apply(x);
	}
	
	public static Object getObject(Supplier<Object> supplier) {
		return supplier.get();
	}
	
}
