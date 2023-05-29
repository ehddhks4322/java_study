package ex1_if;

public class Ex3_if_elseIf_else {
	public static void main(String[] args) {
		//if-elseif-else : 비교해야할 조건이 여러개 있는 경우
		//기본형
		//if(조건식1){
		//		   조건식1이 참인경우 실행할 명령
		//} else if(조건식2){
		//		   조건식1이 거짓이고 조건식2가 참일경우 실행할 명령
		//}else if(조건식3){
		//		   조건식1,2가 거짓이고 조건식3이 참일경우 실행할 명령
		//}else if(조건식4){
		//		   조건식1,2,3이 거짓이고 조건식4가 참일경우 실행할 명령
		//} else { 필요가 없다면 생략 가능하다.
		//		   위의 조건이 모두 거짓일 때 실행할 명령
		//}
		
		//학점을 매길때
		int score = 75;
		if(score >= 90) {
			System.out.println("성적은 A입니다.");
		} else if(score >= 80) {
			System.out.println("성적은 B입니다.");
		} else if(score >= 70) {
			System.out.println("성적은 C입니다.");
		} else if(score >= 60) {
			System.out.println("성적은 D입니다.");
		} else {
			System.out.println("성적은 F입니다.");
		}
		
		//if문의 중첩
		//if(조건식1){
		//		   if(조건식2){
		//					조건식1,2가 모두 참일 때 실행할 명령
		//		}
		//}
		
		//정수형 변수 num에 임의의 숫자를 대입하고
		//해당 숫자가 5의 배수이면서 홀수인지 판별하는 조건문을 작성해보세요.
		
		//배수구하는법
		//정수 % N == 0 -> 그 정수는 N의 배수
		
		//짝홀구하는법
		//정수 % 2 == 0 -> 짝수
		//정수 % 2 != 0 -> 홀수
		
		int num = 15;
		
		if(num % 5 == 0) {
			if(num % 2 == 0) {
				System.out.println("짝수입니다.");
			}else {
				System.out.println("홀수입니다.");
			}
		}else {
			System.out.println("5의 배수가 아닙니다.");
		}
		
		
	}
}
