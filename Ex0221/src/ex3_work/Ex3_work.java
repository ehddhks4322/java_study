package ex3_work;

import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {
		//ȸ�����ϱ�
		//ȸ���̶� ������ �о , �ڷ� �о �Ȱ��� ������ ������ ���մϴ�.
		
		//Ű���忡�� ���ڿ��� �Է¹��� �� �ش� ������ ȸ������ �ƴ����� �Ǵ��ϴ� �ڵ带 �����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է����ּ��� : ");
		
		String ori = sc.next();
		
		String rev = "";
		
		for(int i = ori.length()-1; i >= 0; i--) {
			rev += ori.charAt(i);
		}
		
		if(ori.equals(rev)) {
			System.out.println(ori + "��(��) ȸ���Դϴ�.");
		}else {
			System.out.println(ori + "��(��) ȸ���� �ƴմϴ�.");
		}
		
		
		//Ű���忡�� ���ڿ� Ư�����ڸ� ������ ���ĺ��� �������� �Է¹޴´�.
		//�Է¹��� ���ڿ��� �ҹ���a�� � �ִ����� �Ǻ��ϴ� �ڵ带 �����غ���.
		
		//����
		//�Է� : asdfasdf
		//a�� ���� : 2
		System.out.println("���ĺ��� �Է����ֻ��� : ");
		String str = sc.next();
		
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println("a�� ���� : " + count);
		
		
		
		
		
	}
}
