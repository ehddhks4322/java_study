package ex5_Thread;

public class DaemonMain implements Runnable{
	//���󽺷���
	//�ٸ� �Ϲ� �������� �۾��� ���� ������ ������ �����ϴ� �������̴�.
	//�Բ� �������� �Ϲ� �����尡 ����Ǹ� ���󽺷��嵵 �Բ� ����ȴ�.
	//������� ������ �ۼ��ϴ� ���߿� 3�ʰ������� �ڵ� ���̺갡 �ʿ��ϴٰ�
	//�����Ͽ� �ڵ带 �ۼ��غ���.
	
	static boolean autoSave = false;
	
	public static void main(String[] args) {
		
		DaemonMain dm = new DaemonMain();
		Thread t = new Thread(dm);
		
		t.setDaemon(true);//t��� �����尡 ���󽺷������� ����ϴ� �޼���
						  //���� �����尡 ����� �� �Բ� ����ǵ��� �Ѵ�.
		
		t.start();
		
		for(int i = 1; i <= 15; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
			if(i == 3) {//3�� �ڿ� �ڵ����̺� ����
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
				System.out.println("�ڵ������� �����մϴ�.");
			}
		}
	}

}
