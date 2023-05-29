package ex2_stream;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StudentMain {
	public static void main(String[] args) {
		Student[] students = {
			new Student("학생1",3,300),	
			new Student("학생2",1,200),
			new Student("학생3",2,100),
			new Student("학생4",2,150),
			new Student("학생5",1,200),
			new Student("학생6",1,290),
			new Student("학생7",2,180),
			new Student("학생8",3,100),
			new Student("학생9",3,300),
		};													
											//반별로 정렬
		Stream.of(students).sorted(Comparator.comparing(Student::getBan)
								  .thenComparing(Student::compareTo)).forEach(System.out::println);
												//성적순으로 정렬
		
		System.out.println();
		//map()
		//스트림의 요소에서 저장된 값 중에서 원하는 필드만 뽑아내거나 특정 형태로 변환해야 하는 경우
		//mapToDouble()
		//mapToInt()
		//mapToLong()
		
		//Student 스트림을 score스트림으로 변환하고 점수를 콘솔에 출력하기
		Stream.of(students).mapToInt((x -> x.getTotalScore())).forEach(score -> System.out.println(score));
		
		System.out.println();
		
		//학생들의 점수의 총합을 구하는 스트림 생성하고 출력하기
		int total = Stream.of(students).mapToInt(x -> x.getTotalScore()).reduce(0, (x,y) -> x+y);
		System.out.println(total);
		//학생들의 성적의 평균 구하기
		double avg = Stream.of(students).mapToInt(x -> x.getTotalScore()).average().getAsDouble();
		System.out.println(avg);
		
		IntStream stream = Stream.of(students).mapToInt(Student::getTotalScore);
		IntSummaryStatistics stat = stream.summaryStatistics();
		System.out.println(stat);
	}
}
