package ex1_computer;

public class ComMain {
	public static void main(String[] args) {
		Computer com1 = new Computer();
		com1.ssd  = 1024;//Ŭ������ �������� �����ϴ°� �ʹ� �����ϴ�.
		//com1.brand = "apple";//�ٲ�� �ȵǴ� �ֵ鵵 �ٲ�� ��Ȳ������ ����
		
		com1.setBrand("LG");
		//System.out.println(com1.brand);//���� �Ժη� �ٲܼ� ������ ȣ�⵵ �ȵ�
		System.out.println(com1.getBrand());
	}
}
