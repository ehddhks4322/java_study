package ex6_static;

public class Bank {
	//static : 객체가 아무리 많이 생성되어도
	//메모리상에 딱 한개만 만들어지는 변수나 메서드
	
	private String name = "우리은행";
	private String point;//은행의 위치
	private String tel;//은행 전화번호
	static float interest = 10f;//은행 이자
	
	//생성자를 setter처럼 사용
	public Bank(String point, String tel) {
		this.point = point;
		this.tel = tel;
	}
	
	// 결과를 출력할 메서드
	public void pointBank() {
		System.out.println("이름 : " + name);
		System.out.println("위치 : " + point);
		System.out.println("전화번호 : " + tel);
		System.out.println("이자율 : " + interest);
		System.out.println("-----------------------");
	}
}
