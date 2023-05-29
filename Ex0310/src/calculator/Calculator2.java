package calculator;

public class Calculator2 {
	
	//지역 내부 익명 클래스
	//익명 클래스는 내부 클래스(inner class)의 일종으로
	//이름이 없는 클래스를 말한다.
	//나중에 다시 불러질 이유가 없다는 뜻을 내포하고 있다.
	//즉, 프로그램에서 일시적(한번만)으로 사용되고 버려지는 객체라고 보면 된다.
	//(일회용 클래스)
	
	public static void main(String[] args) {
		
		int num3 = 30;
		
		MyCalculator calc = new MyCalculator() {
			
			
			
			@Override
			public int plus(int num1, int num2) {
				//num3 = 40;//final int num3 (변수의 상수화가 되기때문에 값을 새롭게 대입을 하려고 해도 안된다.)
				return num1 + num2;
			}
		};
	}
	
	
}
