package ex6_printf;

public class Ex1_printf {
	public static void main(String[] args) {
		//printf : ���ڿ��� ������ ����ִ� �����͸� �Բ� ����� �� �ֵ��� �����ִ� ��������
		//f�� format�̶�� �� �Դϴ�.
		
		int su1 = 10;
		int su2 = 7;
		
		// %d : ������ �����͸� �Է¹��� �� ����Ѵ�.
		// %c : ������ �����͸� �Է¹��� �� ����Ѵ�.
		// %s : ���ڿ� �����͸� �Է¹��� �� ����Ѵ�.
		// %f : �Ǽ��� �����͸� �Է¹��� �� ����Ѵ�.
		
		System.out.println(su1 + " + " + su2 + " = " + (su1+su2));
		System.out.printf("%d + %d = %d\n",su1,su2,su1+su2);
		
		//�� ���̴� 30�� �Դϴ�.
		int age = 30;
		System.out.printf("�� ���̴�%d�� �Դϴ�.\n",age);
		
		//�� �̸��� OOO�̰�, �� ���̴� OO���̰�, �� Ű�� OOO.Ocm�̰�, �� �������� OO���Դϴ�.
		
		String name = "�赿��";
		age = 26;
		double d = 160.0;
		String str = "AB";
		
		System.out.printf("�� �̸��� %s�̰�, �� ���̴� %d���̰�, �� Ű�� %.1fcm�̰�, �� �������� %s���Դϴ�.",name,age,d,str);
		
		
		

	}

}
