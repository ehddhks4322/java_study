package ex5_continue;

public class Ex3_continue {
	public static void main(String[] args) {
		int n = 0;
		
		outer:while(true) {
			if(n >= 10) {
				break;
			}
			while(true) {
				n++;
				if(n % 3 == 0) {
					System.out.println("continue�� ����");
					continue outer;
				}
				System.out.println(n);
			}
		}
		System.out.println();

		
		//switch�������� break;
		n = 0;
		w:while(n < 10) {
			n++;
			switch(n) {
			case 1:
				System.out.println("switch�� 1�� ���İ�");
				break w;//switch�� ���������� ������ ���� �����Ѵ�.
						//label�� �޾��ְԵǸ� ��Ÿ������μ��� ������ �Ѵ�.
			case 2:
				System.out.println("switch�� 2�� ���İ�");
				continue;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
