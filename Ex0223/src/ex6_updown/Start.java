package ex6_updown;

import java.util.Random;

public class Start {
//	Start클래스를 생성하여 1~50 사이의 난수를 발생시킨다.
//	메인클래스를 만들고 사용자가 키보드를 통해 정수를 입력받는다.
//	Strat클래스에서 사용자가 입력한 숫자를 판단하여
//	발생한 난수보다 크다면 Down!! 작다면 UP!!을 출력.
//	사용자가 입력한 숫자와 발생한 난수가 같을경우에 프로그램을 종료시키며
//	단, 정답을 맞춘 경우 프로그램의 종료는 Start클래스가 아닌
//	메인클래스에서 이루어 지도록 한다.
//
//	실행한 결과
//
//	숫자입력 : 30
//	Down!!
//	숫자입력 : 15
//	Up!! 
	
	Random rnd = new Random();
	int n = rnd.nextInt(50)+1;
	
	public String number(int num) {
		String str = "";
		if(num == n) {
			str = "종료";
		}else if(num < n) {
			str = "UP";
		}else {
			str = "DOWN";
		}
		return str;
	}
	
	
}
