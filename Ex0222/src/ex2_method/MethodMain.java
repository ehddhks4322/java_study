package ex2_method;

public class MethodMain {
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		int num = mt.f(3); //7;
		System.out.println(num);
		
		int su = 10;
		mt.test(su); // 결과 : 11
		System.out.println(su); // 결과 : 10
		
//		int sum = mt.add(10, 7);
//		System.out.println(sum);
		
//		mt.add(10, 7);
		
		mt.sum(10);
		
		mt.multi(5);
	}
}
