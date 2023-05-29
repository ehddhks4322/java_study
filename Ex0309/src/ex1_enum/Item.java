package ex1_enum;

public enum Item {
	//열거형은 상수를 가지고 생성되는 객체들을 한곳에 모아둔 묶음이다. (상수 -> 변하지 않는 값을 의미한다.)
	//상수들은 사용자가 지정한 이름으로부터 0부터 순차적으로 증가한다(index값을 가진다)
	//클래스처럼 보이게 하는 상수
	//서로 관련있는 상수들끼리 모아 상수들을 정의하는 것
	START("시작","s"),STOP("멈춤","p"),EXIT("종료","e");//작성한 순서대로 값을 부여받는다.
	
	String itemStr;
	String symbol;
	//상수에 값을 직접 넣으려면 생성자를 정의해줘야 합니다.
	Item(String str, String symbol) {//private로 만들어져서 생성자를 외부에서 호출할 수 없다.
		this.itemStr = str;
		this.symbol = symbol;
	}
	
	public String getItemstr() {
		return itemStr;
	}
	
	public String getSymbol() {
		return symbol;
	}
	}
