package ex5_bank;

public class UserInfo {
	//UserInfo 클래스를 만든뒤, 금액을 저장할 money라는 변수를 만든다.
	
	//deposit(int money)메서드를 만들어 유저가 돈을 입금했을 경우를 처리
	
	//withdraw(int money)메서드를 만들어 유저가 돈을 출금했을 때 경우를 처리
	//단, 이 메서드는 출금하고자 하는 돈 보다 잔액이 적을 경우 "잔액이 부족하다" 라는 메세지 출력
	
	//showMoney()메서드를 만들어 현재 잔액을 반환하도록 한다.
	
	//Main클래스를 새로 만들어 UserInfo형 객체를 생성한 뒤 아래의 결과가 나오도록 해보자.
	
	//1.입 금 : 
	//2.출 금 : 
	//3.잔액확인:
	//4.종료 :
	//항목선택 : 
	private int money;
	public void deposit(int money) {
		this.money += money; // this.money = this.money + money
		System.out.println("입금 성공");
	}
	
	public int showMoney() {
		return money;
	}
	
	public void withdraw(int money) {
		int total = this.money - money;
		if(this.money < money) {
			System.out.println("잔액이 부족하다.");
		}else {
			System.out.printf("%d원\n",total);
		}
	}
	
	
	
}


