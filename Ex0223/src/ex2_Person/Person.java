package ex2_Person;

public class Person {
	//������� �̸�, ����, ��ȭ��ȣ�� �� �ٸ��� ������ �̸� ������ �� ���� ����.
	//this : ����(���� Ŭ����)
	//���������� ���������� �̸��� ���� ������ this�� �� ������� �Ѵ�.
	//�޼��� �ȿ����� ���������� �켱�����̱� ������!
	private int age;//��������
	private String name, tel;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {//��������
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
}
