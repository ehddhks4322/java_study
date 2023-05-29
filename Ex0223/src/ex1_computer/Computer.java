package ex1_computer;

public class Computer {
	private String brand = "Samsung";
	int ssd = 512;
	
	//setter&getter
	//setter&getter : 영원히 변할것 같지 않지만 피치못할 사정으로 바뀔 때
	//목적은private으로 만들어진 변수의 값을 변경하거나 조회하고 싶을 때 사용하는 메서드의 개념
	
	public void setBrand(String a) {//private에 있는 값을 세팅한다고 해서 setter
		brand = a;
	}
	
	public String getBrand() {//private에 있는 값을 가져온다고 해서 getter
		return brand;
	}
}
