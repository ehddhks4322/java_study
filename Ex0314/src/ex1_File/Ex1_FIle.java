package ex1_File;

import java.io.File;

public class Ex1_FIle {
	public static void main(String[] args) {
		//IO(Input, Output) : ����°� ���õ� ��Ʈ��
		//��Ʈ�� : ������ ������� ���� ���,���
		//���α׷����� ������ �о�´ٵ���, �ֿܼ��� Ű���尪�� ������ ���� �۾��� �� �� �ֽ��ϴ�.
		//�ڹ� ����ӽſ��� �ַܼ� ���� ������ Output, �ݴ�� �ܼ��� ���� JVM���� ������ Input
		
		//���� ��ü�� ������ ���
		String path = "D:\\java_study\\test.txt";
		
		//�غ�� ��η� File��ü ����
		File f = new File(path);
		
		//FileŬ������ �����Ǹ鼭 path��α��� ��Ʈ���� ����
		
		System.out.println(f.length()+ "byte");
		//������ �뷮�� �� �� �ִ�. �ѱ��� 2byte, ����, Ư������ 1byte
		//�����̵� ������ ���� �������� �ش��ϴ� ���� �뷮�� ������ �� �ִ�.
	}
}
