package ex1_annotation;

public class Ex1_annotation {
	
	//어노테이션
	//프로그램의 소스코드 안에 다른 프로그램을 위한 정보를 미리
	//약속된 형식으로 포함시킨 것
	//어노테이션은 주석(comment)처럼 프로그래밍 언어에 영향을 미치지 않으면서도 다른 프로그램에게
	//유용한 정보를 제공할 수 있다는 장점이 있다.
	///어노테이션의 뜻은 주석, 주해, 메모이다.
	
	//1. 표준 어노테이션
	//JDK가 제공
	//컴파일시 컴파일러에게 정보제공
	//@Override : 컴파일러에게 재정의하는 메서드라는 것을 알린다.
	//@Deprecated : 앞으로 사용되지 않을 문법을 권장하는 대상에게 붙인다. 더이상 사용하지 않을 메서드에 쓰는 것 (클래스도 포함) (사용을 못하는게 아니라 이건 더이상 쓰지 않을것이라고 경고를 하는 것)
	//@SuppressWarnings : 경고를 무시해준다.
	//@FunctionalInterface : 람다식(인터페이스 - 추상메서드가 하나만 정의된 인터페이스)
	
	public static void main(String[] args) {
		
		Integer num1 = new Integer(9);
		
	}
}
