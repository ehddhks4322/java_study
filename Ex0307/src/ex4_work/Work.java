package ex4_work;

import java.util.ArrayList;
import java.util.Scanner;

public class Work {
	public static void main(String[] args) {
		//아래의 결과를 도출하세요
		//아이디 생성 : abc
		//abc
		
		//아이디 생성 : abc2
		//abc abc2
		
		//아이디 생성 : abc3
		//abc abc2 abc3
		
		//아이디 생성 : ...
		//...
		
		//중복된 아이디를 검사하는 로직 추가하기
		//아이디 생성 : abc
		//abc
		
		//아이디 생성 : abc
		//중복된 아이디 입니다.
		
		//아이디 생성 : 
		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		w:while(true) {
			System.out.print("아이디 생성 : ");
			String id = sc.next();
			
			//id중복체크
//			for(int i = 0; i <list.size(); i++) {
//				if(id.equals(list.get(i))) {
//					System.out.println("중복된 id");
//					continue w;
//				}
//			}
			
			if(list.contains(id)) {
				System.out.println("중복된 아이디 입니다.");
				continue w;
			}
			
			list.add(id);
			for(int i = 0; i <list.size(); i++) {
				System.out.print(list.get(i)+ " ");
			}
			System.out.println();
		}
	}
	
}
