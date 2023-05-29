package ex2_method;



public class MethodTest {
	
	//f(x) = 2x+1
	//f : 메서드명
	//x : 파라미터
	//2x+1 : 명령
	
	public int f(int x) {
		int num = 2*x+1;
		return num;
	}
	
	public void test(int su) {
		su++;
		System.out.println("su : " + su);
	}
	
	//두개의 정수를 더하는 add함수를 구현하고
	//main에서 add함수를 호출하여 두개의 숫자를 입력하고
	//결과를 출력하세요.
	
	//return활용
//	public int add(int x, int y) {
//		int sum = x+y;
//		return sum;
//	}
	
	//return 활용x
//	public void add(int x, int y) {
//		System.out.println("x+y = " + (x+y));
//	}
	
	
	//1~n까지 총합을 구해주는 함수 만들기!
	
	public void sum(int n) {
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum += i; //sum = sum + i;
		}
		System.out.println("1~n까지의 총합 : " + sum);
	}
	
	//외부에서 수를 하나 입력받아서 해당 수에 해당하는 구구단을 출력하는 함수 만들기
	public void multi(int num) {
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d X %d = %d\n",num,i,num*i);
		}
	}
	
	
}

