package memo;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MemoMain {
	public static void main(String[] args) {
		JFrame frame = new JFrame("메모장");
		frame.getContentPane().setBackground(Color.CYAN);//프레임에 배경색 설정하는 법
		frame.setLayout(null);
		
		JTextField tf = new JTextField();
		tf.setBounds(7,15,180,30);
		
		JButton btn_input = new JButton("확인");
		btn_input.setBounds(190,15,60,30);
		btn_input.setEnabled(false);//버튼 비활성화
		
		JTextArea ta =  new JTextArea();
		ta.setBounds(7,50,242,200);
		ta.setEditable(false);//수정불가 상태로 만드는 법
		
		JButton btnSave = new JButton("저장");
		JButton btnClose = new JButton("종료");
		btnSave.setBounds(7, 260, 110, 30);
		btnClose.setBounds(140,260,110,30);
		
		//프레임에 요소 붙히기
		frame.add(tf);
		frame.add(btn_input);
		frame.add(ta);
		frame.add(btnSave);
		frame.add(btnClose);
		
		tf.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyReleased(KeyEvent e) {
				if(tf.getText().length() == 0) {
					//tf에 아무것도 쓰여있지 않으면 버튼 비활성화
					btn_input.setEnabled(false);//버튼 비활성화
				}else {
					btn_input.setEnabled(true);//버튼 활성화
				}
			}
		});
		
		
		//확인 버튼 클릭시 tf에 값을 ta로 복사해서 넣어주기
		btn_input.addActionListener(new InputButtonAdapter(ta,tf,btn_input));
		
		//btnSave를 눌렀을 때 ta에 있는 값을 메모장으로 저장하는 기능 구현하기
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//ta에 써있는 내용을 가져와야 한다.
				String msg = ta.getText();
				
				FileDialog fd = new FileDialog(frame,"저장",FileDialog.SAVE);
				fd.setVisible(true);
				
				//fd를 통해 지정한 저장경로와 파일명을 알아내자.
				String path = fd.getDirectory()+fd.getFile()+".txt";//확장자가 .txt로 고정
				//System.out.println(path);
				
				//char기반의 스트림을 생성하여 path경로에 저장
				try {
					FileWriter fw = new FileWriter(path);
					fw.write(msg);
					fw.close();
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
			}
		});
		
		
		//btnClose를 눌렀을 때 프로그램 종료
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();//프레임 종료
				
			}
		});
		
		frame.setBounds(700,200,272,350);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}
}
