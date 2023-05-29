package ex9_ChangeEvent;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ex1_JSlider extends JFrame {
	
	JLabel colorLabel;
	JSlider jsl;
	
	public Ex1_JSlider() {
		setTitle("슬라이더와 ChangeEvent");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		colorLabel = new JLabel("    SLIDER EXAMPLE    ");
		//0~100사이의 값을 선택할 수 있는 슬라이더 생성, 초기값은 50
		jsl = new JSlider(JSlider.HORIZONTAL,0,255,50);//수평으로 0~255,초기값 50
		jsl.setPaintLabels(true);//true면 눈금의 숫자가 보이고, false면 눈금의 숫자가 안보인다.
		jsl.setPaintTrack(true);//슬라이더가 true면 보이고, false면 안보인다.
		jsl.setPaintTicks(true);//true면 눈금이 보이고, false면 눈금이 안보인다.
		jsl.setMajorTickSpacing(50);//큰 눈금
		jsl.setMinorTickSpacing(10);//작은 눈금
		
		jsl.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				//슬라이더의 값이 변경되면 호출됨
				colorLabel.setBackground(new Color(0,jsl.getValue(),0));
				
			}
		});
		//폰트의 색상을 지정해주는 메서드
		jsl.setForeground(Color.RED);//글자색상 변경하는 메서드
		
		//라벨에 배경색을 집어넣을 수 있도록 해주는 메서드
		colorLabel.setOpaque(true);
		
		add(jsl);
		add(colorLabel);
		setSize(300,300);
		setVisible(true);
	}//생성자
	
	public static void main(String[] args) {
		new Ex1_JSlider();
	}
}
