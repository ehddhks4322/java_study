package ex5_super;

public class Child extends Parent{
	
	public Child(int n) {
		super(n);//�θ�Ŭ������ �����ڴ� ������ �����ϴ�.
		//�θ�����ڿ� �Ķ���Ͱ� �ִٸ� �θ�����ڸ� ������ �� ����.
		System.out.println("�ڽ�(Child)Ŭ����");
	}
	
	@Override
	public int result() {
		
		return super.result();
	}
}
