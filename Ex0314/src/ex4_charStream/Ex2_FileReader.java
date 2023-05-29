package ex4_charStream;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex2_FileReader {
	public static void main(String[] args) {
		//test.txt���Ͽ� �ѱ�,����(�ҹ���,�빮�� ����)�� ��� �ۼ�
		//test.txt�� ������ �о�ͼ�
		//���뿡 ������ �빮�ڰ� �����, �ҹ��ڰ� �����
		//������ ���� ����ϼ���
		
		//���
		//�빮��: X��
		//�ҹ���: X��
		
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
			
			System.out.printf("�빮�� : %d��\n",up);
			System.out.printf("�ҹ��� : %d��\n",low);
			
			fr.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
