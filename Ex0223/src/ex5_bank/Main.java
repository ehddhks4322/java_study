package ex5_bank;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int select;//������ �׸��� ������ ����
		int money;
		
		UserInfo ui = new UserInfo();
		
		w:while(true) {
			System.out.println("1.��\t��");
			System.out.println("2.��\t��");
			System.out.println("3.�ܾ�Ȯ��");
			System.out.println("4.��\t��");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("�׸��� : ");
			select = sc.nextInt();
			
			switch(select) {
			case 1 :
				System.out.println("---�Ա�---");
				System.out.println("�Ա��� �ݾ��� �Է� : ");
				money = sc.nextInt();
				ui.deposit(money);
				break;
			case 2 :
				System.out.println("---���---");
				System.out.println("����� �ݾ��� �Է� : ");
				money = sc.nextInt();
				ui.withdraw(money);
				break;
			case 3 :
				System.out.println("---�ܾ�Ȯ��---");
				System.out.println(ui.showMoney()+"��");
				break;
			case 4 :
				System.out.println("����");
				break w;
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
}
