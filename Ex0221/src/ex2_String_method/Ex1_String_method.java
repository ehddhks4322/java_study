package ex2_String_method;

public class Ex1_String_method {
	public static void main(String[] args) {
		//�޼���(method) : ��� ����� ������ �ִ� ��ɹ��� ����
		//�޼��带 ����ϴ� ���� ū ������ �ݺ������� ���Ǵ� �ڵ带 ���̱� ���ؼ��̴�.
		//���� ���Ǵ� ������ �ڵ带 �޼���� �ۼ��� �ΰ� �ʿ��Ҷ����� ȣ�⸸ �ϸ� �ȴ�.
		
		//�޼��� ȣ���ϴ¹�
		//��ü��.�Լ���()
		String str = "Hong Gil Dong";
		System.out.println("���ڿ��� ���� : " + str.length()); //��� : 13
		
		int index = str.indexOf('n');
		System.out.println("�� ó�� ���� n�� ��ġ : " + index); //��� : 2
		
		char c = str.charAt(2);
		System.out.println("������ ���� : " + c);//��� : n
		
		String str2 = str.substring(0,4); //��� : hong
		System.out.println("�߶� ���ڿ� : " + str2);
		
		
		//split() : �Ұ�ȣ�ȿ� ������ �������� ���ڿ��� ������ �迭�� �־��ִ� ���
		String [] str3 = str.split(" ");
		
		for(int i = 0; i < str3.length; i++) {
			System.out.printf("str[%d] : %s\n",i,str3[i]);
		}
		System.out.println(str);
		str =" Hong Gil Dong ";
		
		//trim() : ���ڿ��� �յ� ������ �������ִ� ���
		System.out.println(str.trim());
		
		
		//StringŬ������ �����ִ� �޼���� �ƴ����� ������ �޼���
		//���ڿ��� �ۼ��� ���ڸ� ���� ������ �ٲ��ִ� �ڵ�
		String number = "1";
		System.out.println(Integer.parseInt(number)+10);
		
		//���� ������ ���ڿ��� �ٲ��ִ� �ڵ�
		int number2 = 1;
		System.out.println(Integer.toString(number2)+10);
		
		
		
		
		
	}
}
