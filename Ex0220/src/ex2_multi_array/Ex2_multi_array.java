package ex2_multi_array;

import java.util.Scanner;

public class Ex2_multi_array {
	public static void main(String[] args) {
		//���� 2���� �迭�� ���հ� ����� ���ϼ���.
		int arr[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
		
		int total = 0;
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
				count++;
			}
		}
		System.out.println("�迭�� ���� : " + total);
		System.out.println("��� : " + (float)total/count);
		
		
		//�л����� ���а� ������� ����ϴ� ���α׷��� �ִ�.
				//���α׷��� �����ϸ� �� ���� ������ ������ �������� �Է¹��� ��,
				//�Է¹��� �� ��ŭ �л����� �̸��� ���׼���, ������� �Է¹޴� ���α׷� �ۼ�
				
				//����
				//����� �ο� �� : 2
				//�̸�: ȫ�浿
				//����: 90
				//����: 87
				//----------
				//�̸�: ��浿
				//����: 70
				//����: 100
				//----------
				//2�� ��� �Ϸ�!!
				//ȫ�浿 90 87
				//��浿 70 100
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����� �ο� �� : ");
		int n = sc.nextInt();
		
		String str[][] = new String[n][3];
		
		for(int i = 0; i < str.length; i++) {
			System.out.println("�̸� : ");
			str[i][0] = sc.next();
			
			System.out.println("���� : ");
			str[i][1] = sc.next();
			
			System.out.println("���� : ");
			str[i][2] = sc.next();
			
			System.out.println("----------");
		}
		
		System.out.println(str.length + "��  ��� �Ϸ�!!");
		
		for(int i = 0; i < str.length; i++) {
			for(int j = 0; j < str[i].length; j++) {
				System.out.println(str[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}
}
