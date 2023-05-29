package ex5_Check;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Ex2_RadioButton {
	public static void main(String[] args) {
		JFrame f =  new JFrame();
		f.setLayout(new FlowLayout());
		//라디오버튼  : 중복선택 할 수 없는것
		//남자,여자   이과,문과    
		
		ButtonGroup bg1 = new ButtonGroup();
		JRadioButton jrb1 = new JRadioButton("남자",true);
		JRadioButton jrb2 = new JRadioButton("여자");
		
		//버튼 그룹에 라디오버튼 추가하기
		bg1.add(jrb1);
		bg1.add(jrb2);
		
		//프레임에 요소 추가하기
		f.add(jrb1);
		f.add(jrb2);
		
		
		
		
		
		
		
		//프레임이 보여질 위치와 크기 정하기
		f.setBounds(300,300,400,400);//x,y,너비,높이
		f.setVisible(true);
		
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}
