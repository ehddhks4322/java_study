package ex1_overload;

public class OverloadMain {
	public static void main(String[] args) {
		Ex1_overload od = new Ex1_overload();
		od.result();
		od.result(1);
		od.result('A');
		od.result("ȫ�浿", 1);
		od.result(1, "��浿");
		
		//�����ε��� ���� : �޼��带 ��Ȳ�� ���� ������ �ʿ䰡 ����.
		//ex println
		System.out.println();
	}
}
