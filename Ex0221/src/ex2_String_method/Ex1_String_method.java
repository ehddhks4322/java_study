package ex2_String_method;

public class Ex1_String_method {
	public static void main(String[] args) {
		//메서드(method) : 어떠한 기능을 가지고 있는 명령문의 집함
		//메서드를 사용하는 가장 큰 이유는 반복적으로 사용되는 코드를 줄이기 위해서이다.
		//자주 사용되는 내용의 코드를 메서드로 작성해 두고 필요할때마다 호출만 하면 된다.
		
		//메서드 호출하는법
		//객체명.함수명()
		String str = "Hong Gil Dong";
		System.out.println("문자열의 길이 : " + str.length()); //결과 : 13
		
		int index = str.indexOf('n');
		System.out.println("맨 처음 문자 n의 위치 : " + index); //결과 : 2
		
		char c = str.charAt(2);
		System.out.println("추출한 문자 : " + c);//결과 : n
		
		String str2 = str.substring(0,4); //결과 : hong
		System.out.println("잘라낸 문자열 : " + str2);
		
		
		//split() : 소괄호안에 적힌걸 기준으로 문자열을 나눠서 배열에 넣어주는 기능
		String [] str3 = str.split(" ");
		
		for(int i = 0; i < str3.length; i++) {
			System.out.printf("str[%d] : %s\n",i,str3[i]);
		}
		System.out.println(str);
		str =" Hong Gil Dong ";
		
		//trim() : 문자열의 앞뒤 공백을 제거해주는 기능
		System.out.println(str.trim());
		
		
		//String클래스에 속해있는 메서드는 아니지만 유용한 메서드
		//문자열로 작성된 숫자를 실제 정수로 바꿔주는 코드
		String number = "1";
		System.out.println(Integer.parseInt(number)+10);
		
		//실제 정수를 문자열로 바꿔주는 코드
		int number2 = 1;
		System.out.println(Integer.toString(number2)+10);
		
		
		
		
		
	}
}
