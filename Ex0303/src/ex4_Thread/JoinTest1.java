package ex4_Thread;

public class JoinTest1 implements Runnable{
	//join : Ư���� �޼��尡 �۾��� ���� ������ �� ���
	//��������� ���Ѿ� �ϴ� ��������� �����Ѵ�.
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("t1 : " + i);
		}
		System.out.println("<<t1�Ϸ�>>");
	}
	
	
	
}
