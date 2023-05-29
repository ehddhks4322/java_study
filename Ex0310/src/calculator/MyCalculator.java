package calculator;

@FunctionalInterface
//내가 컴파일러에게 인터페이스를 람다식용 인터페이스로 사용할거다 라고 알려주는 것
public interface MyCalculator {
	
	int plus(int num1, int num2);//추상메서드
	
}
