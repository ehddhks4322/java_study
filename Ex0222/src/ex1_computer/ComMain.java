package ex1_computer;

public class ComMain {
	public static void main(String[] args) {
		//�ٸ� Ŭ������ �ִ� ������ �Լ��� ����ϱ� ���ؼ��� 
		//�ش� Ŭ������ ��üȭ �ؾ� �մϴ�.
		
		//��ü �����ϴ¹�
		//Ŭ������ ��ü�� = new Ŭ������();
		
		//�ٸ� Ŭ������ �ִ� ������ ����ϰų� �����ϴ¹�
		//��ü��.������ = ������;
		Computer com1 = new Computer(); //��ǻ�� 1�� ����
		com1.getInfo();
		Computer com2 = new Computer();
		com2.ram = 128;
		com2.getInfo();
		
	}
}
