package ex4_charStream;

import java.io.FileWriter;
import java.io.IOException;

public class Ex3_FileWriter {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("D:\\java_study\\fileWriter예제.txt");
			
			fw.write("첫번째 줄 작성합니디.");
			fw.write("\n");
			fw.write("두번쨰 줄도 문제 없다\n");
			
			fw.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
