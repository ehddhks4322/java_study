package ex1_object;

public class Ex1_Object {
	//현재 클래스에 특정 메서드가 있습니다.
	//어떨때는 String을 인자로 받고 어떨때는 int형을 인자로 받는다.
	//이렇게 상황에 따라서 다른 인자값을 받아야 한다면
	//클래스 변수를 어떻게 선언해야 할까
	//1. 오버로딩
	//오버로딩을 하는 방법도 있지만 Object를 쓰는 방법도 있다.
	
	Object value;//자바의 최상위 객체인 Object형 변수 생성
	
	public void setValue(Object value) {
		this.value = value;
	}
	
	public Object getValue() {
		return value;
	}
	
}
