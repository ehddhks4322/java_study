package ex1_interface;

public interface InterMain {
	public static void main(String[] args) {
		//InterTest it = new InterTest();
		//인터페이스 자체를 객체화 시킬수 없다.
		
		InterChild ic = new InterChild();
		System.out.println("getA(): " + ic.getNumber());
	}
}
