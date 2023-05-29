package ex2_interface;

public class Kitchen implements Menu3/*Menu1,Menu2*/{
//클래스는 여러개의 인터페이스를 구현할 수 있다.
	
	@Override
	public String jajang() {
		
		return "중면 + 춘장 + 완두콩";
	}

	@Override
	public String boggembab() {
		
		return "밥 + 계란 + 춘장";
	}

	@Override
	public String tangsuyouck() {
		
		return "돼지고기 + 양념 + 당근";
	}

	@Override
	public String jjambbong() {
		
		return "중면 + 청경채 + 홍합 ";
	}

}
