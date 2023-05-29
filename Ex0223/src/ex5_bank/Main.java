package ex5_bank;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int select;//선택한 항목을 저장할 변수
		int money;
		
		UserInfo ui = new UserInfo();
		
		w:while(true) {
			System.out.println("1.입\t금");
			System.out.println("2.출\t금");
			System.out.println("3.잔액확인");
			System.out.println("4.종\t료");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("항목선택 : ");
			select = sc.nextInt();
			
			switch(select) {
			case 1 :
				System.out.println("---입금---");
				System.out.println("입금할 금액을 입력 : ");
				money = sc.nextInt();
				ui.deposit(money);
				break;
			case 2 :
				System.out.println("---출금---");
				System.out.println("출금할 금액을 입력 : ");
				money = sc.nextInt();
				ui.withdraw(money);
				break;
			case 3 :
				System.out.println("---잔액확인---");
				System.out.println(ui.showMoney()+"원");
				break;
			case 4 :
				System.out.println("종료");
				break w;
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
}
