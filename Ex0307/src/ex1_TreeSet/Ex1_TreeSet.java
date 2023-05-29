package ex1_TreeSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class Ex1_TreeSet {
	public static void main(String[] args) {
		//TreeSet은 이전탐색트리 중에서도 성능을 향상시킨 레드-블랙트리(Red-Black Tree)로 구현되어있습니다.
		//레드 블랙 트리는 부모노드보다 작은 값을 가지는 노드는 왼쪽 자식으로, 큰 값을 가지는 노드는 오른쪽 자식으로 배치하여
		//데이터의 추가나 삭제 시 트리가 한쪽으로 치우쳐지지 않도록 균형을 맞추어줍니다.
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		//TreeSet<Integer> ts = new TreeSet<Integer>(set1);
		//set1이 가진 모든 값을 TreeSet으로 생성
		
		//TreeSet<Integer> ts = new TreeSet<Integer>(Arrays.asList(1,2,3));
		//초기값을 갖고 TreeSet을 생성
		
		//TreeSet의 요소 추가하기
		ts.add(7);
		ts.add(4);
		ts.add(9);
		ts.add(1);
		ts.add(5);
		
		//TreeSet의 값 삭제
		ts.remove(1);//값 1제거
		
		//TreeSet의 모든 값 제거
		ts.clear();
		
		TreeSet<Integer> ts2 = new TreeSet<Integer>(Arrays.asList(7,4,9,1,5));//초기값 7,4,9,1,5 지정
		
		//TreeSet의 크기 구하기
		System.out.println("트리셋의 크기  : " + ts.size());
		
		//TreeSet의 값 출력하기
		System.out.println(ts2);//정렬이 된 상태로 출력
		
		System.out.println("최소값 출력 : " + ts2.first());
		System.out.println("최대값 출력 : " + ts2.last());
		
		//조건에 충족하는 값이 없다면 null값을 반환한다.
		System.out.println("입력값보다 큰 데이터 중 최소값 출력 : " + ts2.higher(3));
		System.out.println("입력값보다 작은 데이터 중 최대값 출력 : " + ts.lower(3));
		
		//HashSet을 이용하여 5 * 5의 랜덤 빙고판 만들기
		HashSet<Integer> hs = new HashSet<Integer>();
		int[][] board = new int[5][5];
		
		while(true) {
			hs.add(new Random().nextInt(50)+1);
			
			if(hs.size() == 25) {
				break;
			}
		}
		
		//Set구조는 특정 인덱스로 접근할 수 없기 때문에, 내용을 순차적으로 얻어오기 위해서는 
		//iterator라고 하는 반복자를 이용해야 한다.
		
		//Iterator<Integer> 이터레이터명 = 컬렉션객체.iterator();
		Iterator<Integer> it = hs.iterator();
		
		//it.hasNext();
		//iterator안에 다음값이 들어있는지 확인하여
		//있으면 true, 없으면 false
		
		//it.next();
		//iterator의 다음값 가져오기(처음부터 끝까지)
		
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				board[i][j] = it.next();
				System.out.printf("%02d ",board[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
}
