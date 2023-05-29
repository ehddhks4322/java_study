package ex8_JMenu;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Ex1_JMenuTest {
	public static void main(String[] args) {
		JFrame f = new JFrame("JMenuTest");
		
		JMenuBar jmb = new JMenuBar();
		JMenu jm1 = new JMenu("파일");
		JMenu jm2 = new JMenu("편집");
		JMenu jm3 = new JMenu("보기");
		
		JMenuItem jmi1 = new JMenuItem("새로만들기");
		JMenuItem jmi2 = new JMenuItem("열기");
		JMenuItem jmi3 = new JMenuItem("저장");
		
		jm1.add(jmi1);
		jm1.add(jmi2);
		jm1.add(jmi3);
		
		JMenuItem jmi4 = new JMenuItem("잘라내기");
		JMenuItem jmi5 = new JMenuItem("복사");
		JMenuItem jmi6 = new JMenuItem("붙여넣기");
		
		jm2.add(jmi4);
		jm2.add(jmi5);
		jm2.add(jmi6);
		
		jmb.add(jm1);
		jmb.add(jm2);
		jmb.add(jm3);
		
		f.setJMenuBar(jmb);
		
		//프레임이 보여질 위치와 크기 정하기
		f.setBounds(300,200,300,200);//x,y,너비,높이
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		
		
	}
}
