package ex1_array;

import java.util.Random;
import java.util.Scanner;

public class Ex3_Array {
	public static void main(String[] args) {
		//�迭 arr�� ����ִ� ��� ���� ����ϼ���
		//��� : 150
		
		int[] arr = {10,20,30,40,50};
		
		int total = 0;
		
		for(int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		System.out.printf("�迭 arr�� ����ִ� ��� ���� �� : %d\n",total);
		
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
			System.out.print(ch[i]);
		}
		System.out.println();
		System.out.println();
		
		//���� money�� 10 ~ 5000������ ������ �߻����� �ִ´�.
		//�� 3450,2100,60�� ���� 1�� �ڸ��� �ݵ�� 0�� �ǵ��� �Ѵ�.
		
		//�߻��� ���� money�� �������� �ٲٸ� ���� ������ �� ���� �ʿ����� �Ǵ��ϴ� �ڵ� �ۼ��ϱ�
		
		//������ ���� ���� ������ ����ϵ��� �Ѵ�.
		
		Random rnd = new Random();
		
		int money = rnd.nextInt(500)+10;
		money *= 10; // ���� �ڸ��� ������
		
		int[] coin = {500,100,50,10};
		System.out.println("�ݾ� : " + money);
		
		for(int i = 0; i < coin.length; i++) {
			int res = money/coin[i];
			money %= coin[i];
			System.out.println(coin[i]+"�� : "  + res);
		}
		System.out.println();
		
		//1~45�� ������ �߻����� �ζǹ�ȣ�� �����ϴ� ���α׷� �����.
		//6���� ���ڰ� ��ġ�� �ʰ� ���� �մϴ�.
		
		
		int[] number = new int[6];
		
		System.out.print("�ζ� ��ȣ : ");
		for(int i = 0; i < number.length; i++) {
			int lotto = rnd.nextInt(45)+1;
			number[i] = lotto;
			for(int j = 0; j < i; j++) {
				if(number[i] == number[j]) {
					
					break;
				}
			}
			System.out.print(number[i] + " ");
		}
		
		
		
		
		
		
		
	}
}
