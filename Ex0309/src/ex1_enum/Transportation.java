package ex1_enum;

public enum Transportation {
	//�߻�޼��带 ����� ������ �ؾ� �մϴ�.
	//�͸�Ŭ������ ����
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
