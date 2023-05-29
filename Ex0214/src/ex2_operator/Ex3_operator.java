package ex2_operator;

public class Ex3_operator {
	public static void main(String[] args) {
		//비트연산자
		//&, |, ^, ~
		
		//논리연산자와 유사하지만 bit단위(2진수)의 연산만 가능하다.
		//일반적으로 암호화,복호화 작업에 사용된다.
		
		int a = 10; //1010
		int b = 7; //0111
		int c = a & b; //논리곱(and) - 2진수로 바꿨을 때 두 값이 모두 1일 때만 결과가 1, 나머지는0
		System.out.println("c : " + c);
		
		c = a | b; //논리합(or) - 2진수로 바꿨을 때 두 값이 모두 0이면 0, 나머지는 1
		System.out.println("c : " + c);
		
		c = a ^ b; //배타적or(xor) - 2진수로 바꿨을 때 두 값이 서로 같으면 0, 다를 때는 1
		System.out.println("c : " + c);
		
		System.out.println("c : " + ~c);
		//00000000 00000000 00000000 00001101
		
		//증감연산자
		//1씩 증가시키거나 1씩 감소시켜주는 연산자
		//++, --
		
		//선행증감
		//변수의 앞에서 사용이 된다.
		a = 10;
		System.out.println("++a : " + ++a); //결과 11
		
		//후행증감
		//변수의 뒤에서 사용이 된다.
		b = 10;
		System.out.println("b++ : " + b++);
		//1을 더해주되, 다음번에 다시 한번 사용될 때 적용
		System.out.println("b : " + b);
		
		a = 7;
		++a;//8
		++a;//9
		a++;//9(+1)
		++a;//11
		a++;//11(+1)
		a++;//12(+1)
		a++;//13(+1)
		System.out.println("a : " + a);
		
		a = 10;
		b = 12;
		boolean result = ++a >= b || 2 + 7 <= b  && 13 -b >= 0 && (a+=b) - (a % b) > 10;
		// 11 >= 12 || 9 <= 12 && 1 >= 0 && 23 - 11 > 10;
		//    false ||   true  && true && true;
	    //정답 : true
		System.out.println(result);
		
		/*
		 * 과수원이 있다.
		 * 배, 사과, 오렌지를 키우고 있는데 하루에 생산되는 양은 각각
		 * 5,7,5개.
		 * 
		 * 과수원에서 하루에 생산되는 총 개수를 출력하고,
		 * 시간당 전체 과일의 평균 생산개수를 출력하세요.
		 * 평균값을 담는 변수는 float으로 만들 것
		 * */
		
		int pear = 5;
		int apple = 7;
		int orange = 5;
		
		int total = pear + apple + orange;
		System.out.println("하루에 생산되는 총 개수 : " + total);
		
		float avg = (float)total / 24f;
		System.out.println("전체 과일의 평균 생산개수 : " + avg);
		// 정수 / 정수 -> 정수, 실수/정수  -> 실수, 정수/실수  -> 실수
		// 실수 / 실수 -> 실수
	}
}
