package ex6_car;

public class Car {
	
	int gasGauge;
	
	public Car(int gasGauge) {
		this.gasGauge = gasGauge;
	}
	
	public void showCurrentGauge() {
		System.out.println("ÀÜ¿© °¡½º·® : " + gasGauge);
	}
}
