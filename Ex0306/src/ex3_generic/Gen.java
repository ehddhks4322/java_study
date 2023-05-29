package ex3_generic;

public class Gen {
//제네릭 메서드
//메서드의 선언부에서 제네릭타입이 선언된 메서드를 제네릭 메서드라고 합니다.
//선언 위치는 반환형 바로 앞입니다.
	
//public <T> void 메서드명(클래스명<T> 객체명){
//
//}
	
//제네릭타입 <T>를 갖는 printArr메서드를 생성한다.
//printArr메서드 내부에서 배열을 순차적으로 보여줄 수 있게 하는 코드를 작성
	
//GenMain클래스를 만들어 Integer[],Double[],Character[]을 각각 만든 뒤
//Gen클래스의 printArr메서드를 호출하여 배열의 내용을 출력하도록 하자.
	
//결과
//1 2 3 4 5
//1.1 2.2 3.3 4.4 5.5
//A B C D E
	
	public <T> void printArr(T[]arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
