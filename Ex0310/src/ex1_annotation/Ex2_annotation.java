package ex1_annotation;


@TestInfo(tester="홍길동",datetime=@DateTime(date="20230310",time="170408"))
//value를 통해서 TestInfo의 value()메서드에 정보가 저장된다.
//value에 여러개를 사용할 때에는 반드시 { }를 사용해야 한다.
//value= 생략이 가능하다
public class Ex2_annotation {
	public static void main(String[] args) {
		//2. 메타 어노테이션
		//- 이노테이션을 만들기 위한 어노테이션
		//- 우리만의 어노테이션을 만들기 위한 어노테이션
		//- 스프링에서 어노테이션으로 많이 통제를 한다.
		//- java.lang.annotation 패키지에 정의되어 있다.
		
		//@Target : 어노테이션이 적용 가능한 대상(범위)을 지정하는데 사용된다. 말 그대로 어노테이션을 붙일 수 있는 대상을 지정하는 것(여러개 사용 가능)
		//@Target(ElementType.TYPE) : 클래스의 어떤 요소에나 적용가능, 기본값
		//@Target(ElementType.FIELD) : 클래스의 특정 필드
		//@Target(ElementType.METHD) : 클래스의 메서드
		//@Target(ElementType.PARAMETER) : 메서드의 파라미터
		//@Target(ElementType.CONSTRUCTOR) : 생성자
		//@Target(ElementType.ANNOTATION_TYPE) : 어노테이션 타입
		//@Target({TYPE,FIELD,TYPE_USE,METHOD})로 여러개 사용 가능
		
		//@Documented
		
		//@Inherited
		
		//@Retention : 어노테이션이 유지되는 기간을 지정하는데 사용된다. (Retention(RUNTIME)을 주로 사용함)
		//@Retention(SOURCE) : 어노테이션이 소스 코드에만 이용 가능하며 컴파일 후에는 사라짐
		//@Retention(CLASS) : 어노테이션이 .class파일에 존재하지만 런타임에는 사라짐(실행시 사용 불가)
		//@Retention(RUNTIME) : 어노테이션이 컴파일러와 런타임에 사용 가능(실행시에 정보 제공)
		
		//@Repeatable
		
		//"@" 기호를 붙이는 것을 제외하면 인터페이스를 정의하는 것과 동일하다.
		//"@Override"는 어노테이션이고 'Override'는 어노테이션의 타입이다.
		
		//어노테이션 요소의 규칙
		//어노테이션 요소를 선언할 때 반드시 지켜야 하는 규칙
		//요소의 타입은 기본자료형,String,Enum,어노테이션,Class만 허용된다.
		//()안에 매개변수를 선언할 수 없다.
		//예외를 선언할 수 없다.
		//요소를 타입 매개변수로 정의할 수 없다.
		
//		Annotation[] annos = Ex2_annotation.class.getAnnotations();
//		
//		for(Annotation anno : annos) {
//			System.out.println(anno);
//		}
		
		TestInfo testInfo = (TestInfo)Ex2_annotation.class.getAnnotation(TestInfo.class);
		
		String[] value = testInfo.value();
		for(String val : value) {
			System.out.print(val+ " ");
		}
		System.out.println();
		
		String[] tools = testInfo.testTool();
		for(String tool : tools) {
			System.out.print(tool+ " ");
		}
		System.out.println();
		
		String tester = testInfo.tester();
		System.out.println(tester);
		
		String date = testInfo.datetime().date();
		String time = testInfo.datetime().time();
		System.out.printf("date = %s, time = %s",date,time);
		
		
		
		
		
		
		
		
		
		
		
	}
}
