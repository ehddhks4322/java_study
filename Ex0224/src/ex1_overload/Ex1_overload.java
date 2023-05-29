package ex1_overload;

public class Ex1_overload {
	//오버로드 : 메서드의 '중복정의'라고 하며, 하나의 클래스 내에서 같은 이름을 가진
	//메서드가 여러개 정의되는 것을 말한다.
	
	//**메서드 오버로드 규칙**//
	//1) 메서드의 이름은 모두 같아야 한다.
	//2) 파라미터의 개수가 달라야 한다.
	//3) 파라미터의 개수가 같은 경우 자료형이 달라야 한다.
	//4) 파라미터의 개수가 같아도 순서가 다르면 된다.
	
	public void result() {
		System.out.println("인자가 없는 메서드");
	}
	
	public void result(int n) {
		System.out.println("정수를 인자로 받는 메서드");
	}
	
	
	//3) 파라미터의 개수가 같은 경우 자료형이 달라야 한다.
	public void result(char n) {
		System.out.println("문자형을 인자로 받는 메서드");
	}
	
	
	//4) 파라미터의 개수가 같아도 순서가 다르면 된다.
	public void result(String s, int n) {
		System.out.println("문자열, 정수를 인자로 받는 메서드");
	}
	
	public void result(int n, String s) {
		System.out.println("정수, 문자열을 인자로 받는 메서드");
	}
	
	
}
