package ex2_switch;

public class Ex3_switch {
	public static void main(String[] args) {
		//�ΰ��� ������ ������ �ʱ�ȭ �Ѵ� (���� ����)
		//�׸��� ��������ڸ� �޾��� ���ڿ� ������ �����.
		//switch���� �̿��Ͽ� ������ ������ �����ϴ� ���� �ڵ� �ۼ��ϱ�
		
		int num1 = 10;
		int num2 = 5;
		
		String str = "+";
		
		switch(str) {
		case "+":
			System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
			break;
		case "-":
			System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
			break;
		case "*":
			System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
			break;
		case "/":
			System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
			break;
		}
		
		//������ ������ �ϳ� ����� ��(1��,2��)�� �����Ѵ�. �ش� ���� ���ϱ��� �ִ���
		//switch���� �̿��Ͽ� �ۼ��Ͻÿ�.
		
		int month = 1;
		
		switch(month) {
		case 1: 
			System.out.println(month + "����" + "31�ϱ��� �ֽ��ϴ�." );
			break;
		case 2: 
			System.out.println(month + "����" + "28�ϱ��� �ֽ��ϴ�." );
			break;
		case 3: 
			System.out.println(month + "����" + "31�ϱ��� �ֽ��ϴ�." );
			break;
		case 4: 
			System.out.println(month + "����" + "30�ϱ��� �ֽ��ϴ�." );
			break;
		case 5: 
			System.out.println(month + "����" + "31�ϱ��� �ֽ��ϴ�." );
			break;
		case 6: 
			System.out.println(month + "����" + "30�ϱ��� �ֽ��ϴ�." );
			break;
		case 7: 
			System.out.println(month + "����" + "31�ϱ��� �ֽ��ϴ�." );
			break;
		case 8: 
			System.out.println(month + "����" + "31�ϱ��� �ֽ��ϴ�." );
			break;
		case 9: 
			System.out.println(month + "����" + "30�ϱ��� �ֽ��ϴ�." );
			break;
		case 10: 
			System.out.println(month + "����" + "31�ϱ��� �ֽ��ϴ�." );
			break;
		case 11: 
			System.out.println(month + "����" + "30�ϱ��� �ֽ��ϴ�." );
			break;
		case 12: 
			System.out.println(month + "����" + "31�ϱ��� �ֽ��ϴ�." );
			break;
		}
		
		//���� ���� break�� 3���� ����Ͽ� ����� ���ÿ�.
		
		switch(month) {
		case 1:case 3: case 5:case 7:case 8:case 10:
			case 12:
				System.out.println(month + "����" + "31�ϱ��� �ֽ��ϴ�.");
				break;
		case 2:
			System.out.println(month + "����" + "28�ϱ��� �ֽ��ϴ�.");
			break;
		case 4:case 6:case 9:case 11:
			System.out.println(month + "����" + "30�ϱ��� �ֽ��ϴ�.");
			break;
		}
				
	}
}
