package ex2_multi_array;

import java.util.Scanner;

public class Ex2_multi_array {
	public static void main(String[] args) {
		//다음 2차원 배열의 총합과 평균을 구하세요.
		int arr[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
		
		int total = 0;
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
				count++;
			}
		}
		System.out.println("배열의 총합 : " + total);
		System.out.println("평균 : " + (float)total/count);
		
		
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
		
		Scanner sc = new Scanner(System.in);
		System.out.println("등록할 인원 수 : ");
		int n = sc.nextInt();
		
		String str[][] = new String[n][3];
		
		for(int i = 0; i < str.length; i++) {
			System.out.println("이름 : ");
			str[i][0] = sc.next();
			
			System.out.println("수학 : ");
			str[i][1] = sc.next();
			
			System.out.println("영어 : ");
			str[i][2] = sc.next();
			
			System.out.println("----------");
		}
		
		System.out.println(str.length + "명  등록 완료!!");
		
		for(int i = 0; i < str.length; i++) {
			for(int j = 0; j < str[i].length; j++) {
				System.out.println(str[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}
}
