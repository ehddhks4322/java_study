package ex4_work;

import java.util.ArrayList;
import java.util.Scanner;

public class UseMain {
	public static void main(String[] args) {
		//������ ���̵�� �н����带 ������ UserInfo Ŭ������ �����
		//MainŬ�������� ������ ������ ArrayList�� �߰��Ͽ� ����غ���.
		
		//������ ������� ���̵� ���� ��� "���̵� �ߺ��˴ϴ�."���
		//����ϰ� ó������ ���ư���
		
		//���̵� ����: aaa
		//�н����� �Է� : 1111
		//aaa
		//1234
		//-----------
		//���̵� ���� : aaa
		//���̵� �ߺ��˴ϴ�.
		//���̵���� : bbb
		//�н����� ���� : 2222
		//aaa
		//1111
		//----------
		//bbb
		//2222
		
		ArrayList<UserInfo> list = new ArrayList<UserInfo>();
		Scanner sc = new Scanner(System.in);
		
		w:while(true) {
			UserInfo ui = new UserInfo();
			System.out.print("���̵� ���� : ");
			ui.setId(sc.next());
			
			for(int i = 0; i < list.size(); i++) {
				if(ui.getId().equals(list.get(i).getId())) {
					System.out.println("���̵� �ߺ��˴ϴ�.");
					continue w;
				}
			}
			System.out.print("�н����� ���� : ");
			ui.setPw(sc.nextInt());
			
			list.add(ui);
			
			for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getId());
				System.out.println(list.get(i).getPw());
				System.out.println("---------------");
			}
			
		}
		
		
		
		
		
		
		
		
	}
}
