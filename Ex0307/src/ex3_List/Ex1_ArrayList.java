package ex3_List;

import java.util.ArrayList;

public class Ex1_ArrayList {
	public static void main(String[] args) {
		//C언어의 LinkedList에서 넘어온 개념에서 단점을 보완해서 나온 개념입니다.
		
		//List -> 컬렉션 인터페이스
		//ArrayList : *index제한 없이* 값을 추가하거나 제거하는 용도의 클래스
		//중복된 값을 무시하지 않고 추가
		//index번호를 가지고 있다.(제일 중요!!)
		
		//배열은 크기가 정해져야만 한다.
		//하지만 ArrayList구조는 size가 늘었다 줄었다 유동적이다.
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//ArrayList에 요소 추가하기
		list.add(100);
		list.add(100);
		list.add(20);
		System.out.println(list);
		
		//ArrayList에서  요소 하나 가져오기
		System.out.println("list.get(2) : " + list.get(2));
		
		//for문을 사용하여 ArrayList가 가진 모든 요소에 접근하기
		for(int i = 0; i < list.size(); i ++) {
			System.out.print(list.get(i)+ " ");
		}
		System.out.println();
		
		//개선된 for문(개선된 roop문)
		//배열 list와 같은 순차적 index 구조로 자동으로 접근하여 요소를 출력해줍니다.
		//특정 index로 직접적인 접근이 불가능하기 때문에 특정 index 에 대한 수정이나
		//제어가 불가능하다.
		for(int i : list) {
			System.out.print(i + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
