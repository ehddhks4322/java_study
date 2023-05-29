package ex2_Abstract;

public class AbsMain {
	public static void main(String[] args) {
		
		
		//AbsParent ap = new AbsParent();
		
		AbsChild ac = new AbsChild();
		ac.setValue(100);
		ac.getValue();
		
		//추상클래스를 상속받았기 때문에 추상클래스에 있는 일반메서드도 문제없이 사용할 수 있다.
		System.out.println(ac.getValue());
	}
}
