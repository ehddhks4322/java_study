package ex3_try_catch;

import java.util.Scanner;

public class Ex3_try_catch {
	public static void main(String[] args) {
		int [] var = {10,20,30};
		
		try {
			for(int i = 0; i <= var.length; i++) {
				System.out.printf("var[%d] : %d\n",i,var[i]);
			}
		} catch (Exception e) {
			System.out.println("�����߻�");
		}
		
		//����
		//Ű���忡�� ������ �Է¹ް�, ���� �̿��� ���� �ԷµǸ�
		//"������ �Է°���"�̶�� �޼����� �������
		
		//���� : 100
		//�Է¹��� �� : 100
		
		//���� : aaa
		//�Է¹��� �� : ������ �Է°���
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("���� : ");
//		
//		try {
//			int n = sc.nextInt();
//			System.out.printf("�Է¹��� �� : %d",n);
//		} catch (Exception e) {
//			System.out.println("������ �Է°���");
//		}
		
		
		//���� : 100
		//��� : 100
				
		//���� : aaa
		//��� : aaa��(��) ������ �ƴմϴ�.
		
		String str = "";
		System.out.print("���� : ");
		
		try {
			str = sc.next();
			int n = Integer.parseInt(str);
			System.out.println("��� : " + n);
		} catch (Exception e) {
			System.out.println("��� : " + str + "��(��) ������ �ƴմϴ�.");
		}
		
		
		
		
		
		
		
		
		
	}
}
