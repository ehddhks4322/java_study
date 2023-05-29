package ex1_interface;

public interface InterTest {
	//인터페이스에는 상수와 추상메서드만으로 구성되어 있다.
	
	//int a = 100; 변수
	final int NUMBER = 100; //상수(무조건 대문자)
	//인터페이스에서는 final을 생략할 수 있다.
	
	abstract public int getNumber();
	//어차피 인터페이스에 들어있는 메서드는
	//추상메서드로 인지하기 때문에 abstract는 생략이 가능하다.
}
