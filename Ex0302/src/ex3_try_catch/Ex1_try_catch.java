package ex3_try_catch;

public class Ex1_try_catch {
	public static void main(String[] args) {
		//자바에서 프로그램이 실행되는 도중 예외(오류,에러,버그)
		//예외가 발생하면 그 시점에서 프로그램이 강제로 종료된다.
		//대게 종료가 안되면 더 큰 문제가 발생할 수 있지만
		//떄로는 예상가능한 오류가 있거나 오류 발생시 이를 무시하고
		//이후의 작업을 진행해야 하는 경우가 있다.
		//이럴 때 사용하는 문법이 예외처리 이다.
		
		//예상가능한 오류?
		//키보드에서 값을 받을 때 원하는 타입이 아닌 다른 타입으로
		//받는다면 나는 오류
		
		int result = 10;
		char[] arr = new char[3];
		
		//result = 10/0;
		//ArithmeticException 정수를 0으로 나누려 할 때  발생하는 예외
		
		//ArrayIndexOutOfBoundsException 없는 index에 값을 넣으려고 할 때 발생하는 예외
		
		try {
			//너무 많이 작성하면 오류를 못 잡을수도 있다.
			//오류가 발생할 확률이 높은 것만 써야한다.
			//result = 10/0;
			arr[3] = 'A';
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("없는 index에 값을 넣을 수 없습니다.");
		}
		
		
		
		
		
	}
	
}
