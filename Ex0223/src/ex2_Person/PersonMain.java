package ex2_Person;

public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person();//����� ��ü ����
		
		//��ü p1�� setter�� ���� ������ �����Ѵ�.
		p1.setName("ȫ�浿");
		p1.setAge(20);
		p1.setTel("010-1111-1111");
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p1.getTel());
		System.out.println("-------------------");
		
		Person p2 = new Person();
		
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		System.out.println(p2.getTel());
		System.out.println("-------------------");
		
	}
}
