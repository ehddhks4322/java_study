package ex1_enum;

public enum Item {
	//�������� ����� ������ �����Ǵ� ��ü���� �Ѱ��� ��Ƶ� �����̴�. (��� -> ������ �ʴ� ���� �ǹ��Ѵ�.)
	//������� ����ڰ� ������ �̸����κ��� 0���� ���������� �����Ѵ�(index���� ������)
	//Ŭ����ó�� ���̰� �ϴ� ���
	//���� �����ִ� ����鳢�� ��� ������� �����ϴ� ��
	START("����","s"),STOP("����","p"),EXIT("����","e");//�ۼ��� ������� ���� �ο��޴´�.
	
	String itemStr;
	String symbol;
	//����� ���� ���� �������� �����ڸ� ��������� �մϴ�.
	Item(String str, String symbol) {//private�� ��������� �����ڸ� �ܺο��� ȣ���� �� ����.
		this.itemStr = str;
		this.symbol = symbol;
	}
	
	public String getItemstr() {
		return itemStr;
	}
	
	public String getSymbol() {
		return symbol;
	}
	}
