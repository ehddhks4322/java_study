package ex3_constructor;

public class ConTest {
	
	//생성자 : 객체가 생성될 때 메모리 할당을 위해 호출되는 영역
	//생성자는 객체가 생성될 때 처음 딱 한번만 자동으로 호출된다.
	
	//생성자의 특징
	//클래스와 이름이 완전히 동일하다.
	//반환형이 없다.
	
	public ConTest() {//기본생성자
		System.out.println("나는 기본생성자임");
	}
	
	public ConTest(String name) {
		System.out.println("name이 "+name+" 으로 초기화됨" );
	}
	
}
