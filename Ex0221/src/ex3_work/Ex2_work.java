package ex3_work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		//Ű���忡�� ���ڿ� Ư�����ڸ� ������ ���ĺ��� �������� �Է¹޴´�.
		//�Է¹��� ���ڿ��� �ҹ���a�� � �ִ����� �Ǻ��ϴ� �ڵ带 �����غ���.
		
		//����
		//�Է� : asdfasdf
		//a�� ���� : 2
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("���ĺ��� �Է����ּ��� : ");
//		
//		String str = sc.next();
//		
//		int count = 0;
//		
//		for(int i = 0; i < str.length(); i++) {
//			if(str.charAt(i) == 'a') {
//				count++;
//			}
//		}
//		System.out.println("a�� ���� : " + count);
		
		
		//ȸ�����ϱ�
		//ȸ���̶� ������ �о , �ڷ� �о �Ȱ��� ������ ������ ���մϴ�.
		
		//Ű���忡�� ���ڿ��� �Է¹��� �� �ش� ������ ȸ������ �ƴ����� �Ǵ��ϴ� �ڵ带 �����ϼ���.
//		System.out.println("���ڿ��� �Է����ּ��� : ");
//		String str = sc.next();
//		
//		String rev = "";
//		
//		for(int i = str.length()-1; i >=0; i--) {
//			rev += str.charAt(i); // rev = rev + str.chartAt(i);
//		}
//		
//		if(str.equals(rev)) {
//			System.out.println(str + "��(��) ȸ���Դϴ�.");
//		}else {
//			System.out.println(str + "��(��) ȸ���� �ƴմϴ�.");
//		}
		
		//Ű���忡�� ���ڿ� Ư�����ڸ� ������ ���ĺ��� �������� �Է¹޴´�.
		//�Է¹��� ���ڿ��� �ҹ���a�� � �ִ����� �Ǻ��ϴ� �ڵ带 �����غ���.
		
		//����
		//�Է� : asdfasdf
		//a�� ���� : 2
		System.out.println("���ĺ��� �Է����ּ��� : ");
		String str2 = sc.next();
		
		int count = 0;
		
		for(int i = 0; i < str2.length(); i++) {
			if(str2.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println("a�� ���� : " + count);
		
		//ȸ�����ϱ�
		//ȸ���̶� ������ �о , �ڷ� �о �Ȱ��� ������ ������ ���մϴ�.
		
		//Ű���忡�� ���ڿ��� �Է¹��� �� �ش� ������ ȸ������ �ƴ����� �Ǵ��ϴ� �ڵ带 �����ϼ���.
		System.out.println("������ �Է����ּ��� : ");
		String ori = sc.next();
		
		String rev = "";
		
		for(int i = ori.length()-1; i >= 0; i--) {
			rev += ori.charAt(i);
		}
		
		if(ori.equals(rev)){
			System.out.println(ori + "��(��) ȸ���Դϴ�.");
		}else {
			System.out.println(ori + "��(��) ���� �ƴմϴ�.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
