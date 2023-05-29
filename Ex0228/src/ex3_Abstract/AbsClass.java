package ex3_Abstract;

public abstract class AbsClass {
	
	int value = 100;
	
	public int getValue() {
		return value;
	}
	
	public abstract int changeValue();//추상메서드
}
