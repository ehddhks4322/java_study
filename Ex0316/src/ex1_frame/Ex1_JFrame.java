package ex1_frame;

import javax.swing.JFrame;

public class Ex1_JFrame {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		
		//프레임이 보여질 위치와 크기
		jf.setLocation(300, 300);//x,y
		jf.setSize(300, 200);//너비,높이
		
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
}
