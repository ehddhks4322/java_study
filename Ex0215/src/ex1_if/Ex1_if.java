package ex1_if;

public class Ex1_if {
	public static void main(String[] args) {
		//���(control-statement) : �ڵ��� �帧�� �����ϴ� ����
		//-���ǹ� : if, switch
		//-�ݺ��� : for, while
		
		//���ǹ� : ���ǿ� ���Ͽ� ����� �������� �������� ������ ���ϴ� ����
		
		//�⺻��
		//if(���ǽ�){
		//		   ���ǽ��� ���� �� ������ ���
		//}
		
		//���ǽ� : ��,���������� �Ǻ��� �� �ִ� ��
		
		int n = 49;
		String str = "";
		
		if(n == 0) {
			str = "n�� 50�Դϴ�.";
		}
		if(n != 0) {
			str = "n�� 50�� �ƴմϴ�.";
		}
		
		System.out.println(str);
	}
}
