package ex3_List;

import java.util.ArrayList;

public class Ex2_ArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(10);
		list.add(1,14);
		list.add(1,20);//기존 index의 값은 오른쪽으로 한칸 밀리게 된다.
		list.set(2,30);//index 2번의 값을 30으로 수정
		
		System.out.println(list);
		
		//ArrayList에 요소 제거하기
		list.remove(1);//index 1번에 있는 요소 제거하기
		//중간에 있는 요소를 제거하면 왼쪽으로 한칸씩 당겨진다.
		
		
		//ArrayList에 요소의 인덱스값 알아내기
		//중복된 값의 경우 가장 먼저 만나는 요소의 인덱스를 반환
		//기본적인 탐색 방향은 왼쪽에서 오른쪽
		System.out.println("30의 index : " + list.indexOf(30));
		
		//오른쪽에서 왼쪽으로 탐색하면서 가장 먼저 만나는 요소의 index를 반환
		System.out.println("lastIndexOf 10의 index : " + list.lastIndexOf(10));
		
		//ArrayList에 요소가 포함되어있는지 확인
		list.contains(30);//있으면 true, 없으면 false를 반환
		
		//ArrayList 비우기
		if(list.removeAll(list)) {
			System.out.println("list 비워짐");
		}
		list.clear();
		
		//ArrayList가 비어있는지 확인
		list.isEmpty();//비워져 있으면 true, 비워져있지 않으면 false를 반환
		
		
		System.out.println(list);
		
		
		
		
	}
}
