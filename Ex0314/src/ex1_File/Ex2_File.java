package ex1_File;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {
		String path = "D:\\java_study";
		
		File f = new File(path);
		//파일클래스의 두번째 기능
		//최종목적지가 폴더일 때 해당 폴더가 가진 하위목록의 이름을 가져올 수 있습니다.
		
		//폴더 == 디렉토리
		//알파벳 순서로 정렬을 해서 보여준다.
		if(f.isDirectory()) {
			String[] names = f.list();

			for(String s : names) {
				System.out.println(s);
			}
		}
		
		
		
	}
}
