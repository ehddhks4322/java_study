package ex1_array;

public class Ex2_array {
	public static void main(String[] args) {
		char[] ch;
		ch = new char[4];
		
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		//ch[4] = '!'; ���� index�� ���� �������� �� ���� ������ ����.
		
		//�迭�� ���� ���
		//������ index��ȣ�� ���� -1
		for(int i = 0; i < ch.length; i++) {
			System.out.printf("ch[%d] : %c\n",i,ch[i]);
		}
		
		System.out.println(ch); //�������迭�� �迭������ ����ϴ°� �����ϴ�.
		
		String[] str = new String[3];
		str[0] = "hello";
		
		for(int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		System.out.println();
		//System.out.println(str); �迭������ ����ϴ°��� �Ұ����ϴ�.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
