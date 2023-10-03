package xtra.thenComparingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class App {

	public static void main(String[] args) {

		List<Student> studentList = new ArrayList<>(
				Arrays.asList(new Student("Lorem", 20, "Java", 10), new Student("Amet", 25, "PHP", 8),
						new Student("Massa", 19, "Java", 9), new Student("Viverra", 22, "Java", 5),
						new Student("Mauris", 21, "PHP", 6), new Student("Vivamus", 19, "PHP", 3),
						new Student("Rock", 19, "Python", 2), new Student("Phio", 19, "Python", 3)));

		studentList.sort(Comparator.comparing(Student::getStudentAge)
				.thenComparing(Student::getStudentName));
		
		studentList.forEach(System.out::println);

	}

}
