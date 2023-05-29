package ex1_enum;

import java.util.Arrays;

public class Ex1_enum {
	public static void main(String[] args) {
		Item[] items = Item.values();
		for(int i = 0; i < items.length; i++) {
			System.out.println(items[i]);
		}
		System.out.println(Arrays.toString(items));
		
		//������ ���� ��ȯ�ϱ�
		//ordinal() : �������� ����ִ� ������� ������� ��ȯ
		for(Item item : items) {
			System.out.println("name="+item.name()+",ordinal="+item.ordinal());
			
			
			Item i1 = Item.START;
			Item i2 = Item.valueOf("START");
			//valueOf(String) : String���� enum���� �����´�. ���ٸ� Exception �߻�
			Item i3 = Item.valueOf(Item.class,"START");
			//valueOf(Ŭ����.class, String) : �Ѱܹ��� Ŭ������ �������� String�� ã�Ƽ�, enum���� �����´�.
			Item i4 = Item.STOP;
			
			//������ ������� �񱳿��� == �� ����� �� �ִ�.(����� �ּҸ� ��)
			// < , > �� ���� �ʰ�,�̸�,�̻�,���� ���� �񱳿����ڴ� ����� �� ����.
			System.out.println(i1);//��� : START
			System.out.println(i1 == i2);//��� : true
			System.out.println(i1 == i4);//��� : false
			
			switch(i1) {
			case START ://Item.START��� �� �� ����.
				System.out.println("���� ����");
				break;
			case STOP:
				System.out.println("���� ����");
			case EXIT:
				System.out.println("���� ����");
				break;
			}
		}
	}
}
