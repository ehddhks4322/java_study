package ex4_gugudan;

import java.util.Scanner;

public class TimesTableMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 단을 입력 : ");
		int dan = sc.nextInt();
		System.out.printf("%d단\n",dan);
		
		TimesTable tt = new TimesTable();
		
		tt.showTable(dan);
		
	}
}
