package ex2_method;

public class Ex {
	//�ΰ��� ������ ���ϴ� add�Լ��� �����ϰ�
	//main���� add�Լ��� ȣ���Ͽ� �ΰ��� ���ڸ� �Է��ϰ�
	//����� ����ϼ���.
	
	public int add(int x, int y) {
		int sum = x+y;
		return sum;
	}
	
	public void add2(int a, int b) {
		System.out.println("add �� : " + (a+b));
	}
	
	//1~n���� ������ �����ִ� �Լ� �����!
	public void sum(int n) {
		int total = 0;
		
		for(int i = 1; i <= n; i++) {
			total += i;
		}
		System.out.println("1~n������ ���� : " + total);
	}
	
	//�ΰ��� ������ ���ϴ� add�Լ��� �����ϰ�
	//main���� add�Լ��� ȣ���Ͽ� �ΰ��� ���ڸ� �Է��ϰ�
	//����� ����ϼ���.
	
	public void add3(int n1, int n2) {
		int sum2 = n1+n2;
		System.out.println("add�� �� : " + sum2);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
