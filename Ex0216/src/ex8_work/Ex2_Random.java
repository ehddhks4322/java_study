package ex8_work;

import java.util.Random;
import java.util.Scanner;

public class Ex2_Random {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Random rnd = new Random();
		
		//rnd.nextInt(종료값)+시작값;
		int r = rnd.nextInt(45)+1;
		
		System.out.println(r);
		
		//랜덤으로 1~130까지 세 과목에 대해 시험점수를 대입합니다.
		//과목명은 kor,eng,math
		//100점보다 높은 난수가 나오면 다시 난수를 대입하여 세 과목이 모두 100점 이하가 되면
		//출력하는 do-while문을 작성해보세요.
		
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		do {
			 kor = rnd.nextInt(130)+1;
			 eng = rnd.nextInt(130)+1;
			 math = rnd.nextInt(130)+1;
		}while(kor >= 100 || eng >= 100 || math >= 100);
		
		System.out.println("국어 :" + kor);
		System.out.println("영어 :" +eng);
		System.out.println("수학 :" +math);
		
		
		
		
		
		
		
		
	}
}
