package ex8_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
		//Ű���忡�� ���� �Է¹ް� �ش��ϴ� �������� ����غ�����.
		//2~9 �̿��� ���� �ԷµǸ� "2~9������ ���ڸ� �Է��ϼ���" ����ϱ�
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("���ڸ� �Է����ּ��� : ");
//		int dan = sc.nextInt();
//		
//		if(dan < 2 || dan > 9) {
//			System.out.println("2~9������ ���ڸ� �Է��ϼ���.");
//		}else {
//			for(int i = 1; i<10; i++) {
//				System.out.printf("%d X %d = %d\n",dan,i,dan*i);
//			}
//		}
		
		//Scanner�� ���� ���� n1,n2�� �Է¹޴´�.
		//�׸��� n1���� n2������ ���� ����Ͽ� �� ����� ����ϴ� ���α׷��� �ۼ�
		//������� 2�� 5�� �Է¹����� 2+3+4+5�� �������� 14�� ����ؾ� �մϴ�.
		//n1�� n2���� ũ�ٸ� �������� �ڸ��� �ٲ�־ ��� ����ϱ�
		//������� 5�� 2�� �Է¹����� 2+3+4+5�� �������� 14�� ����ؾ� �մϴ�.
		
		System.out.println("������ �Է����ּ��� : ");
		int n1 = sc.nextInt();
		
		System.out.println("������ �Է����ּ��� : ");
		int n2 = sc.nextInt();
		
		int total = 0;
		
		if(n2 > n1) {
		for(int i = n1; i<=n2; i++) {
			
			total += i;
			}
		}else {
			for(int i = n2; i<=n1; i++) {
				
				total += i;
				}
		}
		System.out.printf("��� : %d\n",total);
		
		
		
		
		
		

	}

}
