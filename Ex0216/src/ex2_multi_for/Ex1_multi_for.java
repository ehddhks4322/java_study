package ex2_multi_for;

public class Ex1_multi_for {
	public static void main(String[] args) {
		//다중 for문 : for문 안에 for문이 있는 문장
		
		//기본형
		//for(초기식;조건식;증감식){
		//			for(초기식;조건식;증감식){
		//						반복하고자 하는 명령
		//		}
		//}
		
		for(int i = 1; i <=3; i++) {
			for(int j = 1; j <=3; j++) {
				System.out.println(i + " " +j);
			}//inner
		}//outer
		
		//1 2 3 4
		//1 2 3 4
		//1 2 3 4
		
		for(int i = 1; i <= 3; i++) {//줄의 갯수만큼 반복
			for(int j = 1; j <= 4; j++) {//찍어줘야 하는 숫자 개수 만큼 반복
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		//1 1 1 1
		//1 1 1 1
		//1 1 1 1
		
		for(int i = 1; i <=3; i++) {
			for(int j = 1; j <=4; j++) {
				System.out.print(1 + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		//1 2 3 4
		//5 6 7 8
		//9 10 11 12
		
		int num = 1;
		
		for(int i = 1; i <=3; i++) {
			for(int j = 1; j<=4; j++) {
				System.out.print(num++ + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		//A B C D
		//A B C D
		//A B C D
		
		for(int i = 1; i<=3; i++) {
			for(int j = 65; j<69; j++) {
				System.out.print((char)j+ " ");
			}
			System.out.println();
		}
		System.out.println();
		
	
		for(int i = 1; i <=10; i++) {
			System.out.print(i + " ");
			
			for(int j = 1; j < 10; j++) {
				if(j+i > 10) {
					System.out.print(j + i-10 + " ");
				}else {
					System.out.print(j + i + " ");
				}
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}
}
