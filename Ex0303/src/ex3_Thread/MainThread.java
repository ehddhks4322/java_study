package ex3_Thread;

public class MainThread {
	public static void main(String[] args) {
		//스레드 클래스에는 현재 스레드의 이름과 상태, 우선순위를 
		//확인하는 메서드를 제공한다.
		ThreadName tn = new ThreadName();
		tn.start();
		
		
		System.out.println("현재 실행되고 있는 스레드의 이름 : " + Thread.currentThread().getName());
		System.out.println("현재 실행되고 있는 스레드의 상태 : " + Thread.currentThread().getState() );
		System.out.println("현재 실행되고 있는 스레드의 우선순위 : " + Thread.currentThread().getPriority());
		
		//우선순위는 1~10 까지 존재한다.
		//숫자가 낮을수록 우선순위가 높고, 숫자가 높을수록 우선순위가 낮다.
		//기본값은 5로 고정이다.
	}
}
