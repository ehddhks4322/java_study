package ex4_person;

public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동",40,"010-1111-1111");
//		p1.name = "홍길동";
//		p1.age = 40;
//		p1.tel = "010-1111-1111";
//		
		Person p2 = new Person("김길동",30,"010-2222-2222");
		
		
		
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.tel);
		
		Person p3 = new Person();//파라미터를 받는 생성자를 정의한 순간부터
								 //기본생성자는 사용할 수 없습니다.
								 //기본생성자를 따로 정의해 놓는다면 사용할 수 있다.
	}
}
