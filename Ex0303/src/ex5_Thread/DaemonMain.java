package ex5_Thread;

public class DaemonMain implements Runnable{
	//데몬스레드
	//다른 일반 스레드의 작업을 돕는 보적인 역할을 수행하는 스레드이다.
	//함께 구동중인 일반 스레드가 종료되면 데몬스레드도 함께 종료된다.
	//예를들어 문서를 작성하는 도중에 3초간격으로 자동 세이브가 필요하다고
	//가정하여 코드를 작성해보자.
	
	static boolean autoSave = false;
	
	public static void main(String[] args) {
		
		DaemonMain dm = new DaemonMain();
		Thread t = new Thread(dm);
		
		t.setDaemon(true);//t라는 스레드가 데몬스레드임을 명시하는 메서드
						  //메인 스레드가 종료될 때 함께 종료되도록 한다.
		
		t.start();
		
		for(int i = 1; i <= 15; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
			if(i == 3) {//3초 뒤에 자동세이브 시작
				autoSave = true;
			}
		}
	}//main

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(autoSave == true) {
				System.out.println("자동저장을 수행합니다.");
			}
		}
	}

}
