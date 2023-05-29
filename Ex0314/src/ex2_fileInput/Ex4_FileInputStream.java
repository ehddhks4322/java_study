package ex2_fileInput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex4_FileInputStream {
	public static void main(String[] args) {
		//������ ��ο� file.txt������ �����
		//�ƹ� �����̳� �Է��صд�.
		//file.txt�� ������ FileInputStream���� �о�� ��,
		//�� ���� ȸ������ �ƴ����� �Ǻ��ϼ���.
		
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
					System.out.println(ori + "�� ȸ���Դϴ�.");
				}else {
					System.out.println(ori + "�� ȸ���� �ƴմϴ�.");
				}
				
				fis.close();
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
	}
}
