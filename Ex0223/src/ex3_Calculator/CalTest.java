package ex3_Calculator;

public class CalTest {
	//CalMain���� Scanner�� ����� ���� �ΰ��� �����ȣ�� ���� ��
	//CalTestŬ�������� ������ ���ִ� Ŭ���� ����� �����ϱ�
	public void Colculator(int num1, int num2, String str) {
		
		switch(str) {
		case "+" : System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
					break;
		case "-" : System.out.printf("%d - %d = %d\n",num1,num2,num1-num2);
					break;
		case "*" : System.out.printf("%d * %d = %d\n",num1,num2,num1*num2);
					break;
		case "/" : System.out.printf("%d / %d = %d\n",num1,num2,num1/num2);
					break;
					
		}
	}
}
