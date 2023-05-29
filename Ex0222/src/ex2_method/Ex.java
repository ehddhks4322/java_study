package ex2_method;

public class Ex {
	//두개의 정수를 더하는 add함수를 구현하고
	//main에서 add함수를 호출하여 두개의 숫자를 입력하고
	//결과를 출력하세요.
	
	public int add(int x, int y) {
		int sum = x+y;
		return sum;
	}
	
	public void add2(int a, int b) {
		System.out.println("add 값 : " + (a+b));
	}
	
	//1~n까지 총합을 구해주는 함수 만들기!
	public void sum(int n) {
		int total = 0;
		
		for(int i = 1; i <= n; i++) {
			total += i;
		}
		System.out.println("1~n까지의 총합 : " + total);
	}
	
	//두개의 정수를 더하는 add함수를 구현하고
	//main에서 add함수를 호출하여 두개의 숫자를 입력하고
	//결과를 출력하세요.
	
	public void add3(int n1, int n2) {
		int sum2 = n1+n2;
		System.out.println("add의 값 : " + sum2);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
