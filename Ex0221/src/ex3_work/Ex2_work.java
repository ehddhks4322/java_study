package ex3_work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		//키보드에서 숫자와 특수문자를 제외한 알파벳을 무작위로 입력받는다.
		//입력받은 문자열에 소문자a가 몇개 있는지를 판별하는 코드를 구현해보자.
		
		//예시
		//입력 : asdfasdf
		//a의 개수 : 2
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("알파벳을 입력해주세요 : ");
//		
//		String str = sc.next();
//		
//		int count = 0;
//		
//		for(int i = 0; i < str.length(); i++) {
//			if(str.charAt(i) == 'a') {
//				count++;
//			}
//		}
//		System.out.println("a의 개수 : " + count);
		
		
		//회문구하기
		//회문이란 앞으로 읽어도 , 뒤로 읽어도 똑같이 읽히는 문장을 말합니다.
		
		//키보드에서 문자열을 입력받은 후 해당 문장이 회문인지 아닌지를 판단하는 코드를 구현하세요.
//		System.out.println("문자열을 입력해주세요 : ");
//		String str = sc.next();
//		
//		String rev = "";
//		
//		for(int i = str.length()-1; i >=0; i--) {
//			rev += str.charAt(i); // rev = rev + str.chartAt(i);
//		}
//		
//		if(str.equals(rev)) {
//			System.out.println(str + "는(은) 회문입니다.");
//		}else {
//			System.out.println(str + "는(은) 회문이 아닙니다.");
//		}
		
		//키보드에서 숫자와 특수문자를 제외한 알파벳을 무작위로 입력받는다.
		//입력받은 문자열에 소문자a가 몇개 있는지를 판별하는 코드를 구현해보자.
		
		//예시
		//입력 : asdfasdf
		//a의 개수 : 2
		System.out.println("알파벳을 입력해주세요 : ");
		String str2 = sc.next();
		
		int count = 0;
		
		for(int i = 0; i < str2.length(); i++) {
			if(str2.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println("a의 개수 : " + count);
		
		//회문구하기
		//회문이란 앞으로 읽어도 , 뒤로 읽어도 똑같이 읽히는 문장을 말합니다.
		
		//키보드에서 문자열을 입력받은 후 해당 문장이 회문인지 아닌지를 판단하는 코드를 구현하세요.
		System.out.println("문장을 입력해주세요 : ");
		String ori = sc.next();
		
		String rev = "";
		
		for(int i = ori.length()-1; i >= 0; i--) {
			rev += ori.charAt(i);
		}
		
		if(ori.equals(rev)){
			System.out.println(ori + "는(은) 회문입니다.");
		}else {
			System.out.println(ori + "는(은) 희문이 아닙니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
