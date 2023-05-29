package ex2_chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread{
	//http��Ű� socket����� ������
	//- �ܹ��� ����� http��� http����� Client�� ��û(Request)�� ���� ���� ������ ����(Response)�Ͽ� �ش� ������ �����ϰ� ��ٷ� ������ �����ϴ� ����̴�.
	//Client�� ��û�� ������ ��쿡�� Server�� �����ϴ� �ܹ��� ������� �ݴ�� Server�� Client���� ��û�� �������� ����.
	
	//- ����� ����� Socket��� Server�� Client�� Ư�� Port�� �ǽð����� ����� ����� �ϴ� ����̴�.
	//Http��Ű��� �ٸ��� Server�� Client�� Port�� ���� ����Ǿ� �־ �ǽð����� ����� ����� �� �� �ִ�.
	//Streaming�̳� �ǽð� ä��, ���� ��� ���� �ﰢ������ ������ �ְ�޴� ��쿡 ���ȴ�.
	
	//Socket����� ��Ģ
	//1. ���� ��ٸ��� ���� Server��� �ϸ�, Server������ Port�� ���� Client�� ������ ��ٸ���.
	//2. ������ �ϴ� ���� Client��� �ϸ�, Server�� IP�� Port�� �����Ͽ� ����� ����ȴ�.
	//3. Server�� Client���� ����� send, Receive�� ���·� �ְ�޴´�.
	//4. ����� ������ close()�� ������ ���´�.
	
	ServerSocket ss;
	
	public MyServer() {
		try {
			ss = new ServerSocket(3001);
			System.out.println("���� ����!");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}//������
	
	public static void main(String[] args) {
		new MyServer().start();
	}
	
	
	@Override
	public void run() {
		//thread�� �ؾ�����
		//(�����ڸ� �ް�, ���ڿ��� �޾Ƴ���.)
		while(true) {
			try {
				Socket s = ss.accept();
				
				//Ŭ���̾�Ʈ�� ���� ���ڿ�
				BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
				String msg = reader.readLine();//�����ڰ� ���� �޼���
				String ip = s.getInetAddress().getHostAddress();
				
				System.out.println(ip + " : " + msg);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}
}
