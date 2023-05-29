package ex1_object;

public class ObjectMain {
	public static void main(String[] args) {
		Ex1_Object v1 = new Ex1_Object();
		v1.setValue("TEST");
		//인자가 Object이지만 String이 Object를
		//상속받았으므로 인자가 가능하다.
		
		System.out.println(v1.getValue());
		
		//정수(int)를 인자로 넣어보자.
		Ex1_Object v2 = new Ex1_Object();
		
		v2.setValue(100);//AutoBoxing(자동 형변환 : 기본자료형 -> 객체)
		
		//UnBoxing : 객체 -> 기본자료형
		int i = (int)v2.getValue();
		System.out.println(i+1);
	}
}
