package ex2_method;



public class MethodTest {
	
	//f(x) = 2x+1
	//f : �޼����
	//x : �Ķ����
	//2x+1 : ���
	
	public int f(int x) {
		int num = 2*x+1;
		return num;
	}
	
	public void test(int su) {
		su++;
		System.out.println("su : " + su);
	}
	
	//�ΰ��� ������ ���ϴ� add�Լ��� �����ϰ�
	//main���� add�Լ��� ȣ���Ͽ� �ΰ��� ���ڸ� �Է��ϰ�
	//����� ����ϼ���.
	
	//returnȰ��
//	public int add(int x, int y) {
//		int sum = x+y;
//		return sum;
//	}
	
	//return Ȱ��x
//	public void add(int x, int y) {
//		System.out.println("x+y = " + (x+y));
//	}
	
	
	//1~n���� ������ �����ִ� �Լ� �����!
	
	public void sum(int n) {
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum += i; //sum = sum + i;
		}
		System.out.println("1~n������ ���� : " + sum);
	}
	
	//�ܺο��� ���� �ϳ� �Է¹޾Ƽ� �ش� ���� �ش��ϴ� �������� ����ϴ� �Լ� �����
	public void multi(int num) {
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d X %d = %d\n",num,i,num*i);
		}
	}
	
	
}

