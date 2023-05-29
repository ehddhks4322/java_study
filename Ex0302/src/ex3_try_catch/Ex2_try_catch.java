package ex3_try_catch;

public class Ex2_try_catch {
	public static void main(String[] args) {
		int res = 10;
		int [] arr = new int[2];
		
		try {
			res = 10/0;
			arr[1] = 10;
			//예외별로 나눠서 관리할 수 있다.
		} catch (ArithmeticException e) {
			System.out.println("정수는 0으로 나눌 수 없습니다.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("없는 index에 값을 넣을 수 없습니다.");
		}finally {
			//try영역에서의 예외 발생 여부와 상관 없이
			//마지막에 무조건 호출되는 영역
			System.out.println("finally");
		}
		
		System.out.println(res);
		
		
		
		
		
		
		
		
		
	}
}
