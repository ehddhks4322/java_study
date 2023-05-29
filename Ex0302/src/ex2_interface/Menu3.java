package ex2_interface;

public interface Menu3 extends Menu1,Menu2{
//인터페이스 끼리는 상속이 가능하다.
//다중 상속이 가능하다.
	abstract public String boggembab();
	
//다른 인터페이스의 메서드를 구현하는것은 불가능하다.
}
