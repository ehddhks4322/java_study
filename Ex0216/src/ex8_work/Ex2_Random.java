package ex8_work;

import java.util.Random;
import java.util.Scanner;

public class Ex2_Random {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Random rnd = new Random();
		
		//rnd.nextInt(���ᰪ)+���۰�;
		int r = rnd.nextInt(45)+1;
		
		System.out.println(r);
		
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
		}while(kor >= 100 || eng >= 100 || math >= 100);
		
		System.out.println("���� :" + kor);
		System.out.println("���� :" +eng);
		System.out.println("���� :" +math);
		
		
		
		
		
		
		
		
	}
}
