package ex2_function;

import java.util.ArrayList;

public class Ex1_function {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i <=10; i++) {
			list.add(i);
		}
		
		//리스트 안에 들어있는 요소를 제거할 때 
		//list.remove();
		
		list.removeIf(t -> t % 2 == 0);//홀수만 반환
		System.out.println(list);
	}
}
