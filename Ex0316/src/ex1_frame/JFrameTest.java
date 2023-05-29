package ex1_frame;

import javax.swing.JFrame;

public class JFrameTest extends JFrame{
	
	public JFrameTest() {
		super("제목");
		setBounds(300,300,300,200);//x,y,너비,높이
		setVisible(true);
	}
}
