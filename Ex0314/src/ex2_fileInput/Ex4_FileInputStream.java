package ex2_fileInput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex4_FileInputStream {
	public static void main(String[] args) {
		//임의의 경로에 file.txt문서를 만들고
		//아무 내용이나 입력해둔다.
		//file.txt의 내용을 FileInputStream으로 읽어온 뒤,
		//이 값이 회문인지 아닌지를 판별하세요.
		
		String path = "D:\\java_study\\file.txt";
		
		File f = new File(path);
		
		byte[] read = new byte[(int)f.length()];
		
		if(f.exists()) {
			try {
				FileInputStream fis = new FileInputStream(f);
				
				fis.read(read);
				
				String ori = new String(read);
				String rev = "";
				
				for(int i = ori.length()-1; i >= 0; i--) {
					rev += ori.charAt(i);
				}
				
				if(ori.equals(rev)) {
					System.out.println(ori + "는 회문입니다.");
				}else {
					System.out.println(ori + "는 회문이 아닙니다.");
				}
				
				fis.close();
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
	}
}
