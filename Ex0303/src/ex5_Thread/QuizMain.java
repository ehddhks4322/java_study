package ex5_Thread;

public class QuizMain {
	public static void main(String[] args) {
		//QuizThreadŬ������ ����� �����带 ��ӹ޴´�.
		//startGame()�޼��带 ����� 1~100������
		//���� �� ���� ���ϴ� ������ ����
		
		//Ű���忡�� ���� �Է��Ͽ� 5������ ����ó�� �� ������ ������ �ݺ��Ѵ�
		//������ ������ �� �Ŀ� ��� ������ �����µ� �� �ʰ� �ɷȴ����� ȭ�鿡 ����Ͽ�
		//���α׷� ����
		
		//QuizMainŬ���� ������
		//QuizThread qt = new QuizThread();
		//qt.start(); //������ ����
		//qt.startGame(); //����Ǯ�� �Լ�
		
		//�� ���� �ܿ��� �ٸ� �ڵ�� �߰����� �ʵ��� �Ѵ�.
		
		QuizThread qt = new QuizThread();
		
		qt.start();
		qt.startGame();
		
		
		
		
		
		
		
		
	}
}
