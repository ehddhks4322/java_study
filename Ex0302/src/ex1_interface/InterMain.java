package ex1_interface;

public interface InterMain {
	public static void main(String[] args) {
		//InterTest it = new InterTest();
		//�������̽� ��ü�� ��üȭ ��ų�� ����.
		
		InterChild ic = new InterChild();
		System.out.println("getA(): " + ic.getNumber());
	}
}
