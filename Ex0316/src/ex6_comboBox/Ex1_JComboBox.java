package ex6_comboBox;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Ex1_JComboBox {
	public static void main(String[] args) {
		JFrame f = new JFrame("�޺��ڽ� �����");
		f.setLayout(null);
		String[] title = {"C","���־�����","Java","�ڷᱸ��","�̻����"};
		JComboBox<String> jcm1 = new JComboBox<String>(title);
		
		//�޺��ڽ��� ������ �߰��ϴ� ��
		jcm1.addItem("Python");
		
		
		jcm1.setBounds(50,50,100,30);
		f.add(jcm1);
		
		
		
		
		
		//�������� ������ ��ġ�� ũ�� ���ϱ�
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setBounds(300,300,300,200);//x,y,�ʺ�,����
		f.setVisible(true);
	}
}
