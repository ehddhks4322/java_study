package ex1_array;

public class Ex1_Array {
	public static void main(String[] args) {
		//�迭(array): �迭�� ���� �ڷ����� ������� �̷���� ���������̶�� ������ �� �ֽ��ϴ�.
		//�����͸� ȿ�������� �����ϱ� ���ؼ��� �迭�� �� �ʿ��մϴ�.
		
		//�迭�� ����
		//�ڷ���[] �迭��;
		
		//�迭�� ����
		//�迭�� = new �ڷ���[����(����)];
		
		//����� ������ ���ÿ�
		//�ڷ���[] �迭�� = new �ڷ���[����(����)];
		
		int su1 = 100;
		int su2 = 200;
		int su3 = 300;
		int su4 = 400;
		
		//1)�迭�� ����
		int[] ar;
		
		//2)�迭�� ����
		ar = new int[4];
		
		//�迭�� ���� �ִ¹�
		//�迭��[index] = ��;
		ar[0] = 100;
		ar[1] = 200;
		ar[2] = 300;
		ar[3] = 400;
		
		//�迭�� ���� �ִ¹�2
		//�迭�� �ʱ�ȭ
		//�迭�� ���� ����� ������ŭ �˾Ƽ� ���� ���������.
		//int[] arr = {100,200,300,400,500};
		
		//�迭�� ���
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		
		//�迭�� ���2
		for(int i = 0; i < 4; i++) {
			System.out.println(ar[i]);
		}
		System.out.println();
		
		//�ݺ����� ���Ͽ� �迭�� ������ �濡 ���� ������ ���� �ִ�.
		for(int i =0; i <4; i++) {
			ar[i] = (i+1)*10;
			System.out.println(ar[i]);
		}
		
		
		
		
		
		
		
		
		
	}
}
