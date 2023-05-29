package ex1_generic;

public class GenEx_main {
	public static void main(String[] args) {
		
		//<>안에는 클래스만 적을수 있다.
		//int -> Integer
		//char -> Character
		//float -> Float
		//double -> Double
		
		//T에 원하는 클래스를 적어서 원하는 형태의 객체로 생성
		GenEx<String> v1 = new GenEx<String>();//T자리에 String을 지정한다.
		v1.setValue("홍길동");
		System.out.println(v1.getValue());
		
		//정수를 가지는 GenEx객체를 생성해보자!
		//제네릭 타입은 기본자료형을 인식하지 못합니다.
		//따라서 기본자료형(int,char,float,double)을 제네릭타입에서 이용하고자 할 때는
		//Integer,Character,Float,Double등의 클래스를 이용해야한다.
		//GenEx<Integer> v2 = new GenEx<>(); 뒤에 있는 제네릭은 생략가능
		GenEx<Integer> v2 = new GenEx<Integer>();
		v2.setValue(100);
		System.out.println(v2.getValue());
		
		GenEx<Character> v3 = new GenEx<Character>();
		v3.setValue('A');
		System.out.println(v3.getValue());
		
		GenEx<Double> v4 = new GenEx<Double>();
		v4.setValue(3.14);
		System.out.println(v4.getValue());
	}
}
