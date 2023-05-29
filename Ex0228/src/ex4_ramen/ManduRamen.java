package ex4_ramen;

public class ManduRamen extends Ramen{

	String mandu = "¸¸µÎ";
	@Override
	public void makeRamen() {
		System.out.printf("%s %s %s\n",nudle,soup,mandu);
	}

}
