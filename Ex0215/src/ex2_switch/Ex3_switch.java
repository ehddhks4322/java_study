package ex2_switch;

public class Ex3_switch {
	public static void main(String[] args) {
		//두개의 정수형 변수를 초기화 한다 (값은 자유)
		//그리고 산술연산자를 달아줄 문자열 변수를 만든다.
		//switch문을 이용하여 정수의 연산을 수행하는 계산기 코드 작성하기
		
		int num1 = 10;
		int num2 = 5;
		
		String str = "+";
		
		switch(str) {
		case "+":
			System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
			break;
		case "-":
			System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
			break;
		case "*":
			System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
			break;
		case "/":
			System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
			break;
		}
		
		//정수형 변수를 하나 만들고 달(1월,2월)을 대입한다. 해당 달이 몇일까지 있는지
		//switch문을 이용하여 작성하시오.
		
		int month = 1;
		
		switch(month) {
		case 1: 
			System.out.println(month + "월은" + "31일까지 있습니다." );
			break;
		case 2: 
			System.out.println(month + "월은" + "28일까지 있습니다." );
			break;
		case 3: 
			System.out.println(month + "월은" + "31일까지 있습니다." );
			break;
		case 4: 
			System.out.println(month + "월은" + "30일까지 있습니다." );
			break;
		case 5: 
			System.out.println(month + "월은" + "31일까지 있습니다." );
			break;
		case 6: 
			System.out.println(month + "월은" + "30일까지 있습니다." );
			break;
		case 7: 
			System.out.println(month + "월은" + "31일까지 있습니다." );
			break;
		case 8: 
			System.out.println(month + "월은" + "31일까지 있습니다." );
			break;
		case 9: 
			System.out.println(month + "월은" + "30일까지 있습니다." );
			break;
		case 10: 
			System.out.println(month + "월은" + "31일까지 있습니다." );
			break;
		case 11: 
			System.out.println(month + "월은" + "30일까지 있습니다." );
			break;
		case 12: 
			System.out.println(month + "월은" + "31일까지 있습니다." );
			break;
		}
		
		//위의 식을 break를 3번만 사용하여 만들어 보시오.
		
		switch(month) {
		case 1:case 3: case 5:case 7:case 8:case 10:
			case 12:
				System.out.println(month + "월은" + "31일까지 있습니다.");
				break;
		case 2:
			System.out.println(month + "월은" + "28일까지 있습니다.");
			break;
		case 4:case 6:case 9:case 11:
			System.out.println(month + "월은" + "30일까지 있습니다.");
			break;
		}
				
	}
}
