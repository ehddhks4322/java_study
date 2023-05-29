package ex6_comboBox;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Ex1_JComboBox {
	public static void main(String[] args) {
		JFrame f = new JFrame("콤보박스 만들기");
		f.setLayout(null);
		String[] title = {"C","비주얼베이직","Java","자료구조","이산수학"};
		JComboBox<String> jcm1 = new JComboBox<String>(title);
		
		//콤보박스에 데이터 추가하는 법
		jcm1.addItem("Python");
		
		
		jcm1.setBounds(50,50,100,30);
		f.add(jcm1);
		
		
		
		
		
		//프레임이 보여질 위치와 크기 정하기
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setBounds(300,300,300,200);//x,y,너비,높이
		f.setVisible(true);
	}
}
