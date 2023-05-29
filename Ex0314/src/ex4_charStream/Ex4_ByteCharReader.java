package ex4_charStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;



public class Ex4_ByteCharReader {
	public static void main(String[] args) {
		//byte��� ��Ʈ���� char����� ��Ʈ���� ����
		
		File f = new File("D:\\java_study\\work\\Ex0302\\src\\ex1_interface\\InterChild.java");
		
		try {
			FileInputStream fis = new FileInputStream(f);
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			
			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			
			if(fis != null) {
				fis.close();
			}
			if(br != null) {
				br.close();
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
