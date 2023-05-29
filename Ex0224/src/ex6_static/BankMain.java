package ex6_static;

public class BankMain {
	public static void main(String[] args) {
		Bank bk1 = new Bank("서울","02-222-2222");
		Bank bk2 = new Bank("대전","032-333-3333");
		Bank bk3 = new Bank("부산","052-555-5555");
		
		//static변수는 클래스의 이름으로 접근하는게 보통의 방식이다.
		//객체 생성 없이도 언제든 가져다가 사용할 수 있다.
		Bank.interest = 0.1f;
		
		bk1.pointBank();
		bk2.pointBank();
		bk3.pointBank();
	}
}
