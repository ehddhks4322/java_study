package ex5_Thread;

import java.util.Scanner;

public class ThreadMain {
	public static void main(String[] args) {
		//스캐너를 입력하여 키보드에서 숫자를 입력받고
		//스레드에서 입력받은 숫자가 1씩 감소하다가 0이 되었을 때
		//"종료"라는 메세지와 함께 스레드를 빠져나오도록 만들어보자.
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int n = sc.nextInt();
		
		ThreadCount tc = new ThreadCount(n);
		
		tc.start();
	}
}
