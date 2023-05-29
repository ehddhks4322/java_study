package ex2_multi_for;

public class Assignment {

	public static void main(String[] args) {
		//°úÁ¦
		
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
