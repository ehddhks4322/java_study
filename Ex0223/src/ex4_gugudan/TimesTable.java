package ex4_gugudan;

public class TimesTable {
	//TimesTableŬ������ ����� showTable()�޼��带 �����Ѵ�.
	//showTable()�޼��忡�� �������� ����ϴ� �ڵ� �ۼ�
	
	//TimesTableMainŬ������ ����� TimesTable��ü�� �����ϰ� �̸� �̿��Ͽ� �Ʒ��� ���� ��� ����ϱ�
	
	//Scanner�� ���� ���� �޴� �۾��� �ݵ�� TimesTableMainŬ�������� �ϵ��� �Ѵ�.
	
	//���
	//����� ���� �Է�:5
	//5��
	//5 * 1 = 5
	//
	
	public void showTable(int n) {
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n",n,i,n*i);
		}
	}
	
	
}
