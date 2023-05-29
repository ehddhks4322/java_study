package ex6_printf;

public class Ex1_printf {
	public static void main(String[] args) {
		//printf : 문자열과 변수에 들어있는 데이터를 함께 출력할 수 있도록 도와주는 포멧형식
		//f는 format이라는 뜻 입니다.
		
		int su1 = 10;
		int su2 = 7;
		
		// %d : 정수형 데이터를 입력받을 때 사용한다.
		// %c : 문자형 데이터를 입력받을 때 사용한다.
		// %s : 문자열 데이터를 입력받을 때 사용한다.
		// %f : 실수형 데이터를 입력받을 때 사용한다.
		
		System.out.println(su1 + " + " + su2 + " = " + (su1+su2));
		System.out.printf("%d + %d = %d\n",su1,su2,su1+su2);
		
		//제 나이는 30세 입니다.
		int age = 30;
		System.out.printf("제 나이는%d세 입니다.\n",age);
		
		//제 이름은 OOO이고, 제 나이는 OO세이고, 제 키는 OOO.Ocm이고, 제 혈액형은 OO형입니다.
		
		String name = "김동완";
		age = 26;
		double d = 160.0;
		String str = "AB";
		
		System.out.printf("제 이름은 %s이고, 제 나이는 %d세이고, 제 키는 %.1fcm이고, 제 혈액형은 %s형입니다.",name,age,d,str);
		
		
		

	}

}
