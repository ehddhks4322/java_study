package ex1_computer;

public class Computer {
	private String brand = "Samsung";
	int ssd = 512;
	
	//setter&getter
	//setter&getter : ������ ���Ұ� ���� ������ ��ġ���� �������� �ٲ� ��
	//������private���� ������� ������ ���� �����ϰų� ��ȸ�ϰ� ���� �� ����ϴ� �޼����� ����
	
	public void setBrand(String a) {//private�� �ִ� ���� �����Ѵٰ� �ؼ� setter
		brand = a;
	}
	
	public String getBrand() {//private�� �ִ� ���� �����´ٰ� �ؼ� getter
		return brand;
	}
}
