package ex2_method;

public class Ex_main {
	public static void main(String[] args) {
		Ex mt = new Ex();
		int sum = mt.add(10, 7);
		System.out.println(sum);
		
		mt.add2(10, 8);
		
		mt.sum(20);
		
		mt.add3(20, 30);
	}
}
