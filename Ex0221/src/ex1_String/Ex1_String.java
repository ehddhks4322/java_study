package ex1_String;

import java.util.Scanner;

public class Ex1_String {
	public static void main(String[] args) {
		//자바로 만들어진 모든 프로그램은 클래스로 이루어져 있다.
		//우리가 문자열을 저장하기 위해 사용했던 String도 자바에 내장되어 있는 클래스 입니다.
		
		//String클래스는 두가지 특징을 가지고 있다.
		//1) 객체 생성방법이 두가지(암시적,명시적)
		//2) 한 번 생성된 문자열의 내용은 변하지 않는다.(불변의 특징)
		
		String s1 = "abc"; //암시적 객체 생성
		String s2 = "abc";
		//이미 앞에 같은 문자열로 생성된 암시적 객체가 있다면
		//앞서 생성된 객체의 주소를 재사용한다.
		
		//암시적 객체 생성을 할 수 있는 클래스는 String밖에 없다.
		//다른 모든 클래스들은 new를 사용하여 명시적 객체 생성을 해야 합니다.
		
		String s3 = new String("abc"); //명시적 객체 생성
		String s4 = new String("abc");
		
		//==연산자는 기본자료형을 비교할 때는 데이터를 사용한다.
		//그러나 객체끼리 비교를 할 때는 주소를 비교하는 연산자로 기능이 바뀐다.
		if(s1 == s2) {
			System.out.println("s1과 s2의 주소가 같습니다.");
		}else {
			System.out.println("s1과 s2의 주소가 다릅니다.");
		}
		
		System.out.println("------------");
		
		if(s1 == s3) {
			System.out.println("s1과 s3의 주소가 같습니다.");
		}else {
			System.out.println("s1과 s3의 주소가 다릅니다.");
		}
		
		System.out.println("------------");
		
		if(s3 == s4) {
			System.out.println("s3과 s4의 주소가 같습니다.");
		}else {
			System.out.println("s3과 s4의 주소가 다릅니다.");
		}
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 : ");
		//스캐너를 통해서 문자열을 입력받아 객체에 저장했을 때
		//주소를 재사용하지 않는다.
		String s5 = sc.next();
		
		System.out.println("------------");
		if(s1 == s5) {
			System.out.println("s1과 s5의 주소가 같습니다.");
		}else {
			System.out.println("s1과 s5의 주소가 다릅니다.");
		}
		
		String greet = "안녕";
		greet += "하세요"; // greet = greet + "하세요";
		System.out.println(greet);
		
		//"하세요"가 뒤에 붙는 순간 "안녕" 뒤에 붙는게 아닌
		//"안녕하세요"라는 메모리를 새로 할당 받는다. 그러면 남아있는 "안녕"이
		//메모리를 낭비할 수 있는데 JVM의 GC가 힙 영역을 돌면서
		//쓰레기 데이터를 처리한다.
		
		
		
		
	}
}
