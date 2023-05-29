package ex1_annotation;

import java.lang.annotation.*;
import static java.lang.annotation.ElementType.*;//ElementType -> 열거형
import static java.lang.annotation.RetentionPolicy.*;

@Target({TYPE,FIELD,TYPE_USE,METHOD})
@Retention(RUNTIME)
public @interface TestInfo {//앞으로 다른곳에서 @TestInfo라는 이름으로 어노테이션을
							//사용할 수 있습니다.
	String[] value()default"정보1"; // 추상메서드
	//아무것도 정의하지 않았을 때 기본값으로 "정보1"을 반환을 하겠다.
	String[] testTool()default"INF01";
	String tester();
	DateTime datetime();
	
	//default로 되어 있는 것들은 명시를 안해줘도 크게 문제가 되지 않는다.
	//하지만 default가 되어있지 않은 것들에 대해서는 명시를 해주지 않으면 오류가 난다.
}
