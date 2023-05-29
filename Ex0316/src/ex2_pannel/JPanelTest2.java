package ex2_pannel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelTest2 {
	public static void main(String[] args) {
		JFrame f = new JFrame("BorderLayout 예제");
		
		JPanel p1 = new JPanel();
		//패널에 배경색 지정하기
		p1.setBackground(Color.YELLOW);
		
		//패널에 레이아웃 정하기
		p1.setLayout(new BorderLayout());
		
		//패널에 버튼 붙히기
		p1.add("North",new JButton("위"));
		p1.add("West",new JButton("왼쪽"));
		p1.add("Center",new JButton("가운데"));
		p1.add("East",new JButton("오른쪽"));
		p1.add("South",new JButton("아래"));
		
		//프레임에 패널 붙히기
		f.add(p1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//프레임이 보여질 위치와 크기 정하기
		f.setBounds(300,300,300,200);//x,y,너비,높이
		f.setVisible(true);
		
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}
