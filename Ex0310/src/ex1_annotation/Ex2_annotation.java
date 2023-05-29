package ex1_annotation;


@TestInfo(tester="ȫ�浿",datetime=@DateTime(date="20230310",time="170408"))
//value�� ���ؼ� TestInfo�� value()�޼��忡 ������ ����ȴ�.
//value�� �������� ����� ������ �ݵ�� { }�� ����ؾ� �Ѵ�.
//value= ������ �����ϴ�
public class Ex2_annotation {
	public static void main(String[] args) {
		//2. ��Ÿ ������̼�
		//- �̳����̼��� ����� ���� ������̼�
		//- �츮���� ������̼��� ����� ���� ������̼�
		//- ���������� ������̼����� ���� ������ �Ѵ�.
		//- java.lang.annotation ��Ű���� ���ǵǾ� �ִ�.
		
		//@Target : ������̼��� ���� ������ ���(����)�� �����ϴµ� ���ȴ�. �� �״�� ������̼��� ���� �� �ִ� ����� �����ϴ� ��(������ ��� ����)
		//@Target(ElementType.TYPE) : Ŭ������ � ��ҿ��� ���밡��, �⺻��
		//@Target(ElementType.FIELD) : Ŭ������ Ư�� �ʵ�
		//@Target(ElementType.METHD) : Ŭ������ �޼���
		//@Target(ElementType.PARAMETER) : �޼����� �Ķ����
		//@Target(ElementType.CONSTRUCTOR) : ������
		//@Target(ElementType.ANNOTATION_TYPE) : ������̼� Ÿ��
		//@Target({TYPE,FIELD,TYPE_USE,METHOD})�� ������ ��� ����
		
		//@Documented
		
		//@Inherited
		
		//@Retention : ������̼��� �����Ǵ� �Ⱓ�� �����ϴµ� ���ȴ�. (Retention(RUNTIME)�� �ַ� �����)
		//@Retention(SOURCE) : ������̼��� �ҽ� �ڵ忡�� �̿� �����ϸ� ������ �Ŀ��� �����
		//@Retention(CLASS) : ������̼��� .class���Ͽ� ���������� ��Ÿ�ӿ��� �����(����� ��� �Ұ�)
		//@Retention(RUNTIME) : ������̼��� �����Ϸ��� ��Ÿ�ӿ� ��� ����(����ÿ� ���� ����)
		
		//@Repeatable
		
		//"@" ��ȣ�� ���̴� ���� �����ϸ� �������̽��� �����ϴ� �Ͱ� �����ϴ�.
		//"@Override"�� ������̼��̰� 'Override'�� ������̼��� Ÿ���̴�.
		
		//������̼� ����� ��Ģ
		//������̼� ��Ҹ� ������ �� �ݵ�� ���Ѿ� �ϴ� ��Ģ
		//����� Ÿ���� �⺻�ڷ���,String,Enum,������̼�,Class�� ���ȴ�.
		//()�ȿ� �Ű������� ������ �� ����.
		//���ܸ� ������ �� ����.
		//��Ҹ� Ÿ�� �Ű������� ������ �� ����.
		
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
