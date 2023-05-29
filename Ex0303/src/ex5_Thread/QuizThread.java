package ex5_Thread;

import java.util.Random;
import java.util.Scanner;

public class QuizThread extends Thread{
	
	Random rnd = new Random();
	Scanner sc = new Scanner(System.in);
	int count1 = 0;
	int count2 = 0;
	String str = "+";
	
	public void startGame() {
		
		while(true) {
			int n = rnd.nextInt(100)+1;
			System.out.printf("%d %s %d :",n,str,n);
			int result = sc.nextInt();
			System.out.println("정답 : " + (n+n));
				
			if(result == (n+n)) {
				 count1++;
			}
			if(count1 == 5) {
				break;
			}else {
				continue;
			}
		}//while
		
		}
	

	@Override
	public void run() {
		while(true) {
		if(count1 != 5) {
			try {
				Thread.sleep(1000);
				count2++;
			}
			 catch (InterruptedException e) {
				e.printStackTrace();
				
			}
		}if(count1 == 5) {
			System.out.println("모든 문제를 맞췄습니다.");
			System.out.printf("%d초 걸렸습니다.",count2);
			break;
		}
	}//while
		
	}
	
	
	
}
