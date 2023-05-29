package ex1_overload;

public class OverloadMain {
	public static void main(String[] args) {
		Ex1_overload od = new Ex1_overload();
		od.result();
		od.result(1);
		od.result('A');
		od.result("홍길동", 1);
		od.result(1, "김길동");
		
		//오버로드의 장점 : 메서드를 상황에 따라서 구분할 필요가 없다.
		//ex println
		System.out.println();
	}
}
