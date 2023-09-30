package n3Exe1;

public class Studient {
	
	private String studientName;
	private int studientAge;
	private String studientCourse;
	private int studientNote;
	
	public Studient(String studientName, int studientAge, String studientCourse, int studientNote) {
		this.studientName = studientName;
		this.studientAge = studientAge;
		this.studientCourse = studientCourse;
		this.studientNote = studientNote;
	}
	
	public String getStudientName() {
		return studientName;
	}
	
	public void setStudientName(String studientName) {
		this.studientName = studientName;
	}
	
	public int getStudientAge() {
		return studientAge;
	}
	
	public void setStudientAge(int studientAge) {
		this.studientAge = studientAge;
	}
	
	public String getStudientCourse() {
		return studientCourse;
	}
	
	public void setStudientCourse(String studientCourse) {
		this.studientCourse = studientCourse;
	}
	
	public int getStudientNote() {
		return studientNote;
	}
	
	public void setStudientNote(int studientNote) {
		this.studientNote = studientNote;
	}
	
	@Override
	public String toString() {
		return "Studient [studientName=" + studientName + ", studientAge=" + studientAge + ", studientCourse="
				+ studientCourse + ", studientNote=" + studientNote + "]";
	}
	

}

	/*
	 * Crea una clase Alumno con sus atributos: Nombre, edad, curso y nota.
	 * Llena una lista con 10 alumnos
	 * Muestra por pantalla el nombre y la edad de cada alumno/a.
	 * Filtra la lista por todos los alumnos cuyo nombre comienza por ‘a’. 
	 * Asigna a estos alumnos a otra lista y muestra por pantalla la nueva lista (todo con lambdes).
	 * Filtra y muestra por pantalla a los alumnos que tienen una nota de 5 o superior.
	 * Filtra y muestra por pantalla a los alumnos que tienen una nota de 5 o más, y que no son de PHP.
	 * Muestra a todos los alumnos que hacen JAVA y son mayores de edad.
	 */ 
