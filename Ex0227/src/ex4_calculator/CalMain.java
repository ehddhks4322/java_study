package ex4_calculator;

public class CalMain {
	public static void main(String[] args) {
		
	
		//CalculatorŬ������ �����
		//getResult()�Լ��� �����ϼ���. ��ȯ���� ����
		//�Ķ���ʹ� n1,n2 �ΰ��� �ް� -1�� return �մϴ�.
		
		//CalPlus Ŭ������ ����� CalculatorŬ������ ��ӹ�������.
		//�������̵��� �̿��Ͽ� Calculator�� getResult()�Լ���
		//���ڷ� �޴� n1,n2�� �����ִ� �Լ��� ����ϴ�.
		//�̶� return ���� -1�̸� �ȵǰ���?
		
		//CalMinus Ŭ������ ����� CalculatorŬ������ ��ӹ�������.
		//�������̵��� �̿��Ͽ� Calculator�� getResult()�Լ���
		//���ڷ� �޴� n1,n2�� ���ִ� �Լ��� ����ϴ�.
		//�̶� return ���� -1�̸� �ȵǰ���?
		
		//Main���� �����Ͽ� �Ʒ��� ���� ����� ������ ����
		//CalPlus : 30
		//CalMinus : 15
		
		CalPlus cp = new CalPlus();
		CalMinus cm = new CalMinus();
		
		int res1 = cp.getResult(15, 15);
		int res2 = cm.getResult(30, 15);
		
		System.out.println("CalPlus : " + res1);
		System.out.println("CalMinus : " + res2);
	
	}
}
