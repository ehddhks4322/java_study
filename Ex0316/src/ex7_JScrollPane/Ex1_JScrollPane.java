package ex7_JScrollPane;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class Ex1_JScrollPane {
	public static void main(String[] args) {
		JFrame f = new JFrame("스크롤 만들기");
		f.setLayout(new BorderLayout());
		
		
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(10,5));//세로,가로
		int cnt = 1;
		for(int i =1; i <= 10; i++) {
			for(int j = 1; j <= 5; j++) {
				jp.add(new JButton("버튼" + cnt));
				cnt++;
			}
		}
		
		//수직, 수평 스크롤바 설정하기 위한 상수
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;//무조건 스크롤바가 보인다.(Vertical = 수직)
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;//무조건 스크롤바가 보인다.(Horizontal = 수평)
		JScrollPane js = new JScrollPane(jp, v, h);
		
		f.add(js, BorderLayout.CENTER);
		
		
		
		
		
		
		//프레임이 보여질 위치와 크기 정하기
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setBounds(300,300,300,200);//x,y,너비,높이
		f.setVisible(true);
	}
}
