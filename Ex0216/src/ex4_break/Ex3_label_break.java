package ex4_break;

public class Ex3_label_break {
	public static void main(String[] args) {
		//label : Ư�� �ݺ����� �̸�ǥ�� ���� ���� ���ϴ� �ݺ����� 
		//������ �� �ֵ��� �ϴ� Ű����
		
		//label�� �׻� ������ �����Ѵ�.
		//label�� �̸��� ���ϴ´�� ����� �����ϴ�.
		
		//label�� �ڽ��� �����ϰ� �ִ� ���� ���信�Ը� �� �� �ִ�.
		
		happy:for(int i = 1; i<=3; i++) {
			for(int k = 1; k<=3; k++) {
				System.out.print(k + " ");
			}
			
			for(int j = 1; j<=10; j++) {
				if(j % 2 == 0) {
					break happy;
				}
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}
	
}
