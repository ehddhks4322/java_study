package ex8_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
		//키보드에서 값을 입력받고 해당하는 구구단을 출력해보세요.
		//2~9 이외의 값이 입력되면 "2~9사이의 숫자만 입력하세요" 출력하기
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자를 입력해주세요 : ");
//		int dan = sc.nextInt();
//		
//		if(dan < 2 || dan > 9) {
//			System.out.println("2~9사이의 숫자만 입력하세요.");
//		}else {
//			for(int i = 1; i<10; i++) {
//				System.out.printf("%d X %d = %d\n",dan,i,dan*i);
//			}
//		}
		
		//Scanner를 통해 정수 n1,n2를 입력받는다.
		//그리고 n1부터 n2까지의 합을 계산하여 그 결과를 출력하는 프로그램을 작성
		//예를들어 2와 5를 입력받으면 2+3+4+5의 연산결과인 14를 출력해야 합니다.
		//n1이 n2보다 크다면 데이터의 자리를 바꿔넣어서 결과 출력하기
		//예를들어 5와 2를 입력받으면 2+3+4+5의 연산결과인 14를 출력해야 합니다.
		
		System.out.println("정수를 입력해주세요 : ");
		int n1 = sc.nextInt();
		
		System.out.println("정수를 입력해주세요 : ");
		int n2 = sc.nextInt();
		
		int total = 0;
		
		if(n2 > n1) {
		for(int i = n1; i<=n2; i++) {
			
			total += i;
			}
		}else {
			for(int i = n2; i<=n1; i++) {
				
				total += i;
				}
		}
		System.out.printf("결과 : %d\n",total);
		
		
		
		
		
		

	}

}
