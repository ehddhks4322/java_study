package ex3_while;

public class Ex2_do_while {
	public static void main(String[] args) {
		//do-while : 선처리 후비교
		//조건에 맞지 않는 명령일지라도 무조건 한번은 수행을 하고
		//빠져나갑니다. 제어문중에서 유일하게 뒤에 세미콜론(;)을 붙여야 하는 문법
		
		//기본형
		//do{
		//		반복하고자 하는 명령
		//}while(조건식);
		
		int i = 11;
		
		do {
			System.out.println(i);
		}while(i <= 10);
		
		

	}

}
