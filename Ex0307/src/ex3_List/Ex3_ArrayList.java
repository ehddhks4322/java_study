package ex3_List;

import java.util.ArrayList;

public class Ex3_ArrayList {
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		
		Person p1 = new Person();
		p1.setName("È«±æµ¿");
		p1.setAge(30);
		p1.setHeight(180.5);
		
		Person p2 = new Person();
		p2.setName("±è°³¶Ë");
		p2.setAge(40);
		p2.setHeight(158.8);
		
		list.add(p1);
		list.add(p2);
		
//		System.out.println(list.get(0).name);//list.get(0).name = p1.name
//		System.out.println(list.get(0).age);//list.get(0).age = p1.age
//		System.out.println(list.get(0).height);//list.get(0).height = p1.height
//		
//		System.out.println(list.get(1).name);//list.get(1).name = p2.name
//		System.out.println(list.get(1).age);
//		System.out.println(list.get(1).height);
		
		for(int i = 0; i < list.size(); i++) {
			Person vo = list.get(i);
			System.out.println(vo.getName());
			System.out.println(vo.getAge());
			System.out.println(vo.getHeight());
			System.out.println("-------------");
		}
		
		
		
		
		
		
		
		
	}
}
