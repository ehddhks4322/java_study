package ex2_switch;

public class Ex2_switch {
	public static void main(String[] args) {
		char ch = 'A';
		
		switch(ch) {
		case 'A':
			System.out.println("������ 100~90�� �����Դϴ�.");
			break;
		case 'B':
			System.out.println("������ 89~80�� �����Դϴ�.");
			break;
		case 'C':
			System.out.println("������ 79~70�� �����Դϴ�.");
			break;
		case 'D':
			System.out.println("������ 69~60�� �����Դϴ�.");
			break;
		default:
			System.out.println("������ 59�� �����Դϴ�.");
			break;
		}
		
		//switch�� Ư¡
		//1) �񱳰��� ���ǰ��� �ڷ����� �ݵ�� ��ġ�ؾ� �Ѵ�.
		//2) �ߺ��Ǵ� ���ǰ��� ���� �� ����.
		
		//switch���� �񱳰����� ��밡���� �ڷ���
		//1) ����(byte,short,int)
		//2) ������(char)
		//3) ���ڿ�(String)
		
		//�Ǽ��� �񱳰����� �� �� ����.
//		double d = 3.14;
//		
//		switch(d) {
//		
//		}
		
		String str = "ȫ";
		
		switch(str) {
		case "ȫ":
			System.out.println("�� �̸��� ȫ�浿 �Դϴ�.");
			break;
		case "��":
			System.out.println("�� �̸��� �ڱ浿 �Դϴ�.");
			break;
		case "����":
			System.out.println("�� �̸��� ����浿 �Դϴ�.");
			break;
		}
	}
}
