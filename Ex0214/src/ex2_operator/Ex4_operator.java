package ex2_operator;

public class Ex4_operator {
	public static void main(String[] args) {
		//���׿�����
		//�ϳ��� ������ �����Ͽ�, ������ ���� �� ��ȯ�� ���, ������ ������ �� ��ȯ�� ����� ���� ���� ������
		
		int a = 10;
		int b = 15;
		
		boolean result = ++a >= b ? true : false;
		System.out.println("result : " + result);
		
		char result2 = ++a >= b ? 'O' : 'X';
		System.out.println("result2 : " + result2);
		
		int result3 = ++a >= b ? 1 : 0;
		System.out.println("result3 : " + result3);
	}
}
