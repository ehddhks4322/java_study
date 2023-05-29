package ex5_continue;

public class Ex3_continue {
	public static void main(String[] args) {
		int n = 0;
		
		outer:while(true) {
			if(n >= 10) {
				break;
			}
			while(true) {
				n++;
				if(n % 3 == 0) {
					System.out.println("continue를 만남");
					continue outer;
				}
				System.out.println(n);
			}
		}
		System.out.println();

		
		//switch문에서의 break;
		n = 0;
		w:while(n < 10) {
			n++;
			switch(n) {
			case 1:
				System.out.println("switch문 1번 거쳐감");
				break w;//switch를 빠져나오는 역할을 먼저 수행한다.
						//label을 달아주게되면 기타제어문으로서의 역할을 한다.
			case 2:
				System.out.println("switch문 2번 거쳐감");
				continue;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
