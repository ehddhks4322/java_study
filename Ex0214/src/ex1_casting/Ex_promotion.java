package ex1_casting;

public class Ex_promotion {
	public static void main(String[] args) {
		//����ȯ: �ڷ����� �ٲ��ִ� ��
		// - Promotion: ���� �ڷ����� ū �ڷ������� �����ϴ� �� (�ڵ�����ȯ, �Ͻ�������ȯ)
		// - Demotion: ū �ڷ����� ���� �ڷ������� �����ϴ� �� (��������ȯ, ���������ȯ)
		
		double d = 100.5; //8byte
		int n = 200; //4byte
		d = n;
		
		System.out.println("d�� �� : " + d);
		
		char c = 'A'; //2byte
		long l = 100; //8byte
		l = c;
		System.out.println("l�� �� : " + l);
	}
}
