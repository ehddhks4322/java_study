package ex1_generic;

public class GenEx_main {
	public static void main(String[] args) {
		
		//<>�ȿ��� Ŭ������ ������ �ִ�.
		//int -> Integer
		//char -> Character
		//float -> Float
		//double -> Double
		
		//T�� ���ϴ� Ŭ������ ��� ���ϴ� ������ ��ü�� ����
		GenEx<String> v1 = new GenEx<String>();//T�ڸ��� String�� �����Ѵ�.
		v1.setValue("ȫ�浿");
		System.out.println(v1.getValue());
		
		//������ ������ GenEx��ü�� �����غ���!
		//���׸� Ÿ���� �⺻�ڷ����� �ν����� ���մϴ�.
		//���� �⺻�ڷ���(int,char,float,double)�� ���׸�Ÿ�Կ��� �̿��ϰ��� �� ����
		//Integer,Character,Float,Double���� Ŭ������ �̿��ؾ��Ѵ�.
		//GenEx<Integer> v2 = new GenEx<>(); �ڿ� �ִ� ���׸��� ��������
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
