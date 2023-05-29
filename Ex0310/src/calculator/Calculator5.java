package calculator;

public class Calculator5 {
	public static void main(String[] args) {
		
		MyCalculator calc = myCalc();
//		MyCalculator calc = (num1,num2) -> num1 + num2;
		
		System.out.println(calc.plus(10, 20));
	}
	
	public static MyCalculator myCalc() {
//		MyCalculator calc = (num1,num2) -> num1 + num2;
//			return calc;
		
		return (num1,num2) -> num1 + num2;
	}
}
