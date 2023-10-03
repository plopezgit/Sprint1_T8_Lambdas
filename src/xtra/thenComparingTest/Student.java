package xtra.thenComparingTest;

public class Student {
	
	private String studentName;
	private int studentAge;
	private String studentCourse;
	private int studentNote;
	
	public Student(String studientName, int studientAge, String studientCourse, int studientNote) {
		this.studentName = studientName;
		this.studentAge = studientAge;
		this.studentCourse = studientCourse;
		this.studentNote = studientNote;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public String getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}

	public int getStudentNote() {
		return studentNote;
	}

	public void setStudentNote(int studentNote) {
		this.studentNote = studentNote;
	}

	@Override
	public String toString() {
		return "Name=" + studentName + ", Age=" + studentAge + ", Course=" + studentCourse
				+ ", Note=" + studentNote;
	}
	
}