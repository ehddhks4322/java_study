package ex1_File;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {
		String path = "D:\\java_study";
		
		File f = new File(path);
		//����Ŭ������ �ι�° ���
		//������������ ������ �� �ش� ������ ���� ��������� �̸��� ������ �� �ֽ��ϴ�.
		
		//���� == ���丮
		//���ĺ� ������ ������ �ؼ� �����ش�.
		if(f.isDirectory()) {
			String[] names = f.list();

			for(String s : names) {
				System.out.println(s);
			}
		}
		
		
		
	}
}
