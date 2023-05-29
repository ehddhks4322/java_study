package ex1_net;

import java.net.MalformedURLException;
import java.net.URL;

public class Ex2_URL {
	public static void main(String[] args) {
		//URL�� ���ͳݿ� �����ϴ� ���� �������� �����ϴ� �ڿ��� ������ �� �ִ� �ּҸ� ǥ���ϱ� ���� ������
		// ��������://ȣ��Ʈ��:��Ʈ��ȣ/��θ�/���ϸ�?������Ʈ��#������ ���·� �̷���� �ִ�.
		//URL���� ��Ʈ��ȣ, ������Ʈ��, ������ ������ �� �ִ�.
		//http://dm.n-mk.kr:80/board/list.html?referer=kim#index01
		//�������� - �ڿ��� �����ϱ� ���� ������ ����ϴµ� ���Ǵ� ��űԿ� (http)
		//ȣ��Ʈ�� - �ڿ��� �����ϴ� ������ �̸� (dm.n-mk-kr)
		//��Ʈ��ȣ - ��ſ��� ���Ǵ� ������ ��Ʈ��ȣ (:80)
		//��θ� - �����Ϸ��� �ڿ��� ����� �������� ��ġ (board)
		//���ϸ� - �����Ϸ��� �ڿ��� �̸� (list.html)
		//������Ʈ�� - URL���� '?'������ �κ� (referer-kim)
		//���� - URL���� '#'������ �κ� (index01)
		
		try {
			URL url = new URL("http://dm.n-mk.kr:80/board/list.html?referer=kim#index01");
			System.out.println("url.getAuthority() : " + url.getAuthority());
			//url.getAuthority() : ȣ��Ʈ��� ��Ʈ�� ���ڿ� ���·� ��ȯ
			
			System.out.println("url.getPort() : " + url.getPort());
			//url.getPort() : ��Ʈ��ȣ�� ���������� ��ȯ
			
			System.out.println("url.getHost() : " + url.getHost());
			//url.getHost() : ȣ��Ʈ���� ���ڿ��� ��ȯ
			
			System.out.println("url.getProtocol() : " + url.getProtocol());
			//url.getProtocol() : ���������� ���ڿ��� ��ȯ
			
			System.out.println("url.getQuery() : " + url.getQuery());
			//url.getQuery() : ������ ���ڿ� ���·� ��ȯ
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
		
		//URLConnection�� ���ø����̼ǰ� URL���� ��ſ����� ��Ÿ���� Ŭ������ �ֻ��� Ŭ������ �߻�Ŭ�����̴�.
		//URLConnection�� ��ӹ޾� ������ Ŭ�����δ� HttpURLConnection�� JarURLConnection�� ������,
		//URL�� ���������� http �������� �̶�� openConnection()�� HttpURLConnection�� ��ȯ�Ѵ�.
		//URLConnection�� ����ؼ� �����ϰ��� �ϴ� �ڿ��� �����ϰ� �а� ���⸦ �� �� �ִ�.
		
		
		
		
	}
}
