package ex6_static;

public class BankMain {
	public static void main(String[] args) {
		Bank bk1 = new Bank("����","02-222-2222");
		Bank bk2 = new Bank("����","032-333-3333");
		Bank bk3 = new Bank("�λ�","052-555-5555");
		
		//static������ Ŭ������ �̸����� �����ϴ°� ������ ����̴�.
		//��ü ���� ���̵� ������ �����ٰ� ����� �� �ִ�.
		Bank.interest = 0.1f;
		
		bk1.pointBank();
		bk2.pointBank();
		bk3.pointBank();
	}
}
