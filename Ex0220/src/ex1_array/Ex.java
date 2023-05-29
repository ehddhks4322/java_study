package ex1_array;

import java.util.Random;
import java.util.Scanner;


public class Ex {
	public static void main(String[] args) {
		//1~45의 난수를 발생시켜 로또번호를 생성하는 프로그램 만들기.
		//6개의 숫자가 겹치지 않고 들어가야 합니다.
		
		Random rnd = new Random();
		int lotto[] = new int[6];
		
		System.out.print("로또번호 : ");
		w:for(int i = 0; i < lotto.length; i++) {
			int num = rnd.nextInt(45)+1;
			lotto[i] = num;
			
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					continue w;
				}
			}
			System.out.print(lotto[i] + " ");
		}
		
		System.out.println();
		
		//변수 money에 10 ~ 5000사이의 난수를 발생시켜 넣는다.
		//단 3450,2100,60과 같이 1의 자리는 반드시 0이 되도록 한다.
		
		//발생된 난수 money를 동전으로 바꾸면 각각 동전이 몇 개씩 필요한지 판단하는 코드 작성하기
		
		//가능한 적은 수의 동전을 사용하도록 한다.
		
		int money = rnd.nextInt(500)+10;
		
		money *= 10;
		
		int[] coin = {500,100,50,10};
		
		System.out.println(money + "원");
		for(int i = 0; i < coin.length; i++) {
			int res = money/coin[i];
			System.out.println(coin[i] + "원: " + res);
			money %= coin[i];
		}
		
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
			System.out.print(ch[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		
		//랜덤으로 1~130까지 세 과목에 대해 시험점수를 대입합니다.
		//과목명은 kor,eng,math
		//100점보다 높은 난수가 나오면 다시 난수를 대입하여 세 과목이 모두 100점 이하가 되면
		//출력하는 do-while문을 작성해보세요.
		
		int kor = 0;
		int eng = 0;
		int math = 0;
	
		
		do {
			 kor = rnd.nextInt(130)+1;
			 eng = rnd.nextInt(130)+1;
			 math = rnd.nextInt(130)+1;
		}while(kor > 100 || eng > 100 || math > 100);
		
		System.out.println("국어 : " + kor +"점");
		System.out.println("영어 : " + eng +"점");
		System.out.println("수학 : " + math +"점");
		
		//학생들의 수학과 영어성적을 등록하는 프로그램이 있다.
		//프로그램을 실행하면 몇 명의 정보를 저장할 것인지를 입력받은 후,
		//입력받은 수 만큼 학생들의 이름과 수항성적, 영어성적을 입력받는 프로그램 작성
		
		//예시
		//등록할 인원 수 : 2
		//이름: 홍길동
		//수학: 90
		//영어: 87
		//----------
		//이름: 김길동
		//수학: 70
		//영어: 100
		//----------
		//2명 등록 완료!!
		//홍길동 90 87
		//김길동 70 100
		System.out.print("등록할 인원 수 : ");
		int n = sc.nextInt();
		
		String str[][] = new String[n][3];
		
		for(int i = 0; i < str.length; i++) {
			System.out.print("이름 : ");
			str[i][0] = sc.next();
			
			System.out.print("수학 : ");
			str[i][1] = sc.next();
			
			System.out.print("영어 : ");
			str[i][2] = sc.next();
			
			System.out.println("-----------------");
		}
		
		System.out.println(str.length +"명 등록 완료!!");
		
		for(int i = 0; i < str.length; i++) {
			for(int j = 0; j < str[i].length; j++) {
				System.out.print(str[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//다음 2차원 배열의 총합과 평균을 구하세요.
		int arr[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
		
		int total = 0;
		float average = 0;
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
				count++;
			}
		}
			
		System.out.println("총합 : " + total);
		
		average = (float)total/count;
		
		System.out.println("평균 : " + average);
		
		
		
		//변수 money에 10 ~ 5000사이의 난수를 발생시켜 넣는다.
		//단 3450,2100,60과 같이 1의 자리는 반드시 0이 되도록 한다.
		
		//발생된 난수 money를 동전으로 바꾸면 각각 동전이 몇 개씩 필요한지 판단하는 코드 작성하기
		
		//가능한 적은 수의 동전을 사용하도록 한다.
		
		int money2 = rnd.nextInt(500)+10;
		
		money2 *= 10; 
		
		int coin2[] = {500,100,50,10};
		
		
		System.out.println("금액 : " + money2);
		for(int i = 0; i < coin2.length; i++) {
			int res2 = money2/coin2[i];
			System.out.println(coin2[i] + "원 : " + res2);
			money2 %= coin2[i];
		}
		
		
		
		
	}
}
