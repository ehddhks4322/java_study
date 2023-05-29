package ex1_array;

public class Ex1_Array {
	public static void main(String[] args) {
		//배열(array): 배열은 같은 자료형의 변수들로 이루어진 유한집합이라고 정의할 수 있습니다.
		//데이터를 효율적으로 관리하기 위해서는 배열이 꼭 필요합니다.
		
		//배열의 선언
		//자료형[] 배열명;
		
		//배열의 생성
		//배열명 = new 자료형[개수(길이)];
		
		//선언과 생성을 동시에
		//자료형[] 배열명 = new 자료형[개수(길이)];
		
		int su1 = 100;
		int su2 = 200;
		int su3 = 300;
		int su4 = 400;
		
		//1)배열의 선언
		int[] ar;
		
		//2)배열의 생성
		ar = new int[4];
		
		//배열에 값을 넣는법
		//배열명[index] = 값;
		ar[0] = 100;
		ar[1] = 200;
		ar[2] = 300;
		ar[3] = 400;
		
		//배열에 값을 넣는법2
		//배열의 초기화
		//배열에 넣은 요소의 개수만큼 알아서 방이 만들어진다.
		//int[] arr = {100,200,300,400,500};
		
		//배열의 출력
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		
		//배열의 출력2
		for(int i = 0; i < 4; i++) {
			System.out.println(ar[i]);
		}
		System.out.println();
		
		//반복문을 통하여 배열에 각자의 방에 값을 대입할 수도 있다.
		for(int i =0; i <4; i++) {
			ar[i] = (i+1)*10;
			System.out.println(ar[i]);
		}
		
		
		
		
		
		
		
		
		
	}
}
