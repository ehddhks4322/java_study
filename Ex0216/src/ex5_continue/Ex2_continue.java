package ex5_continue;

public class Ex2_continue {
	public static void main(String[] args) {
		int n = 0;
		
		while(n < 10) {
			n++;
			
			if(n % 2 != 0) {
				continue;//증감식이 없다면 조건식으로 돌아간다.
			}
			System.out.println(n);
		}
		
		//기타제어문의 특징
		//1) 반복문 안에서만 사용된다.
		//2) 기타제어문 밑에는 어떠한 코드도 올 수 없다.

		
		
		
		
		
		
		
		
		
	}

}
