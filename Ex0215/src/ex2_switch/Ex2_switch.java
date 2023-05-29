package ex2_switch;

public class Ex2_switch {
	public static void main(String[] args) {
		char ch = 'A';
		
		switch(ch) {
		case 'A':
			System.out.println("성적은 100~90점 사이입니다.");
			break;
		case 'B':
			System.out.println("성적은 89~80점 사이입니다.");
			break;
		case 'C':
			System.out.println("성적은 79~70점 사이입니다.");
			break;
		case 'D':
			System.out.println("성적은 69~60점 사이입니다.");
			break;
		default:
			System.out.println("성적은 59점 이하입니다.");
			break;
		}
		
		//switch의 특징
		//1) 비교값과 조건값의 자료형은 반드시 일치해야 한다.
		//2) 중복되는 조건값을 가질 수 없다.
		
		//switch문의 비교값으로 사용가능한 자료형
		//1) 정수(byte,short,int)
		//2) 문자형(char)
		//3) 문자열(String)
		
		//실수는 비교값으로 들어갈 수 없다.
//		double d = 3.14;
//		
//		switch(d) {
//		
//		}
		
		String str = "홍";
		
		switch(str) {
		case "홍":
			System.out.println("제 이름은 홍길동 입니다.");
			break;
		case "박":
			System.out.println("제 이름은 박길동 입니다.");
			break;
		case "독고":
			System.out.println("제 이름은 독고길동 입니다.");
			break;
		}
	}
}
