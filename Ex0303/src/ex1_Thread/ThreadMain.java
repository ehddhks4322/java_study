package ex1_Thread;

public class ThreadMain {
	public static void main(String[] args) {
		ThreadTest tt = new ThreadTest();
		
		RunnableTest rt = new RunnableTest();
		
		Thread t1 = new Thread(rt);
		
		tt.start();//run()메서드 호출해주는 메서드
		t1.start();
		
	}
}
