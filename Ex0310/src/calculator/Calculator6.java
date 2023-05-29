package calculator;

import java.util.ArrayList;

public class Calculator6 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("이름1");
		list.add("이름2");
		list.add("이름3");
		list.add("이름4");
		list.add("이름5");
		list.add("이름6");
		
		//일반적인 출력
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+ ",");
		}
		System.out.println();
		
		//향상된 for문
		for(String name : list) {
			System.out.print(name+",");
		}
		System.out.println();
		
		//forEach()사용하여 출력하기
		//제네릭 메서드로 정의하면 매개변수나 반환타입이 달라도 문제가 되지않는다.
		list.forEach(x -> System.out.print(x+","));
		
		
		
		
		System.out.println();
		list.forEach(System.out::println);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		list2.forEach(i -> System.out.print(i+" "));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
