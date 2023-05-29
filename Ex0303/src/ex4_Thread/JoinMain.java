package ex4_Thread;

public class JoinMain {
	public static void main(String[] args) {
		JoinTest1 jt1 = new JoinTest1();
		JoinTest2 jt2 = new JoinTest2();
		
		Thread t1 = new Thread(jt1);
		Thread t2 = new Thread(jt2);
		
		t1.start();
		
		try {
			t1.join();//t1�����带 ������ ������ �����带 blocked ���·� �����.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t2.start();
		
		try {
			t2.join();//t2�����带 ������ ������ �����带 blocked ���·� �����.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println("���ν����� : " + i);
		}
		
		
		
		
		
		
		
		
	}
}
