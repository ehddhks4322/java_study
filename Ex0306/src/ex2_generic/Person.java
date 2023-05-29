package ex2_generic;

public class Person<T,M> {
	
	//제네릭 타입은 두개 이상의 멀티타입 파라미터를 사용할 수 있고
	//이 경우 각 타입 파라미터를 콤마를 통해 구분합니다.
	
	//사람의 정보를 지정할 때
	//이름,전화번호
	
	private T name;
	private M tel;
	
	public Person(T name, M tel) {
		this.name = name;
		this.tel = tel;
	}

	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}

	public M getTel() {
		return tel;
	}

	public void setTel(M tel) {
		this.tel = tel;
	}
	
	//위 사람의 정보를 저장하는 코드에서 객체들의 이름이 일치하면 true
	//다르면 false, 번호가 일치하면 true, 다르면 false를 받아
	//논리연산 하기
}
