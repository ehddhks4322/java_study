package ex1_if;

public class Ex2_if_else {
	public static void main(String[] args) {
		//if - else
		
		//�⺻��
		//if(���ǽ�){
		//		  ���ǽ��� ���� �� ������ ���
		//} else {
		//		 ���ǽ��� ���� �ƴ� �� ������ ���
		//}
		
		int n = 49;
		String str = "";
		
		if(n >= 50) {
			str = "n�� 50�̻��� ��";
		} else { //else������ ������ ���� �ʴ´�.
			str = "n�� 50�̸��� ��";
		}
		
		System.out.println(str);
		
		//���� age�� ���̸� �����ϰ�, 30�� �̻��̸�
		//"��Ǹ�ŭ ��̳׿�", �׷��� ������ "�� ��ŵ� �ǰڳ׿�"�� 
		//����ϴ� ���ǹ� �ۼ��ϱ�
		//�׸��� ���������� "�����մϴ�"��� ���� ����ϱ�
		
		int age = 26;
		String str1 = "";
		
		if(age >= 30) {
			str1 = "��Ǹ�ŭ ��̳׿�";
		}else {
			str1 = "�� ��ŵ� �ǰڳ׿�";
		}
		
		System.out.println(str1);
		System.out.println("�����մϴ�.");
		
		//�� ���ǹ� �ڵ带 ���׿����ڷ� �ٲٱ�
		
		str = age >= 30 ? "��Ǹ�ŭ ��̳׿�" : "�� ��ŵ� �ǰڳ׿�";
		System.out.println(str);
	}
}
