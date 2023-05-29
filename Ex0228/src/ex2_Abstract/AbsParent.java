package ex2_Abstract;

public abstract class AbsParent {
//추상 메서드가 한 개 이상 정의되어 있는 클래스를 추상 클래스라고 하는데
//추상클래스 또한 abstract를 통해 자신이 추상클래스 라는걸 명시해줘야 합니다.
//abstract 접근제한자 class 클래스명{}
//접근제한자 abstract class 클래스명{}

	int value = 100;
	
	public int getValue() {
		return value;
	}
	
	//추상메서드
	//추상메서드의 구성 : 접근제한자 abstract 반환형 메서드명();
				   //abstract 접근제한자 반환형 메서드명();
	//완성된 단계가 아닌 미완성적 개념으로 두고, 나중에 타 클래스 내에서 재정의하여 사용할 수 있도록 만드는 것
	abstract public void setValue(int n);
}
