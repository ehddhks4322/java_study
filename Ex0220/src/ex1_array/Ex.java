package ex1_array;

import java.util.Random;
import java.util.Scanner;


public class Ex {
	public static void main(String[] args) {
		//1~45�� ������ �߻����� �ζǹ�ȣ�� �����ϴ� ���α׷� �����.
		//6���� ���ڰ� ��ġ�� �ʰ� ���� �մϴ�.
		
		Random rnd = new Random();
		int lotto[] = new int[6];
		
		System.out.print("�ζǹ�ȣ : ");
		w:for(int i = 0; i < lotto.length; i++) {
			int num = rnd.nextInt(45)+1;
			lotto[i] = num;
			
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					continue w;
				}
			}
			System.out.print(lotto[i] + " ");
		}
		
		System.out.println();
		
		//���� money�� 10 ~ 5000������ ������ �߻����� �ִ´�.
		//�� 3450,2100,60�� ���� 1�� �ڸ��� �ݵ�� 0�� �ǵ��� �Ѵ�.
		
		//�߻��� ���� money�� �������� �ٲٸ� ���� ������ �� ���� �ʿ����� �Ǵ��ϴ� �ڵ� �ۼ��ϱ�
		
		//������ ���� ���� ������ ����ϵ��� �Ѵ�.
		
		int money = rnd.nextInt(500)+10;
		
		money *= 10;
		
		int[] coin = {500,100,50,10};
		
		System.out.println(money + "��");
		for(int i = 0; i < coin.length; i++) {
			int res = money/coin[i];
			System.out.println(coin[i] + "��: " + res);
			money %= coin[i];
		}
		
		//���α׷��� ����Ǹ� �迭�� ���̸� ������ �� ������ �����.
		//������� Ű���忡�� 5�� �Է¹�����
		
		//���
		
		//�迭�� ���̴� ������..? :5
		//ABCDE
		
		//�迭�� ���̴� ������..? :3
		//ABC
		
		//���� ���� ����� ������ִ� �ڵ� �ۼ�
		
		System.out.println("�迭�� ���̴� ������..? : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		char[] ch = new char[num];
		
		for(int i = 0; i < ch.length; i++) {
			ch[i] = (char)(65+i);
			System.out.print(ch[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		
		//�������� 1~130���� �� ���� ���� ���������� �����մϴ�.
		//������� kor,eng,math
		//100������ ���� ������ ������ �ٽ� ������ �����Ͽ� �� ������ ��� 100�� ���ϰ� �Ǹ�
		//����ϴ� do-while���� �ۼ��غ�����.
		
		int kor = 0;
		int eng = 0;
		int math = 0;
	
		
		do {
			 kor = rnd.nextInt(130)+1;
			 eng = rnd.nextInt(130)+1;
			 math = rnd.nextInt(130)+1;
		}while(kor > 100 || eng > 100 || math > 100);
		
		System.out.println("���� : " + kor +"��");
		System.out.println("���� : " + eng +"��");
		System.out.println("���� : " + math +"��");
		
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
		System.out.print("����� �ο� �� : ");
		int n = sc.nextInt();
		
		String str[][] = new String[n][3];
		
		for(int i = 0; i < str.length; i++) {
			System.out.print("�̸� : ");
			str[i][0] = sc.next();
			
			System.out.print("���� : ");
			str[i][1] = sc.next();
			
			System.out.print("���� : ");
			str[i][2] = sc.next();
			
			System.out.println("-----------------");
		}
		
		System.out.println(str.length +"�� ��� �Ϸ�!!");
		
		for(int i = 0; i < str.length; i++) {
			for(int j = 0; j < str[i].length; j++) {
				System.out.print(str[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//���� 2���� �迭�� ���հ� ����� ���ϼ���.
		int arr[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
		
		int total = 0;
		float average = 0;
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
				count++;
			}
		}
			
		System.out.println("���� : " + total);
		
		average = (float)total/count;
		
		System.out.println("��� : " + average);
		
		
		
		//���� money�� 10 ~ 5000������ ������ �߻����� �ִ´�.
		//�� 3450,2100,60�� ���� 1�� �ڸ��� �ݵ�� 0�� �ǵ��� �Ѵ�.
		
		//�߻��� ���� money�� �������� �ٲٸ� ���� ������ �� ���� �ʿ����� �Ǵ��ϴ� �ڵ� �ۼ��ϱ�
		
		//������ ���� ���� ������ ����ϵ��� �Ѵ�.
		
		int money2 = rnd.nextInt(500)+10;
		
		money2 *= 10; 
		
		int coin2[] = {500,100,50,10};
		
		
		System.out.println("�ݾ� : " + money2);
		for(int i = 0; i < coin2.length; i++) {
			int res2 = money2/coin2[i];
			System.out.println(coin2[i] + "�� : " + res2);
			money2 %= coin2[i];
		}
		
		
		
		
	}
}
