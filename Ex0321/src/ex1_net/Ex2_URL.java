package ex1_net;

import java.net.MalformedURLException;
import java.net.URL;

public class Ex2_URL {
	public static void main(String[] args) {
		//URL은 인터넷에 존재하는 여러 서버들이 제공하는 자원에 접근할 수 있는 주소를 표현하기 위한 것으로
		// 프로토콜://호스트명:포트번호/경로명/파일명?쿼리스트링#참조의 형태로 이루어져 있다.
		//URL에서 포트번호, 쿼리스트링, 참조는 생략할 수 있다.
		//http://dm.n-mk.kr:80/board/list.html?referer=kim#index01
		//프로토콜 - 자원에 접근하기 위해 서버와 통신하는데 사용되는 통신규역 (http)
		//호스트명 - 자원을 제공하는 서버의 이름 (dm.n-mk-kr)
		//포트번호 - 통신에서 사용되는 서버의 포트번호 (:80)
		//경로명 - 접근하려는 자원이 저장된 서버상의 위치 (board)
		//파일명 - 접근하려는 자원의 이름 (list.html)
		//쿼리스트링 - URL에서 '?'이후의 부분 (referer-kim)
		//참조 - URL에서 '#'이후의 부분 (index01)
		
		try {
			URL url = new URL("http://dm.n-mk.kr:80/board/list.html?referer=kim#index01");
			System.out.println("url.getAuthority() : " + url.getAuthority());
			//url.getAuthority() : 호스트명과 포트를 문자열 형태로 반환
			
			System.out.println("url.getPort() : " + url.getPort());
			//url.getPort() : 포트번호를 정수형으로 반환
			
			System.out.println("url.getHost() : " + url.getHost());
			//url.getHost() : 호스트명을 문자열로 반환
			
			System.out.println("url.getProtocol() : " + url.getProtocol());
			//url.getProtocol() : 프로토콜을 문자열로 반환
			
			System.out.println("url.getQuery() : " + url.getQuery());
			//url.getQuery() : 쿼리를 문자열 형태로 반환
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
		
		//URLConnection은 어플리케이션과 URL간의 통신연결을 나타내는 클래스의 최상위 클래스로 추상클래스이다.
		//URLConnection을 상속받아 구현한 클래스로는 HttpURLConnection과 JarURLConnection이 있으며,
		//URL의 프로토콜이 http 프로토콜 이라면 openConnection()은 HttpURLConnection을 반환한다.
		//URLConnection을 사용해서 연결하고자 하는 자원에 접근하고 읽고 쓰기를 할 수 있다.
		
		
		
		
	}
}
