package ex3_try_catch;

public class Ex2_try_catch {
	public static void main(String[] args) {
		int res = 10;
		int [] arr = new int[2];
		
		try {
			res = 10/0;
			arr[1] = 10;
			//���ܺ��� ������ ������ �� �ִ�.
		} catch (ArithmeticException e) {
			System.out.println("������ 0���� ���� �� �����ϴ�.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���� index�� ���� ���� �� �����ϴ�.");
		}finally {
			//try���������� ���� �߻� ���ο� ��� ����
			//�������� ������ ȣ��Ǵ� ����
			System.out.println("finally");
		}
		
		System.out.println(res);
		
		
		
		
		
		
		
		
		
	}
}
