package ex1_enum;

public class Ex2_enum {
	public static void main(String[] args) {
		Item start = Item.START;
		String str = start.getItemstr();
		System.out.println(str);
		
		//향상된 for문을 이용하여 열거형의 전체 내용 출력하기
		Item[] items = Item.values();
		for(Item item : items) {
			System.out.println(item.getItemstr()+","+item.getSymbol());
		}
	}
}
