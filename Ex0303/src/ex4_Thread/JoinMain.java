package ex4_Thread;

public class JoinMain {
	public static void main(String[] args) {
		JoinTest1 jt1 = new JoinTest1();
		JoinTest2 jt2 = new JoinTest2();
		
		Thread t1 = new Thread(jt1);
		Thread t2 = new Thread(jt2);
		
		t1.start();
		
		try {
			t1.join();//t1스레드를 제외한 나머지 스레드를 blocked 상태로 만든다.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t2.start();
		
		try {
			t2.join();//t2스레드를 제외한 나머지 스레드를 blocked 상태로 만든다.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println("메인스레드 : " + i);
		}
		
		
		
		
		
		
		
		
	}
}
