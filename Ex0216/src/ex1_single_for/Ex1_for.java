package ex1_single_for;

public class Ex1_for {
	public static void main(String[] args) {
		//��� : �ڵ��� �帧�� �����ϴ� ����
		//�ݺ��� : Ư�����๮�� ���ϴ� ��ŭ �ݺ��Ͽ� �����ϴ� ���
		// -for, while
		
		//for�� : Ư�� ����� ���ϴ� ��ŭ �ݺ������� ó���� �� ����մϴ�.
		
		//�⺻��
		//for(�ʱ��; ���ǽ�; ������){
		//		������ ���� �� �ݺ��ϰ����ϴ� ���
		//}
		
		//�ʱ�� : �ݺ��� �����ϱ� ���� ���۰� - ������ �ϳ� �ʱ�ȭ ��Ų��.
		//���ǽ� : �ݺ��� �ϱ� ���� ���ᰪ - �񱳿����ڸ� ���� ����Ѵ�.
		//������ : �ʱ���� �������� ���������ִ� ���� - ���������ڸ� ���� ����Ѵ�.
		
		//int = i; : ��������
		
		for(int i = 0/*��������*/; i < 3; i++) {
			System.out.println(i);
		}
		System.out.println();
		//1~10���� ����ϴ� for�� �ۼ��ϱ�
		
		for(int i = 1; i <=10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i = 0; i <10; i++) {
			System.out.print(i+1 + " ");
		}
		System.out.println();
		System.out.println();
		//10~1���� ����ϴ� for�� �ۼ��ϱ�
		
		for(int i = 10; i > 0; i--) {
			System.out.print(i+ " ");
		}
		System.out.println();
		
		
		int count = 10;
		for(int i = 0; i < 10; i++) {
			System.out.print(count-- + " ");
		}
		System.out.println();
		System.out.println();
		//1~10���� 3�� ����� ����ϴ� for�� �ۼ��ϱ�
		
		for(int i = 1; i <=10; i++) {
			if(i % 3 == 0) {
				System.out.print(i+ " ");
			}
		}
		System.out.println();
		System.out.println();
		//1~20���� Ȧ���� ����ϴ� for�� �ۼ��ϱ�
		
		for(int i = 1; i <=20; i++) {
			if(i % 2 != 0) {
				System.out.print(i+ " ");
			}
		}
		System.out.println();
		System.out.println();
		
		//1~10���� ������ ���ϴ� for�� �ۼ��ϱ�
		
		int sum = 0; // ������ ����� ����
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1~10������ ���� : " + sum);
		
		System.out.println();
		
		//������ ���� num�� ������ ���� �ְ�
		//1~num ������ ������ ���ϴ� for�� �ۼ��ϱ�
		
		//for���� �� ����ϴ� ��!
		// 1) ���� �ݺ��ϰ��� �ϴ� Ƚ���� �����Ұ�!
		// 2) i�� ����� �� �ִٸ� ����ϱ�
		
		int num = 20;
		sum = 0;
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("1~num������ ���� : " + sum);
		
		//������ ���� dan�� ���ڸ� �ϳ� �ְ�
		//�ش� ���ڿ� �ش��ϴ� ������ ����ϱ�
		
		int dan = 9;
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " X " + i + " = " + (dan*i));
		}
		
		// ��� : �١ڡ١ڡ١�
		//System.out.print("��");
		//System.out.print("��");
		
		for(int i = 1; i<=6; i++) {
			if(i % 2 != 0) {
				System.out.print("��");
			}else {
				System.out.print("��");
			}
		}
		System.out.println();
		
		for(int i = 0; i<3; i++) {
			System.out.print("��");
			System.out.print("��");
		}
		
		
		
		
		
		
		
	}
}
