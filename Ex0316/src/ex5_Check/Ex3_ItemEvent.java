package ex5_Check;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ex3_ItemEvent {
	public static void main(String[] args) {
		JFrame f =  new JFrame("ItemEvent 처리");
		f.setLayout(new BorderLayout());
		
		//라디오버튼 객체 3개 생성하기
		ButtonGroup bg = new ButtonGroup();
		JRadioButton jrb1 = new JRadioButton("선택1");
		JRadioButton jrb2 = new JRadioButton("선택2");
		JRadioButton jrb3 = new JRadioButton("선택3");
		
		//그룹에 라디오버튼 추가하기
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		
		
		//패널 하나 만들어서 라디오버튼 붙히기
		JPanel jp1 = new JPanel();
		jp1.setLayout(new FlowLayout());
		jp1.add(jrb1);
		jp1.add(jrb2);
		jp1.add(jrb3);
		
		JPanel jp2 = new JPanel();
		jp2.setLayout(new FlowLayout());
		JLabel jl = new JLabel("선택항목 : ");
		JLabel jl2 = new JLabel();
		jp2.add(jl);
		jp2.add(jl2);
		
		
		//프레임에 요소 붙히기
		f.add(jp1, BorderLayout.CENTER);
		f.add(jp2, BorderLayout.SOUTH);
		
		ItemListener il =  new ItemListener() {
			
			//e.getStateChange() : 내가 누른 객체의 상태가 바뀌었을때 호출되는 메서드
			//if(e.getStateChange() == ItemEvent.SELECTED) : 내가 누른 버튼이 클릭이 되었다면~
			//e.getSource() : 내가 누른 버튼의 정보를 가져오겟다.
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					if(e.getSource() == jrb1) {
						jl2.setText("선택1");
					}else if(e.getSource() == jrb2) {
						jl2.setText("선택2");
					}else if (e.getSource() == jrb3) {
						jl2.setText("선택3");
					}
				}
			}
		};
		
		jrb1.addItemListener(il);
		jrb2.addItemListener(il);
		jrb3.addItemListener(il);
		
		//프레임이 보여질 위치와 크기 정하기
		f.setBounds(300,300,300,200);//x,y,너비,높이
		f.setVisible(true);
		
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}
