package ex3_Calculator;

import java.util.Scanner;

public class CalMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 1 : ");
		int num1 = sc.nextInt();
		System.out.println("숫자 2 : ");
		int num2 = sc.nextInt();
		System.out.println("연산기호 : ");
		String str = sc.next();
		
		CalTest ct = new CalTest();
		
		ct.Colculator(num1, num2, str);
	}
}
