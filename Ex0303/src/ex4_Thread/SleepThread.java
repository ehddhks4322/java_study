package ex4_Thread;

public class SleepThread extends Thread{

	//sleep() : �����带 ������ �ð����� Blocked ���·� �����.
	//�ð��� 1000���� 1�ʱ��� ������ �� ������, ������ �ð��� ������ �ٽ�
	//Runnable(���డ����)���·� ���ư���.
	
	@Override
	public void run() {
		System.out.println("ī��Ʈ 5��");
		for(int i = 5; i >= 0; i--) {
			if(i != 0) {
				try {
					System.out.println(i);
					Thread.sleep(1000);// 1000�� 1��
				} catch (InterruptedException e) {
					e.printStackTrace();
				}//catch
			}//if
		}//for
		System.out.println( "����");
	}
}
