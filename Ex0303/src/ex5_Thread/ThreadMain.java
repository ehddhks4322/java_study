package ex5_Thread;

import java.util.Scanner;

public class ThreadMain {
	public static void main(String[] args) {
		//��ĳ�ʸ� �Է��Ͽ� Ű���忡�� ���ڸ� �Է¹ް�
		//�����忡�� �Է¹��� ���ڰ� 1�� �����ϴٰ� 0�� �Ǿ��� ��
		//"����"��� �޼����� �Բ� �����带 ������������ ������.
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int n = sc.nextInt();
		
		ThreadCount tc = new ThreadCount(n);
		
		tc.start();
	}
}
