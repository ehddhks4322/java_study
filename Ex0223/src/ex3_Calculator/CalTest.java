package ex3_Calculator;

public class CalTest {
	//CalMain에서 Scanner를 사용해 숫자 두개와 연산기호를 받은 뒤
	//CalTest클래스에서 연산을 해주는 클래스 만들고 실행하기
	public void Colculator(int num1, int num2, String str) {
		
		switch(str) {
		case "+" : System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
					break;
		case "-" : System.out.printf("%d - %d = %d\n",num1,num2,num1-num2);
					break;
		case "*" : System.out.printf("%d * %d = %d\n",num1,num2,num1*num2);
					break;
		case "/" : System.out.printf("%d / %d = %d\n",num1,num2,num1/num2);
					break;
					
		}
	}
}
