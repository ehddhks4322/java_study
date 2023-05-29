package ex1_generic;

public class GenEx<T> {
//제네릭스?
//일반적인 코드를 작성하고 이 코드를 다양한 타입의 객체에 대하여 재사용하는 객체 지향 기법입니다.
//객체의 타입을 컴파일할 때 체크하기 때문에 객체의 타입에 대해 안정성을 높이고 형변환을 하는 번거로움을
//줄일 수 있다.
	
	//public class 클래스명<T>{}
	//public interface 인터페이스명<T>{}
	//T를 타입변수라고 하며 Type의 첫글자에서 따왔다.
	//다른 글자를 사용해도 크게 문제는 없다. T 이외에는 E(Element),K(Key),V(Value)를 많이 사용한다.
	T value;
	
	public void setValue(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}
}
