package calculator;

public class Calculator2 {
	
	//���� ���� �͸� Ŭ����
	//�͸� Ŭ������ ���� Ŭ����(inner class)�� ��������
	//�̸��� ���� Ŭ������ ���Ѵ�.
	//���߿� �ٽ� �ҷ��� ������ ���ٴ� ���� �����ϰ� �ִ�.
	//��, ���α׷����� �Ͻ���(�ѹ���)���� ���ǰ� �������� ��ü��� ���� �ȴ�.
	//(��ȸ�� Ŭ����)
	
	public static void main(String[] args) {
		
		int num3 = 30;
		
		MyCalculator calc = new MyCalculator() {
			
			
			
			@Override
			public int plus(int num1, int num2) {
				//num3 = 40;//final int num3 (������ ���ȭ�� �Ǳ⶧���� ���� ���Ӱ� ������ �Ϸ��� �ص� �ȵȴ�.)
				return num1 + num2;
			}
		};
	}
	
	
}
