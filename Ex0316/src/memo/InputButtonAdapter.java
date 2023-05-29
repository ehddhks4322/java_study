package memo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class InputButtonAdapter implements ActionListener{
	
	JTextArea ta;
	JTextField tf;
	JButton btn_input;
	
	public InputButtonAdapter(JTextArea ta, JTextField tf, JButton btn_input) {
		this.ta = ta;
		this.tf = tf;
		this.btn_input = btn_input;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		ta.append(tf.getText()+"\n");//ta에 tf내용을 추가한다.
		
		tf.requestFocus();//tf로 커서를 옮긴다.
		tf.setText("");//tf의 내용을 비워준다.
		btn_input.setEnabled(false);//버튼 비활성화
	}
	
}
