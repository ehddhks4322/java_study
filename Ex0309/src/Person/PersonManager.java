package Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PersonManager {
	
	int select;
	Person p;
	
	public void personMgr() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Person> list = new ArrayList<Person>();
		w:while(true) {
			System.out.println("1. 정보추가");
			System.out.println("2. 정보삭제");
			System.out.println("3. 전체정보");
			System.out.println("4. 종료");
			System.out.println("항목선택 : ");
			select = sc.nextInt();
			
			switch(select) {
			case 1 :
				//정보추가
				p = new Person();
				System.out.println("----정보추가----");
				
				System.out.print("이름 : ");
				p.setName(sc.next());
				
				System.out.print("나이 : ");
				p.setAge(sc.nextInt());
				
				System.out.print("번호 : ");
				p.setTel(sc.next());
				
				list.add(p);
				System.out.println("정보가 저장되었습니다.");
				
				
				
				break;
				
			case 2 :
				//정보삭제
				System.out.println("----정보삭제----");
				System.out.println("삭제할 이름 : ");
				String name = sc.next();
				for(int i = 0; i < list.size(); i++) {
					if(list.get(i).getName().equals(name)) {
						list.remove(i);
						System.out.println(name + "이 삭제되었습니다.");
						break;
					}else {
						if(i+1 == list.size()) {
							System.out.println(name + "이 존재하지 않습니다.");
						}
					}
				}
				
				
				
				
				break;
				
			case 3 :
				//전체정보
				System.out.println("----전체정보----");
				System.out.println("등록인원 : " +list.size());
//				for(int i = 0; i < list.size(); i++) {
//					System.out.println("이름 : " + list.get(i).getName());
//					System.out.println("나이 : " + list.get(i).getAge());
//					System.out.println("번호 : " + list.get(i).getTel());
//					System.out.println("---------------------");
//				}
				
				//for문 대신 Iterator를 이용한 while문 사용 가능
				//hasNext -> 다음 요소가 있는지 파악
				//next() -> 요소를 처음부터 끝까지 가져오는 메서드
				Iterator<Person> it = list.iterator();
				while(it.hasNext()) {
					p = it.next();
					System.out.println("이름 : " + p.getName());
					System.out.println("나이 : " + p.getAge());
					System.out.println("번호 : " + p.getTel());
					System.out.println("--------------------");
				}

				break;
				
			case 4 : 
				//종료
				break w;
			
			}
		}
	}
}
