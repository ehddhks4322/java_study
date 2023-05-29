package ex4_charStream;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex2_FileReader {
	public static void main(String[] args) {
		//test.txt파일에 한글,영어(소문자,대문자 포함)를 섞어서 작성
		//test.txt의 내용을 읽어와서
		//내용에 영어의 대문자가 몇개인지, 소문자가 몇개인지
		//개수를 각각 출력하세요
		
		//결과
		//대문자: X개
		//소문자: X개
		
		int up = 0;
		int low = 0;
		
		try {
			FileReader fr = new FileReader("D:\\java_study\\test.txt");
			
			int code = 0;
			
			while((code = fr.read()) != -1) {
				if(code >= 'A' && code <= 'Z') {
					up++;
				}
				if(code >= 'a' && code <= 'z') {
					low++;
				}
			}
			
			System.out.printf("대문자 : %d개\n",up);
			System.out.printf("소문자 : %d개\n",low);
			
			fr.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
