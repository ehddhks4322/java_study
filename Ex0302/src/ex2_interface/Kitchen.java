package ex2_interface;

public class Kitchen implements Menu3/*Menu1,Menu2*/{
//Ŭ������ �������� �������̽��� ������ �� �ִ�.
	
	@Override
	public String jajang() {
		
		return "�߸� + ���� + �ϵ���";
	}

	@Override
	public String boggembab() {
		
		return "�� + ��� + ����";
	}

	@Override
	public String tangsuyouck() {
		
		return "������� + ��� + ���";
	}

	@Override
	public String jjambbong() {
		
		return "�߸� + û��ä + ȫ�� ";
	}

}
