package ex3_message;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient extends JFrame implements Runnable{
	
	JTextArea area;
	JTextField input;
	JButton send_bt;
	JPanel south_p;
	
	Socket s;
	BufferedReader in;
	PrintWriter out;
	Thread t;
	
	public ChatClient() {
		area = new JTextArea();
		this.add(area);
		area.setEnabled(false);
		
		south_p = new JPanel(new BorderLayout());
		south_p.add(input = new JTextField());
		south_p.add(send_bt = new JButton("보내기"),BorderLayout.EAST);
		
		this.add(south_p,BorderLayout.SOUTH);
		
		this.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				out.println("xx:~X");//종료시 xx:~X라는 메세지 전달
			}
		});
		
		send_bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sendData();//서버로 메세지를 전달하기 위한 메서드
			}
		});
		
		setBounds(100,100,400,500);
		setVisible(true);
		
		connected();//서버에 접속해주는 메서드
		
		//서버로부터 전달되는 메세지를 감지하여 받는 스레드 생성
		t = new Thread(this);
		t.start();
	}//생성자
	
	public void connected() {
		//서버접속
		try {
			s = new Socket("114.201.94.154",3200);
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			out = new PrintWriter(s.getOutputStream());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}//connected
	
	public static void main(String[] args) {
		new ChatClient();
	}
	
	
	
	@Override
	public void run() {
		//서버로부터 전달되는 메세지를 기다렸다가
		//메세지가 도착하면 화면에 출력
		while(true) {
			try {
				String msg = in.readLine();
				if(msg.equals("xx:~X")) {
					break;
				}
				if(msg != null) {
					area.append(msg+"\r\n");
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}//while
		closed();//열려있는 스트림을 닫는 메서드
		System.exit(0);//프로그램 종료!
	}//run
	
	public void sendData() {
		String msg = input.getText().trim();
		if(msg.length() > 0) {
			out.println(msg);
		}
		input.setText("");
	}//sendData
	
	public void closed() {
		try {
			if(out != null) {
				out.close();
			}
			
			if(in != null) {
				in.close();
			}
			
			if(s != null) {
				s.close();
			}
		} catch (Exception e) {
			
		}
	}//closed
}
