package ex4_gugudan;

public class TimesTable {
	//TimesTable클래스를 만들고 showTable()메서드를 정의한다.
	//showTable()메서드에는 구구단을 출력하는 코드 작성
	
	//TimesTableMain클래스를 만들어 TimesTable객체를 생성하고 이를 이용하여 아래와 같은 결과 출력하기
	
	//Scanner를 통해 값을 받는 작업은 반드시 TimesTableMain클래스에서 하도록 한다.
	
	//결과
	//출력할 단을 입력:5
	//5단
	//5 * 1 = 5
	//
	
	public void showTable(int n) {
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n",n,i,n*i);
		}
	}
	
	
}
