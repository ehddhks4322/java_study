package ex1_File;

import java.io.File;

public class ex3_File {
	public static void main(String[] args) {
		String path = "D:\\java_study\\aaa\\bbb";
		
		File f = new File(path);
		
		//����Ŭ������ �������������� �������� �ʴ� ��ΰ� ���ԵǾ��ִ��� �Ǵ��� �� �ִ�.
		//exists() : ���� Ŭ������ path ��η� ã�ư��� ��
		//���������� ������ ������ �����Ѵٸ� true�� ��ȯ
		if(!f.exists()) {
			System.out.println("���� ����");
			f.mkdirs();//������ ������ִ� �޼���
		}
		
		//���� Ŭ������ Ư�� ������ ����ų�, Ư�� ������ ����ִ� ������ �о���°���
		//�Ұ����ϴ�.
	}
}
