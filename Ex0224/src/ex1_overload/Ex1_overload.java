package ex1_overload;

public class Ex1_overload {
	//�����ε� : �޼����� '�ߺ�����'��� �ϸ�, �ϳ��� Ŭ���� ������ ���� �̸��� ����
	//�޼��尡 ������ ���ǵǴ� ���� ���Ѵ�.
	
	//**�޼��� �����ε� ��Ģ**//
	//1) �޼����� �̸��� ��� ���ƾ� �Ѵ�.
	//2) �Ķ������ ������ �޶�� �Ѵ�.
	//3) �Ķ������ ������ ���� ��� �ڷ����� �޶�� �Ѵ�.
	//4) �Ķ������ ������ ���Ƶ� ������ �ٸ��� �ȴ�.
	
	public void result() {
		System.out.println("���ڰ� ���� �޼���");
	}
	
	public void result(int n) {
		System.out.println("������ ���ڷ� �޴� �޼���");
	}
	
	
	//3) �Ķ������ ������ ���� ��� �ڷ����� �޶�� �Ѵ�.
	public void result(char n) {
		System.out.println("�������� ���ڷ� �޴� �޼���");
	}
	
	
	//4) �Ķ������ ������ ���Ƶ� ������ �ٸ��� �ȴ�.
	public void result(String s, int n) {
		System.out.println("���ڿ�, ������ ���ڷ� �޴� �޼���");
	}
	
	public void result(int n, String s) {
		System.out.println("����, ���ڿ��� ���ڷ� �޴� �޼���");
	}
	
	
}
