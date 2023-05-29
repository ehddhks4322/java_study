package ex3_while;

public class Ex1_while {
	public static void main(String[] args) {
		//while : for문보다는 간편한 구성을 가진 반복문(선비교 후처리)
		//기본형
		//while(조건식){
		//		반복하고자 하는 명령
		//}
		
		int num = 1;
		
		while(num <=10) {
			System.out.println(num);
			num++;//변수의 값을 증감시켜주는 증감식
		}
		System.out.println();
		
		//while문의 중첩
		int n1 = 1;
		int n2 = 1;
		
		while(n1 <= 3) {
				n2 = 1;
			while(n2 <= 3) {
				System.out.println(n1 + " " + n2);
				n2++;
			}
			n1++;
		}
		System.out.println();
		
		//1~10까지의 총합을 while문으로 작성하기
		
		int n = 1; //시작값
		
		int total = 0; //총합을 담아줄 변수
		
		while(n <=10) {
			total += n;
			n++;
		}
		System.out.println("1~10까지의 총합 : " + total);
		
		
		
		
		

	}

}
