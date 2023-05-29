package ex2_Thread;

public class ThreadMain {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		MyRunnable mr = new MyRunnable();
		Thread t1 = new Thread(mr);
		//mt.run(); run()메서드를 직접 호출하게 되면 독립적으로 수행하지 못한다.
		//mr.run(); 일반 메서드처럼 호출을 해버린다.
		mt.start();
		t1.start();
		
		//메인 메서드도 스레드의 하나이다.
		for(int i = 0; i < 10; i++) {
			System.out.println("메인함수 실행중" + i);
		}
	}
}
