package ex5_Abstract;

public class Terran extends Unit{
	
	//super() -> Unit() : 부모의 생성자
	//super.name -> Unit.name : 부모의 변수(객체)
	//super -> 부모의 클래스명으로 치환한다.
	
	//공중유닛이면 true 지상유닛이면 false
	boolean fly;
	
	public Terran(String name, int energy, boolean fly) {
		super.name = name;
		super.energy = energy;
		this.fly = fly;
	}
	
	@Override
	public void decEnergy() {
		energy -= 3;
	}

}
