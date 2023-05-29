package ex1_File;

import java.io.File;

public class Ex1_FIle {
	public static void main(String[] args) {
		//IO(Input, Output) : 입출력과 관련된 스트림
		//스트림 : 데이터 입출력을 위한 통로,방법
		//프로그램에서 파일을 읽어온다든지, 콘솔에서 키보드값을 얻어오는 등의 작업을 할 수 있습니다.
		//자바 가상머신에서 콘솔로 값을 보낼땐 Output, 반대로 콘솔의 값을 JVM에서 읽을땐 Input
		
		//파일 객체를 생성할 경로
		String path = "D:\\java_study\\test.txt";
		
		//준비된 경로로 File객체 생성
		File f = new File(path);
		
		//File클래스가 생성되면서 path경로까지 스트림을 생성
		
		System.out.println(f.length()+ "byte");
		//파일의 용량을 알 수 있다. 한글은 2byte, 영문, 특수문자 1byte
		//파일이든 폴더는 최종 목적지에 해당하는 곳의 용량을 가져올 수 있다.
	}
}
