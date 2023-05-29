package ex3_fileout;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex2_FileOutputStream {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("D:\\java_study\\fileOut.txt",true);
			
			fos.write('f');
			fos.write('i');
			fos.write('l');
			fos.write('e');
			fos.write('\n');
			
			String msg = "fileOutput예제입니다.\n";
			String msg2 = "여러줄도 가능";
			
			//getBytes() : 문자열을 byte[]배열로 반환하는 메서드
			fos.write(msg.getBytes());
			fos.write(msg2.getBytes());
			
			fos.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
