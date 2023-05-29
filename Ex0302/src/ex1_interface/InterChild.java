package ex1_interface;

public class InterChild implements InterTest{
	//인터페이스를 구현하려면
	//구현하려는 클래스에서 implements라는 키워드를 사용한다.
	
	@Override
	public int getNumber() {
		
		return NUMBER;//InterTest의 상수 NUMBER 반환
	}
	
}
