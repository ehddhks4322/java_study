package ex2_fileInput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex1_FileInputStream {
	public static void main(String[] args) {
		//File클래스가 하지 못하는 것들을
		//FileInputStream이 할 수 있다.
		
		//byte 기반의 스트림 -> 1byte씩 읽어온다.
		//...Stream
		//char 기반의 스트림 -> 2byte씩 읽어온다
		//...Reader(읽을 때), ...Writer(저장할 때)
		
		String path = "D:\\java_study\\test.txt";
		File f = new File(path);
		
		if(f.exists()) {//파일이 존재할 때만 수행
			try {
				FileInputStream fis = new FileInputStream(f);
				
				int code = 0;
				//read()메서드가 한번에 1byte씩 읽어오다가
				//더이상 읽어올 단어가 없다면 문장의 끝(End Of File)인 -1을 반환한다.
				//유니코드에도 아스키코드에도 -1에 해당하는 값은 없기 때문에 -1로 정한다.
				while((code = fis.read()) != -1) {
					System.out.print((char)code);
				}
				
				//스트림은 사용이 완료된 후 close를 통해 닫아주는것이 좋다.
				//그래야 다음 작업을 하는데 문제가 생기지 않는다.
				//close를 작성하지 않았을 때, 아직 할 작업이 남았으니까 화면에 띄우거나 
				//파일을 만들면 안되겠구나 하고 착각하는 경우가 있다.
				
				fis.close();
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}
}
