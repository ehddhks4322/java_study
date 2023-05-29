package ex2_function;

import java.util.function.BiPredicate;

public class Ex6_function {
	public static void main(String[] args) {
		
//�޼��� ����
//���ٽ��� ���� �����ϰ� ǥ���� �� �ִ�.
//���ٽ��� �ϳ��� �޼��常 ȣ���ϴ� ��쿡�� �޼��� ����(method reference)��� ������� ���ٽ��� �����ϰ� �� �� �ִ�.
//�ϳ��� �޼��常 ȣ���ϴ� ���ٽ��� Ŭ�����̸�::�޼����̸� �Ǵ� ��������::�޼����̸����� �ٲ� �� �ִ�.
//���� Ÿ�� (byte,short,char,int,long,float,double,boolean)�⺻ Ÿ���� �����ϰ� �迭,����,Ŭ����,�������̽� ���� ���Ѵ�.
//���� Ÿ���� �������� ��ü(�޸�)�� �ּҰ� ����ȴ�.
		
//		boolean result = isEqualString("abc","abc",(s1,s2) -> s1.equals(s2));
//		System.out.println(result);
		
		boolean result = isEqualString("abc","abc",String::equals);
		System.out.println(result);
		
	}
	
	public static boolean isEqualString(String s1, String s2, BiPredicate<String, String> predicate) {
		return predicate.test(s1, s2);
	}
}
