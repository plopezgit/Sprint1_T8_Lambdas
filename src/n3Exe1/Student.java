package n3Exe1;

public class Student {
	
	private String studientName;
	private int studientAge;
	private String studientCourse;
	private int studientNote;
	
	public Student(String studientName, int studientAge, String studientCourse, int studientNote) {
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