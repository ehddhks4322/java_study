package ex1_annotation;

import java.lang.annotation.*;
import static java.lang.annotation.ElementType.*;//ElementType -> ������
import static java.lang.annotation.RetentionPolicy.*;

@Target({TYPE,FIELD,TYPE_USE,METHOD})
@Retention(RUNTIME)
public @interface TestInfo {//������ �ٸ������� @TestInfo��� �̸����� ������̼���
							//����� �� �ֽ��ϴ�.
	String[] value()default"����1"; // �߻�޼���
	//�ƹ��͵� �������� �ʾ��� �� �⺻������ "����1"�� ��ȯ�� �ϰڴ�.
	String[] testTool()default"INF01";
	String tester();
	DateTime datetime();
	
	//default�� �Ǿ� �ִ� �͵��� ��ø� �����൵ ũ�� ������ ���� �ʴ´�.
	//������ default�� �Ǿ����� ���� �͵鿡 ���ؼ��� ��ø� ������ ������ ������ ����.
}
