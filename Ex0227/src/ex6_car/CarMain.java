package ex6_car;

public class CarMain {
	public static void main(String[] args) {
		//CarŬ������ gasGauge������ ���� �ְ�
		//�ܿ� �������� ����ϴ� �Լ��� showCurrentGauge()�� ���� �ִ�.
		
		//HybridCarŬ������ electricGauge������ �����ְ�, CarŬ������ ��ӹް�
		//�����ڸ� ������ �� gasGauge,electricGauge�� �Ķ���ͷ� �޴´�.
		//�޼���� �������̵��� �̿��Ͽ� �ܿ� �������� �ܿ� ���ⷮ�� ���
		
		//HybridWaterCarŬ������ waterGauge������ ���� �ְ�, HybridCar�� ��ӹ޴´�.
		//�����ڸ� ������ �� gasGauge,eletricGauge,waterGauge�� �Ķ���ͷ� �޴´�.
		//�޼���� �������̵��� �Ͽ� �ܿ� ����,����,���Ǿ��� ���
		
		//main���� HybridWaterCar ��ü�� �����Ͽ� ������ ���� ����� ����Ͻÿ�.
		
		//�ܿ������� : 15
		//�ܿ����ⷮ : 30
		//�ܿ����Ǿ� : 25
		
		HybridWaterCar hwc = new HybridWaterCar(15, 30, 25);
		hwc.showCurrentGauge();
	}
}
