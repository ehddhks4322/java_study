package ex6_car;

public class CarMain {
	public static void main(String[] args) {
		//Car클래스는 gasGauge변수를 갖고 있고
		//잔여 가스량을 출력하는 함수인 showCurrentGauge()를 갖고 있다.
		
		//HybridCar클래스는 electricGauge변수를 갖고있고, Car클래스를 상속받고
		//생성자를 생성할 때 gasGauge,electricGauge를 파라미터로 받는다.
		//메서드는 오버라이딩을 이용하여 잔여 가스량과 잔여 전기량을 출력
		
		//HybridWaterCar클래스는 waterGauge변수를 갖고 있고, HybridCar를 상속받는다.
		//생성자를 생성할 때 gasGauge,eletricGauge,waterGauge를 파라미터로 받는다.
		//메서드는 오버라이딩을 하여 잔여 가스,전기,물의양을 출력
		
		//main에서 HybridWaterCar 객체를 생성하여 다음과 같은 결과를 출력하시오.
		
		//잔여가스량 : 15
		//잔여전기량 : 30
		//잔여물의양 : 25
		
		HybridWaterCar hwc = new HybridWaterCar(15, 30, 25);
		hwc.showCurrentGauge();
	}
}
