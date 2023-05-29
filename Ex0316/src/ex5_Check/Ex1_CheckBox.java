package ex5_Check;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Ex1_CheckBox {
	public static void main(String[] args) {
		JFrame f =  new JFrame();
		
		//null 속성은 요소를 수동배치 해야한다.
		f.setLayout(null);
		
		
		JCheckBox jcb1 = new JCheckBox("음악",true);
		JCheckBox jcb2 = new JCheckBox("등산",true);
		JCheckBox jcb3 = new JCheckBox("낚시",false);
		
		//요소가 프레임에 보여질 위치와 크기
		jcb1.setBounds(50,50,70,30);//x,y,너비,높이
		jcb2.setBounds(130,50,70,30);//x,y,너비,높이
		jcb3.setBounds(200,50,70,30);//x,y,너비,높이
		
	
		
		
		//프레임에 요소 붙히기
		f.add(jcb1);
		f.add(jcb2);
		f.add(jcb3);
		
		
		
		
		
		
		
		
		
		
		
		//프레임이 보여질 위치와 크기 정하기
		f.setBounds(300,300,400,400);//x,y,너비,높이
		f.setVisible(true);
		
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
	
	
	
	
}
