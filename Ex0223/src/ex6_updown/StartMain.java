package ex6_updown;

import java.util.Scanner;

public class StartMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Start st = new Start();
		
		while(true) {
		System.out.println("숫자를 입력해주세요 : ");
		int num = sc.nextInt();
		if(st.number(num).equals("종료")) {
			System.out.println(st.number(num));
			break;
		}else {
			System.out.println(st.number(num));
		}
		
		}
	}
}
