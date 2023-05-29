package panel1;

import javax.swing.JFrame;

import panel2.JPanel01;
import panel2.JPanel02;

public class JPanelTest extends JFrame{
	
	public JPanel01 jpanel01 = null;
	public JPanel02 jpanel02 = null;
	
	public void change(String panelName) {
		if(panelName.equals("panel01")) {
			getContentPane().removeAll();//구성요소를 모두 지운다.
			//ContentPane : 일반적인  컴포넌트를 가질 수 있는 패널
			getContentPane().add(jpanel01);//jpanel01 구성요소를 넣는다.(구성요소에 jpanel101을 넣는다.)
			revalidate();//배치관리자에게 자식 컴포넌트를 다시 배치하도록 지시하는 메서드
			repaint();//새로고침
		}else {
			getContentPane().removeAll();//구성요소를 모두 지운다.
			getContentPane().add(jpanel02);//jpanel02 구성요소를 넣는다.(구성요소에 jpanel102를 넣는다.)
			revalidate();//배치관리자에게 자식 컴포넌트를 다시 배치하도록 지시하는 메서드
			repaint();//새로고침
		}
	}
}
