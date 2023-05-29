package panel1;

import panel2.JPanel01;
import panel2.JPanel02;

public class PanelSwitch {
	public static void main(String[] args) {
		JPanelTest win = new JPanelTest();
		
		win.setTitle("frame Test");
		win.jpanel01 = new JPanel01(win);
		win.jpanel02 = new JPanel02(win);
		
		win.add(win.jpanel01);
		win.setBounds(30,30,300,300);
		win.setVisible(true);
		win.setDefaultCloseOperation(win.EXIT_ON_CLOSE);
		
	}
}
