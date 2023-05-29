package ex2_switch;

public class Ex1_switch {
	public static void main(String[] args) {
		//기본형
		/*
		 * switch(비교값){
		 * case 조건값1 :
		 * 				비교값과 조건값1이 일치할 때 실행할 명령;
		 * 				break; 
		 * case 조건값1 :
		 * 				비교값과 조건값1이 일치할 때 실행할 명령;
		 * 				break; 
		 * case 조건값2 :
		 * 				비교값과 조건값2가 일치할 때 실행할 명령;
		 * 				break; 
		 * case 조건값3 :
		 * 				비교값과 조건값3이 일치할 때 실행할 명령;
		 * 				break; 
		 * default: -> 필요없다면 생략가능
		 * 				비교값과 조건값이 일치하는게 없을 때 실행할 명령;
		 * 				break;
		 */
		
		int n = 1;
		
		switch(n) {
		case 1:
			System.out.println("1. 게임하기");
			break;
		case 2:
			System.out.println("2. 게임소개");
			break;
		case 3:
			System.out.println("3. 종료");
			break;
		default: 
			System.out.println("메뉴선택이 올바르지 않습니다.");
			break;
		}
		
		//if vs switch
		//if -> 범위를 가지고 비교를 할 때 ex) 성적비교
		//switch -> 1:1대응을 할 때 ex) 메뉴선택
		int score = 80;
		
		switch(score) {
		case 100: 
			System.out.println("성적은 A입니다.");
			break;
		case 99: 
			System.out.println("성적은 B입니다.");
			break;
		case 98: 
			System.out.println("성적은 C입니다.");
			break;
		}
		
		
		
		
		
	}
}
