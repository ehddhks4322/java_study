package ex2_Thread;

public class ThreadMain {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		MyRunnable mr = new MyRunnable();
		Thread t1 = new Thread(mr);
		//mt.run(); run()�޼��带 ���� ȣ���ϰ� �Ǹ� ���������� �������� ���Ѵ�.
		//mr.run(); �Ϲ� �޼���ó�� ȣ���� �ع�����.
		mt.start();
		t1.start();
		
		//���� �޼��嵵 �������� �ϳ��̴�.
		for(int i = 0; i < 10; i++) {
			System.out.println("�����Լ� ������" + i);
		}
	}
}
