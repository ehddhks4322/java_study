package ex4_ramen;

public class CheeseRamen extends Ramen{

	String cheese = "ġ��";
	@Override
	public void makeRamen() {
		System.out.printf("%s %s %s\n",nudle,soup,cheese);
	}

}
