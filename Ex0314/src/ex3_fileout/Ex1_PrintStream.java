package ex3_fileout;

import java.io.IOException;
import java.io.PrintStream;

public class Ex1_PrintStream {
	public static void main(String[] args) {
		
		//ȭ�鿡 �����͸� ����ϵ��� �ϴ� ��ǥ���� Ŭ����
		PrintStream ps = System.out;
		
		ps.write('A');
		ps.write('B');
		ps.write('\n');//�ƽ�Ű�ڵ� 10��
		ps.write('D');
		System.out.println();
		
		
		try {
			byte[] by = {'J','A','V','A'};
			ps.write(by);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		ps.close();
	}
}
