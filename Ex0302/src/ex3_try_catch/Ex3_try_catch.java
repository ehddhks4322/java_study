package ex3_try_catch;

import java.util.Scanner;

public class Ex3_try_catch {
	public static void main(String[] args) {
		int [] var = {10,20,30};
		
		try {
			for(int i = 0; i <= var.length; i++) {
				System.out.printf("var[%d] : %d\n",i,var[i]);
			}
		} catch (Exception e) {
			System.out.println("오류발생");
		}
		
		//문제
		//키보드에서 정수를 입력받고, 정수 이외의 값이 입력되면
		//"정수만 입력가능"이라는 메세지를 출력하자
		
		//정수 : 100
		//입력받은 수 : 100
		
		//정수 : aaa
		//입력받은 수 : 정수만 입력가능
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("정수 : ");
//		
//		try {
//			int n = sc.nextInt();
//			System.out.printf("입력받은 수 : %d",n);
//		} catch (Exception e) {
//			System.out.println("정수만 입력가능");
//		}
		
		
		//정수 : 100
		//결과 : 100
				
		//정수 : aaa
		//결과 : aaa은(는) 정수가 아닙니다.
		
		String str = "";
		System.out.print("정수 : ");
		
		try {
			str = sc.next();
			int n = Integer.parseInt(str);
			System.out.println("결과 : " + n);
		} catch (Exception e) {
			System.out.println("결과 : " + str + "은(는) 정수가 아닙니다.");
		}
		
		
		
		
		
		
		
		
		
	}
}
