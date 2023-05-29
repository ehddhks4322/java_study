package ex5_super;

public class SuperMain {
	public static void main(String[] args) {
		Child c = new Child(100);
		//자식클래스를 생성하면
		//자식의 생성자가 호출되는데, 여기서는 자식클래스에서 super()로
		//부모의 생성자를 먼저 호출했으므로
		//부모클래스의 생성자에 먼저 접근하게 된다.
		
		int res = c.result();
		System.out.println("res : " + res);
	}
}
