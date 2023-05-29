package ex1_enum;

public enum Transportation {
	//추상메서드를 만들면 구현을 해야 합니다.
	//익명클래스로 구현
	BUS(100){
		@Override
		int totalFare(int distance) {
			return fare*distance;
		}
	},
	TRAIN(150){
		@Override
		int totalFare(int distance) {
			return fare*distance;
		}
	},
	SHIP(200){
		@Override
		int totalFare(int distance) {
			return fare*distance;
		}
	},
	AIRPLANE(250){
		@Override
		int totalFare(int distance) {
			return fare*distance;
		}
	};
	
	protected final int fare;
	
	private Transportation(int fare) {
		this.fare = fare;
	}
	
	abstract int totalFare(int distance);
}
