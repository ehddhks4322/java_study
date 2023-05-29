package Person;

public class PersonMain {
	//고객의 인적사항을 추가하고, 삭제하고, 확인을 해보자.
	
	//이름,나이,번호를 갖는  Person클래스를 만든다.
	//PersonManager클래스를 만들어서 personMgr()메서드를 만들고
	//아래와 같이 기능 구현하기
	//실행은 PersonMain에서 하기
	
	//결과 :
	//    1. 정보추가
	//    2. 정보삭제
	//    3. 전체정보
	//    4. 종료
	//    항목선택 : 1 <- 정보추가 항목
	//    ----정보추가----
	//	  이름 : 1
	//   나이 : 1
	//   전화 : 1
	//   정보가 저장되었습니다.
	
	//    1. 정보추가
	//    2. 정보삭제
	//    3. 전체정보
	//    4. 종료
	//    항목선택 : 3 <-정보보기 항목
	//    ----전체정보----
	//	   등록인원 1명
	//   이름 : 1
	//   나이 : 1
	//   전화 : 1
	//    1. 정보추가
	//    2. 정보삭제
	//    3. 전체정보
	//    4. 종료
	//    항목선택 : 2 <- 정보삭제
	
	public static void main(String[] args) {
		PersonManager pm = new PersonManager();
		
		pm.personMgr();
	}
}
