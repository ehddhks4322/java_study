package ex4_Thread;

public class JoinTest2 implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("t2 : " + i);
		}
		System.out.println("<<t2�Ϸ�>>");
	}

}
