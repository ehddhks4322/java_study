package ex6_static;

public class Bank {
	//static : ��ü�� �ƹ��� ���� �����Ǿ
	//�޸𸮻� �� �Ѱ��� ��������� ������ �޼���
	
	private String name = "�츮����";
	private String point;//������ ��ġ
	private String tel;//���� ��ȭ��ȣ
	static float interest = 10f;//���� ����
	
	//�����ڸ� setteró�� ���
	public Bank(String point, String tel) {
		this.point = point;
		this.tel = tel;
	}
	
	// ����� ����� �޼���
	public void pointBank() {
		System.out.println("�̸� : " + name);
		System.out.println("��ġ : " + point);
		System.out.println("��ȭ��ȣ : " + tel);
		System.out.println("������ : " + interest);
		System.out.println("-----------------------");
	}
}
