package ex2_bread;

public class Method {
	//MethodŬ������ ����� ���� �ٸ� ����� �ϴ� makeBread()�޼��带 �� �� ����µ�,
	//����Ŭ�������� ������ �޼��带 ȣ���������� ����� ���� ������ ������ ����.
	
	//���� ��������ϴ�. <--------------- method 1�� ȣ���ؼ� ���� ���
	//------------
	
	//���� ��������ϴ�. <--------------- method 2�� ȣ���ؼ� ���� ���
	//���� ��������ϴ�.
	//��û�Ͻ� n���� ���� ��������ϴ�.
	//--------------------
	
	//ũ������ ��������ϴ�. <--------------- method 3�� ȣ���ؼ� ���� ���
	//ũ������ ��������ϴ�.
	//��û�Ͻ� n���� OO���� ��������ϴ�.
	
	public void makeBread() {
		System.out.println("���� ��������ϴ�.");
		System.out.println("----------------");
	}
	
	public void makeBread(int n) {
		for(int i = 0; i < n; i++) {
			System.out.println("���� ��������ϴ�.");
		}
		System.out.printf("��û�Ͻ� %d���� ���� ��������ϴ�.\n",n);
		System.out.println("----------------");
	}
	
	public void makeBread(String s, int n) {
		for(int i = 0; i < n; i++) {
			System.out.printf("%s���� ��������ϴ�.\n",s);
		}
		System.out.printf("��û�Ͻ� %d���� %s���� ��������ϴ�.\n",n,s);
	}
	
	
	
	
	
	
	
	
}
