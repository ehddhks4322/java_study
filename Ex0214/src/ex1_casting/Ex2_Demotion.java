package ex1_casting;

public class Ex2_Demotion {
	public static void main(String[] args) {
		//ū �ڷ����� ���� �ڷ����� ����
		char c = 'B'; //2byte
		int n = c+1; //��������� ���θ�� ĳ����
		//c = n; c�� 2byte, n�� 4byte�̹Ƿ� ���� �߻�
		c = (char)n;
		System.out.println("c�� �� : " + c);
		
		float f = 5.5f; //4byte
		int n1 = 0; //4byte
		
		n1 = (int)f; //���� 4byte���� �ڷ����� ��ġ���� ������ ���Ե��� �ʴ´�.
		System.out.println("n1�� �� : " + n1);
		//float ���� int�� ĳ���� �Ǹ鼭 �Ҽ��� ���� �ڸ��� ����ϰ� �ȴ�.
		
		byte b3 = 100;
		byte b4 = 20;
		
		byte b5;
		
		b5 = (byte)(b3 + b4);
	}
}
