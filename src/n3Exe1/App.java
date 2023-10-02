package n3Exe1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {

		List<Student> studentList = new ArrayList<>(
				Arrays.asList(new Student("Lorem", 20, "Java", 10), new Student("Amet", 25, "PHP", 8),
						new Student("Massa", 19, "Java", 9), new Student("Viverra", 22, "Java", 5),
						new Student("Mauris", 21, "PHP", 6), new Student("Vivamus", 19, "PHP", 3),
						new Student("Rock", 19, "Python", 2), new Student("Phio", 19, "Python", 3)));

		studentList.forEach(System.out::println);
		System.out.println("ends");

		FilterableList<Student, String, Integer> filter = (list, ch, len) -> {

			List<Student> result = studentList.stream().filter(s -> s.getStudentName().startsWith(ch))
					.collect(Collectors.toList());
			return result;
		};

		filter.filterBy(studentList, "A", null).forEach(System.out::println);
		System.out.println("ends");

		FilterableList<Student, String, Integer> filter2 = (list, ch, len) -> {

			List<Student> result = studentList.stream().filter(s -> (s.getStudentNote() >= len))
					.collect(Collectors.toList());
			return result;
		};

		filter2.filterBy(studentList, "A", 5).forEach(System.out::println);
		System.out.println("ends");

		FilterableList<Student, String, Integer> filter3 = (list, ch, len) -> {

			List<Student> result = studentList.stream()
					.filter(s -> s.getStudentNote() >= len && !s.getStudentCourse().equalsIgnoreCase(ch))
					.collect(Collectors.toList());

			return result;
		};

		filter3.filterBy(studentList, "PHP", 5).forEach(System.out::println);
		System.out.println("ends");

		FilterableList<Student, String, Integer> filter4 = (list, ch, len) -> {

			List<Student> result = studentList.stream()
					.filter(s -> s.getStudentAge() >= len && s.getStudentCourse().equalsIgnoreCase(ch))
					.collect(Collectors.toList());

			return result;
		};

		filter4.filterBy(studentList, "Java", 18).forEach(System.out::println);
	}

	/*
	 * Crea una clase Alumno con sus atributos: Nombre, edad, curso y nota. Llena
	 * una lista con 10 alumnos Muestra por pantalla el nombre y la edad de cada
	 * alumno/a. Filtra la lista por todos los alumnos cuyo nombre comienza por ‘a’.
	 * Asigna a estos alumnos a otra lista y muestra por pantalla la nueva lista
	 * (todo con lambdes). Filtra y muestra por pantalla a los alumnos que tienen
	 * una nota de 5 o superior. Filtra y muestra por pantalla a los alumnos que
	 * tienen una nota de 5 o más, y que no son de PHP. Muestra a todos los alumnos
	 * que hacen JAVA y son mayores de edad.
	 */

}
