package ex2_Abstract;

public abstract class AbsParent {
//�߻� �޼��尡 �� �� �̻� ���ǵǾ� �ִ� Ŭ������ �߻� Ŭ������� �ϴµ�
//�߻�Ŭ���� ���� abstract�� ���� �ڽ��� �߻�Ŭ���� ��°� �������� �մϴ�.
//abstract ���������� class Ŭ������{}
//���������� abstract class Ŭ������{}

	int value = 100;
	
	public int getValue() {
		return value;
	}
	
	//�߻�޼���
	//�߻�޼����� ���� : ���������� abstract ��ȯ�� �޼����();
				   //abstract ���������� ��ȯ�� �޼����();
	//�ϼ��� �ܰ谡 �ƴ� �̿ϼ��� �������� �ΰ�, ���߿� Ÿ Ŭ���� ������ �������Ͽ� ����� �� �ֵ��� ����� ��
	abstract public void setValue(int n);
}
