package ex5_bank;

public class UserInfo {
	//UserInfo Ŭ������ �����, �ݾ��� ������ money��� ������ �����.
	
	//deposit(int money)�޼��带 ����� ������ ���� �Ա����� ��츦 ó��
	
	//withdraw(int money)�޼��带 ����� ������ ���� ������� �� ��츦 ó��
	//��, �� �޼���� ����ϰ��� �ϴ� �� ���� �ܾ��� ���� ��� "�ܾ��� �����ϴ�" ��� �޼��� ���
	
	//showMoney()�޼��带 ����� ���� �ܾ��� ��ȯ�ϵ��� �Ѵ�.
	
	//MainŬ������ ���� ����� UserInfo�� ��ü�� ������ �� �Ʒ��� ����� �������� �غ���.
	
	//1.�� �� : 
	//2.�� �� : 
	//3.�ܾ�Ȯ��:
	//4.���� :
	//�׸��� : 
	private int money;
	public void deposit(int money) {
		this.money += money; // this.money = this.money + money
		System.out.println("�Ա� ����");
	}
	
	public int showMoney() {
		return money;
	}
	
	public void withdraw(int money) {
		int total = this.money - money;
		if(this.money < money) {
			System.out.println("�ܾ��� �����ϴ�.");
		}else {
			System.out.printf("%d��\n",total);
		}
	}
	
	
	
}


