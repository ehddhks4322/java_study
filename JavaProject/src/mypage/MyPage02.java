package mypage;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyPage02 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("마이페이지");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setLayout(null);
	
		
		//JButton bt = new JButton(new ImageIcon("./Button_Img/cgv.png"));
		//bt.setBounds(120, 0, 200, 109);
//		bt.setBorderPainted(false);
//		bt.setFocusPainted(false);
//		bt.setContentAreaFilled(false);
		//frame.add(bt);
		
		Font font1 = new Font("Serif", Font.BOLD, 50);
		Font font2 = new Font("맑은 고딕", Font.BOLD, 20);
		
		
		JLabel main = new JLabel("My Info");
		main.setBounds(140, 0, 200, 150);
		main.setFont(font1);
		frame.add(main);
		
		//아이디
		JLabel id = new JLabel("아이디 : ");
		id.setBounds(120,170,100,20);
		id.setFont(font2);
		frame.add(id);
		
		JTextField idField = new JTextField();
		idField.setBounds(200, 168, 130, 30);
		idField.setEditable(false);
		frame.add(idField);
		
		//비밀번호
		JLabel pw = new JLabel("비밀번호 : ");
		pw.setBounds(100, 230, 100, 20);
		pw.setFont(font2);
		frame.add(pw);
		
		JPasswordField pwField = new JPasswordField();
		pwField.setBounds(200, 230, 130, 30);
		pwField.setEditable(false);
		frame.add(pwField);
		
		//이름
		JLabel name = new JLabel("이름 : ");
		name.setBounds(140, 295, 100, 20);
		name.setFont(font2);
		frame.add(name);
		
		JTextField nField = new JTextField();
		nField.setBounds(200, 293, 130, 30);
		nField.setEditable(false);
		frame.add(nField);
		
		//전화번호
		JLabel tel = new JLabel("전화번호 : ");
		tel.setBounds(100, 355, 100, 20);
		tel.setFont(font2);
		frame.add(tel);
		
		JTextField tField = new JTextField();
		tField.setBounds(200, 353, 130, 30);
		tField.setEditable(false);
		frame.add(tField);		
		
//		//성별
//		JLabel gender = new JLabel("성별 : ");
//		gender.setBounds(140, 415, 100, 20);
//		gender.setFont(font2);
//		frame.add(gender);
//		
//		JTextField gField = new JTextField();
//		gField.setBounds(200, 413, 80, 30);
//		gField.setEditable(false);
//		frame.add(gField);
//		
//		//나이
//		JLabel age = new JLabel("나이 : ");
//		age.setBounds(140, 475, 100, 20);
//		age.setFont(font2);
//		frame.add(age);
//		
//		JTextField aField = new JTextField();
//		aField.setBounds(200, 473, 80, 30);
//		aField.setEditable(false);
//		frame.add(aField);
		
		JButton btn_input = new JButton("확인");
		btn_input.setBounds(155, 550, 165, 50);
		btn_input.setFont(font2);
		frame.add(btn_input);
		
		//btn_input.addActionListener(new Member(idField, pwField, nField, tField));
		
		frame.setBounds(700, 200, 450, 800);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}
}
