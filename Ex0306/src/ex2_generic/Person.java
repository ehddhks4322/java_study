package ex2_generic;

public class Person<T,M> {
	
	//���׸� Ÿ���� �ΰ� �̻��� ��ƼŸ�� �Ķ���͸� ����� �� �ְ�
	//�� ��� �� Ÿ�� �Ķ���͸� �޸��� ���� �����մϴ�.
	
	//����� ������ ������ ��
	//�̸�,��ȭ��ȣ
	
	private T name;
	private M tel;
	
	public Person(T name, M tel) {
		this.name = name;
		this.tel = tel;
	}

	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}

	public M getTel() {
		return tel;
	}

	public void setTel(M tel) {
		this.tel = tel;
	}
	
	//�� ����� ������ �����ϴ� �ڵ忡�� ��ü���� �̸��� ��ġ�ϸ� true
	//�ٸ��� false, ��ȣ�� ��ġ�ϸ� true, �ٸ��� false�� �޾�
	//������ �ϱ�
}
