package ex1_enum;

import java.util.Arrays;

public class Ex1_enum {
	public static void main(String[] args) {
		Item[] items = Item.values();
		for(int i = 0; i < items.length; i++) {
			System.out.println(items[i]);
		}
		System.out.println(Arrays.toString(items));
		
		//열거형 순서 반환하기
		//ordinal() : 열거형에 들어있는 상수들을 순서대로 반환
		for(Item item : items) {
			System.out.println("name="+item.name()+",ordinal="+item.ordinal());
			
			
			Item i1 = Item.START;
			Item i2 = Item.valueOf("START");
			//valueOf(String) : String값을 enum에서 가져온다. 없다면 Exception 발생
			Item i3 = Item.valueOf(Item.class,"START");
			//valueOf(클래스.class, String) : 넘겨받은 클래스의 정보에서 String을 찾아서, enum에서 가져온다.
			Item i4 = Item.STOP;
			
			//열거형 상수간의 비교에는 == 만 사용할 수 있다.(상수의 주소를 비교)
			// < , > 와 같은 초과,미만,이상,이하 같은 비교연산자는 사용할 수 없다.
			System.out.println(i1);//결과 : START
			System.out.println(i1 == i2);//결과 : true
			System.out.println(i1 == i4);//결과 : false
			
			switch(i1) {
			case START ://Item.START라고 쓸 수 없다.
				System.out.println("게임 시작");
				break;
			case STOP:
				System.out.println("게임 멈춤");
			case EXIT:
				System.out.println("게임 종료");
				break;
			}
		}
	}
}
