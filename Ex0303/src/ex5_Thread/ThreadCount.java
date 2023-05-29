package ex5_Thread;

public class ThreadCount extends Thread{

	int n;
	
	public ThreadCount(int n) {
		this.n = n;
	}
	@Override
	public void run() {
		for(int i = n; i >=0; i--) {
			try {
				System.out.println(i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Á¾·á");
	}
}
