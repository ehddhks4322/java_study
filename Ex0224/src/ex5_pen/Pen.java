package ex5_pen;

public class Pen {
	int price;
	String brand = "monami";
	String color = "white";
	
	public Pen() {
		price = 1000;
		color = "white";
	}
	
	public Pen(int price, String color) {
		this.price = price;
		this.color = color;
	}
}
