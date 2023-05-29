package mypage;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyPage extends JFrame{
	
	
	
	public MyPage(String idd, String pww, String namee, String tell) {
		super("마이페이지");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel jp = new JPanel();
		jp.setBackground(Color.WHITE);
		jp.setLayout(null);
		
		Font font1 = new Font("Serif", Font.BOLD, 50);
		Font font2 = new Font("맑은 고딕", Font.BOLD, 20);
		
		//로고 글씨?
		JLabel main = new JLabel("My Info");
		main.setBounds(140, 0, 200, 150);
		main.setFont(font1);
		jp.add(main);
		
		//아이디
		JLabel idLabel = new JLabel("아이디 : ");
		idLabel.setBounds(120,170,100,20);
		idLabel.setFont(font2);
		jp.add(idLabel);
		
		JTextField idField = new JTextField();
		idField.setBounds(200, 168, 130, 30);
		idField.setEditable(false);
		jp.add(idField);
		
		
		//비밀번호
		JLabel pwLabel = new JLabel("비밀번호 : ");
		pwLabel.setBounds(100, 230, 100, 20);
		pwLabel.setFont(font2);
		jp.add(pwLabel);
		
		JPasswordField pwField = new JPasswordField();
		pwField.setBounds(200, 230, 130, 30);
		pwField.setEditable(false);
		jp.add(pwField);
		
		
		//이름
		JLabel name = new JLabel("이름 : ");
		name.setBounds(140, 295, 100, 20);
		name.setFont(font2);
		jp.add(name);
		
		JTextField nField = new JPasswordField();
		nField.setBounds(200, 293, 130, 30);
		nField.setEditable(false);
		jp.add(nField);
		
		
		//전화번호
		JLabel tel = new JLabel("전화번호 : ");
		tel.setBounds(100, 355, 100, 20);
		tel.setFont(font2);
		jp.add(tel);
		
		JTextField tField = new JTextField();
		tField.setBounds(200, 353, 130, 30);
		tField.setEditable(false);
		jp.add(tField);		
		
		
		JButton btn_input = new JButton("확인");
		btn_input.setBounds(155, 550, 165, 50);
		btn_input.setFont(font2);
		jp.add(btn_input);
		
		this.add(jp);
		
		setBounds(700, 200, 460, 690);
		setVisible(true);
		
	}
	
}
