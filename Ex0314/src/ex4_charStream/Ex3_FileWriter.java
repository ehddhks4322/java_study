package ex4_charStream;

import java.io.FileWriter;
import java.io.IOException;

public class Ex3_FileWriter {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("D:\\java_study\\fileWriter����.txt");
			
			fw.write("ù��° �� �ۼ��մϵ�.");
			fw.write("\n");
			fw.write("�ι��� �ٵ� ���� ����\n");
			
			fw.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
