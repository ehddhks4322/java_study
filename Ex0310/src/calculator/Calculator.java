package calculator;

public class Calculator {
	public static void main(String[] args) {
		//메서드 -> 메서드 밖에서 만듦
		//호출 -> 메서드 안에서
		
		//람다식
		//메서드를 하나의 식(expression)으로 표현한 것
		//자바 1.8버전에서 도입
		
		//람다식이 도입된 이유
		//함수형 프로그래밍 방식이 뜨고 있어서
		//자바에서는 함수형 프로그래밍 방식이 적용되지 않았다.
		//자바에서 함수는 클래스를 나누어서 작성을 했었다.
		//함수가 독립적이지 않다. -> 반드시 객체를 만들어서 호출을 했어야 했다.
		
		//함수형 프로그래밍의 특징
		//1. 함수를 파라미터에 넣어서 사용할 수 있다.
		//2. 함수를 반환형에 넣어서 사용할 수 있다.
		
		//람다식 사용하는 법
		//1. 인터페이스를 1개 만든다.
		//2. 구현할 추상메서드를 1개 정의합니다.
		//3. 메서드는 1개만 정의를 해야 합니다.
		
		MyCalculator calc = (int num1, int num2) -> {return num1 + num2;};//무조건 세미콜론을 적어줘야 한다.
		
		int result = calc.plus(20, 30);
		System.out.println(result);
		
		
		
		
		
	}
}
