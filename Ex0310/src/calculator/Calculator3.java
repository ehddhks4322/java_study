package calculator;

public class Calculator3 {
	public static void main(String[] args) {
		MyCalculator calc = (int num1, int num2) -> {
			return num1 + num2;
		};
		
		//�߰�ȣ�� return ���� ����(�� ����� ������ �� �����ϴ�.)
		MyCalculator calc2 = (int num1, int num2) -> num1 + num2;
		
		//�Ķ������ �ڷ����� ������ �����ϴ�.
		//�ڷ����� �����Ϸ��� ��� �Ķ���͸� �����ؾ� �Ѵ�.
		MyCalculator calc3 = (num1, num2) -> num1 + num2;
		
		//�Ű������� �ϳ��� �� ���ڸ� ������ִ� ���ٽ� �ۼ��غ���
		//(�Ķ����) -> {���,return;};
		//�Ķ���Ͱ� �ϳ��� ���� �Ұ�ȣ�� ������ �� �ִ�.
		MyFunction func = num -> System.out.println(num);
		
		//::(�����ݷ�) : �޼��� ���� ������.
		//���ٽ��� ���� �����ϰ� ����� �� �ֵ��� ���ش�.
		MyFunction func2 = System.out::println;
	}
}
