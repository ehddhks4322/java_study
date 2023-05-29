package ex3_constructor;

public class ConMain {
	public static void main(String[] args) {
		ConTest ct = new ConTest();
		
		//ct.ConTest(); 다시 한번 호출할 수 없다.
		
		ConTest ct2 = new ConTest("홍길동");
	}
}
