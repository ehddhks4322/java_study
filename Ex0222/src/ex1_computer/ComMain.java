package ex1_computer;

public class ComMain {
	public static void main(String[] args) {
		//다른 클래스에 있는 변수와 함수를 사용하기 위해서는 
		//해당 클래스를 객체화 해야 합니다.
		
		//객체 생성하는법
		//클래스명 객체명 = new 클래스명();
		
		//다른 클래스에 있는 변수를 출력하거나 대입하는법
		//객체명.변수명 = 데이터;
		Computer com1 = new Computer(); //컴퓨터 1대 생성
		com1.getInfo();
		Computer com2 = new Computer();
		com2.ram = 128;
		com2.getInfo();
		
	}
}
