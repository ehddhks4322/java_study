package Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PersonManager {
	
	int select;
	Person p;
	
	public void personMgr() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Person> list = new ArrayList<Person>();
		w:while(true) {
			System.out.println("1. �����߰�");
			System.out.println("2. ��������");
			System.out.println("3. ��ü����");
			System.out.println("4. ����");
			System.out.println("�׸��� : ");
			select = sc.nextInt();
			
			switch(select) {
			case 1 :
				//�����߰�
				p = new Person();
				System.out.println("----�����߰�----");
				
				System.out.print("�̸� : ");
				p.setName(sc.next());
				
				System.out.print("���� : ");
				p.setAge(sc.nextInt());
				
				System.out.print("��ȣ : ");
				p.setTel(sc.next());
				
				list.add(p);
				System.out.println("������ ����Ǿ����ϴ�.");
				
				
				
				break;
				
			case 2 :
				//��������
				System.out.println("----��������----");
				System.out.println("������ �̸� : ");
				String name = sc.next();
				for(int i = 0; i < list.size(); i++) {
					if(list.get(i).getName().equals(name)) {
						list.remove(i);
						System.out.println(name + "�� �����Ǿ����ϴ�.");
						break;
					}else {
						if(i+1 == list.size()) {
							System.out.println(name + "�� �������� �ʽ��ϴ�.");
						}
					}
				}
				
				
				
				
				break;
				
			case 3 :
				//��ü����
				System.out.println("----��ü����----");
				System.out.println("����ο� : " +list.size());
//				for(int i = 0; i < list.size(); i++) {
//					System.out.println("�̸� : " + list.get(i).getName());
//					System.out.println("���� : " + list.get(i).getAge());
//					System.out.println("��ȣ : " + list.get(i).getTel());
//					System.out.println("---------------------");
//				}
				
				//for�� ��� Iterator�� �̿��� while�� ��� ����
				//hasNext -> ���� ��Ұ� �ִ��� �ľ�
				//next() -> ��Ҹ� ó������ ������ �������� �޼���
				Iterator<Person> it = list.iterator();
				while(it.hasNext()) {
					p = it.next();
					System.out.println("�̸� : " + p.getName());
					System.out.println("���� : " + p.getAge());
					System.out.println("��ȣ : " + p.getTel());
					System.out.println("--------------------");
				}

				break;
				
			case 4 : 
				//����
				break w;
			
			}
		}
	}
}
