package ex2_function;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Ex3_function {
	public static void main(String[] args) {
		int result = square(10, x -> x*x);
		System.out.println(result);
		
		int result2 = multi(10,20,(x,y) -> x*y);
		System.out.println(result2);
	}
	
	public static int square(int num1, UnaryOperator<Integer> oper) {
		return oper.apply(num1);
	}
	
	public static int multi(int num1, int num2, BinaryOperator<Integer> oper) {
		return oper.apply(num1, num2);
	}
}
