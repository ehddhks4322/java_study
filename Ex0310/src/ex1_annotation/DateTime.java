package ex1_annotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Target;
import java.lang.annotation.Retention;

@Retention(RUNTIME)
@Target(METHOD)//범위를 메서드로 제한을 한다.
public @interface DateTime {
	//날짜와 시간을 저장하도록 하는 메서드
	String date();
	String time();
}
