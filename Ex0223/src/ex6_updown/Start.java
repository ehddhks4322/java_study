package ex6_updown;

import java.util.Random;

public class Start {
//	StartŬ������ �����Ͽ� 1~50 ������ ������ �߻���Ų��.
//	����Ŭ������ ����� ����ڰ� Ű���带 ���� ������ �Է¹޴´�.
//	StratŬ�������� ����ڰ� �Է��� ���ڸ� �Ǵ��Ͽ�
//	�߻��� �������� ũ�ٸ� Down!! �۴ٸ� UP!!�� ���.
//	����ڰ� �Է��� ���ڿ� �߻��� ������ ������쿡 ���α׷��� �����Ű��
//	��, ������ ���� ��� ���α׷��� ����� StartŬ������ �ƴ�
//	����Ŭ�������� �̷�� ������ �Ѵ�.
//
//	������ ���
//
//	�����Է� : 30
//	Down!!
//	�����Է� : 15
//	Up!! 
	
	Random rnd = new Random();
	int n = rnd.nextInt(50)+1;
	
	public String number(int num) {
		String str = "";
		if(num == n) {
			str = "����";
		}else if(num < n) {
			str = "UP";
		}else {
			str = "DOWN";
		}
		return str;
	}
	
	
}
