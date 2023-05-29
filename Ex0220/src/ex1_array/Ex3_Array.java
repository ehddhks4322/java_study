package ex1_array;

import java.util.Random;
import java.util.Scanner;

public class Ex3_Array {
	public static void main(String[] args) {
		//배열 arr에 담겨있는 모든 값을 출력하세요
		//결과 : 150
		
		int[] arr = {10,20,30,40,50};
		
		int total = 0;
		
		for(int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		System.out.printf("배열 arr에 담겨있는 모든 값의 합 : %d\n",total);
		
		//프로그램이 실행되면 배열의 길이를 몇으로 할 것인지 물어본다.
		//예를들어 키보드에서 5를 입력받으면
		
		//결과
		
		//배열의 길이는 몇으로..? :5
		//ABCDE
		
		//배열의 길이는 몇으로..? :3
		//ABC
		
		//위와 같은 결과를 출력해주는 코드 작성
		System.out.println("배열의 길이는 몇으로..? : ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		char[] ch = new char[num];
		
		for(int i = 0; i < ch.length; i++) {
			ch[i] = (char)(65+i);
			System.out.print(ch[i]);
		}
		System.out.println();
		System.out.println();
		
		//변수 money에 10 ~ 5000사이의 난수를 발생시켜 넣는다.
		//단 3450,2100,60과 같이 1의 자리는 반드시 0이 되도록 한다.
		
		//발생된 난수 money를 동전으로 바꾸면 각각 동전이 몇 개씩 필요한지 판단하는 코드 작성하기
		
		//가능한 적은 수의 동전을 사용하도록 한다.
		
		Random rnd = new Random();
		
		int money = rnd.nextInt(500)+10;
		money *= 10; // 일의 자리가 없어짐
		
		int[] coin = {500,100,50,10};
		System.out.println("금액 : " + money);
		
		for(int i = 0; i < coin.length; i++) {
			int res = money/coin[i];
			money %= coin[i];
			System.out.println(coin[i]+"원 : "  + res);
		}
		System.out.println();
		
		//1~45의 난수를 발생시켜 로또번호를 생성하는 프로그램 만들기.
		//6개의 숫자가 겹치지 않고 들어가야 합니다.
		
		
		int[] number = new int[6];
		
		System.out.print("로또 번호 : ");
		for(int i = 0; i < number.length; i++) {
			int lotto = rnd.nextInt(45)+1;
			number[i] = lotto;
			for(int j = 0; j < i; j++) {
				if(number[i] == number[j]) {
					
					break;
				}
			}
			System.out.print(number[i] + " ");
		}
		
		
		
		
		
		
		
	}
}
