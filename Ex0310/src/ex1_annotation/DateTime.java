package ex1_annotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Target;
import java.lang.annotation.Retention;

@Retention(RUNTIME)
@Target(METHOD)//������ �޼���� ������ �Ѵ�.
public @interface DateTime {
	//��¥�� �ð��� �����ϵ��� �ϴ� �޼���
	String date();
	String time();
}
