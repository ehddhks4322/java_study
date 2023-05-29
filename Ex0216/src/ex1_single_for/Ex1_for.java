package ex1_single_for;

public class Ex1_for {
	public static void main(String[] args) {
		//제어문 : 코드의 흐름을 제어하는 문장
		//반복문 : 특정수행문을 원하는 만큼 반복하여 실행하는 제어문
		// -for, while
		
		//for문 : 특정 명령을 원하는 만큼 반복적으로 처리할 때 사용합니다.
		
		//기본형
		//for(초기식; 조건식; 증감식){
		//		조건이 참일 때 반복하고자하는 명령
		//}
		
		//초기식 : 반복을 시작하기 위한 시작값 - 변수를 하나 초기화 시킨다.
		//조건식 : 반복을 하기 위한 종료값 - 비교연산자를 많이 사용한다.
		//증감식 : 초기식의 변수값을 증감시켜주는 역할 - 증감연산자를 많이 사용한다.
		
		//int = i; : 전역변수
		
		for(int i = 0/*지역변수*/; i < 3; i++) {
			System.out.println(i);
		}
		System.out.println();
		//1~10까지 출력하는 for문 작성하기
		
		for(int i = 1; i <=10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i = 0; i <10; i++) {
			System.out.print(i+1 + " ");
		}
		System.out.println();
		System.out.println();
		//10~1까지 출력하는 for문 작성하기
		
		for(int i = 10; i > 0; i--) {
			System.out.print(i+ " ");
		}
		System.out.println();
		
		
		int count = 10;
		for(int i = 0; i < 10; i++) {
			System.out.print(count-- + " ");
		}
		System.out.println();
		System.out.println();
		//1~10까지 3의 배수만 출력하는 for문 작성하기
		
		for(int i = 1; i <=10; i++) {
			if(i % 3 == 0) {
				System.out.print(i+ " ");
			}
		}
		System.out.println();
		System.out.println();
		//1~20까지 홀수만 출력하는 for문 작성하기
		
		for(int i = 1; i <=20; i++) {
			if(i % 2 != 0) {
				System.out.print(i+ " ");
			}
		}
		System.out.println();
		System.out.println();
		
		//1~10까지 총합을 구하는 for문 작성하기
		
		int sum = 0; // 총합을 담아줄 변수
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1~10까지의 총합 : " + sum);
		
		System.out.println();
		
		//정수형 변수 num에 임의의 값을 넣고
		//1~num 까지의 총합을 구하는 for문 작성하기
		
		//for문을 잘 사용하는 팁!
		// 1) 내가 반복하고자 하는 횟수에 집중할것!
		// 2) i를 사용할 수 있다면 사용하기
		
		int num = 20;
		sum = 0;
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("1~num까지의 총합 : " + sum);
		
		//정수형 변수 dan에 숫자를 하나 넣고
		//해당 숫자에 해당하는 구구단 출력하기
		
		int dan = 9;
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " X " + i + " = " + (dan*i));
		}
		
		// 결과 : ☆★☆★☆★
		//System.out.print("☆");
		//System.out.print("★");
		
		for(int i = 1; i<=6; i++) {
			if(i % 2 != 0) {
				System.out.print("☆");
			}else {
				System.out.print("★");
			}
		}
		System.out.println();
		
		for(int i = 0; i<3; i++) {
			System.out.print("☆");
			System.out.print("★");
		}
		
		
		
		
		
		
		
	}
}
