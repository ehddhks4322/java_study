package ex1_computer;

public class ComMain {
	public static void main(String[] args) {
		Computer com1 = new Computer();
		com1.ssd  = 1024;//클래스의 변수까지 접근하는게 너무 간단하다.
		//com1.brand = "apple";//바뀌면 안되는 애들도 바뀌는 상황에서는 단점
		
		com1.setBrand("LG");
		//System.out.println(com1.brand);//값을 함부로 바꿀수 없지만 호출도 안됨
		System.out.println(com1.getBrand());
	}
}
