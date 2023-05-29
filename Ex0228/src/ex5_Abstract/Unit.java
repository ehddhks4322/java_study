package ex5_Abstract;

public abstract class Unit {
	
	String name; //이름
	int energy; //체력
	
	public int getEnergy() {
		return energy;
	}
	
	//캐릭터가 공격을 당했을 때 체력 감소량은 지금 당장 알수가 없다.
	//언제 어디서 어떻게 공격을 받을지 모르니까.. 그래서 추상메서드로 정의
	
	abstract public void decEnergy();
}
